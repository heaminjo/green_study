import { useState } from "react";

export default function Body(props) {
  //개별적 관리
  // const [name, setname] = useState("");
  // const [gender, setGender] = useState("");
  // const [birth, setBirth] = useState("");
  // const [info, setInfo] = useState("");

  // const nameChange = (e) => setname(e.target.value);
  // const genderChange = (e) => setGender(e.target.value);
  // const birthChange = (e) => setBirth(e.target.value);
  // const infoChange = (e) => setInfo(e.target.value);

  const [member, setMember] = useState({
    name: "",
    gender: "",
    birth: "",
    info: "",
  });

  const memberChange = (e) => {
    //현재 멤버가 가지고있는 값을 펼쳐놓는다.
    console.log(e.target.name);
    console.log(e.target.value);
    setMember({ ...member, [e.target.name]: e.target.value });
  };
  return (
    <div className="body">
      <div>
        <input
          name="name"
          value={member.name}
          onChange={memberChange}
          placeholder="이름"
        />
      </div>
      <div>
        <select name="gender" value={member.gender} onChange={memberChange}>
          <option>여자</option>
          <option>남자</option>
        </select>
      </div>
      <div>
        <input
          type="date"
          value={member.birth}
          name="birth"
          onChange={memberChange}
        />
      </div>
      <div>
        <textarea
          name="info"
          value={member.info}
          onChange={memberChange}
        ></textarea>
      </div>
    </div>
  );
}
