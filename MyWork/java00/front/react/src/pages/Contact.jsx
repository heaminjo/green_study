import { useLocation, useSearchParams } from "react-router-dom";
import emotion1 from "../images/emotion1.png";
import emotion2 from "../images/emotion2.png";
import emotion3 from "../images/emotion3.png";
import emotion4 from "../images/emotion4.png";
import emotion5 from "../images/emotion5.png";
export default function Contact() {
  console.log("Contact Update");
  // ** useSearchParams 와 useLocation
  // => useSearchParams()
  //    url 에 있는 쿼리 스트링의 값을 꺼내어 사용할 수 있도록 해줌.
  //
  // => useLocation()
  //    현재 라우터의 위치를 나타내는 location 객체를 return
  //    현재 위치에 관한 정보가 필요할떄 이용됨.
  // => location 객체의 속성 : pathname, search(쿼리문자열), state 등

  // => useState 처럼 배열형태로 반환
  // => 첫번째 요소: 조회, 수정가능한 메서드를 포함하고있는 쿼리스트링 객체
  // => 두번째 요소: 이 객체를 업데이트하는 함수 (즉, 새로운 쿼리스트링을 설정할수있음)

  // 1) Emotion Data 배열
  const emotionList = [
    { id: 1, name: "완전 좋음", img: emotion1 },
    { id: 2, name: "좋음", img: emotion2 },
    { id: 3, name: "그럭저럭", img: emotion3 },
    { id: 4, name: "나쁨", img: emotion4 },
    { id: 5, name: "끔찍함", img: emotion5 },
  ];

  function SelectEmotion() {
    //쿼리스트링을 읽고 수정하는 변수 생성
    const [searParams, setSearchParams] = useSearchParams();
    console.log(searParams.get("id"), searParams.get("name"));

    //전달받은 params값들을 받아놓는다.(문자형태인 숫자자)
    const searchId = searParams.get("id");

    const location = useLocation();
    console.log(`location : ${location}`);
    console.log(`location : ${location.pathname}`);
    console.log(`location : ${location.search}`);

    //일치하는것을 찾지 못했을 경우 not Found 정의
    let selected_item = {
      name: "sorry",
      img: emotion5,
    };

    //
    //배열에서 id 와 일치하는 이미지 찾기
    //id 의 존재 여부
    if (parseInt(searchId) > 0) {
      //선택했을 경우우

      //일치하는 emotion 객체 찾기
      const find_item = emotionList.find(({ id }) => id === parseInt(searchId));

      //값이 있다면 넣어준다
      if (find_item) selected_item = find_item;
    } else {
      //이무것도 선택 안했을 경우
      selected_item.name = "번호를 선택하지 않았습니다.";
      selected_item.img = null;
    }
    return (
      <div>
        <h3>
          {searParams.get("name")}
          {selected_item.name}
        </h3>

        {/* 선택한 이미지가 출력되도록 한다 */}
        <img src={selected_item.img} />
      </div>
    );
  }
  return (
    <>
      <div>
        <h3>Contact, EmotionList & Image Test</h3>
        {/* image 경로설정

        img 폴더가 public 하위에 존재하는 경우

        img 폴더가 src 하위에 존재하는 경우 */}
        <img alt="감정1" src={emotion1} width={100} height={100} />
        <img alt="감정2" src="img/emotion2.png" width={100} height={100} />
        <img alt="감정3" src={emotion3} width={100} height={100} />
        <img alt="감정4" src={emotion4} width={100} height={100} />
        <img alt="감정5" src={emotion5} width={100} height={100} />
        <p>요청 사항을 주소창에 쿼리스트링으로 작성해주세요</p>
        <p>예) http://localhost:3000/contact? id=1&name=홍길동 </p>
        {/* 결과는 아래 컴포넌트로 출력 */}

        <SelectEmotion />
      </div>
    </>
  );
}
