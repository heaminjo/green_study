import logo from "./logo.svg";
import "./App.css";

import React from "react";
import Header from "./components03/Header";
import Footer from "./components03/Footer";
import Body from "./components03/Body02";

function App() {
  let test = "Green Computer";
  const bestDress = {
    color: "Blue",
    style: "Long_Sleeveless",
    price: 9900,
    size: ["xs", "small", "medium", "large", "xl"],
  };
  return (
    <>
      <Header {...bestDress} />
      <Body name={test} country={"대한민국"} />
      <Footer />
    </>
  );
}
// ** React.Fragment(조각)
// => 리액트는 둘 이상의 형제 엘리먼트를 랜더링 하지않으므로
//    ( 최상위 Tag 규칙, 프래그먼트 사용을 권장하는 오류 발생 )
//    이들을 <div> 와 같은 Tag로 감싸 주어야 하는데,
//    이때 <React.Fragment> Tag 로 감싸면 불필요한  <div> 사용을 줄여줌
// => <React.Fragment> 는 렌더링 되지않음
// => 사용시 react import 필요함.
export default App;
