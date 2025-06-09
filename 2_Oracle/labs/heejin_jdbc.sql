drop table emp;

drop table if exists emp;

create table emp 
(
    empno number(4) ,
    ename varchar(50),
    sal number,
    CONSTRAINT emp_pk primary key(empno)
);

select * from emp;

create SEQUENCE emp_seq
    start with 1
    increment by 1
    MAXVALUE 100
    CYCLE nocache  ; 
    
insert into emp(empno, ename, sal) values(emp_seq.nextval, '김연아', 10000);
insert into emp(empno, ename, sal) values(emp_seq.nextval, '강감찬', 20000);
insert into emp(empno, ename, sal) values(emp_seq.nextval, '박태환', 30000);

    
    
