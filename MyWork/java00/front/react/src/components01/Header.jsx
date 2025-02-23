import { Link, NavLink, useNavigate } from "react-router-dom";
import "../styles/Header.css";
export default function Header({
  isLogin,
  userName,
  userId,
  onRequestPage,
  onLogout,
}) {
  const navigate = useNavigate();

  return (
    <div className="headerTop">
      <h3>React Router Test</h3>
      <div className="headerLeft">
        <a href="http://naver.com">Naver</a>
        <Link to="/">Home</Link>
      </div>
      <div className="serviceTab">
        <ul className="serviceTabList">
          {isLogin ? (
            <>
              <li>{userName}님</li>
              <li>
                <NavLink
                  to="/"
                  onClick={() => {
                    onLogout();
                  }}
                >
                  로그아웃
                </NavLink>
              </li>
              <li>
                <span
                  onClick={() => {
                    navigate("/myInfo", {
                      state: { id: userId, userName: userName },
                    });
                  }}
                  className="textLink"
                >
                  마이페이지
                </span>
              </li>
              <li>
                <span
                  onClick={() => {
                    onRequestPage("/memberList");
                  }}
                  className="textLink"
                >
                  회원목록
                </span>
              </li>
              <li>
                <span
                  onClick={() => {
                    onRequestPage("/boardList");
                  }}
                  className="textLink"
                >
                  게시판
                </span>
              </li>
            </>
          ) : (
            <>
              <li>
                <Link to="/login">로그인</Link>
              </li>
              <li>
                <Link to="/join">회원가입</Link>
              </li>
              <li>
                <Link to="/boardList">게시판</Link>
              </li>
            </>
          )}
        </ul>
      </div>
    </div>
  );
}
