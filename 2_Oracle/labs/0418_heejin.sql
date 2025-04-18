-- Join--
-- 두개 이상의 테이블을 하나의 테이블로 만들어 한번의 검색으로 여러 컬럼의 정보를 확인 할 때 사용

select * from emp; -- 14개
select * from dept; -- 4개
select * from emp,dept; --엉뚱하게 56개 나옴,, 문제있음

-- 종류 inner/outer(left,right)/full/self

-- *Inner Join
-- 양쪽 테이블에서 일치하는 것만 출력하겠다. 

select ename,job,sal,e.deptno,dname from emp e, dept d where e.deptno=d.deptno; -- 조인은 where 대신 on 쓴다
select ename,job,sal,e.deptno,dname from emp e join dept d on e.deptno=d.deptno; -- 정확한 문법 (inner 생략 가능)


-- *Left Outer Join
-- 왼쪽에 있는 데이터 모두 나옴, 오른쪽 데이터는 일치하는 것만 나옴
select ename,job,sal,e.deptno,dname from emp e left outer join dept d on e.deptno=d.deptno; 
select ename,job,sal,e.deptno,dname from dept d  left outer join emp e on e.deptno=d.deptno; 

-- *Right Outer Join
-- 오른쪽에 있는 데이터 모두 나옴, 왼쪽 데이터는 일치하는 것만 나옴
select ename,job,sal,d.deptno,dname from emp e right outer join dept d on e.deptno=d.deptno; 
select ename,job,sal,d.deptno,dname from dept d  right outer join emp e on e.deptno=d.deptno; 


desc dept;
insert into dept(deptno, loc) values(50,'seoul');
select * from dept;

-- 문제] professor / student table 
-- inner join
-- outer join (left/right)
select * from professor;
select * from student;

-- 교수 이름, 교수 직위, 학과 코드, 교수코드, 학생의 이름, 학번, 학년, 주전공
select p.name, p.position, p.deptno, p.profno, s.name, s.studno, s.grade, s.deptno1
    from professor p join student s 
        on p.deptno = s.deptno1;



select p.name, p.position, p.deptno, p.profno, s.name, s.studno, s.grade, s.deptno1
    from professor p left outer join student s 
        on p.deptno = s.deptno1;

select p.name, p.position, p.deptno, p.profno, s.name, s.studno, s.grade, s.deptno1
    from professor p right outer join student s 
        on p.deptno = s.deptno1;



-- 사원 이름, 부서이름, 직책, 매니저 번호 출력 (EMP/DEPT)
select * from emp; -- ename,job
select * from dept; -- 


select ename "사원이름", job "직책", d.dname "부서이름", mgr "매니저번호"
from emp e  join dept d
on e.deptno=d.deptno;

-- self Join
--하나의 테이블을 두개의 테이블처럼 사용
select * from emp;

select e.empno, e.ename, e.job, em.ename, em.mgr
    from emp e join emp em --별칭을 따로 주기
    on e.mgr = em.empno;


-- 여러 테이블 조인
select * from department;
select * from professor;
select * from student;

select p.profno"교수번호", p.name "교수명", studno"학생번호", s.name"학생명", grade"학년", dname"학과"
    from professor p join student s
    on p.profno=s.profno join department d
    on s.deptno1=d.deptno;

