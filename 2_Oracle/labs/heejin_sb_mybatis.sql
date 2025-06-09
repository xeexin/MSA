drop table book_info_tbl;

create table book_info_tbl (
    book_key number,
    book_reg_no  varchar2(20),
    book_title   varchar2(30),
    book_author  varchar2(30),
    book_publisher  varchar2(30)

);

select * from book_info_tbl;