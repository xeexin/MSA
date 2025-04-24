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
create or replace procedure p_msg (name in varchar2) -- 변수 하나
is
begin
 dbms_output.put_line(name || '아(야) 오늘 뭐 먹지?');
end;

execute p_msg('희진'); -- 재사용성 굳~
exec p_msg('연아');
-------------------------------------
create or replace procedure p_test
(
  name in varchar2,
  su IN number 
)
is
begin
     dbms_output.put_line(name || '님의 점수는 : ' || su);
end;

exec p_test ('임희진',100);
exec p_test ('김연아',99);
exec p_test ('박태환',80);
-------------------------------------
create table  userlist (
    id varchar2(10),
    name varchar2(20),
    age number,
    addr varchar(50)
);
desc userlist;

create or replace procedure p_userlist (
    id in userlist.id%type := 'heejin',
    name in userlist.name%type := '희진',
    age in userlist.age%type := 10,
    addr in userlist.addr%type := null
)
is
begin
    insert into userlist values(id,name,age,addr);
    dbms_output.put_line('insert 정보는 : ' || id || ' ' || name || ' ' || age || ' ' || addr);
    
end;

exec p_userlist('yuna','김연아',30,'군포');
exec p_userlist('kim','김',45,'서울');
exec p_userlist;
exec p_userlist(name=>'박보검', age => 33); --원하는 값만 넣고 나머지는 디폴트값으로 채워짐
----------------------------------------
select * from userlist;

------------------------------------------
select sal,rownum from emp where rownum = 1;

select *
    from (select * from emp order by sal desc) -- 인라인뷰
    where rownum = 1;
------------------------------------------
select d.* -- e.*
    from emp e,dept d;
------------------------------------------
create or replace procedure p_empMaxSal
(
    p_empno out emp.empno%type,
    p_ename out emp.ename%type,
    p_sal out emp.sal%type
)
is
    begin
        select p_empno, p_ename, p_sal  
            from (select * from emp order by sal desc) 
            where rownum <= 5;
    end;
------------------------------------------
create or replace procedure p_empMaxSal
(
    p_empno  emp.empno%type,
    p_ename  emp.ename%type,
    p_sal  emp.sal%type,
    p_laststatementbalance out float
)
is
    begin
        select empno, ename, sal ,  p_laststatementbalance
            from (select * from emp order by sal desc) 
            where rownum <= 5;
    end;
    
    exec p_empMaxSal;
------------------------------------------
drop procedure p_empMaxSal;

create or replace procedure p_empMaxSal
is
    p_emprow emp%rowtype; -- 다 가져옴

    begin
        for i in 1..5 loop
            select * into p_emprow from
                (select *
                    from (select * from emp order by sal desc)
                    where rownum <= i
                    ) 
            where rownum <=5;
            dbms_output.put_line(p_emprow.empno || ' ' || p_emprow.ename || ' ' || p_emprow.sal);
        end loop;
    end;

exec p_empMaxSal;
------------------------------------------

-- [answer]-- 

create or replace procedure p_empMaxSal
is
    p_emprow  emp%rowtype;
    begin
        for i in 1..5 loop
            select * into p_emprow from
                ( select *
                    from (select * from emp order by sal desc)
                    where rownum <= i order by sal, ename ) where rownum =1 order by sal asc;

            dbms_output.put_line(p_emprow.empno  || ' ' || p_emprow.ename || ' ' || p_emprow.sal);
        end loop;
    end;

exec p_empMaxSal;

------------------------------------------

/*
 LOOP END 문
LOOP
    실행문장;
    증감식;
    EXIT [ WHEN 조건식] ; --조건식이 만족할 때 loop을 빠져나간다.
END loop;
*/

DECLARE I INT := 1;
    BEGIN
        LOOP
            DBMS_OUTPUT.PUT_LINE(I);
            I := I+1;
        EXIT WHEN (I > 10);
        END LOOP;
    END;
    
--while loop
  DECLARE i INT :=1;

  BEGIN
     WHILE (i<=10) loop
         DBMS_OUTPUT.put_line(i);
         i:= i+1;
     END LOOP;
  END;
------------------------------
-- 1~10사이의 짝수 출력
Begin
  for i in 1..10 loop
     --dbms_output.put_line( mod(i, 2) );
     if( mod( i, 2 ) = 0 ) then DBMS_OUTPUT.put_line(i);
     end if;
  end loop;
End;
-------------------------------------
-- 2단 출력하기
-- BASIC LOOP로 구구단(2단 출력하기)
DECLARE   -- 선언(선택)
    dan NUMBER :=2;
    i NUMBER :=1;
BEGIN  -- 필수 
    loop
    dbms_output.put_line(dan || '*' ||i|| '=' || (dan*i));
    -- 2 * i = 2
    i:=i+1;
    IF i > 9 THEN exit;  
    END IF;
  END loop;
END;  -- 필수
-------------------------------------------------------------------
-- FOR LOOP로 구구단(2단) 출력하기
DECLARE
    dan NUMBER := 2;
    i NUMBER :=1;
BEGIN
    FOR i IN 1..9 loop
      dbms_output.put_line(dan||'*'||i||'='||(dan*i));
    END loop;
END;
---------------------------------------------------------------------
-- WHILE LOOP로 구구단 (2단) 출력하기
DECLARE 
    dan NUMBER := 2;
    i NUMBER :=1;
