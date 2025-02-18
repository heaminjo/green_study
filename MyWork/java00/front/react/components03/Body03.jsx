import { useState } from "react";

export default function Body(props) {
  const [count, setCount] = useState(0);
  const [text, setText] = useState("");
  const [date, setDate] = useState("");
  const [newDate, setNewDate] = useState("");
  let check = 0;
  const onIndrease2 = () => {
    check++;
    if (check % 5 == 0) {
      setCount(count + 5);
    }
  };

  const onDecrease2 = () => {
    check--;
    console.log(`check = ${check}`);
    console.log(`count = ${count}`);

    if (check % 5 == 0) {
      setCount(check);
    }
  };

  const onChangeInput = (e) => {
    setText(e.target.value);
  };

  const dateChange = (e) => {
    setDate(e.target.value);
  };
  const datePick = (e) => {
    setNewDate(date);
  };

  const [option, setOption] = useState("비빔밥");
  const menuChange = (e) => {
    setOption(e.target.value);
  };
  return (
    <>
      <h1>{count}</h1>
      <button onClick={onIndrease2}>증가</button>
      <button onClick={onDecrease2}>감소</button>
      <br />
      <input value={text} onChange={onChangeInput} /> <span>{text}</span>
      <br />
      <input type="date" value={date} onChange={dateChange} />
      <button onClick={datePick}>날짜 결정</button>
      <h2>날짜 : {newDate}</h2>
      <br />
      <select value={option} onChange={menuChange}>
        <option>짜장면</option>
        <option>짬봉</option>
        <option>칼국수</option>
        <option>돈카츠</option>
        <option>신라먄</option>
      </select>
      <p>고른 메뉴 : {option}</p>
    </>
  );
}
