-- DML
-- select distinct | * | 컬럼명 as 별칭, 컬럼명 별칭,....
-- from 테이블이름
-- [where 조건식 ]
-- [order by 컬럼명 desc | asc , .. ]

SELECT * from emp2;
select name, empno, emp_type from emp2;
select name, empno, emp_type from emp2 where emp_type='정규직';
select name, empno, emp_type from emp2 where emp_type='정규직' order by name desc; -- default 오름차순(asc)
select name, empno, emp_type from emp2 order by name desc; -- default 오름차순(asc)

select name, empno, emp_type, deptno from emp2 order by name desc, deptno asc; -- default 오름차순(asc)


select * from emp2 order by 2 desc, 4 asc; -- table은 1부터 시작!!!! 

--
SELECT DISTINCT emp_type from emp2;

SELECT DISTINCT deptno from emp2;

SELECT DISTINCT deptno from emp2 where emp_type='정규직';

select name as "성 명",empno as 사원번호 ,deptno "부 서" ,emp_type 근무타입, position as "직 급"
from emp2
where position='부장';

select name as "성 명",empno as 사원번호 ,deptno "부 서" ,emp_type 근무타입, position as "직 급"
from emp2
where position='과장' and name='유관순';


select name as "성 명",empno as 사원번호 ,deptno "부 서" ,emp_type 근무타입, position as "직 급"
from emp2
where position='부장' and name='유관순';

select name as "성 명",empno as 사원번호 ,deptno "부 서" ,emp_type 근무타입, position as "직 급"
from emp2
where position='부장' or name='유관순';

select * from emp2 where deptno=1000;


-- delete/update 하기 전에 반드시 select * 하기!!!!!!! 


select * from emp2;

-- 문제1] emp_type이 수습직,계약직 직원만 검색
select * from emp2 where emp_type='수습직' or emp_type='계약직';
select * from emp2 where emp_type in ('수습직','계약직');


-- 문제2] 취미가 등산 이거나 골프인 직원만 검색
select * from emp2 where hobby='등산' or hobby='골프';
select * from emp2 where hobby in ('등산','골프');



-- 문제3] 직책(position)이 null인 사람들만 검색
select * from emp2 where position is null; -- = null 불가
select * from emp2 where position is not null;

-- 문제4] 필드가 사번, 이름, 취미, 월급 필드만 보여주고, 별칭으로 적용해서 출력
select empno 사번, name 이름, hobby as 취미, pay as 월급 from emp2;


-- 연산자
select mod(7,3) from dual;


select * from professor;
select name, bonus, position 
    from professor;

select name, bonus, position 
    from professor
    where bonus is null; -- is null || is not null

select * from professor;

select name, bonus + 100, position  from professor; -- null 연산은 무조건 null

-- nvl함수사용
select name, bonus + 100, position  from professor;
select name, bonus + 100, nvl(bonus,0), position  from professor;
select name, nvl(bonus,0)+100, position  from professor;

select * from student;

select * from student where grade in(3,2,1);

select * from student where grade not in(3,2,1);

select * from professor where deptno between 103 and 201; -- between 작은 값 and 큰 값!

select * from emp2 where name like '김%';
select * from emp2 where name like '%나';
select * from emp2 where name like '%윤%';

select * from professor;
select * from professor where name like '__';
select * from professor where name like '허_';
select * from professor where name like '_은';

select * from professor where name like '나_%';
select * from professor where name like '나__';

select * from professor where pay > 500;
select * from professor where pay <= 300;
select * from professor where pay >= 250 and pay <500;
select * from professor where pay >= 250 or pay <500;

----------------------------------------------
--문제1] 급여가 500이상이고, 보너스가 60이상 받는 교수는? (professor table)
select * from professor;
select * from professor where pay >= 500 and bonus >= 60;

--문제2] 이름이 '나한라'을 '너한라'으로 변경 (emp2)
select * from emp2;
update emp2 set name ='너한라' where name = '나한라';

