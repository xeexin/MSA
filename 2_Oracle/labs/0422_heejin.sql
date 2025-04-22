-- VIEW 
/*
    가상테이블
    실제 존재하지 않지만 실제 테이블과 똑같이 사용 (Select, Insert, Update, Delete 사용 가능)
    복잡한 쿼리문(조인,서브쿼리)을 미리 뷰로 만들어 사용하면 간단하게 검색 가능함
    보안을 위해 사용 (민감한 정보 보호) 
    
    
    create or replace view 뷰이름
    as 뷰의 내용;
    
    
    drop view 뷰이름;
    
*/

select * from emp2;
select * from professor;
select * from emp;

create or replace view v_emp
    as select empno, ename, deptno from emp; -- where deptno=20;
    
select * from v_emp;

drop view v_emp;

-- emp 테이블 제거하면 v_emp는 어떻게 되지? : 가상 테이블(v_emp)도 제거됨
-- 가상테이블 제거하면 원본 테이블은 제거 안됨
create view v_student_join
as 
    select p.profno, p.name 교수이름,
           studno, s.name 학생이름, grade, dname 학과명 --, p.deptno
        from professor p join student s
        on p.profno = s.profno join department d
        on s.deptno1 = d.deptno;
    
select * from V_STUDENT_JOIN;


--문제10] 30번 부서 사원들의 직위, 이름, 월급을 담은 view 테이블 만들기 (emp)
select * from emp;
create view v_emp 
    as select job, ename, sal from emp where deptno=30;
select * from v_emp;

--문제11] 30번 부서 사원들의 직위, 이름, 월급을 담은 view 테이블 만드는데,
--    컬럼명을 직위, 사원이름, 급여로 Alias를 주고 월급이 2000보다 많은 사원들만 추출한다
create or replace view v_emp2
    as select job "직위", ename "사원이름", sal "급여" from emp where deptno=30 and sal > 2000;
    
select * from v_emp2;

--문제12] 부서별 최대급여, 최소급여, 평균급여를 갖는 view 만드시오
create or replace view v_emp3 
    as select deptno 부서, max(sal)"최대급여", min(sal)"최소급여", round(avg(sal))"평균급여" from emp group by deptno order by deptno;
select * from v_emp3;


--문제13] 부서별 평균급여를 갖는 view 만드는데, 평균급여가 2000이상인 부서만 출력하세요.
create or replace view v_emp4
    as select deptno, round(avg(sal),0)"평균급여" from emp group by deptno having avg(sal) > 2000;
select * from v_emp4;


--문제14]직위별 총급여를 구하는 view 테이블 만드는데, 직위(job)가 manager인 사원들은 제외하고
--    총급여가 3000 이상인 직원들만 저장한 테이블 만들기
select * from emp;
create or replace view v_emp5
    as select deptno, job, sum(sal)"총급여" from emp where job not in ('manager') group by deptno,job having sum(sal) >3000 ; 

select * from v_emp5;

--문제15]학생 테이블에서 학년별 평균 키와 몸무게가 키는 165 이상이고,
--    몸무게는 60이상인 사람들만 출력하는 뷰 테이블 만들기
select * from student;
create or replace view v_emp6
    as select grade, avg(height)"평균 키", avg(weight)"평균 몸무게" from student group by grade having avg(height) >= 165 and avg(weight) >= 60;
select * from v_emp6;


select * from professor;

create or replace view V_professor
as select * from professor where position='전임강사';

select * from V_professor;



-- CONSTRAINTS  || 기존의 테이블을 제거하지 않고 제약조건 변경하기

select * from cal;

desc cal; --아무런 제약 조건 없음

select * from all_constraints where table_name='CAL';

alter table cal add constraint cal_num_pk primary key(num_day);

select * from all_constraints where table_name='CAL'; -- 제약 조건 변경



-- 레코드 복사 

/*
 형식>
    insert into 테이블이름
        select 컬럼명,... from 테이블 이름
*/

create table c_emp_6
    as select ename, empno, hiredate from emp where 1=0;
    
select * from c_emp_6;
desc c_emp_6;
select * from emp2;
desc emp2;

alter table c_emp_6 modify ename varchar(16);
alter table c_emp_6 modify empno number;

insert into c_emp_6
    select emp_type, pay, birthday from emp2; -- 레코드개수,테이터타입, 데이터크기 맞추면 됨


select * from c_emp_6; -- 레코드 복사됨










