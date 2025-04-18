-- kingsmile
create user smile2 IDENTIFIED by oracle account unlock; -- 일반 유저는 사용자 계정 생성 못함
select * from tab;

create table SampleTable (
    num number,
    name  VARCHAR2(20) not null,
    phone VARCHAR2(15),
    address VARCHAR2(50),
    irum char,
    irum2 VARCHAR2
);

drop table sampletable;

select * from sampletable; -- 전체보기

select name, address from sampletable; -- 특정 필드만 보기

desc sampletable; -- 해당 테이블의 구조 보기

-- insert ------------------------------
insert into sampletable values(10, 'doyeon', '010-9872-0202', '서울');
insert into sampletable values(20, '강감찬', '010-5555-2222', '부산');
insert into sampletable values(30, '김연아', '010-7777-8888', '제주');

insert into sampletable(num, address, name) values(40, '서울', '이순신');

delete from sampletable;  -- 레코드 제거
rollback;
select * from sampletable;

drop table sampletable;  -- 테이블 삭제

select sysdate from sampletable; 
select sysdate from dual;  -- dual 가상테이블 제공

select rownum, name, address, rowid from sampletable;

select sysdate as "오늘날짜" from dual;
select sysdate as toDay from dual;
select sysdate toDay from dual;

-- select 필드명, 필드명,..... from 테이블명; 

/*
create table 테이블이름(
    컬럼명 datatype [ null | not null ] [ constraint 별칭 제약조건 ] ,
    컬럼명 datatype [ null | not null ] [ constraint 별칭 제약조건 ] ,
    .....
)
*/

select * from help;
select * from emp2;

-- 날짜 타입 메뉴로??
-- 메뉴: 도구> 환경설정 > 데이터베이스 > NLS : 날짜형식 
--      기본값 : RR/MM/DD
--      YYYY-MM-DD HH:MI:SS

select sysdate toDay from dual;






