--PL-SQL(Oracle ���α׷��� ���)

BEGIN
		DBMS_OUTPUT.PUT_LINE('hello world');
END;

--�����(����)  , �����(������ �� �Ҵ� �Ǵ� �����)
DECLARE --�����
	vno NUMBER(4);
  vname VARCHAR2(20);
BEGIN --�����
		--vno  := 100;
    --vname := 'kglim';    -- �Ҵ�( := )
    --DBMS_OUTPUT.PUT_LINE(vno);
		--DBMS_OUTPUT.PUT_LINE( vno  ||   '---'       ||  vname);
    SELECT empno, ename
    INTO vno, vname -- into ������.... select �� ����� ������ ��� ���
    FROM EMP
    WHERE empno=7788;
    DBMS_OUTPUT.PUT_LINE( vno  ||   '---'       ||  vname);
END;

-----------------------------------------------------------------
--���� �Է� &������--
DECLARE
	vno NUMBER(4);
  vname VARCHAR2(20);
BEGIN
	SELECT empno, ename
  	INTO vno, vname
  FROM EMP
  WHERE empno = &empno;   --&empno ���ؼ� �� �Է� �ޱ�
  DBMS_OUTPUT.PUT_LINE( '�Է°� : ' || vno  ||   '---'       ||  vname);
END;
-----------------------------------------------------------------
--Type �����ϱ�
--sqlplus scott/1004
--set serveroutput on;
--���� : edit �����ϰ� ����
-- / enter


--1.  %TYPE
DECLARE
	  vno emp.empno%TYPE;  --���ϴ� ���̺��� Ÿ�� ���� ���
    vname emp.ename%TYPE;
BEGIN
		SELECT empno, ename
   	 INTO vno, vname
    FROM EMP
    WHERE empno=&empno;
      DBMS_OUTPUT.PUT_LINE( 'Type : ' || vno  ||   '---'   ||  vname);
END;

----------------------------------------------------------------
--pl-sql (DML) ó���ϱ�
CREATE TABLE pl_test
(
   NO number,
   NAME VARCHAR2(20),
   addr VARCHAR2(50)
);
SELECT * FROM pl_test;
--pl-sql ����ο��� parameter �� �ޱ�   '&������'
DECLARE
v_no NUMBER := '&NO';
v_name VARCHAR2(20) := '&NAME';
v_addr VARCHAR2(50) := '&addr';
BEGIN
		INSERT INTO pl_test(NO,NAME,addr)
    VALUES(v_no , v_name, v_addr);
END;

--update
DECLARE
v_no NUMBER := '&NO';
v_name VARCHAR2(20) := '&NAME';
v_addr VARCHAR2(50) := '&addr';
BEGIN
		UPDATE pl_test
    SET NAME = v_name , addr= v_addr
    WHERE NO = v_no;
END;
--------------------------------------------------------------
--1.���� �����ϱ�
--1. Ÿ�� : v_empno number(10)
--2.Ÿ�� : v_empno emp.empno%TYPE -> �÷��� Ÿ������ ���
--3.Ÿ�� : v_row emp%ROWTYPE ->  emp ���̺��� ���� �÷��� �Ѳ�����
--                                           ������ �� �ִ� ���� ����

--Quiz
--�ΰ��� ������ �Է¹޾� �� ���� ���
DECLARE
	v_no1 NUMBER := &no1;
  v_no2 NUMBER := &no2;
  result NUMBER;
BEGIN
		result := v_no1 + v_no2;
     DBMS_OUTPUT.PUT_LINE(result || '=' || v_no1 || '+' || v_no2);
END;

--------------------------------------------------------------------------
DECLARE
	v_emprow emp%ROWTYPE;

BEGIN
	SELECT *
  INTO v_emprow
  FROM EMP
  WHERE empno=7788;

   DBMS_OUTPUT.PUT_LINE(v_emprow.empno || '-' || v_emprow.ename || '-' ||
                                  v_emprow.job );
END;
--------------------------------------------------------------------------
--���
/*
 if(����) then
 		���๮��;
 end if;

 if(����) then
 		���๮;
 elseif(����) then
    ���๮

*/
DECLARE
	vempno emp.empno%TYPE;
  vename emp.ename%TYPE;
  vdeptno emp.deptno%TYPE;
  vname  VARCHAR2(20) := NULL;
