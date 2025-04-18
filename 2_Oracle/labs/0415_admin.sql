-- loacl admin : system 
select * from tab;  -- 로그인한 계정이 갖고 있는 테이블 리스트 보기

-- 12c ~ 19c 버전에서 보안처리 되어 계정 생성해야하는 상황 있음.  c##계정명
create user c##계정명 identified by 비밀번호;

create user 계정명 identified by 비밀번호;
alter user 계정명 account unlock;
-- ==>
create user 계정명 identified by 비밀번호  account unlock;

-- 권한 부여
grant connect, resource to smile;

grant create session, create table, create view,
    create sequence, create procedure
    to smile;
    
-- 사용자 계정 삭제
drop user smile;


desc help;  -- 

-- 테이블 스페이스 공간에 대한 권한 제한 풀어줌
grant unlimited tablespace to  kingsmile;

alter user smile quota 50M on USERS;

select * from help;
--select sysdate from help;


