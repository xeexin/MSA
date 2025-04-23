-- PLSQL(Procedural Language) --------

/*
    Declare –선언(선택)
    
    Begin
     DBMS_output.put_line(‘heejung’); --출력
    End;
*/


begin
    dbms_output.put_line('heejin');  -- 출력(+개행)
end;

-------------------------------------

-- 변수 선언 방법 
declare
    name varchar2(10) := '임희진';

begin
 dbms_output.put_line ('이름은 ' || name); --화면에 name 변수까지 출력
end;

------------------------------------

/*
    desc emp; -- ENAME             VARCHAR2(10) 
    
    - 테이블이름.필드명%TYPE  => 필드명과 같은 타입 선언
    ex) DECLARE NAME emp.ename%TYPE ; -- = Declare name varchar2(10);
*/

------------------------------------
select sal,ename from emp;

declare
    e_name emp.ename%type;
    e_sal emp.sal%type;

begin
    select sal,ename into e_sal, e_name from emp where empno=7788;
        dbms_output.put_line ('7788님의 이름은 ' || e_name || ' 급여는 ' || e_sal);
end;
------------------------------------
select * from emp;

declare data emp%rowtype; --전체 가져오기

begin
    select * into data from emp where empno=7788;
        dbms_output.put_line('7777님의 직무는 ' || data.job || ' 고용일은 '|| data.hiredate || ' 부서번호는 ' || data.deptno);
end;

------------------------------------

declare 
    num1 number :=3;
    num2 number :=5;
begin
    if(num1 >= num2) then
        dbms_output.put_line(num1 || '이 큽니다');
    else
        dbms_output.put_line(num2 || '가 큽니다.');
    end if;
end;

------------------------------------

DECLARE
  n_sales NUMBER ; --:= 300000;
  n_commission NUMBER( 10, 2 ) := 0; -- 10자리 중에서 소수점 2자리 넣겠다.
BEGIN
    n_sales := &n_sales;  -- 입력받기

  IF n_sales > 200000 THEN
    n_commission := n_sales * 0.1;
  ELSIF n_sales <= 200000 AND n_sales > 100000 THEN 
    n_commission := n_sales * 0.05;
  ELSIF n_sales <= 100000 AND n_sales > 50000 THEN 
    n_commission := n_sales * 0.03;
  ELSE
    n_commission := n_sales * 0.02;
  END IF;

   DBMS_OUTPUT.PUT_LINE(n_sales  || ',  ' || n_commission );
END;

------------------------------------
begin
    dbms_output.put_line('시험 잘보세요.');
    dbms_output.put_line('시험 잘보세요2.');
    dbms_output.put_line('시험 잘보세요3.');

end;

------------------------------------

/*
    for 변수이름 in 시작..끝 loop
        실행문장;
    end loop;
*/

declare 
    dan number(1):= &inputDan;
begin
    for i in 1..9 loop
        DBMS_OUTPUT.put_line( dan || ' * ' || i || ' = ' || dan*i);
    end loop;
end;
------------------------------------
/*
     CREATE PROCEDURE 프로시져이름
    IS
     [
    변수이름 데이터타입; --프로시져내에서 사용할 변수선언
    변수이름 데이터타입;
     ....
     ]
     BEGIN
    기능 구현;
     END;
*/

--create procedure p_msg
create or replace procedure p_msg
is
begin
 dbms_output.put_line('오늘 뭐 먹지?');
end;

execute p_msg;
-------------------------------------
create or replace procedure p_msg (name in varchar2)
is
begin
 dbms_output.put_line(name || '아(야) 오늘 뭐 먹지?');
end;

execute p_msg('희진'); -- 재사용성 굳~
exec p_msg('연아');
-------------------------------------















