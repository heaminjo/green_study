import { useState, useRef } from "react";
import "./body.css";
import img1 from "../images/mung.png";

export default function Body(props) {
  //** useRef_Reference Test
  // => DOM 요소를 직접 제어 할 수 있음.
  //    ( DOM 노드, 엘리먼트, 리액트 컴포넌트의 주소값 참조 가능
  //      JS 비교 : document.getElementById('root')   )

  // => useRef는 상태 값을 참조하되 그로인해 랜더링을 일으키지는 않게 하기 위해 사용하는 리액트훅
  //  -> ref 는 랜더링 중 읽거나 쓰려고 할 경우 순수기능을 잃고 예상치 못한 결과를 낼 수도 있어서
  //     event handler 에서 주로 사용함.
  //  -> 입력폼 초기화, 포커스하기 등에 사용

  // => current 속성을 가지고 있는 객체를 반환.
  //    인자로 넘어온 초깃값을  이 current 속성에 할당하며 이 속성은 값을 변경하여도
  //    리액트 컴포넌트는 리랜더링 되지 않으며,
  //    리액트 컴포넌트가 리랜더링 되는 경우도 이 속성의 값을 잃지 않음.

  // => 함수 컴포넌트에서는 Hooks (useEffect) 를 이용해서 처리가능
  // => 실습순서 : 카운터 앱 만들기, useEffect Test

  const [text, setText] = useState("");
  const textRef = useRef();

  const onChangeText = (e) => {
    console.log(e.target.value);
    setText(e.target.value);
  };

  const onClickBtn = () => {
    if (text.length < 3) {
      // textRef.current.focus();
    } else {
      alert("버튼클릭2:" + { text });
      textRef.current.value = "";
      console.log(text);
    }
  };
  return (
    <div className="body">
      <h2>TEst</h2>
      <input type="text" onChange={onChangeText} ref={textRef} />
      <button onClick={onClickBtn}>클릭</button>
    </div>
  );
}
