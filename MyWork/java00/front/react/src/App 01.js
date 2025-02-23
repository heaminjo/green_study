import logo from "./logo.svg";
import "./App.css";
import Contact from "./pages/Contact";
import Home from "./pages/Home";
import Topics from "./pages/Topics";
import { Link, NavLink, Route, Routes } from "react-router-dom";

function App() {
  return (
    <>
      <div className="App">
        <h3>Router Test</h3>
        {/* <Home />
        <Topics />
        <Contact /> */}
        {/* <ul>
          <li>
            <a href="/">Home</a>
          </li>
          <li>
            <a href="/topics">Topics</a>
          </li>
          <li>
            <a href="/contact">Contact</a>
          </li>
        </ul> */}
        <ul>
          <li>
            <NavLink to="/">Home_L</NavLink>
          </li>
          <li>
            <NavLink to="/topics">Topics_L</NavLink>
          </li>
          <li>
            <NavLink to="/contact">Contact_L</NavLink>
          </li>
        </ul>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/topics/*" element={<Topics />} />
          <Route path="/contact" element={<Contact />} />
          <Route path="/*" element={"없는 요청 입니다."} />
        </Routes>
      </div>
    </>
  );
}

export default App;
