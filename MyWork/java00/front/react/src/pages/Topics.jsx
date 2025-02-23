import { NavLink, Route, Routes, useParams } from "react-router-dom";

const contents = [
  { id: "1", title: "Join", description: "회원가입 입니다." },
  { id: "2", title: "Login", description: "로그인인 입니다." },
  { id: "3", title: "Board", description: "게시판 입니다." },
  { id: "4", title: "MyInfo", description: "마이페이지 입니다." },
];

function Topic() {
  //params을 통해 아이디을 전달 받는다.
  const { topic_id } = useParams();
  console.log(`topic_id = ${topic_id}`);

  //배열에서 구조분해하여 id만 가지고온다
  // id와 일치하는 객체를 findItem에 저장장
  const findItem = contents.find(({ id }) => id === topic_id);

  //일치하는 값이 없을 경우를 대비한 not Found 객체 생성성
  let selected_item = {
    title: "sorry",
    description: "not Found",
  };

  //일치하는 값을 찾을 경우 해당 객체를 selected_item에 저장
  if (findItem) selected_item = findItem;

  return (
    <div>
      <p>{selected_item.title}</p>
      <p>{selected_item.description}</p>
    </div>
  );
}
export default function Topics() {
  console.log("Topics Update");
  // ** Nested Routing
  // 1) 자식 page 1,2,3 추가 ( Topics01 )
  // => App.js의 라우트 path "/topics/*" 로 수정

  // 2) 배열로 목록 정의 ( Topics ) : ver02
  // 3) Topic 컴포넌트 추가 : ver02

  // ** useParams()
  // => 현재 URL에 포함되어 있는 파라미터를  key, value 형식의 객체형식으로 반환
  // => <Route path 속성에 ":?????" 로 정의된 파라미터 에 전달된 값을 객체에 담아 전달해주는 Hook.
  //   예) path /test/3 으로 이동한 경우 params의 값 {id:'3'}을 확인할 수 있고
  //      path /test/something 으로 이동한 경우 params의 값 {id:'something'} 확인가능
  // => "/test/:id" 라는 라우트가 있다면 useParams 로 :id 파라미터를 가져올 수 있음

  //출력할 컨텐츠 내용

  //contents 배열을 .map을 통해 한 행씩 가져와서 li 생성성.
  const liMap = contents.map(({ id, title }) => {
    return (
      <li key={id}>
        <NavLink to={"/topics/" + id}>{title}</NavLink>
      </li>
    );
  });
  return (
    <>
      <div>
        <h3>Topics</h3>
        <ul>{liMap}</ul>
        <Routes>
          <Route path="/:topic_id" element={<Topic />} />
        </Routes>
      </div>
    </>
  );
}
