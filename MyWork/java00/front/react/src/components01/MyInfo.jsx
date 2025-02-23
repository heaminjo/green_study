import { useLocation, useNavigate } from "react-router-dom";

export default function MyInfo() {
  const location = useLocation();
  console.log(`location.pathname = ${location.pathname}`);
  console.log(`location.search = ${location.search}`);
  console.log(`location.state = ${location.state}`);

  const navigate = useNavigate();
  // const { id, userName } = location.state;
  return (
    <div>
      <div className="contents">
        <p className="pageTitle">My Infomation</p>
        <p>UserId : {location.state.id}</p>
        <p>UserName : {location.state.userName}</p>
      </div>
      <p></p>
      <button onClick={() => navigate(-2)}>2PagesBack</button>
      <button onClick={() => navigate(-1)}>Bback</button>
      <button onClick={() => navigate(1)}>Forward</button>
      <button onClick={() => navigate(2)}>2PagesForward</button>
      <button onClick={() => navigate("/")}>Root</button>
    </div>
  );
}
