import "./App.css";
import Controller from "./components04/Controller";
import Even from "./components04/Even";
import Viewer from "./components04/Viewer";
import { useEffect, useRef, useState } from "react";

function App() {
  const [count, setCount] = useState(0);
  const [text, setText] = useState("");

  const onChangeText = (e) => {
    console.log(`text: ${e.target.value}`);
    setText(e.target.value);
  };
  const onChangeCount = (num) => {
    setCount(count + num);
  };
  console.log("**App 랜더링**");

  // useEffect(() => {
  //   console.log("text바뀜");
  // }, [text]);

  // useEffect(() => {
  //   console.log(`use count = ${count} , text = ${text}`);
  // }, [count, text]);

  //빈배열열
  // useEffect(() => {
  //   console.log();
  //   isLoad()
  // }, []);
  const isLoad = useRef(false);

  // useEffect(() => {
  //   if (!isLoad.current) {
  //     isLoad.current = true;
  //   } else {
  //     console.log("문서가 랜더링 된 이후입니다.");
  //   }
  // });

  // ** 2. 함수형 컴포넌트의 LifeCycle
  // => 컴포넌트는 개념적으로 props를 input으로 하고
  //    UI가 어떻게 보여야 하는지 정의하는 React Element를 output으로 하는 함수.
  // => UI를 구성하기 위해서는 화면에 컴포넌트를
  //    그리고(Mounting), 갱신하고(Updating), 지워야(Unmounting) 함.
  // => 컴포넌트는 이 과정에서 각 프로세스 진행단계별로 Lifecycle 함수로 불리는 특별한 함수가 실행됨.
  //    개발자는 이를 재정의하여 컴포넌트를 제어할 수 있음. (클래스컴포넌트)

  // => 랜더링의 의미
  //  -> 리액트엘리먼트(Virtual DOM) 들을 HTML DOM(Real DOM) 으로 이동시켜 브러우져에 표시 되도록함.
  //  -> 리액트엘리먼트 특징
  //    - 자바스크립트 객체형식
  //    - 불변성: 엘리먼트 생성후에는 속성, 자식 등을 변경할수 없음
  //    - 업데이트(리랜더링): new 엘리먼트를 생성하고 real DOM에 바꿔치기 하는것

  // => Mounting : 컴포넌트를 페이지에 처음 랜더링 할때
  // => Updating : State, Props 값이 바뀌거나 부모컴포넌트가 리랜더 하면서 자신도 리랜더 될때
  // => Unmounting : 컴포넌트가 페이지에서 제거될때 (더이상 랜더링하지않음)

  // => 함수 컴포넌트에서는 useEffect 를 이용하여 제어함.

  // 3. useEffect
  // => 어떤 값이 변경될때 마다 특정코드를 실행하는 리액트훅이며
  //    이것을 "특정값을 검사한다" 라고도 표현함
  // => 예를 들면 State 값이 바뀔때 마다 변경된 값을 콘솔에 출력하게 할 수 있음

  // => 목적: side effect 를 수행하기위한 훅
  //  -> side effect
  //     사이드이펙트, 사전적 직역은 (예상치못한) 부작용 을 의미
  //     대상의 옆에서 효과가 난다는 의미에서 나옴
  //     개발시에는 의도치 않은 코드 실행으로 버그발생시 사이드이펙트가 발생했다고 함
  //     그러나 리액트에서는 effect(효과, 영향) 의 의미로 쓰이며
  //     다른 컴포넌트에 영향을 줄 수 있으며, 랜더링 도중에는 작업이 완료될수 없기 때문에
  //     랜더링 후에 실행되어야 하는 작업들을 의미함.
  //     예를 들면 전역변수 수정, 서버에서 데이터를 받아오거나, 수동으로 DOM 조작,
  //     타이머 설정 등의 작업을 말함.

  // => useEffect(callback_함수, [deps]_의존성 배열)
  //    두번째 인자인 의존성 배열요소의 값이 변경되면 첫번째 인자인 콜백함수를 실행함
  //  -> 두번째 인자값 초기화 할때도 감지함
  //  -> 두번째인자가 없는 useEffect : 조건값이 제시되지않았으므로 랜더링 할때마다 호출됨
  //  -> 두번째인자가 빈배열 인경우 : 마운트 시점에만 콜백함수 실행, 그러므로 Mount 제어에 이용

  // => 첫번째인자인 callback_함수의 주의사항
  //  -> 전역변수 사용 불가능, 함수 내부에서 정의한 지역변수만 사용가능
  //  -> useState 와 useRef 로 정의한 변수는 접근 가능함 (아래 예제 참고)

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // ** Test
  // => 1) State 변수인 count 값이 바뀌면 바뀐값을 콘솔로 출력한다.
  // => 2) State 변수 text 추가후 확인하기.
  // => 3) 두번째인자가 없는 useEffect
  // => 4) LifeCycle 제어1: Mount 제어
  // => 5) LifeCycle 제어2: Update(리랜더링)시에만 호출하도록 변경
  // => 6) LifeCycle 제어3: UnMount 제어
  //    6.1) 클린업 이해 (setInterval 활용)
  //    6.2) 클린업을 이용한 언마운트 제어하기

  // useEffect(() => {
  //   //setInterval을 변수에 저장
  //   const intervalID = setInterval(() => {
  //     console.log(`깜빡깜빡`);
  //   }, 1000);

  //   return () => {
  //     console.log("클린업 함수");
  //     clearInterval(intervalID);
  //   };
  // });

  const isEven = useRef(false);

  useEffect(() => {
    if (!isLoad.current) {
      isLoad.current = true;
    } else {
      console.log();
      count % 2 == 1 ? (isEven.current = true) : (isEven.current = false);
    }
  }, [count]);

  return (
    <>
      <div className="App">
        <h3>Simple Counter와 함수 컴포넌트의 LifeCycle</h3>
        <section>
          <Viewer count={count} />
          <Controller onChangeCount={onChangeCount} />
        </section>
        <section>
          <input value={text} onChange={onChangeText} />
        </section>
        <section>{count % 2 === 0 && <Even />}</section>
      </div>
    </>
  );
}
export default App;
