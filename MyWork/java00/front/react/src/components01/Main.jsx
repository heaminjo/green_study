import BList from "./BList";
import Join from "./Join";
import Login from "./Login";
import MainDefault from "./MainDefault";

import { Route, Routes } from "react-router-dom";
import MyInfo from "./MyInfo";
import MList from "./MList";
import Post from "./Post";

export default function Main({ onLoginSubmit }) {
  return (
    <div>
      <Routes>
        <Route path="/" element={<MainDefault />} />
        <Route path="/join" element={<Join />} />
        <Route
          path="/login"
          element={<Login onLoginSubmit={onLoginSubmit} />}
        />
        <Route path="/boardList/post/:id" element={<Post />} />
        <Route path="/boardList" element={<BList />} />
        <Route path="/myInfo" element={<MyInfo />} />
        <Route path="/memberList" element={<MList />} />
      </Routes>
    </div>
  );
}