BEGIN
	SELECT empno, ename, deptno
  	INTO vempno, vename, vdeptno
  FROM EMP
  WHERE empno = 7788;

  IF(vdeptno =10) THEN vname :='ACCOUNT';
  	ELSIF(vdeptno = 20) THEN vname := 'IT';
  	ELSIF(vdeptno = 30) THEN vname := 'SALES';
  	ELSIF(vdeptno = 40) THEN vname := 'MARKTING';
  END IF;
   DBMS_OUTPUT.PUT_LINE('����� ������ : ' || vname);
END;

--------------------------------------------------------------------------
DECLARE
	vempno emp.empno%TYPE;
  vename emp.ename%TYPE;
  vsal      emp.sal%TYPE;
BEGIN
	SELECT empno, ename, sal
  	INTO vempno , vename, vsal
  FROM EMP
  WHERE empno=7788;

  IF (vsal > 2000) THEN
  		  DBMS_OUTPUT.PUT_LINE('����� �޿� : BIG'  || vsal);
  ELSE
  			 DBMS_OUTPUT.PUT_LINE('����� �޿� : SMALL'  || vsal);
  END IF;

END;

--SET VERIFY ON/OFF :
--SQL��ɾ PL/SQL���� &�� �̿��� ġȯ �������� ����� ��
-- ġȯ�Ǳ� �� ���� �ڼ��� ���� ���� ������ ���θ� ���� �Ѵ�. �⺻���� ON �̴�.

--------------------------------------------------------------------------
--CASE ��
DECLARE
	vempno emp.empno%TYPE;
  vename emp.ename%TYPE;
  vdeptno emp.deptno%TYPE;
  v_dname VARCHAR2(10);
BEGIN
	  SELECT empno ,ename, deptno
    	INTO vempno, vename, vdeptno
    FROM EMP
    WHERE empno=7788;
    /*
    v_dname := CASE vdeptno
                    	WHEN 10 THEN 'ACCOUT'
                    	WHEN 20 THEN 'RESEARCH'
                    	WHEN 30 THEN 'SALES'
                    	WHEN 40 THEN 'OPERATIONS'
    								END;
   */
    v_dname := CASE
                    	WHEN  vdeptno = 10 THEN 'ACCOUT'
                    	WHEN  vdeptno in(20,30) THEN 'RESEARCH'
                    	WHEN  vdeptno =40 THEN 'SALES'
                    	ELSE 'NOT'
    								END;
	DBMS_OUTPUT.PUT_LINE(vempno || ' ' || vename || ' ' || vdeptno || ' ' || v_dname);
END;
--------------------------------------------------------------------------
--�ݺ���
--basic loop
--LOOP
--	����;
--	EXIT[����];
--END LOOP

DECLARE
	n NUMBER := 0;
BEGIN
		LOOP
			 DBMS_OUTPUT.PUT_LINE(n);
       n := n + 1;
       EXIT WHEN n > 5;
    END LOOP;
END;

--while
--WHILE ���� LOOP
--	����
--END LOOP;

DECLARE
	num  NUMBER := 0;
BEGIN
	WHILE num < 6 LOOP
  		DBMS_OUTPUT.PUT_LINE(num);
      num := num + 1;
  END LOOP;

END;

--for (java for)
BEGIN
		FOR i IN 0..10 LOOP
    	DBMS_OUTPUT.PUT_LINE(i);
    END LOOP;
END;

DECLARE
	total NUMBER := 0;
BEGIN
	FOR i IN 1..10 LOOP
		total := total + i;
  END LOOP;
  DBMS_OUTPUT.PUT_LINE('�հ�:' || total);
END;

--continue (11g)
DECLARE
	total NUMBER := 0;
BEGIN
	FOR i IN 1..10 LOOP
    CONTINUE WHEN i > 5;
		total := total + i;
  END LOOP;
  DBMS_OUTPUT.PUT_LINE('�հ�:' || total);
END;

--------------------------------------------------------------------------
--���ݱ��� ���� ������ ������ ó��
--[CURSOR]
--1.������� �����͸� ó���ϴ� ����� ����
--2. �������� �����͸� ó���ϴ� ó���ϴ� ����� ���� (�� ���̻���  row������ ���)
/*
DECLARE
             CURSOR cursor_name IS statement; -- Ŀ�� ����
             BEGIN
                OPEN cursor_name; -- Ŀ�� ����
                          --Ŀ���κ��� �����͸� �о�� ������ ����
                FECTCH cur_name INTO variable_name;
                CLOSE cursor_name; --Ŀ�� �ݱ�
             END;
*/

