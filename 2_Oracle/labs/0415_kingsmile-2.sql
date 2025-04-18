-- 제약조건
CREATE TABLE userlist(    -- userlist_id_pk
    id VARCHAR2(10) CONSTRAINT id_pk PRIMARY key, 
    name varchar2(10) -- not null
);

select * from userlist;
insert into userlist values('kingsmile', 'doyeon');
insert into userlist(name, id) values('kang', 'aaa');
insert into userlist(id) values('park');
insert into userlist(id) values('hong'); 
insert into userlist(id) values('hong'); -- 중복허용 안됨
insert into userlist(name) values('hong333'); -- pk는 (기본키) 중복안되고 not null 임
------------------------------------------------------
/*
제약조건명 ===> 테이블명_필드명_성격(pk, fk, ck, un,....)
CREATE TABLE fk_member(
    code number(2) NOT NULL , 
    id VARCHAR2(20) NOT NULL 
    CONSTRAINT id_fk REFERENCES MEMBER(id) ,
    etc VARCHAR2(10)
);
*/
---------------------------------------------------------------------
CREATE TABLE userlist_un(
    id VARCHAR2(10) CONSTRAINT userlist2_id_pk PRIMARY key, 
    jumin char(13)  CONSTRAINT userlist_jumin_un unique
    --jumin char(13) not null CONSTRAINT jumin_un unique
);

select * from userlist2;
insert into userlist2 values('smile', '11111');
insert into userlist2 values('smile2', '111121');
insert into userlist2(id) values('smile3'); -- 중복안됨, null 허용
--------------------------------------------------------------------
CREATE TABLE ck_Test(
    NAME VARCHAR2(10) NOT NULL,
    age NUMBER(2) NOT NULL 
             CHECK (age BETWEEN 20 AND 30 ) 
              --age컬럼의 값은 20~30사이만 허용
);

select * from ck_test;
insert into ck_test values('doyeon', 22);
insert into ck_test values('doyeon', 77); -- error
insert into ck_test values('doyeon', 30);
-------------------------------------------------------------
CREATE TABLE de_Test(
    NAME VARCHAR2(10) NOT NULL,
    addr VARCHAR2(10) DEFAULT '서울'
);

select * from de_test;
insert into de_test values('yuna', 'jeju');
insert into de_test values('yuna33', default); --
insert into de_test(name) values('yuna22'); -- default value
insert into de_test values('yuna', 'null');  -- 문자열 null 입력됨
insert into de_test values('yuna111', null); -- (null)
---------------------------------------------------------
create table test
(
    no number not null,
    name VARCHAR2(10) not null,
    birdate date,  -- 생년월일 : '년-월-일' or '년/월/일'
    age number,
    CONSTRAINT test_no_pk primary key(no)
);

select * from test;
desc test;











