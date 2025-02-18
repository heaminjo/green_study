import { useEffect } from "react";

export default function Even() {
  useEffect(() => {
    const intervalID = setInterval(() => {
      console.log(`깜빡깜빡`);
    }, 1000);

    return () => {
      console.log("클린업 함수");
      clearInterval(intervalID);
    };
  }, []);
  return <h1>짝수 입니다.</h1>;
}
