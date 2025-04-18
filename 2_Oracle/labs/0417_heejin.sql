-- 함수 --
-- 1. 집계(그룹) 함수

select * from gift;
select sum(g_start)"최저가 합계", sum(g_end)"최고가 합계" from gift;
select count(*) from gift;
select count(gname) from gift;
select sum(g_start), avg(g_start), max(g_start), min(g_start) from gift; -- avg는 null 값 제외하고 나눈다.

--

select * from professor;
select sum(bonus), avg(bonus), max(bonus), min(bonus) from professor; -- avg는 null 값 제외하고 나눈다.
select count(*) from professor; -- * -> null 포함
select count(hpage) from professor; -- null 미포함

/*
rank(expr) whithin group(order by 컬럼명 asc|desc)
-> 전체 값을 대상으로 각 값의 순위를 구함

예) 급여가 3000의 등수 구하기
select rank(3000) within group(order by sal desc) from emp;
*/

select * from gift;
-- oracle은 null 값이 우선순위가 높음. mysql은 null 값의 우선순위가 낮음
select rank(600000) within group(order by g_end desc) from gift;
select rank(600000) within group(order by g_end desc) from gift where g_end is not null;
select rank(600000) within group(order by g_end desc) from gift where g_end is not null or g_end != ' ';
--select rank(600000) within group(order by g_end desc) from gift where g_end not in (' ', null);



desc gift;
insert into gift (gname, g_start) values ('사탕세트', 1000);
insert into gift (gname, gno) values ('사탕세트2', 12);
--update gift set g_end=' ' where gname='사탕세트2';


--문제] 키가 168인 사람은 몇 번째로 큰지 확인? (student)
select * from student;
select rank(168) within group(order by height desc) from student;

--문제] 몸무게가 58인 사람은 몇번째인지 등수 구하기
select rank(58) within group(order by weight desc) from student;

--문제] g_end가 200000, 600000 보다 작은 값 출력 ( any 이용 ) [gift]
select * from gift where g_end  < any(200000, 600000);

-------------

-- 집계 함수 사용시 Group by : 소계(부분합)
select * from student;
select grade, sum(height), avg(height), max(height), min(weight) from student;  -- 함께 사용 불가능
select grade, sum(height), avg(height), max(height), min(weight) from student group by grade; -- 그룹(집합) 필드는 일반 필드와 같이 사용 불가능 그래서 group by 필요


-- emp type 별로 pay, 합, 평균, 최고급여, 최하급여 구하기 (emp2)
select * from emp2;
select emp_type, sum(pay), avg(pay), max(pay), min(pay) from emp2 group by emp_type;

-- 조건 : where, having 절 이용한다.
select grade, sum(height), avg(height), max(height), min(weight) 
    from student 
    group by grade
    having avg(height)>172;
    
select emp_type, sum(pay), avg(pay), max(pay), min(pay) from emp2 group by emp_type having avg(pay) >= 30000000;

-- 숫자 함수
select round(12.3456789, 0), round(12.7456789, 0),round(12.3456789, 2), round(12.3416789, 2) from dual; -- 반올림, (숫자, 올릴 자리 수)
select ceil(12.34), ceil(-12.34) from dual; -- 올림한 정수 반환
select floor(12.34), floor(-12.34) from dual; -- 내림한 정수 반환
select trunc(12.3456789, 0), trunc(12.7456789, 0),trunc(12.3456789, 2), trunc(12.3416789, 2) from dual; -- 내림(절삭), (숫자, 올릴 자리)

select * from dept2;
select * from dept2, emp2; --비추


select * from professor;
--교수테이블에서 월급에 인상률 2%를 한 결과를 출력하시요. (소숫점 0으로 처리)
select profno, name, id, position, pay, round(pay *1.02,0)"인상 월급"  from professor;

--교수테이블에서 모든 교수들에게 보너스를 1000원씩 추가 지급하기 (널처리 할것)
select profno, name, id, position, pay,bonus+1000, deptno, email, hpage from professor ;
select name, bonus from professor;
select bonus, nvl(bonus,0)+1000 from professor;
update professor set bonus = nvl(bonus,0)+1000;
rollback;



-- 문자 함수
select * from professor;
select upper('abcd'),lower('ABCD') from dual;