DECLARE
	vempno emp.empno%TYPE;
  vename emp.ename%TYPE;
  vsal      emp.sal%TYPE;
CURSOR c1
IS SELECT empno, ename , sal FROM EMP WHERE  deptno =30;
BEGIN
		OPEN c1; --Ŀ���� ������ �ִ�  select �� ����
  LOOP
     --Memory �� �ִ� �࿡ ����
     -- 7788 , king , 100
     -- 7902, smith ,200
  		FETCH c1 INTO vempno, vename, vsal;
			EXIT WHEN c1%NOTFOUND;
      DBMS_OUTPUT.PUT_LINE(vempno || '  ' || vename || '  ' || vsal);
  END LOOP;
  CLOSE c1;
END;
--------------------------------------------------------------------------
--�� ǥ���� ���� �����ϰ�
---- java -> for(dept d : deptlist) { d.deptno  }
DECLARE
		CURSOR emp_curr
		IS SELECT empno, ename FROM EMP;
BEGIN
		FOR  emp_record IN emp_curr --emp_record ������ ����ü �޾� ����
    					LOOP
              EXIT WHEN emp_curr%NOTFOUND;
    	      	DBMS_OUTPUT.PUT_LINE(emp_record.empno || ' ' || emp_record.ename );
    END LOOP;
END;


DECLARE
		vemp  emp%ROWTYPE;
		CURSOR emp_curr
		IS SELECT empno, ename FROM EMP;
BEGIN
		FOR  vemp  IN emp_curr --emp_record ������ ����ü �޾� ����
    					LOOP
              EXIT WHEN emp_curr%NOTFOUND;
    	      	DBMS_OUTPUT.PUT_LINE(vemp.empno || ' ' || vemp.ename );
    END LOOP;
END;
--------------------------------------------------------------------------
--���ݱ��� �����ϸ� ��� ���� ��
--���ݱ��� ��� ���� ���������� ������ �ʹ�
--��ü�μ�  �����ϰ� �ʿ�� 	�ҷ����� ���
--( create view .....)
--ORACLE SUBPROGRAM

