/**
 * main.js
 */

/*

let fruits = ["Apple", "Banana", "Cherry"];
console.log(fruits[0]);
console.log(fruits[1]);
console.log(fruits[2]);

console.log(new Date("2025-05-14"));
console.log(new Date("2025-05-14").getDay()); //요일일
console.log(new Date("2025-05-14").getFullYear());
console.log(new Date("2025-05-14").getMonth());
console.log(new Date("2025-05-14").getTime());
console.log(new Date("2025-05-14").getUTCDate());

// String(문자데이터) : 따옴표를 사용한다.
let myName = "heejin";
let email = "naver.com";
let hap = "안녕하세요 " + myName + "입니다:)";
let hap2 = `안녕하세요 ${myName}입니다.`;
console.log(myName);
console.log(email);
console.log(hap);
console.log(hap2);

//Number(숫자데이터) : 정수 및 부동소숫점 숫자
let num = 100;
console.log(num);
num = 99;
console.log(num);

let opacity = 1.34;
console.log(opacity);

// Boolean Type :true false [논리데이터]
let checked = true;
let isShow = false;
console.log(checked);
console.log(isShow);

// Undefined : 값이 할당되지 않은 상태
let undef;
console.log(undef);

let obj = { pw: 1234, pass: "abc" };
console.log(obj.pw);
console.log(obj.pass);

// Null : 어떤 값이 의도적으로 비어있음을 나타냄
let empty = null;
console.log(empty);

// Object 객체 데이터 : 여러개의 데이터를 key-value 타입으로 넣음

*/

//변수 선언 : 재사용(재할당)이 가능
let a = 2;
let b = 5;
console.log(a + b);
console.log(a - b);
console.log(a * b);
console.log(a / b);

a = 12;
b = 999;
console.log(a + b);
console.log(a - b);
console.log(a * b);
console.log(a / b);

// 값(데이터) 재할당 불가
const aa = 2;
const bb = 5;
console.log(aa + bb);
console.log(aa - bb);
console.log(aa * bb);
console.log(aa / bb);

/*
main.js:83 Uncaught TypeError: Assignment to constant variable.
    at main.js:83:4
 */
// aa = 5;
// bb = 7;

// 예약어
// let break = 'Heejin' -> error
console.log(this);

//함수선언
function myFunc() {
  //실행코드
  console.log(1004);
}

//함수호출
myFunc();

// 함수선언 with return type
function returnFuc() {
  return 300;
}

console.log(returnFuc());

//함수선언 with 매개변수
function sumFunc(x, y) {
  return x + y;
}

console.log(sumFunc(1, 2));

let c = sumFunc(3, 4);
let d = sumFunc(5, 6);
let e = sumFunc(7, 8);

console.log(c, d, e);

// 기명함수(이름이 있는 함수)
function hello() {
  console.log("Hello!");
}

// 익명함수(이름이 없는 함수)
let world = function () {
  console.log("World");
};

hello(), world();

// 객체 데이터
const person = {
  name: "강감찬",
  age: 85,

  //메소드도 가능
  getName: function () {
    return this.name;
  },

  getAge: function () {
    return this.age;
  },
  setName: function (newName) {
    this.name = newName;
  },
  setAge: function (newAge) {
    this.age = newAge;
  },
};

const hisName = person.getName();
console.log(hisName);

console.log(person.getName());
person.setName("임희진");
console.log(person.getName());