select id, upper(id), lower(id) from professor;
select id, initcap(id), length(id) from professor;

select * from dept2;
select dname, length(dname), lengthb(dname) from dept2; --한글자는 3byte 처리
select length('사장실') from dual; -- 한글 한글자 1byte 처리
select lengthb('사장실') from dual; -- 한글 한글자 3byte 처리

select * from gogak;
select jumin, substr(jumin,7,1) from gogak;
select instr('abcd','b') from dual; // 인덱스 1부터 시작
select id, instr(id,'b') from professor;
select instr('abcdefjfdskldvjsflkdsfjv','v',-1) from dual; --뒤에서부터 검색 그러나 결과는 앞에서부터 센다.
--select instr('abcdefjfdskldvjsflkdsfjv','v',-3) from dual; -- 뒤에서부터 3번째 부터 검색 그러나 의미 없음!! 그냥 -1부터 세라

-- lpad rpad
select lpad('abcd',20,'#') from dual; // 20자리 중에서 왼쪽 공백에 #으로 채우고 나머지 글자
select rpad('abcd',20,'@')from dual; // 20자리 중에서 오른쪽 공백에 @로 채우고 나머지 글자
select lpad('한글',10,'*') from dual; // 한글 2byte씩 잡음

select dname, length(dname), lengthb(dname) from dept2;
select dname, substr(dname,3) from dept2;
select dname, substr(dname,2,3) from dept2;

select rpad(dname, 10, substr('1234567890', length(dname)+1)) "rpad 연습" from dept2;

select ltrim('  ab cde fghi jk  ') from dual; --왼쪽 공백제거
select rtrim('  ab cde fghi jk  ') from dual; --오른쪽 공백제거

select concat(name,position) || '님' from professor where deptno=101; -- 글자 붙이기
select name || ' ' || position || '님' from professor; -- || 이용해서 붙여도 가능하다!\

//Student 테이블에서 아래와 같이 1 전공(deptno1)이 101 번인 학생들의 
-- 이름을 출력하되 가운데 글자만 ‘#’ 으로 표시되게 출력하세요. 
select * from student;
select deptno1, replace(name, substr(name,2,1),'#') from student where deptno1=101;
select name, replace(jumin, substr(jumin,7,13),'*******') from student where deptno1=101; -- 이거 잘 모르겠음

-- Student 테이블에서 아래 그림과 같이 1 전공이 102 번인 학생들의 이름과 전화번호, 전화번호에서 국번 부분만 ‘#’ 처리하여 출력하세요. 단 모든 국번은 3자리로 간주합니다.
select name, tel, replace(tel, substr(tel,5,3),'###') from student where deptno1=102;


---------------------------------
--날짜 함수

select sysdate from dual;

select months_between(sysdate,'2018/12/20') from dual;
select NEXT_DAY(Date '2025-04-18','화') from dual;
select next_day(Date '2025-04-18',3) from dual;  --일(1) 월(2) 화(3)...토(7)

select add_months(Date '2025-04-18',1) from dual; -- 한달 뒤
select add_months(Date '2025-04-18',3) from dual; -- 세달 뒤

select last_day(Date '1988-02-01') from dual; -- 1998/02/01 형식도 가능

select to_date('20220102', 'YYYYMMDD') from dual; //문자열을 날짜 타입으로 바꿔 줌
select to_date('20220102123445', 'YYYYMMDD HH24MISS') from dual;
select to_char(sysdate, 'YYYY-MM-DD HH:MI:SS') from dual; -- 오늘 날짜를 해당 형태로 보여 줘라
select to_char(sysdate, 'YY/MM/DD HH:MI') from dual;
select to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS') from dual; -- 24시간으로 별경

select '1234' + 200, to_number('1234'), to_number('1234') + 100 from dual;

desc emp2;
select * from emp2;
select to_char(2000, '999,999') from dual; // 세자리 마다 컴마 찍고 싶을 때
select to_char(21231231356789, '999,999,999,999,999') from dual;
select to_char(21231231356789, '999,999,999,999,999') from dual;
select to_char(2000, 'L999,999') from dual; -- L 로케이션 약자로 통화 기호 써줌 한국이니까 원화로 나옴
select to_char(2000, '$999,999') from dual;