BEGIN
    While i <= 9 loop
       dbms_output.put_line(dan||'*'||i||'='||(dan*i));
       i:=i+1;
    END loop;
END;
--------------------------------------------------------
-- 사용자 입력(단수)를 받아 구구단 출력
-- &는 사용자입력값을 받을때 상요하는 키워드 . &공간이름
DECLARE vdan NUMBER(1) :=&dan;
    BEGIN
        FOR i IN 1.. 9 loop
            DBMS_output.put_line(vdan || ' * ' || i ||'='|| (vdan * i) );
        END LOOP;
     END;
-----------------------------------------------------------
--구구단 전체 출력 ( 2중 반복문 )
    BEGIN
        FOR i IN 1 .. 9 LOOP
            FOR j IN 2 .. 9 LOOP
                dbms_output.put( j || ' * ' || i ||'='|| ( i * j ) ||'    ');
            END LOOP;
                dbms_output.put_line(' ');
        END LOOP;
    END;
-----------------------------------------------------------

create or replace procedure p_wantDan
    (p_dan in number) -- 변수 설정
is
begin
    for i in 1..9 loop
        dbms_output.put_line(p_dan || ' * ' || i || ' = ' || p_dan*i);
    end loop;
end;

exec p_wantDan(&p_dan); -- 실행부터 입력 받으면서~

-----------------------------------------------------------

create or replace procedure p_outTest(
    name out varchar2,
    age out varchar2
    )
is
begin
    name:='heejin';
    age := 27;
    dbms_output.put_line('out을 이용한 프로시저 완료');
end;

-- out이 있는 프로시져 호출방법
/*
variable 변수이름 데이터타입; -- 메모리에 만들어지는 변수

ex) 바인드 변수 선언

*/
 
 variable v_name varchar2(20);
 variable v_age varchar2(5);
 
 exec p_outTest(:v_name,:v_age);
 print v_name;
 print v_age;
 -------------------------------------------
 create or replace procedure p_out(
    x in out NUMBER
 )
 is
 begin
    dbms_output.put_line('x = ' || x);
    x:= &x;
 
 end;
 ----------------------------
 variable x varchar2(25);
 exec p_out(x);
 print x;
 
 
------------------ 
--CORSOR

CREATE OR REPLACE PROCEDURE p_job_emp(v_job IN emp.job%TYPE) 
IS
    name emp.ename%TYPE;
    empno emp.empno%TYPE;
    sal emp.sal%TYPE;

    CURSOR c_name IS 
        SELECT empno, ename, sal 
        FROM emp 
        WHERE UPPER(job) = UPPER(v_job);  -- 대소문자 구분 없이 비교
BEGIN
    OPEN c_name;
    DBMS_OUTPUT.PUT_LINE('-------------------------------');
    
    LOOP
        FETCH c_name INTO empno, name, sal;
        EXIT WHEN c_name%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE(name || ' ' || empno || ' ' || sal || ' ' || v_job);
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('결과는 ==> ' || c_name%ROWCOUNT);
    -- DBMS_OUTPUT.PUT_LINE('커서 오픈 상태: ' || TO_CHAR(c_name%ISOPEN)); -- boolean 출력은 오류남

    CLOSE c_name;

    -- 다시 커서 오픈 상태 출력하면 false니까 아래줄 생략해도 됨
    -- DBMS_OUTPUT.PUT_LINE('커서 오픈 상태: ' || TO_CHAR(c_name%ISOPEN)); 
END;
 
exec p_job_emp('MANAGER');
exec p_job_emp('PRESIDENT');
exec p_job_emp('clerk');

 -- 학생 테이블에서 키가 제일 큰 순서로 3명 출력하는 프로시저 만들기
 select * from student;
 
 create or replace procedure p_student_height 
is
    v_stdrow student%rowtype;

begin
    for i in 1..3 loop
        select * into v_stdrow
        from(select *
                from (select * from student order by height desc)
                where rownum <= i ORDER BY height ASC
        )
        WHERE ROWNUM = 1;  -- i번째 큰 학생 1명만 추출

        DBMS_OUTPUT.PUT_LINE(i || '등: ' || v_stdrow.name || ', 키: ' || v_stdrow.height);
    END LOOP;
END;
    

-- 조인으로 되어 있는 구문은 뷰로 새로 만들어서 저장 프로시저로 생성함. (조인, 프로시저, 커서 이용함)
 
create view v_join
as
    select p.profno, p.name 교수이름,
           studno, s.name 학생이름, grade, dname 학과명 --, p.deptno
        from professor p join student s
        on p.profno = s.profno join department d
        on s.deptno1 = d.deptno;

select * from v_join;
------------------------
create or replace procedure p_join
is
    hapName v_join%rowtype;
    cursor cur_name is select * from v_join; -- 1. 커서 선언
begin
    open cur_name; -- 2. 커서 오픈
    loop
        fetch cur_name into hapName; -- 3. 커서로부터 데이터 읽기
        exit when cur_name%notfound; -- 데이터 없을때까지 찾고 반복문 탈출하기
--        dbms_output.put_line(hapName.name || ',' || hapName.name || ', ' || hapName.dname);
        dbms_output.put_line(hapName.교수이름 || ', ' || hapName.학생이름 || ', ' || hapName.학과명);

    end loop;
    close cur_name; --4. 커서 닫기
end;

exec p_join;
 


