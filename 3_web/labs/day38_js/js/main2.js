/*
    main2.js
*/

import getType from "./getType";
import { userRandom } from "./getType";

// HTML 요소(Element) 한개를 검색/찾기
const boxEls = document.querySelectorAll(".box");
console.log(boxEls);

//찾은 요소를 반복해서 함수 실행 - 익명함수 추가
/*
찾은 요소를 반복해서 함수 실행 - 익명함수 추가
//1.반복중인 요소값 , 2.인덱스값, 3. 전체요소
boxEls.forEach(function (1,2,3) {});
*/

boxEls.forEach(function (item, idx) {
  console.log(idx, item);
  //   item.classList.add(`order-${idx + 1}`);
});

const boxEl = document.querySelector(".box");
console.log(boxEl);

/*
 HTML 요소에 적용할 수 있는 메소드
 인수(arguments)를 추가

boxEl.addEventListener(1, 2);   || 1: event 2: 할일(함수로)
*/
boxEl.addEventListener("click", function () {
  console.log("CLICK!!!");
  boxEl.classList.add("active");
  console.log(boxEl.classList.contains("active"));
  boxEl.classList.remove("active");
  console.log(boxEl.classList.contains("active"));
});

//산술연산자
console.log(1 + 2);
console.log(1 - 2);
console.log(10 * 2);
console.log(1 / 2);
console.log(7 % 3);