--1. ���� ���ν��� (procedure)
--MS-SQL������ �ʼ� �������� (NET(c# , ASP.NET) ������ �ǹ������� ����
--[���� ���Ǵ� ������]�� [���ȭ] ���Ѽ� [�ʿ��� ������ ȣ�� : parameter ���]
--�ؼ� ����ϴ� ���
--���ν��� �Ǵ� ����� �Լ��ȿ��� ���α׷����� ��� ����
CREATE  OR REPLACE PROCEDURE usp_emplist
IS
	 BEGIN
   		UPDATE EMP
      SET job = 'ITTT'
      WHERE deptno =30;
  END;

--������
--EXEC
EXECUTE usp_emplist
ROLLBACK;

--APP ���忡�� procedure ������� ��� ����
--emp.java => String sql = "update EMP  set sal=0 where empno=1000"
--emp.java ������ �����Ѵٴ� ���� sql ������ ��� ���ڿ��� DB������ DB����
--�ϰ� ���� ����� resultset ����  java���� ��ȯ �޴� ����

--procedure
--emp.java => String sql = "usp_emplist"
--emp.java ������ �����Ѵٴ� ���� sql ������ ��� ���ڿ��� DB������ DB����
--�ϰ� ���� ����� resultset ����  java���� ��ȯ �޴� ����

--1. ���� (���౸�� ��ü ������� �ʴ´�)
--2.���� (���� �ܰ迡�� ��� ����)
--3.��������(select ... 630�� �Ȱ��� ������ 30�� ��� ....)
    --�÷��� �ϳ� �߰�

CREATE  OR REPLACE PROCEDURE usp_getEmpListByempno
( vempno emp.empno%TYPE )
IS
		BEGIN
    	UPDATE EMP
      SET sal = 0
      WHERE empno=vempno;
    END;

EXEC usp_getEmpListByempno(7788);
-------------------------------------------------------------------------
CREATE OR REPLACE PROCEDURE usp_getEmplist
(vempno emp.empno%TYPE)
IS
		--���� ����
    vename emp.ename%TYPE;
    vsal      emp.sal%TYPE;
BEGIN
		SELECT ename, sal
    	INTO vename, vsal
    FROM EMP
    WHERE empno= vempno;
		DBMS_OUTPUT.PUT_LINE('�̸��� ' || vename || ' �Դϴ�');
    DBMS_OUTPUT.PUT_LINE('�޿���  ' || vsal || ' �Դϴ�');
END;

EXECUTE usp_getEmplist(7902);
------------------------------------------------------------------------
--���ν������� ���Ǵ� �ΰ��� parameter ����
--1. input parameter (default) �ݵ�� �����Ҷ� ���� �޾ƾ� �Ѵ�
--2.output parmeter ����ؼ� output ���ְ� �Է°��� ���� �ʾƵ� �ȴ�

CREATE OR REPLACE PROCEDURE App_Get_Emplist
(
		vempno IN emp.empno%TYPE,
    vename OUT emp.ename%TYPE,
    vsal      OUT emp.sal%TYPE
)
IS
		BEGIN
    		SELECT ename , sal
        INTO vename, vsal
        FROM EMP
        WHERE empno = vempno;
    END;
--����Ŭ���� �����غ��� ................................................................................................---------------
DECLARE
	  out_name emp.ename%TYPE;
    out_sal     emp.sal%TYPE;
BEGIN
	  App_Get_Emplist(7902,out_name,out_sal);
    DBMS_OUTPUT.PUT_LINE(out_name || ' ' || out_sal);
END;
--------------------------------------------------------------------------
--���ν������� cursor ����ϱ� (�� �� �̻��� ������ ó���ϱ�)
CREATE  OR REPLACE PROCEDURE Cusor_Getlist
(p_deptno IN emp.deptno%TYPE )
IS
   vemp	emp%ROWTYPE;
	CURSOR cur_list
	IS SELECT empno, ename , job , sal
     FROM EMP
     WHERE deptno=p_deptno;
  BEGIN
  	FOR vemp IN cur_list
    	LOOP
       	EXIT WHEN cur_list%NOTFOUND;
    		DBMS_OUTPUT.PUT_LINE(vemp.empno || '-' || vemp.ename || '-' || vemp.sal);
      END LOOP;
  END;

--����
EXECUTE Cusor_Getlist(30);
--------------------------------------------------------------------------
--����� ���� �Լ�---------------------------------------------------------
--------------------------------------------------------------------------
--SELECT SUM() , MAX()....
--To_char() To_number() To_date()
--parameter ������
--return Type

--����� : ������ �Լ�

CREATE OR REPLACE FUNCTION F_max_sal
(s_deptno emp.deptno%TYPE )
RETURN NUMBER
IS
  --�������� ����
	max_sal  emp.sal%TYPE;
BEGIN
	SELECT MAX(sal)
  	INTO max_sal
  FROM EMP
  WHERE deptno =s_deptno;
  RETURN max_sal;
END;
--����� ���� �Լ� ����ϱ�------------------------
SELECT MAX(sal) ,F_MAX_SAL(30) FROM EMP;
SELECT F_MAX_SAL(30) AS "SAL" FROM dual;
-------------------------------------------------

CREATE OR REPLACE FUNCTION F_CallName
(vempno emp.empno%TYPE)
RETURN VARCHAR2
IS
	v_name emp.ename%TYPE;
BEGIN
	SELECT ename || ' ��'
		INTO v_name
  FROM EMP
  WHERE empno = vempno;
  RETURN v_name;
END;
--����-------------------------------------------------------------------
SELECT F_CallName(7788) FROM dual;
SELECT empno, ename,F_CALLNAME(7788) , sal
FROM EMP WHERE empno=7788;
-----------------------------------------------------------------------
--����
--parameter ���
--return �μ��̸�
--�Լ� �̸� select  f_getdname(7788) from dual;
--���ο� ���Ǵ� ������ (subquery ���)

CREATE OR REPLACE FUNCTION f_get_dname
(vempno emp.empno%TYPE)
RETURN VARCHAR2
IS
	v_dname dept.dname%TYPE;
BEGIN
			SELECT dname
      	INTO v_dname
      FROM dept
      WHERE deptno = (SELECT deptno FROM EMP WHERE empno=vempno);
  RETURN v_dname;
END;
--����
SELECT empno , ename , f_get_dname(7902)
FROM EMP WHERE empno=7902
--Ȱ���ϱ�
SELECT empno , ename , f_get_dname(empno)
FROM EMP  WHERE deptno=30
--------------------------------------------------------------------------
--[��Ű�� : PACKAGE]

--1. ��Ű���� �������� �ǹ̴� �ٷ����̴�.

--2. [���� �ִ� ���ν����� ���� ȿ�������� ����]�ϱ� ���ؼ� [��Ű�� ������ ����]�� ��
--�����ϰ� ���ȴ�.

--3. ��Ű���� ��Ű�� [����(����)]�� ��Ű�� [��ü ����(��ü��)]

--�λ���� ���ν��� (�λ� ��Ű�� ��� ����)

--�� ���� ��θ� �����ؾ� �Ѵ�.
/*
CREATE [ OR REPLACE ] PACKAGE package_name
IS
    PROCEDURE procedure_name1;
    PROCEDURE procedure_name2;
END;
/
CREATE [ OR REPLACE ] PACKAGE BODY package_name
IS
    PROCEDURE procedure_name1
    IS
     ....
    END;
END;



EXECUTE [��Ű����].[���ν�����]
*/

--�����
CREATE OR REPLACE PACKAGE emp_total
AS
		PROCEDURE emp_sum;
    PROCEDURE emp_avg;

END emp_total;

--������(��ü)
CREATE OR REPLACE PACKAGE BODY  emp_total
AS
	 PROCEDURE emp_sum
   IS
        CURSOR emp_total_sum
        IS SELECT COUNT(*) , SUM(NVL(sal,0)) FROM EMP;
        total_sum NUMBER;
        total_num NUMBER;
        BEGIN
          OPEN emp_total_sum;
          FETCH  emp_total_sum
          INTO total_num , total_sum;
          DBMS_OUTPUT.PUT_LINE('���ο� : ' || total_num || ' �޿��� : ' || total_sum);
          CLOSE emp_total_sum;
        END emp_sum;

   PROCEDURE emp_avg
   IS
   		CURSOR emp_total_avg
      IS SELECT COUNT(*) , AVG(NVL(sal,0)) FROM EMP;
      total_num NUMBER;
      total_avg NUMBER;
      BEGIN
      	OPEN emp_total_avg;
        FETCH emp_total_avg
        INTO total_num , total_avg;
        DBMS_OUTPUT.PUT_LINE('���ο� : ' || total_num || ' �޿���� : ' || total_avg);
        CLOSE emp_total_avg;

      END emp_avg;
END emp_total;

--�����ϱ�
EXECUTE emp_total.emp_sum
EXECUTE emp_total.emp_avg
--------------------------------------------------------------------------
--[Ʈ���� : Trigger]
--Ʈ����(trigger)�� �������� �ǹ̴� ��Ƽ質 (��Ƽ踦) ���, �߻��ϴ�,
--(�����) ���߽�Ű�ٶ�� �ǹ̰� �ִ�.

--�԰�    ���     ���
--�԰� INSERT
--��� INSERT
--����δ� : lock


--PL/SQL������ Ʈ���� ���� ��Ƽ谡 ������� �ڵ����� �Ѿ��� �߻�ǵ��� ���
--�̺�Ʈ�� �߻��ϸ� �׿� ���� �ٸ� �۾��� �ڵ����� ó���Ǵ� ���� �ǹ��Ѵ�.
/*
Ʈ���Ŷ� Ư�� ���̺��� �����Ϳ� ������ �������� �� �ڵ����� ����Ǵ�
���� ���ν������ �� �� �ִ�.
�ռ� ��� ���� ���ν����� �ʿ��� ������ ����ڰ� ����
 EXECUTE ��ɾ�� ȣ���ؾ� �ߴ�.
������ Ʈ���Ŵ� �̿� �޸� ���̺���
�����Ͱ� INSERT, UPDATE, DELETE ���� ���� ����Ǿ��� ��
[ �ڵ����� ����ǹǷ� �� ����� �̿��ϸ� ���� ���� �۾� ] �� �� �� �ִ�.
�̷� ������ Ʈ���Ÿ� ����ڰ� ���� �����ų ���� ����.


--BEFORE : ���̺��� DML ����Ǳ� ���� Ʈ���Ű� ����
--AFTER :  ���̺��� DML �����Ŀ� Ʈ���� ����

CREATE TRIGGER trigger_name
timing[BEFORE|AFTER] event[INSERT|UPDATE|DELETE]
ON table_name
	[FOR EACH ROW]
	[WHEN conditions]
BEGIN
	statement  --�κ��� ����
END



*/

--�ǽ� COPYEMP �������
CREATE OR REPLACE TRIGGER tri_01
AFTER INSERT
ON copyemp
	BEGIN
  	DBMS_OUTPUT.PUT_LINE('���Ի�� �Ի�');
  END;


CREATE OR REPLACE TRIGGER tri_02
AFTER UPDATE
ON copyemp
	BEGIN
  	DBMS_OUTPUT.PUT_LINE('������ ����');
  END;


  CREATE OR REPLACE TRIGGER tri_03
AFTER DELETE
ON copyemp
	BEGIN
  	DBMS_OUTPUT.PUT_LINE('������ ����');
  END;

INSERT INTO COPYEMP(empno, ename)
VALUES(300,'��Ȳ��');

UPDATE COPYEMP
SET ename ='�ƹ���'
WHERE empno=300;


DELETE FROM COPYEMP WHERE empno=300;
COMMIT;

--���� Ʈ���� : ���� �޴� ���� ���� ������ Ʈ���Ű� �ѹ��� ����
--���� Ʈ���Ŵ� Ʈ���� �۾��� ������ �޴� ���� ������ �Ǵ� Ʈ����
--�̺�Ʈ ��ü���� �����ϴ� �����Ϳ� ���ӵ��� �ʴ� ��� ����
--ex) �α� ��� ��

--�� Ʈ���� => for each row
--���̺��� Ʈ���� �̺�Ʈ�� ������ ���� ������ ����ǰ�
--Ʈ������ ������ �޴� ���� ���� ���� ������� �ʽ��ϴ�
--�̺�Ʈ ��ü���� �����ϴ� �����Ϳ� �������� ���  ����

--PL-SQL ���� �����ϴ� �ΰ� ������ ����
--:OLD => Ʈ���Ű� ó���� ���ڵ��� ���� ���� ����  MS-SQL( deleted )
--:NEW => ������ ����                                   MS-SQL( inserted )

--------------------------------------------------------------------------
CREATE TABLE tri_order
(
	NO NUMBER,
  ord_code VARCHAR2(10),
  ord_date DATE
);

CREATE OR REPLACE TRIGGER trigger_order
BEFORE INSERT
ON tri_order
BEGIN
		IF(TO_CHAR(SYSDATE,'HH24:MI') NOT  BETWEEN '10:00' AND '12:00') THEN
    		RAISE_APPLICATION_ERROR(-20000 ,'���ð� ����');
    END IF;
END;

SELECT TO_CHAR(SYSDATE,'HH24:MI') FROM DUAL;
INSERT INTO tri_order
VALUES(1,'p100',sysdate);
COMMIT;
SELECT * FROM tri_order;
--------------------------------------------------------------------------
--��(for each row)
DROP TRIGGER trigger_order;

CREATE OR REPLACE TRIGGER trigger_order2
BEFORE INSERT
ON tri_order
FOR EACH ROW
BEGIN
		IF(:NEW.ord_code) NOT IN('p100') THEN
    	    RAISE_APPLICATION_ERROR(-20001 ,'��ǰ�ڵ� ����');
    END IF;
END;

INSERT INTO tri_order
VALUES(1,'p200',sysdate);
COMMIT;

SELECT * FROM tri_order;

--------------------------------------------------------------------------
--�԰�
CREATE TABLE t_01
(
   NO number,
   pname VARCHAR2(20)
)

--���
CREATE TABLE t_02
(
   NO number,
   pname VARCHAR2(20)
)
--insert Trigger
CREATE OR REPLACE TRIGGER insert_t_01
AFTER INSERT
ON t_01
FOR EACH ROW
BEGIN
	INSERT INTO t_02(NO,pname)
  VALUES(:NEW.NO  , :NEW.pname);
END;

INSERT INTO t_01 VALUES(1,'computer');
INSERT INTO t_01 VALUES(2,'notebook');

SELECT * FROM t_01;
SELECT * FROM t_02;
COMMIT;

--update Trigger
CREATE OR REPLACE TRIGGER update_t_01
AFTER UPDATE
ON t_01
FOR EACH ROW
BEGIN
       UPDATE t_02
       SET pname = :NEW.pname
       WHERE NO = :OLD.NO;
END;

UPDATE t_01
SET pname = 'TV'
WHERE NO =1;

SELECT * FROM t_01;
SELECT * FROM t_02;
COMMIT;

--delete Trigger
CREATE OR REPLACE TRIGGER delete_t_01
AFTER DELETE
ON t_01
FOR EACH ROW
BEGIN
    DELETE FROM t_02
    WHERE NO = :OLD.NO;
END;

DELETE FROM t_01 WHERE no=1;

SELECT * FROM t_01;
SELECT * FROM t_02;
COMMIT;


