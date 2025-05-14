/*
    main2.js
*/

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
});
