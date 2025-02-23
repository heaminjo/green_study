import "./App.css";
import { Route, Routes, useNavigate } from "react-router-dom";
import Main from "./components01/Main";
import Header from "./components01/Header";
import Footer from "./components01/Footer";
import { useState } from "react";

function App() {
  const [isLogin, setIsLogin] = useState(false);
  const [loginInfo, setLoginInfo] = useState("");

  //navigate
  const navigate = useNavigate();

  //navigate 함수
  const onRequestPage = (move) => {
    navigate(move);
  };

  const onLogout = () => {
    sessionStorage.clear();
    setIsLogin(false);
    setLoginInfo("");
    navigate("/");
  };
  //로그인 상태 확인
  if (!isLogin) {
    const loginCheck = JSON.parse(sessionStorage.getItem("loginInfo"));
    if (loginCheck != null) {
      setLoginInfo(loginCheck);
    }
  }

  //로그인 함수
  const onLoginSubmit = (userId, userName) => {
    //객체로 만들어 저장
    const loginData = { id: userId, userName: userName };

    if (userId != null && userId.length > 3) {
      sessionStorage.setItem("loginInfo", JSON.stringify(loginData));
      setIsLogin(true);
      setLoginInfo(loginData);
      alert("로그인을 성공하였습니다.");
      navigate("/");
    } else {
      setIsLogin(false);
      setLoginInfo("");
      alert("다시 입력해주세요.");

      navigate("/login");
    }
  };
  return (
    <>
      <div class="App">
        <Header
          isLogin={isLogin}
          userName={loginInfo.userName}
          userId={loginInfo.userId}
          onRequestPage={onRequestPage}
          onLogout={onLogout}
        />
        <Main onLoginSubmit={onLoginSubmit} />
        <Footer />
      </div>
    </>
  );
}

export default App;
