create table tt (
    num number);

insert into tt values(1);
    
select * from tt;
commit;

-- heejin한테 tt 테이블에 select,insert 권한 부여하기
grant insert,select,delete on smile.tt to heejin;

select * from heejin.emp2;

update heejin.emp2 set position='사원' where name='나사장'; -- sql developer는 자동 커밋 X
commit;


delete from heejin.emp2 where deptno=1000;
commit;

revoke all on smile.tt from heejin;

