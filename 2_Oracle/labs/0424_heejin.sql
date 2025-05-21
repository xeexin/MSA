------ 정규 표현식 -----------

select * from reg_test;

select * from reg_test where REGEXP_LIKE(text, '([aeiou])\1', 'i'); --문자열(또는 문자열 포함 필드명), 패턴, ignore_case(대소문자 구별 안함[옵션])

select * from reg_test where REGEXP_LIKE(text, '[abc]'); -- [ ] 사이에 있는 문자들 중 하나

select * from reg_test where REGEXP_LIKE(text, '[a-z] [0-9]'); -- 소문자a-z + 공백 + 숫자

select * from reg_test where REGEXP_LIKE(text, '[a-z][0-9]'); -- 소문자a-z + 숫자

insert into reg_test values('789ABC');
insert into reg_test values('789 ABC');
insert into reg_test values('123kbs');
insert into reg_test values('mbc567');
insert into reg_test values('sbs 678');

-- 소문자나 공백이나 숫자가 들어가는 것을 찾아라
select * from reg_test where REGEXP_LIKE(text,'[a-z]?[0-9]'); -- 대소문자 구별 없음.
select * from reg_test where REGEXP_LIKE(text,'[0-9]?[A-Z]');
select * from reg_test where REGEXP_LIKE(text,'[A-Z]*[0-9]'); -- * 0이거나 1이상 -- 대소문자 구별 없음.
select * from reg_test where REGEXP_LIKE(text,'[0-9]*[A-Z]');

select * from professor;


-------------
select * from gift;
insert into gift values(11,'사탕세트', 100, 9000); 
commit;