--문제3] 취미가 등산인 사람들만 찾아서 '수영'으로 변경
select * from emp2;
update emp2 set hobby='수영' where hobby='등산';

--문제4] 계약직 직원 찾아서 삭제하기
select * from emp2;
delete emp2 where emp_type='계약직';

--문제5] pay(or bonus)가 50이상인 사람만 출력 (professor )
select * from professor where bonus>=50 and bonus is not null; -- oracle은 null 값이 높은 순위임

--문제6] ~세트가 아닌 상품들만 출력 ( gift table)
select * from gift;
select * from gift where gname not like '%세트';

--문제7] gno가 10인 상품의 이름을 널처리(null) 하세요.
select * from gift where gno=10;
update gift set gname=null where gno=10;

--문제8] gname 이름이 없고, g_start가 999인 값을 갖는 데이터 입력하세요. (없으면 insert)
select * from gift;
insert into gift values(11,null,999,2000);

--문제9] gname이 null이거나 ' ' 인 데이터를 제외하고 출력하시오.
select * from gift where gname is not null or gname!=' ';

--정규직 이면서 '백원만' 찾기
select * from emp2;
select * from emp2 where emp_type='정규직' and name='백원만';

--정규직 이거나 '유도봉' 찾기
select * from emp2 where emp_type='정규직' or name='유도봉';

--수습직 이거나 김씨성을 가진 사람 찾기
select * from emp2 where emp_type='수습직' or  name like '김%';

--김씨가 아닌 수습직원 찾기
select * from emp2 where emp_type='수습직' and  name not like '김%';


--문제1] 이름에서 '김주현' 사람들을 보여주세요.
select * from student where name ='김주현';

--문제2] 이름에서 '김'씨 성을 가진 사람들을 보여주세요.  - 모든 : % , 한글자 : _
select * from student where name like '김%';

--문제3] 이름이 두 글자인 사람 보여주세요.
select * from student where name like '__';

--문제4] id에 s or a 글자가 들어가는 사람 찾기
select * from student where id like '%s%' or id like '%a%';

--문제5] 전임강사 찾아주세요 (professor)
select * from professor;
select * from professor where position in ('전임강사');

--문제6] 학년이 3학년(grade)이고 키(height)가 165이상인 학과코드(deptno1)가 201인 학생 찾기
select * from student where grade in(3) and  height >= 165 and deptno1=201;

--문제7] 생일이 77년 이전인 학생들 찾기
select * from student where birthday < '1977/01/01';
select * from student where birthday < TO_Date('1977-01-01','yyyy-MM-DD'); -- 문자열을 데이트 타입으로 바꿔줌
select * from student where extract(year from birthday) < 1977; 
select * from student where substr(birthday,0,2) < 77;

--문제8] 부전공(deptno2)을 가진 학생들만 찾기
select * FROM student where deptno2 is not null;

--문제9] 담당교수(profno)가 1000 ~ 2001 번 사이 학생들 찾기
select * from student where profno between 1000 and 2001;


-----------------------------------
/*
ANY : 최소값 보다 크면
 필드명(pay) >= ANY : 최소값보다 크거나 같으면   any( 300, 550, 400 )
  < ANY : 최대값보다 작으면
  <= ANY : 최대값보다 작거나 같으면
   = ANY : IN과 같은 효과
  != ANY : NOT IN과 같은 효과
*/
/*
ANY와는 반대되는 개념입니다.

  필드명(pay) > ALL : 최대값 보다 크면  all( 300, 550, 400 )
>= ALL : 최대값보다 크거나 같으면
< ALL : 최소값보다 작으면
<= ALL : 최소값보다 작거나 같으면
= ALL : SUBSELECT의 결과가 1건이면 상관없지만 여러 건이면 오류가 발생합니다.
!= ALL : 위와 마찬가지로 SUBSELECT의 결과가 여러 건이면 오류가 발생합니다
*/

