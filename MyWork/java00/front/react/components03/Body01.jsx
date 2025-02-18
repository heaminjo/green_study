import img1 from "../images/mung.png";

export default function Body(props) {
  let boo1 = true,
    boo2 = false;
  let n1 = 11,
    n2 = 22;
  let s1 = "안녕하세요~~",
    s2 = "hello";
  let obj = { id: "banana", name: "바나나" };

  const clickTest = (e) => {
    alert(`Event test: hello ${e.target.name}`);
    console.log(`type : ${e.type}`);
  };

  return (
    <div className="body">
      <h2>body : props & JSX Test</h2>
      <p>name = {props.name}</p>
      <p>country = {props.country}</p>
      <p>산술식 : n1 + n2 = {n1 + n2}</p>
      <p>문자식 : s1 + s2 = {s1 + s2}</p>
      <p>
        논리식 : boo1 = {boo1.toString()}, AND = {(boo1 && boo2).toString()},
        관계식 = {s1 == s2}
      </p>
      <p>
        객체 : obj = {obj.id} , {obj.name}
      </p>
      <p>삼항식 : n1 + n2 의 결과는 {(n1 + n2) % 2 == 0 ? "짝수" : "홀수"}</p>

      {boo1 && <p>true 입니다</p>}

      <h2 style={{ color: "white", backgroundColor: "hotpink" }}>
        스타일 적용
      </h2>
      <img
        src={img1}
        alt={"imagedTest"}
        style={{ width: "100px", height: "100px" }}
      />

      <button
        name="apple"
        onClick={(event) => {
          clickTest(event);
        }}
      >
        Apple:콜백함수 방식
      </button>
      <button
        name="banana"
        onClick={(event) => {
          clickTest(event);
        }}
      >
        바나나나
      </button>
    </div>
  );
}
