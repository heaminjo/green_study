import { NavLink, Route, Routes } from "react-router-dom";

export default function Topics() {
  console.log("Topics Update");
  // ** Nested Routing
  // 1) 자식 page 1,2,3 추가 ( Topics01 )
  // => App.js의 라우트 path "/topics/*" 로 수정

  // 2) 배열로 목록 정의 ( Topics ) : ver02
  // 3) Topic 컴포넌트 추가 : ver02

  // ** useParams()
  // => 현재 URL에 포함되어 있는 파라미터를  key, value 형식의 객체형식으로 반환
  // => <Route path 속성에 ":?????" 로 정의된 파라미터 에 전달된 값을 객체에 담아 전달해주는 Hook.
  //   예) path /test/3 으로 이동한 경우 params의 값 {id:'3'}을 확인할 수 있고
  //      path /test/something 으로 이동한 경우 params의 값 {id:'something'} 확인가능
  // => "/test/:id" 라는 라우트가 있다면 useParams 로 :id 파라미터를 가져올 수 있음
  return (
    <>
      <div>
        <h3>Topics</h3>
        <p>원하는 메뉴를 선택하세요요</p>
        <ul>
          <li>
            <NavLink to="/topics/join">회원가입</NavLink>{" "}
          </li>
          <li>
            <NavLink to="/topics/login">로그인</NavLink>{" "}
          </li>
          <li>
            <NavLink to="/topics/board">게시판</NavLink>{" "}
          </li>
        </ul>
        <Routes>
          <Route path="/join" element={"회원가입 페이지"}></Route>
          <Route path="/login" element={"로그인 페이지"}></Route>
          <Route path="/board" element={"게시판 페이지"}></Route>
        </Routes>
      </div>
    </>
  );
}
