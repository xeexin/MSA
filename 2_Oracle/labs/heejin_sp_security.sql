select * from users;
drop table users;

create table users (
    userid number not null primary key,
    name varchar2(50) not null,
    passwd varchar2(100) not null,
    enabled number(1) default 1,        -- boolean 타입으로 설정도 가능(계정 사용여부)
    authority varchar(30)
);

CREATE TABLE roll (
	userid VARCHAR2(20),
  Role_name VARCHAR2(30)
);

-- ROLE_USER , ROLE_ADMIN
INSERT INTO roll VALUES('admin','ROLE_USER');
INSERT INTO roll VALUES('admin','ROLE_ADMIN');

INSERT INTO roll VALUES('simson','ROLE_USER');
INSERT INTO roll VALUES('kingsmile','ROLE_USER');
COMMIT;

select * from roll;

drop table roll;
