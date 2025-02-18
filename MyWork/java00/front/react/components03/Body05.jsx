import { useState } from "react";

function Viewer01(props) {
  let { num } = props;
  console.log(`Child Viewer01 : num: ${num}`);
  return (
    <>
      <p>여기는 child 컴포넌트트</p>
      <h3> {num}은</h3> {num % 2 == 0 ? <h3>짝수</h3> : <h3>홀수</h3>}`
    </>
  );
}

function Viewer02(props) {
  let { age } = props;
  console.log(`Child Viewer01 : num: ${age}`);
  return (
    <>
      <p>여기는 child 컴포넌트트</p>
      <h3> {age}은</h3> {age % 2 == 0 ? <h3>짝수</h3> : <h3>홀수</h3>}`
    </>
  );
}

export default function Body(props) {
  const [num, setNum] = useState(0);
  const [age, setAge] = useState(123);
  const onIncrease = () => {
    setNum(num + 1);
  };
  const onDecrease = () => {
    setNum(num + 1);
  };
  //** State 와 Props
  // => State 도 값이므로 Props 로 전달 가능
  // => Body 에 Child 컴포넌트 만들고 전달 Test
  // => 전달된 부모 State 값이 변하면 Child 컴포넌트도 리랜더링 됨.
  // => state 를 전달하지않은 경우와 비교
  //    부모가 리랜더링 되면 Child 컴포넌트도 리랜더링됨
  return (
    <div className="body">
      <p>state 변수 :nun : {num} </p>
      <p>props로 num을 child </p>
      <Viewer01 num={num}></Viewer01>
      <div>
        <button onClick={onIncrease}>증가</button>
        <button onClick={onDecrease}>감소</button>
      </div>
      <Viewer02 age={age} />
    </div>
  );
}
