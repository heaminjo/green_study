import { useState } from "react";

export default function Body(props) {
  // ** 리액트 훅 (HOOK)
  // => 클래스 컴포넌트가 가지고 있던 유용한 기능을
  //    함수컴포넌트에서도 사용가능하도록 개발하여 제공하는 기능들
  //    use~~ 로 명명됨 (useEffect, useContext, useReducer, useCallBack, useMemo 등)
  //    HOOK(갈고리) : 클래스 기능을 낚아채듯 가져와 사용한다는데서 유래..
  // => HOOK 사용규칙
  //  -> 리액트의 함수 컴포넌트 또는 커스텀훅 에서만 호출가능
  //  -> 리액트 함수 컴포넌트의 최상위 레벨에서만 호출 가능
  //    ( 반복문, 조건문 중첩된 함수내에서는 호출할수 없음을 의미함 )
  // => 커스텀 훅 (Custom HOOK)
  //    여러 컴포넌트에서 반복적으로 사용되는 로직을 훅으로 만들어서 재사용할 수 있음

  // ** State
  // => 값을 저장하거나 변경 할 수 있는 객체로 이벤트와 함께 주로 사용됨.
  //    - 즉, 버튼 클릭시 버튼의 컬러를 변경할때 등에 사용됨
  //    - 이벤트 발생 -> 이로인하여 화면의 리랜더링이 필요한 경우 리랜더링이 자동으로실행될 수 있도록 해줌
  //      -> State변수 로 지정된 변수의 값에 변화가 일어나면 리액트 에서는 리랜더링 해줌
  // => useState 생성자함수로 State 생성
  //    const [text_State변수, setText_set함수] = useState("초기값");
  // => useState 를 호출하면 현재상태값과 이 State변수의 값을 변경하는 set함수를 담은 배열을 return.
  // => 이후 State변수 값이 변하면 이를 반영하기위해 컴포넌트를 리랜더링 함.
  //    ( 이것을 컴포넌트의 Update 라함 )

  // ** State 로 사용자 입력 관리하기
  // => 사용자가 Text 를 입력할때마다 console 출력하기
  // => 과제 "-" 버튼 만들기
  //    - 최소값은 0 : alert 경고창 출력
  //    - 최대값은 100 : alert 경고창 출력, 0 으로 초기화

  const [count, setCount] = useState(0);
  // let count = 0;
  const clickBtn = () => {
    setCount(count + 1);
    // count++;
    console.log(`카운트 : ${count}`);
  };
  return (
    <div className="body">
      <h2>Body : State Test</h2>
      <p>count : {count}</p>
      <button onClick={clickBtn}>+ 증가</button>
    </div>
  );
}
