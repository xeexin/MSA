--  테이블 수정 / 삭제
--① 컬럼추가
-- alter table 테이블이름 add 
--      (컬럼명 자료형 [제약조건] , 컬럼명 자료형 [제약조건] , ....)

select * from userlist;
desc userlist;
alter table userlist add phone varchar2(15);
alter table userlist add (no number(2), gender char(2));

update userlist set no = 1;  -- 전체수정
update userlist set phone='111-222' where id='kingsmile';  -- 조건에 맞는것만 수정
--문제] id='hong' 인 사람의 성별 'F', phone = '333-555'
update userlist set gender='F', phone ='333-555' where id ='hong';
rollback; -- 실행취소 - DML (select, insert, update, delete)

--② 컬럼삭제
-- alter table 테이블이름 drop column  컬럼이름
alter table userlist drop column no;
alter table userlist drop (name, gender);

--③ datatype변경
-- alter table 테이블이름 modify 컬럼이름 변경자료형
alter table userlist modify phone number;  -- 컬럼에 데이터 없었을 경우 타입 변경 가능함
alter table userlist add (no number(2));
alter table userlist modify no date; 

update userlist set no='24/12/20' where id='park';
alter table userlist modify no number; -- 데이터가 하나라도 있으면 타입 변경 안됨

--delete from userlist where id='park';
update userlist set no=null where id='park';

--④ 컬럼이름 변경
-- alter table 테이블이름 rename column 기존컬럼명 to  변경컬럼명
alter table userlist rename column phone to tel;
alter table userlist rename column no to num;

--⑤ 테이블 삭제
-- drop table 테이블이름
delete from userlist;
drop table userlist;

-- 삭제 테이블 목록 보기
show recyclebin;
desc recyclebin;
-- 복구( 삭제된 테이블 )
flashback table userlist to before drop;

select * from emp2;
drop table emp2;
flashback table emp2 to before drop;

-- 휴지통 비우기
purge recyclebin;


desc userlist;
select * from userlist;

select * from test;
drop table test purge; -- 휴지통에 안남기고 완전 제거

--  레코드 삽입 / 수정 / 삭제
-- insert into 테이블이름(컬럼명, 컬럼명,...) values(값, 값, ...)
-- insert into 테이블이름 values(값, 값, ...)
--          =>모든 컬럼에 모두 값을 넣을 때 사용
select * from dept2 ;
select * from dept2 order by dcode desc;
insert into dept2(dname,dcode) values('bbb','333');

-- 문제] bbb인 레코드를 pdept, area 변경하기
update dept2  set area='혜화', dname='전산팀', pdept='2000' where dcode='333';
commit; --확정

delete dept2; -- 레코드 전체 제거
delete dept2 where dcode='333';

truncate table dept2; --모든 레코드 제거 --롤백 안됨! -- where 절 사용 불가능!(조건 넣을 수 없음)

rollback; --취소


