import { useState } from "react";
import { Link } from "react-router-dom";

export default function Login({ onLoginSubmit }) {
  const [userId, setUserId] = useState("");
  const [userName, setUserName] = useState("");

  return (
    <div className="contents">
      <p className="pageTitle">로그인</p>
      <div id="contents">
        <p>약관동의</p>
        <form
          onSubmit={(e) => {
            e.preventDefault();
            onLoginSubmit(userId, userName);
          }}
        >
          <input
            type="text"
            placeholder="4글자 이상"
            size={20}
            value={userId}
            onChange={(e) => setUserId(e.target.value)}
          />
          <input
            type="text"
            value={userName}
            onChange={(e) => setUserName(e.target.value)}
          />
          <input
            type="submit"
            value="로그인"
            className="loginBtn"
            style={{ width: 175 }}
          />
        </form>
        <br />
        <br />
        <span>
          <span>아직 회원이 아니신가요?</span>
          <Link to={"/join"}>
            <strong>회원가입</strong>
          </Link>
        </span>
      </div>
    </div>
  );
}
