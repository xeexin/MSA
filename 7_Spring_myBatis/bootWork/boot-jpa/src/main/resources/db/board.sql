drop TABLE board;

create table board (
    id number(10),
    name varchar2(20),
    passwd varchar2(20),
    title varchar2(50),
    content varchar2(4000),
    regdate date,
    readcount number(10),
    reply number(10),
    replystep number(10),
    replylevel number(10)
);

select * from board;
CREATE SEQUENCE board_seq;

insert into board values(1, 'doyeon', '1004', 'title', 'content', sysdate, 0, 0, 0, 0);
commit;