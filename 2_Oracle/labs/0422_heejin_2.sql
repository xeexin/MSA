 -- Rownum : 검색할 때 자동 행 번호 추가 / rowid -----------------
 select rownum, ename, job rowid from emp;
 
 delete from emp where rownum=8; -- rownum은 select에만 적용, 삭제/수정에는 사용 불가

/* 
 dual : 테이블
 rownum : 번호 부여 - 오라클 데이터 베이스 이용한 게시판 만들 경우 페이징 처리에 사용
 rowid : 
 */
select rownum, ename, job  from emp;
select rownum, ename, job  from emp where sal > 3000;
select rownum, ename, sal
    from (select * from emp order by sal);
    
    
-- Sequence : 자동 증가 번호 생성 --------------------

/*
    create sequence 시퀀스이름-- 1부터 시작(default)
    [start with 시작값 ]
     [increment by 증가치 ]
     [maxvalue 최대값 ]
     [minvalue 최소값 ]
     [cycle | nocycle ]
     [cache |  nocache ]
*/

drop sequence autonum;
create sequence autonum;

select autonum.nextval from dual; -- 시퀀스 값 증가
select autonum.currval from dual; -- 현재 시퀀스 값 보여줌

create table kosa_t(
    no number,
    name varchar2(20)
    
    );
    
    insert into kosa_t values (autonum.nextval,'aa');
    insert into kosa_t values (autonum.nextval,'bb');
    insert into kosa_t values (autonum.nextval,'cc');
    insert into kosa_t values (autonum.nextval,'dd');
    
    select * from kosa_t;
    
    create sequence seq_kosa;
    
    create table kosa (
        num number,
        id varchar2(20),
        name varchar2(20)
        );
        
insert into kosa values (seq_kosa.nextval,'dd','name');
insert into kosa values (seq_kosa.nextval,'ff','name');
insert into kosa values (seq_kosa.nextval,'gg','name');
insert into kosa values (seq_kosa.nextval,'hh','name');

select * from kosa;

drop sequence seq_kosa;

create sequence seq_kosa
    INCREMENT by 100;


--create sequence seq_board
alter sequence seq_board
    maxvalue 1000
    increment by 100
    cycle
    cache 2;


     
    create table kosa2 (
        num number,
        id varchar2(20),
        name varchar2(20)
        );
        
insert into kosa2 values (seq_board.nextval,'dd','name');
insert into kosa2 values (seq_board.nextval,'ff','name');
insert into kosa2 values (seq_board.nextval,'gg','name');
insert into kosa2 values (seq_board.nextval,'hh','name');

select * from kosa2;

create sequence sequence_jumin_t
    increment by 10
    start with 10
    maxvalue 150
    minvalue 9
    cycle
    cache 2;
    
create table jumin_t(
    seq number,
    name varchar2(20),
    phone varchar2(15)
    );
    
insert into jumin_t values(seq_jumin_t.nextval, 'aa','1111');
insert into jumin_t values(seq_jumin_t.nextval, 'bb','1123');
insert into jumin_t values(seq_jumin_t.nextval, 'cc','1113');
insert into jumin_t values(seq_jumin_t.nextval, 'dd','1114');
insert into jumin_t values(seq_jumin_t.nextval, 'ee','1115');
insert into jumin_t values(seq_jumin_t.nextval, 'ff','1116');

select * from jumin_t;


-- 문제] 시퀀스 만들기 -seq_freeboard 임의적으로 만들어서 테스트 테이블에 실행시켜 보세요.

create sequence seq_freeboard;

drop table freeboard;
create table freeboard(
    seq number,
    title varchar2(20),
    name varchar2(20)
    );
    
insert into freeboard values(seq_freeboard.nextval, 'aa', 'bb');
insert into freeboard values(seq_freeboard.nextval, 'aa', 'bb');
insert into freeboard values(seq_freeboard.nextval, 'aa', 'bb');
insert into freeboard values(seq_freeboard.nextval, 'aa', 'bb');
insert into freeboard values(seq_freeboard.nextval, 'aa', 'bb');
insert into freeboard values(seq_freeboard.nextval, 'aa', 'bb');
insert into freeboard values(seq_freeboard.nextval, 'aa', 'bb');


select * from freeboard;



-- Transaction -------
/*
    - insert ,update ,delete를 수행한 결과를 저장(commit), 취소(rollback) 할 수 있다.- 특정 영역을 나누어서 저장, 취소를 선택적으로 할 수 있다
        savepoint 이름; =>SQL실행 전에 영역을 분할함.
         rollback to 이름;  => 특정 영역에 해당하는 부분까지 취소됨.- Commit - 전체저장완료- rollback - 전체취
*/

create table c_emp100
as
    select * from emp where 1=0; -- 구조만 복사

SELECT * from c_emp100;

--------------
begin

    for i in 1..10000 loop
        insert into c_emp100
            select * from emp;
    end loop;

end;
--------
SELECT * from c_emp100;
rollback; -- 취소
commit; -- 완료

update c_emp100 set sal = 1000;
rollback;

delete from c_emp100 where deptno=20;
rollback;

update c_emp100 set sal=888 where deptno=20;
savepoint update_sal; -- savepoint 식별자;

update c_emp100 set sal=999 where deptno=30;
savepoint update_sal_30;

update c_emp100 set sal=1 where deptno=30;


SELECT * from c_emp100;
select sum(sal) from c_emp100; //131960000

rollback to savepoint update_sal; -- rollback to savepoint 식별자 

SELECT * from c_emp100;
select sum(sal) from c_emp100; //225900000

rollback to savepoint update_sal_30;

------------------

savepoint create_tt;
create table tt (id number);

insert into tt values(1);
insert into tt values(2);

insert into tt values(3);
insert into tt values(4);

select * from tt;
rollback to savepoint create_tt; -- 오류

-- commit/rollback은 -DML(세인업데) 명령에만 적용됨
---------------

CREATE USER smile IDENTIFIED BY oracle;
GRANT CONNECT, RESOURCE TO testuser;


show user;

select * from heejin.emp2;

select * from smile.tt;

grant select on heejin.emp2 to smile;

insert into smile.tt values(2);
commit;
select * from smile.tt;


-- smile에게 emp2 테이블의 레코드 삭제와 수정 권한을 주기
grant delete,update on heejin.emp2 to smile;

select * from heejin.emp2;

revoke all on heejin.emp2 from smile;

delete from smile.tt where num in (1,2);
commit;

select * from smile.tt;
