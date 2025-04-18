--����Ŭ �����ͺ��̽� �����ý���

--���� :
-- �����ͺ��̽� �𵨸�(����)�� ����� �̷��� �����ϰ� �׿� �԰��� �����ͺ��̽��� ����
-- �̸� ������� ����Ŭ �����ͺ��̽� ���� �ý��ۿ� �����ϱ� ���Ͽ� �����ͺ��̽� ���ν� SQL(Structured Query Language)�� ���
-- ����Ŭ �����ͺ��̽� ���� �ý��� ���ο��� ���� �� ������ ������ ó���� ���Ͽ� PL/SQL�� ���

--����
-- ������ �����ͺ��̽��� ȿ�������� �����ϴ°�
-- �����ͺ��̽��� ������ ���� ������� �ʰ� �������� ����Ҽ��ֵ��� �ϴ°�
-- ���� ��ȸ�� ���� ó�� ������ ���� ���� �����ͺ��̽��� Ʃ��
-- ���� ���� ���� ����ڷκ��� ������ ���̽��� ��ȣ�ϴ� ������ å���� ���� ����

--����
-- �ڹ�, C/C++, ���־�����, �Ŀ�����, CGI, ASP, JSP, PHP�� �پ��� ���� �� ��ũ��Ʈ�� �̿��Ͽ�, �����ͺ��̽��� �����͸� �Է��ϰ�, ��ȸ �� �����ϴ� �����۾��� ���� ����ڰ� ó���Ҽ��ֵ��� �ϴ� �Ϸ��� ����


--������ �ٶ󺸴�  DATABASE
--DB���ϴ� ù��° ���
--**Table ������ ��Ȯ�ϰ� ���� (�÷��� ����)
SELECT * FROM emp; --��� ���̺�
SELECT * FROM DEPT;  --�μ� ���̺�
SELECT * FROM BONUS;
SELECT * FROM SALGRADE; --�޿� ��� ���̺�


--1. ���� (������ ��ȸ �ϱ�)
SELECT	[DISTINCT] 	{*, column [alias], . . .}
FROM		table_name
[WHERE		condition]
[ORDER BY	{column, expression} [ASC | DESC]];

--Table ���� ��ȸ�ϱ�
DESC emp;

--Table ��ü ������ ��ȸ
SELECT * FROM EMP;

--Ư�� �÷� ������ ��ȸ
SELECT empno, ename , sal FROM emp;
SELECT empno, hiredate FROM emp;

--[alias] �÷��� ����Ī �ο��ϱ�

SELECT empno ��� , ename �̸�  FROM emp;
SELECT empno AS ��� FROM emp;  --������
SELECT ename AS "���" FROM emp;

--����Ŭ���� ���� ó���� '����'
--����Ŭ����  ���� ������  ||
--hint) MS-SQL => || -> +(���տ�����)
SELECT '�츮ȸ�� ����� ' || empno  || '�Դϴ� ' AS empdata
FROM emp;

SELECT empno , '0' AS data1 , 'bbbb' AS data2 , 'cccc' AS data3
FROM emp;


SELECT '�޿����� ' || sal FROM emp;
-- + (���������)
-- || (���Ῥ����)
SELECT 100 || 100 FROM dual; --100100
SELECT 100 + 100 FROM dual; --200

-- '100' ������ ����
-- '100A' ������ ����(x)
SELECT 100 + '100' FROM dual;  -- '100' ����ϱ� ���� �ڵ� ����ȯ
SELECT '100' + '100' FROM dual; -- �Ѵ� ����ȯ -> 200
SELECT 'A' + 100  FROM dual;    -- Error

SELECT '100' + sal FROM emp;  --������ ������ ������ (�ڵ� ����ȯ)

--�츮ȸ�� ���� ��� �ֳ� (������ �� ����)
--�ߺ� ������ ���� (DISTINCT)
SELECT distinct job FROM emp;

SELECT deptno , job FROM emp;
--hint -> group  distinct �������  ����
SELECT DISTINCT deptno , job FROM emp;
--�μ���ȣ ���� -> job ���� distinct

--------------------------------------------------------------
--��������� (�� ���̺��� �÷��� Ÿ�� ���� �Ǵ�)
-- + , - , * , /
SELECT * FROM emp;
--����� �� �޿� �λ� 100�޷��� �λ��ϸ� �� ����޿��� ������ ......
SELECT empno,ename, sal AS ���޿� , sal +100 AS �λ�޿�
FROM emp;

--�� ������
-- <  ,  > ,  <= , >= , != , = (����)      �� java  = �Ҵ� ,   ==����

--�� ������
-- AND , OR , NOT

--������ (where)
-- ����(=) , �̻�(=) , �ʰ� , �̸�
SELECT *
FROM emp
WHERE sal > 3000;


SELECT empno, ename, job, sal  --3
FROM emp                            -- 1
WHERE sal >= 2000;                 --2

--����� 7788���� ����� ��� ������ ���
SELECT * FROM emp WHERE empno=7788;

--����� �̸��� king �����  ��� , �̸� ,�޿� ������ ���
--����Ŭ��[������ ������] ���ؼ� [��ҹ��ڸ� ����]�ϰ� �����Ѵ�
--hint) Ms-sql => ������ ������ ��ҹ��ڸ� �������� �ʴ´�

SELECT * FROM emp WHERE ename = 'king';

SELECT * FROM emp WHERE ename = 'KING';

--�޿��� 2000�޷� �̻��̸鼭 ������ manager �� ����� ��� ���� ���
SELECT * FROM emp WHERE sal >= 2000 AND job='MANAGER';

--�޿��� 2000�޷� �̻��� �ų� (�Ǵ�) ������ manager �� ����� ��� ���� ���
SELECT * FROM emp WHERE sal >= 2000 OR job='MANAGER';


Select SQL �������(����Ŭ SQL ����)

SELECT
FROM
WHERE
GROUP BY
HAVING
ORDER BY


1) FROM table(s) [alias]
- FROM ���� ���� ���̺��� �ν��Ͽ� ������ ��ųʸ����� ���õ� �������� �ľ�

2) [WHERE condition(s)]
- WHERE������ ���ǿ� �´� �����͸� ����

3) [GROUP BY column(s)]
- GROUP BY���� �߰��Ǹ� GROUP BY���� ���� �׸񺰷� �������� ������ �Ͼ

4) [HAVING condition(s)]
- HAVING ���� GROUP BY���� ������ �� �����͸� ������� ������ ����.

5) SELECT {*, column(s) [alias],...}
- ��κ��� RDBMS�� ROW(�ο�)���� ���屸���Դϴ�. SELECT�������� ������ �ʴ� Į�������� �����ͺ��̽��� �޸𸮿� ����.

6 [ORDER BY column(s) [alias] [DESC],.....];
- ORDER BY���� ���� ���߿� ����.
- SELECT������ ���õ��� ���� Į���̳� ���굵 �����ͺ��̽��� �޸𸮿� ����Ǿ������Ƿ� ORDER BY������ ���



�������ڸ� ������ ����.

1.FROM ������ ���̺��� ����� ������
2.WHERE ������ �˻� ���ǿ� ����ġ �ϴ� �� ����
3.GROUP BY ������ ��õ� ���� ���� �׷�ȭ
4.HAVING ���� GROUP BY ���� ��� �� �� �˻� ���ǿ� ����ġ �ϴ� �� ����
5.SELECT ������ ��õ� ���� ����
6.ORDER BY ������ ���� �������� ����� ����� ���� �� ���

/*
DML (������ ���۾�) 2����
*/

SELECT * FROM emp;

--sqlplus----------------------------------
select * from nls_session_parameters;
NLS_DATE_FORMAT
--RR/MM/DD
NLS_DATE_LANGUAGE
--KOREAN
SELECT * FROM emp WHERE hiredate = '80/01/01';


--sqlgate
select * from nls_session_parameters;
NLS_DATE_FORMAT
--DD-MON-RR
NLS_DATE_LANGUAGE
--AMERICAN
--sqlgate ����  �� �� ������ ����� ��� �������� �ۼ��� ������
select * from emp where hiredate > '01-JAN-80';
-----------------------------------------------------------
--******���� ���ϴ� ���·� ��¥ ǥ�� �� �Է��� ���� �� ��  ���� ��*******
--�ѱ��ο��� ���� �ͼ��� ǥ��
SELECT * FROM EMP WHERE hiredate > '1980-01-01';


--��¥
--����Ŭ �����ͺ��̽� ���� ��¥
select sysdate from dual;   --DB���� �ð�

--java -> jsp -> �Խ��� �۾��� -> insert into board(sDate) values( sysdate)
--MS-SQL ������ ���̽�
--select getdate()

--��¥ ǥ�� ��� �ٲٱ�
alter session set nls_date_format = 'YYYY-MM-DD HH24:MI:SS';
select * from nls_database_parameters
select * from nls_session_parameters;
--http://blog.naver.com/dgroups?Redirect=Log&logNo=10006253956

--�� ���� ������ ���� ���� ���� �� regedit ������ ���ؼ� ......~~


SELECT * FROM EMP WHERE hiredate > '1980-01-01';

SELECT * FROM EMP WHERE hiredate = '1980-12-17';

--����� �޿� 2000�̻� 4000������ ��� ����� ������ ����ϼ���
select * from emp
where sal >= 2000 and sal <= 4000

--������ (between A and B)
select * from emp
where sal between 2000 and 4000;    -- =������ �ִ�

--����� �޿� 2000�ʰ�  4000�̸��� ��� ����� ������ ����ϼ���
select * from emp
where sal > 2000 and sal < 4000

--�μ���ȣ�� 10���� ������� ��� ������ ����ϼ���
select * from emp  where deptno=10;

--�μ���ȣ�� 10�� �Ǵ� 20�� �Ǵ�  30�� ����� ��� ���� ����ϼ���
select * from emp where deptno=10 or deptno=20 or deptno=30;
--������ (IN)
select * from emp where  deptno in(10,20,30);   --��� �� ó�� Ǯ� ó��

--�μ���ȣ�� 10���� �ƴ� ��� ����� ������ ����ϼ���
select * from emp where deptno != 10;
--�μ���ȣ�� 10�� , 20�� , 30���� �ƴ� ��� ����� ������ ����ϼ���
select * from emp where deptno != 10 and deptno != 20 and deptno != 30
-- IN  <-> NOT IN
select * from emp where deptno not in (10,20,30);

--[ ���ڿ� ] ���� �˻��ϱ�
--�Խ��� (�̸�, ���� , ���� )
--�ּҰ˻� (������ ,,, ����   %����%
--���ϵ� ī�� ( %:��� �� , _:�ѹ���)
select ename from emp where ename like '%A%';
select ename from emp where ename like 'A%';
select ename from emp where ename like '%S';

select ename from emp where ename like '%LL%'
select ename from emp where ename like '%A%A%';
--BAAB  ,  ABBA ,
select ename from emp where ename like '_A%';
--ù���ڴ� � ���̿� �������  �ι�° ���ڰ� A
select ename from emp where ename like '_a%';  --���ڿ� ������ ��ҹ��� ����

--���� �Ϲ����� LIKE �˻� ����
--select * from zipcode where dong like '%�Ǳ�%';
 select * from zipcode where dong like '�Ǳ�%';

 --key point (�ʿ��)
 -- null
 -- DB������ null (�����Ͱ� ���� )
select * from emp;

--������̺��� ������ ���� �ʴ� ��� ����� ������ ����ϼ���
--�����Ͱ� null
--** null�� ���� �񱳴� is null  �Ǵ� is not null
--select * from emp where comm = null; (x)
select * from emp where comm is null;
select * from emp where comm is not null;

--** null�� ���� (null ���� ��� ������ => null)
--������� ������� �̹� �� �޿����� (���޿� , ���� , ���޿� + ������ ��ģ �ݾ�)
select empno, ename , sal, comm, sal + comm as �ѱ޿�
from emp;

--> �� �� ���� ������ ���� �ذ��� -> �Լ� ���� (Null ����)
-->*****************~~~~~~~~~~~~������ �ϱ�
--����Ŭ ( NVL() )
--MS-SQL (Convert() )
select ename , sal ,  comm,  nvl(comm,0) from emp;
select ename , sal ,  comm,  nvl(comm,100) from emp;
--*****************************************************************************************
select ename , sal , comm,  sal + nvl(comm,0) as �ѱ޿�  from emp;
--Ex)---------------------------------------------------
create table member(
    id varchar2(10) not null,    --null���� ������� �ʴ´� (���� insert)
    job varchar2(20) null        --���� , null -> null�� ���(insert ���� �ʾƵ� �ȴ�)
);
desc member;
select * from member;
--����
insert into member(id, job) values ('kglim' , 'Teacher');
select * from member;
--�ǹݿ�
commit;  --�����ϼ���
insert into member(job) values('TTTT');   -- Error -> id colmun -> id not null
insert into member(id) values('king');   --������� -> job column -> null��

select * from member;
commit;

select id , nvl(job,'������ �����ϴ�') as ���� from member;

--����� �޿��� 1000�̻��̰� ������ ���� �ʴ� ����� ���, �̸�, ����, �޿� ,����
--������ ����ϼ���
select empno, ename, job, sal, comm
from emp
where sal >= 1000 and comm is null

--������ �����ϱ�
--����(sort)
--order by (������ �¿��ϴ� ���)
--��������(���� ������) asc
--��������(���� ������) desc

--�޿��� ���� ������ �����ϼ���
select * from emp order by sal asc;
select * from emp order by sal;  -- default => asc

select empno ,ename , sal  from emp order by sal desc;

--�Ի����� ���� ���� ��������� �����ؼ� ����� �̸�, �޿� , �Ի����� ����ϼ���
select empno, ename, sal ,hiredate
from emp
order by hiredate desc;

--������̺��� ������ MANAGER �� ����� ������ ����ϴµ�
--�Ի����� ���� ������ ����ϼ���
select *
from emp
where job='MANAGER'
order by hiredate asc
--���� ) �� �������� ���� ������ ......^^
1.  from
2. where
3. select
4. order by

--�亯�� �Խ���
--(������ �Խ���)
--hint -> group
select *  from emp order by job asc , deptno asc  ;

--�Խ���
select id, writer , title, sdate from board order by sdate desc;

--������
--������(union) : �ߺ����� �����ϰ� ��ġ��
--������(union all) : �ߺ����� ����ϰ� ��ġ��
CREATE TABLE UT (NAME VARCHAR2(20));
	INSERT INTO UT(name) VALUES('AAA');
	INSERT INTO UT(name) VALUES('BBB');
	INSERT INTO UT(name) VALUES('CCC');

CREATE TABLE UTA (NAME VARCHAR2(20));
	INSERT INTO UTA(name) VALUES('AAA');
	INSERT INTO UTA(name) VALUES('BBB');
	INSERT INTO UTA(name) VALUES('CCC');

COMMIT;
SELECT * FROM ut
UNION  --�ߺ��� ����
SELECT * FROM uta;

SELECT * FROM ut
UNION  ALL --�ߺ��� ����
SELECT * FROM uta;
--1.  ����� ���� �÷� (empno, ename)
--���� : ù��° Table
SELECT empno ,ename FROM emp
UNION
SELECT empno ,job FROM emp;

--��� : empno, job
SELECT empno ,job FROM emp
UNION
SELECT empno ,ename FROM emp;

--Error  ���ڹ�   ���ڹ�
SELECT empno, ename FROM emp
UNION
SELECT ename , empno FROM emp;

SELECT empno , ename, sal FROM emp
UNION
SELECT empno, ename, null FROM emp

--**UNION
--1.  ������� �÷��� Type�� �����ؾ� �Ѵ�
--2. ������� �÷��� ���� ��ġ�Ͽ��� �Ѵ�  (�ذ���  : null)

SELECT empno , ename FROM emp
UNION
SELECT deptno , dname FROM dept;

DESC emp;
DESC dept;

--��������� �⺻ select ����
--SELECT           3
--FROM              1
--WHERE            2
--ORDER BY        4
-----------------------------------------------------------------------
-----------------------------------------------------------------------
--�Լ�(Function) -------------------------------------------------------
--���ڿ����� �Լ�
SELECT INITCAP('abcde') FROM dual; --ù���ڸ� �빮��

--��ҹ���(lower , upper)
SELECT LOWER('ABCDE') , UPPER('abcde') FROM dual;

SELECT LOWER(ename) AS "loname" FROM emp;

--key : ������ ����( length()   , lengthB() ����Ʈ �� ����)
SELECT LENGTH('abcde') FROM dual;

SELECT ename, LENGTH(ename) FROM emp;

SELECT LENGTHB('AB') FROM dual;    -- ������ , Ư������, ���� 1BYTE -> 2
SELECT LENGTHB('���̹�') FROM dual; --�ѱ� 2BYTE -> 6
SELECT LENGTHB('     A��') FROM dual;

SELECT ename , LENGTH(ename) , job , LENGTHB(job) FROM emp;

--���� ������ => ||
SELECT CONCAT('ABC' , 'abc') AS "concat" FROM dual;
------------------hr���� ����------------------------------------------
SELECT * FROM EMPLOYEES;
--����� fullname �� ����ϼ���
SELECT first_name || '----'  || last_name AS "fullname" FROM EMPLOYEES;
SELECT CONCAT(first_name , last_name) AS "fullname" FROM EMPLOYEES;
----------------------------------------------------------------------
--key: substr() �κй��� �����ϱ�
SELECT SUBSTR('ABCDE',2,3) FROM dual;
SELECT SUBSTR('ABCDE',2,1) FROM dual;
SELECT SUBSTR('ABCDE',-2,1) FROM dual;
SELECT SUBSTR('ABCDE',-2,3) FROM dual;

--����
--http://docs.oracle.com/cd/B10501_01/server.920/a96540/toc.htm

--QUIZ
--������̺� ename �÷��� �����Ϳ� ���ؼ� ù���ڴ� �ҹ��ڷ� ������ ���ڴ� �빮��
--�� �ϳ��� �÷����� ����ϼ���
SELECT ename FROM emp;
--���
--s MITH
--a LLEN
SELECT LOWER(SUBSTR(ename,1,1)) || ' ' || UPPER(SUBSTR(ename,2,LENGTH(ename)))
FROM emp;


--LPAD , RPAD  ä���
SELECT LPAD('ABC',10,'*')  FROM dual; --*******ABC
SELECT RPAD('ABC',10,'*')  FROM dual; --ABC*******

--QUIZ
--����� �Է� : hong1008
--ȭ�� ��� ho ������  ������ ���� ho******
SELECT  RPAD(SUBSTR('hong1008',1,2),LENGTH('hong1008') ,'*')  FROM dual;
SELECT  RPAD(SUBSTR('kkk1234567',1,2),LENGTH('kkk1234567') ,'*') AS "ID"
FROM dual;

CREATE TABLE member2(id NUMBER , jumin VARCHAR2(14));
INSERT INTO member2(id, jumin) VALUES(100,'123456-1234567');
INSERT INTO member2(id, jumin) VALUES(200,'135791-3456789');
COMMIT;

SELECT * FROM member2;
--����) select ����� => 123456-*******
SELECT RPAD(substr(jumin,1,7) , LENGTH(jumin ) , '*' ) AS "jumin"
FROM member2;

--key : replace (ġȯ�Լ�)
SELECT REPLACE('ABCDE' , 'A' , '��') FROM dual;

SELECT REPLACE('ABCDE' , 'A' , '�����ٶ󸶹ٻ�') FROM dual;
--����) select ����� => 123456-*******   replace ���
SELECT SUBSTR(jumin,8,LENGTH(jumin)) FROM member2;

SELECT REPLACE(jumin, SUBSTR(jumin,8,LENGTH(jumin)),'*******') AS "jumin"
FROM member2;


--1.3.11  RTRIM�Լ�
--������ ���ڸ� ����� �Լ� �Դϴ�.
--Syntax	RTRIM(column1 | expression1,column2 | expression2)
--�� �� ��	RTRIM(��MILLER��, ��R��)  �� MILLE
--SELECT RTRIM('MILLER', 'R') FROM dual;
--SELECT LTRIM('MILLER', 'M') FROM dual;

--���� ǥ���� (���� ���� ) ����
SELECT * FROM EMPLOYEES WHERE regexp_like(email , '^[B-Z]*') ;
CREATE TABLE reg_test(t VARCHAR2(100));
INSERT INTO reg_test values('ABC123');
INSERT INTO reg_test values('ABC 123');
INSERT INTO reg_test values('abc 123');
INSERT INTO reg_test values('a1b2c3');
INSERT INTO reg_test values('a');
INSERT INTO reg_test values('a1');
INSERT INTO reg_test values('abc123');
INSERT INTO reg_test values('?/!@#$*&');
INSERT INTO reg_test values('\~*()..');
INSERT INTO reg_test values('123123');
INSERT INTO reg_test values('123abc');


COMMIT;
--�ҹ��� ������ ���ڰ� ������ ���� �˻�
SELECT * FROM reg_test WHERE regexp_like(t,'[a-z][0-9]');

--�ҹ��� ���� ���� ������ ������ ���� �˻�
SELECT * FROM reg_test WHERE regexp_like(t,'[a-z] [0-9]');

--? ���ڰ� ���ų� �ϳ��� ����
-- [a-z]?�� ������ �ϳ��� ����
SELECT * FROM reg_test WHERE regexp_like(t,'[a-z]?[0-9]');

--* ���ڰ� ���� ��쳪 �ϳ� �̻� ���ӵǴ� ����
SELECT * FROM reg_test WHERE regexp_like(t,'[a-z]*[0-9]');

--�������� ���� �� �����ϱ�
--�빮�ڰ� ���������� 3���� ���� ��
SELECT * FROM reg_test WHERE regexp_like(t,'[A-Z]{3}');

--�ҹ��ڰ� ���������� 3���� ���� ��
SELECT * FROM reg_test WHERE regexp_like(t,'[a-z]{3}');

--���ڰ� ���������� 3���� ���� ��
SELECT * FROM reg_test WHERE regexp_like(t,'[0-9]{3}');

--���� �빮�ڿ� ���ڰ� �Բ� ���µ� �빮�ڰ� 3���� ���� ��
SELECT * FROM reg_test WHERE regexp_like(t,'[A-Z]{3}[0-9]');

--���۵Ǵ� ���ڿ� ������ ���� �����ϱ�
--���ڷ� �����ϴ� �� ���
--^���ڿ��� ���۰� ��ġ
SELECT * FROM reg_test WHERE regexp_like(t,'^[0-9]');


--�ҹ��ڳ� ���ڷ� �����ϴ� �� ���
-- | OR
SELECT * FROM reg_test WHERE regexp_like(t,'^[a-z]|^[0-9]');

--�ҹ��ڷ� ������ ���
-- $ ���ڿ��� ���� ��ġ
SELECT * FROM reg_test WHERE regexp_like(t,'[a-z]$');

--���ڷ� �������� �ʴ� �� ���
SELECT * FROM reg_test WHERE regexp_like(t,'^[^0-9]');

--���ĺ� �빮�� 'A' �� ���� 1�� �����ϰ� �ִ� �� ���

SELECT * FROM reg_test WHERE regexp_like(t,'A|1');

--Ư�� ������ �ƴ� ��� ����ϱ�
--������(��ҹ���)�� �������� �ʴ� ��� ��
SELECT * FROM reg_test WHERE NOT  regexp_like(t,'[a-z][A-Z]');


--���ڸ� �������� �ʴ� ��� ��
SELECT * FROM reg_test WHERE NOT  regexp_like(t,'[0-9]');


--Ư������ �O
--Ư������ �տ� \�� �ٿ��� �˻��Ѵ�
SELECT * FROM reg_test WHERE  regexp_like(t,'\?');

--�ݴ�
SELECT * FROM reg_test WHERE  not regexp_like(t,'\?');




--------------------------------------------------------------------
--���ڿ� �Լ� END

---------------------------------------------------------------------
---------------------------------------------------------------------
--������ �Լ�
--ROUND	���ڸ� �ݿø�
--TRUNC	���ڸ� ����
--MOD	�������� ���� => java %

--oracle : +  , - , *  ,  /
--key : Round �ݿø��Լ�  ( -3 , -2, -1  <-  0(������)  ->  1,2,3 )
SELECT ROUND(12.345,0) AS "R" FROM dual; --12
SELECT ROUND(12.567,0) AS "R" FROM dual; --13
SELECT ROUND(12.345,2) AS "R" FROM dual; --12.35  �Ҽ����� 2��° �ڸ����� ���ܶ�
SELECT ROUND(12.345,-1) AS "R" FROM dual;
SELECT ROUND(15.345,-1) AS "R" FROM dual;

--key : trunc (�����Լ�  : �ݿø� ���� �ʾƿ�)
SELECT TRUNC(12.345,0) AS "T" FROM dual;
SELECT TRUNC(12.567,0) AS "T" FROM dual;
SELECT TRUNC(12.345,2) AS "T" FROM dual;
SELECT TRUNC(12.345,-1) AS "T" FROM dual;
SELECT TRUNC(15.345,-1) AS "T" FROM dual;


--key MOD ������ ���ϴ� �Լ� (java -> %)
SELECT MOD(12 , 10) FROM dual; --������
SELECT MOD(0 , 0) FROM dual; --������


--CEIL (���� ū �������� ����)
SELECT CEIL(12.345) FROM dual;
SELECT CEIL(12.567) FROM dual;
SELECT CEIL(-12.567) FROM dual;
--FLOOR(���� ���� �������� ����)
SELECT FLOOR(12.345) FROM dual;
SELECT FLOOR(12.567) FROM dual;
SELECT POWER(2, 3) FROM dual;
---------------------------------------------------------------------
--�����Լ� END
---------------------------------------------------------------------
--3����
--��¥�Լ�
SELECT * FROM nls_session_parameters;
ALTER SESSION set nls_date_format='YYYY-MM-DD HH24:MI:SS';

SELECT SYSDATE FROM dual;

--��¥
--��¥ + ���� => ��¥
--��¥ - ���� => ��¥
--��¥ - ��¥ => ����
-- MONTHS_BETWEEN (�γ�¥�� ������)
SELECT MONTHS_BETWEEN('2014-04-01','2014-01-01') FROM dual; --����

SELECT * FROM emp;
--QUIZ
--������̺��� ������� �Ի��Ͽ��� ����(sysdate) ���� �ټӿ����� ���ϼ���
--(ROUND �Լ� �����κи� ���⼼��)
--�߰��� �Ѵ��� 31�� ������ �����ϴ� �ټӿ����� ���ϼ���
SELECT empno, ename,
ROUND(MONTHS_BETWEEN(SYSDATE ,hiredate),0) AS "�ټӿ�"
, ROUND((SYSDATE - hiredate) / 31,0) AS "�ټӿ�2"
FROM emp;

SELECT SYSDATE , ADD_MONTHS(SYSDATE,3) FROM dual;

--��¥ ROUND , TRUNC �Լ�
SELECT SYSDATE , ROUND(sysdate) , trunc(sysdate) FROM dual;

-----------------------------------------------------------------
--��ȯ�Լ� (~~~~******* ����)
--TO_CHAR       ��¥�� -> ���ڷ�    ���ڸ� -> ���ڷ�  (80%)
--TO_DATE       ���ڸ� ->  ��¥�� (10%)
--TO_NUMBER   ���ڸ� ->  ���ڷ� (10%)

--����Ŭ�� �⺻ Ÿ��
CREATE TABLE [���̺� ��]
(
   �÷���  Ÿ������
   id       NUMBER(2)
)
--���ڵ����� Ÿ��
--CHAR(20)       :�������� ���ڿ� : �ѱ� 10�� , ������, Ư������, ����20��
--VARCHAR2(20) :�������� ���ڿ�  :�ѱ� 10�� , ������, Ư������, ����20��
--NCHAR(20)      : �ѱ� 20�� , ������,Ư������,���� 20�� => 40byte
--NVARCHAR2(20) : : �ѱ� 20�� , ������,Ư������,���� 20�� => 40byte
CREATE TEST (
col1  CHAR(20),
col2 VARCHAR2(20),
col3 NCHAR(20),
col4 NVARCHAR2(20),
col5 NUMBER,
col6 NUMBER(5),
col7 NUMBER(10,3)
)
INSERT INTO TEST(col1, col2) VALUES('A' , 'A');

--���� ������ Ÿ��
--NUMBER(p,s)    : p ��ü �ڸ��� (1~38)    , s �Ҽ��� ���� �ڸ���(-84~127)
--number(5,2) : ��ü 5�ڸ����� �Ҽ��� ǥ�� 2�ڸ�
--number(5) or number

--�⺻ ����ȯ TEST
SELECT 1 + 1 FROM dual;   --2
SELECT 1 + '1' FROM dual;  --2 (����ȯ)
SELECT '1' + '1' FROM dual;  --2 (����ȯ ) ���� -> ����
SELECT '1A' + 1 FROM dual; --ERROR

SELECT TO_NUMBER('100') + 100 FROM dual;

----------------------------------------------------------
--1. ��¥ -> ����
--TO_CHAR(��¥ , '���ϴ� ���') => ���ϴ� ����(���)

YYYY   �⵵ ǥ��(4�ڸ�)
YY       �⵵ ǥ��(2�ڸ�)
MM      ���� ���ڷ� ǥ��
MON    ���� ���ĺ����� ǥ��
DD      �� ǥ��
DAY    ���� ǥ��
DY      ������ ���� ǥ��

SELECT TO_CHAR(sysdate) || '�Դϴ�' FROM dual;
SELECT SYSDATE , TO_CHAR(SYSDATE , 'YYYY') || '��' AS "YYYY" FROM dual;
SELECT TO_CHAR(SYSDATE,'YEAR')  FROM dual; --TWENTY FOURTEEN
SELECT TO_CHAR(SYSDATE,'MONTH')  FROM dual; --APRIL
SELECT TO_CHAR(SYSDATE,'MM')  FROM dual;  --04

SELECT TO_CHAR(SYSDATE,'DAY')  FROM dual; --TUESDAY
SELECT TO_CHAR(SYSDATE,'DD')  FROM dual; --22
SELECT TO_CHAR(SYSDATE , 'YYYY') || '��' ||
           TO_CHAR(SYSDATE,'MM') || '��' ||
           TO_CHAR(SYSDATE,'DD') || '��' AS "�����"
FROM dual;

SELECT TO_CHAR(SYSDATE , 'YYYY/MM/DD:HH24:MI:SS') FROM dual;

SELECT * FROM emp;
--�Ի�����  12������ ����� ��� ,�̸�, �Ի��� , ��  �� ����ϼ���
SELECT empno, ename, hiredate, TO_CHAR(hiredate,'MM') AS "month"
FROM emp
WHERE TO_CHAR(hiredate,'MM') = '12'

--1. ����  -> ����
--TO_CHAR(���� , '���ϴ� ���') => ���ϴ� ����(���)
SELECT  '>' || TO_CHAR(1234,'999999') || '<' FROM dual; --�ڸ��� (ä��(x)
SELECT  '>' || TO_CHAR(1234,'000000') || '<' FROM dual; --�ڸ��� (ä��(��)

SELECT TO_CHAR(1234,'009999') FROM dual;
SELECT TO_CHAR(1234,'099999') FROM dual;
SELECT TO_CHAR(1234,'0999999999') FROM dual;

SELECT TO_CHAR(1234,'$09999') FROM dual;

SELECT TO_CHAR(12345.789,'999,999.99') FROM dual;

--------------------------------------------------
--hr��������
SELECT * FROM EMPLOYEES;

SELECT COUNT(*) FROM EMPLOYEES;
SELECT COUNT(salary) FROM EMPLOYEES;
SELECT COUNT(commission_pct)  FROM EMPLOYEES; --�� null ���� �����մϴ�

--��� ���̺��� ����̸� (first_name, last_name)
--��� ���̺� ����̸��� fullname ���� ǥ���Ͻð� , �Ի����� 'YYYY-MM-DD' ����
--���� ����ϰ� ������ ���ϰ� ������  (���� * 1,1) 10%�λ� ������ ���ؼ� ��� 1000����
--�޸�ó�� ��� �� 2005�� ���� �Ի��ڵ鿡 ���ؼ���
SELECT employee_id ,
          first_name || last_name AS "fullname" ,
          TO_CHAR(hire_date,'YYYY-MM-DD') AS "hire_date" ,
          salary,
          salary *12 AS "����",
          TO_CHAR((salary *12) *1.1,'9,999,999,999') AS "�λ󿬺�",
          hire_date
FROM EMPLOYEES
WHERE TO_CHAR(hire_date,'YYYY') >= '2005' ;
------------------------------------------------------------
SELECT TO_DATE('2014-04-22', 'YYYY-MM-DD') FROM dual; --return ��¥
--�Ϲ��Լ� ------------------------------------------------------
--NVL   , NVL2
--DECODE   (if�� ����)
--CASE       (switch ����)

SELECT comm, NVL(comm,0) FROM emp;
SELECT comm, NVL(comm,100) FROM emp;

--DECODE (ǥ����, ����1 , ���1 , ����2 , ���2 , ����3 , ���3.......)
CREATE TABLE funtionTmp
(
	 id NUMBER(6),
   job VARCHAR2(20)
);
INSERT INTO funtionTmp(id, job) VALUES(100,'IT');
INSERT INTO funtionTmp(id, job) VALUES(200,'SALES');
INSERT INTO funtionTmp(id, job) VALUES(300,'MGR');
INSERT INTO funtionTmp(id) VALUES(400);
COMMIT;

DELETE FROM funtionTmp;
COMMIT;

SELECT * FROM funtionTmp;
SELECT id, job , NVL2(job,'AAA' , 'BBB') FROM funtionTmp
--job �÷��� �����Ͱ� ������ ó������(AAA) , null�̸� �ι�° �Է°���(BBB)
SELECT id, job , NVL2(job,job, 'BBB') FROM funtionTmp

--DECODE
SELECT id, job , DECODE(id,100,'IT...' ,200,'SALES...' , 300,'MGR..' , 'ETC...') AS "job"
FROM funtionTmp;

--Emp ���̺��� 10 �λ�� , 20 ������ , 30 ȸ���  �׿ܴ� ��Ÿ�μ� ���
SELECT empno, ename, deptno, DECODE(deptno, 10,'�λ��' ,
                                  20,'������',
                                  30,'ȸ���',
                                  '��Ÿ�μ�') AS "�μ���"
FROM emp;

CREATE TABLE functiontmp2
(
   id NUMBER(2),
   jumin char(7)
);

INSERT INTO functiontmp2(id,jumin) VALUES(1,'1234567');
INSERT INTO functiontmp2(id,jumin) VALUES(2,'2134567');
INSERT INTO functiontmp2(id,jumin) VALUES(3,'1222222');
INSERT INTO functiontmp2(id,jumin) VALUES(4,'3123456');
COMMIT;

SELECT * FROM functiontmp2;
--QUIZ)
--jumin��ȣ �÷��� ���ڸ��� 1 �̸� ���� , 2 �̸� ���� , 3 �̸� �߼�
--�� decode
SELECT id , jumin, DECODE(SUBSTR(jumin,1,1), 1,'����' ,2,'����' ,3,'�߼�') AS "gender"
FROM functiontmp2;

SELECT ename, deptno,
          DECODE(deptno , 20, DECODE(ename,'SMITH','hello','world') ,'ETC')
FROM emp;

--CASE
--java switch
CASE ���� WHEN ���1  THEN ���1
              [WHEN ���2  THEN ���2] ...
              ELSE ���3
END "�÷���"
CREATE TABLE temp_zip
(
   zipcode NUMBER(10),
   region VARCHAR2(20)
);
INSERT INTO temp_zip(zipcode) VALUES(02);
INSERT INTO temp_zip(zipcode) VALUES(031);
INSERT INTO temp_zip(zipcode) VALUES(033);
INSERT INTO temp_zip(zipcode) VALUES(041);
INSERT INTO temp_zip(zipcode) VALUES(064);
COMMIT;

SELECT * FROM temp_zip

SELECT  '0' || TO_CHAR(zipcode) ,
           CASE zipcode
                   WHEN 2 THEN '��������'
                   WHEN 31 THEN '�������'
                   WHEN 33 THEN '��������'
                   WHEN 41 THEN '�泲����'
                   ELSE '��Ÿ����'
           END "regionname"

FROM temp_zip
ORDER BY zipcode DESC;
---------------------------------------------------------
--���� ����
--������̺��� ��� �޿���  1000�޷� ���ϸ�  4��
--1001�޷� �̻� 2000�޷� ���̸� 3��
--2001�޷� �̻� 3000�޷� ���̸� 2��
--3001�޷� �̻� 4000�޷� ���̸� 1��
--4001�޷� �̻��̸� Ư���� ����ϼ���

SELECT EMPNO, ENAME, SAL,
CASE WHEN SAL <= 1000 THEN '4��'
        WHEN SAL BETWEEN 1001 AND 2000 THEN '3��'
		    WHEN SAL BETWEEN 2001 AND 3000 THEN '2��'
        WHEN SAL BETWEEN 3001 AND 4000 THEN '1��'
        ELSE 'Ư��'
END "���"
FROM emp;
---------------------------------------------------------------------------
--��������� ����Ŭ �⺻ ����-------------------------------------------------
--����Ŭ �Լ� (�����Լ�)
--COUNT()
--SUM()
--AVG()
--MAX()
--MIN().....
--group �Լ�
--1. key point : null ��� �����Լ��� null�� �����Ѵ�
--2.key point : select ���� �����Լ� �̿ܿ� �ٸ� �÷��� ���� �ݵ��
--                 group by ���� �� �÷��� ��õǾ�� �Ѵ�

SELECT COUNT(*)  AS "rowcount" FROM emp; --row �� ��ȯ
SELECT COUNT(empno) FROM emp;

SELECT COUNT(comm)  FROM emp; -- 4�� (null ���� ����
SELECT * FROM emp;

SELECT SUM(comm) FROM emp; --2200
SELECT AVG(comm) FROM emp;  --550    sum() / �Ǽ�(null���� ������ �ʴ� �Ǽ�)
SELECT 2200 / 4 FROM dual; --�츮ȸ��� ������ �޴� ������� ������
SELECT 2200 / 14 FROM dual; --�츮ȸ��� ������� ������
SELECT SUM(comm) / COUNT(*) FROM emp; -- ���ѹ��
SELECT AVG(NVL(comm,0)) FROM emp;

SELECT COUNT(NVL(comm,0))  FROM emp;
---------------------------------------------------------------------------
SELECT MAX(sal) FROM emp;
SELECT MIN(sal) FROM emp;

SELECT MAX(hiredate) FROM emp;
SELECT MIN(hiredate) FROM emp;

SELECT COUNT(sal) , AVG(sal) , SUM(sal) , MAX(sal) , MIN(sal)
FROM emp;

---------------------------------------------------------------------------
--������ �޿��� ���� ���ϼ���
SELECT job , SUM(sal) ,COUNT(sal) , MAX(sal)
FROM emp
GROUP BY job;


SELECT deptno , job , SUM(sal)
FROM emp
GROUP BY deptno , job

SELECT empno , SUM(sal)
FROM emp
GROUP BY empno;


SELECT * FROM emp;

SELECT COUNT(sal)
FROM emp
GROUP BY sal
--�������
SELECT         --4
FROM            --1
WHERE           --2
GROUP BY      --3
ORDER BY      --5

SELECT job , AVG(sal) AS "avgsal"  --����Ī�� order by ���� �� �ִ�
FROM emp
WHERE sal > 1000
GROUP BY job
ORDER BY "avgsal" asc
--quiz
--emp���̺��� ������ ��� �޿��� 3000�޷� �̻��� ����� ������ ��ձ޿� ���
SELECT job , AVG(sal)
FROM emp
--WHERE AVG(sal) >= 3000 --�������� group by �� �ڷ�
--group by ������ => having
GROUP BY job
HAVING AVG(sal) >= 3000;

--from ���� �������� where
--group by �������� having

SELECT
FROM
WHERE
GROUP BY
HAVING
ORDER BY

--������ ���޹޴� ����߿��� �޿��� ���� 10000�̻�
--��� ���̺��� ������ �޿��� ���� ����ϵ� ������ ���� �ް� �޿��� ���� 10000�̻���
--����� ����� ����ϰ� �޿��� ���� ���� ��µǵ��� �ϼ���

SELECT job , SUM(sal) AS "sumsal"
FROM emp
WHERE comm IS NOT NULL
GROUP BY job
HAVING SUM(sal) >=5000
ORDER BY  "sumsal" asc

--�Լ� (pivot , rank() ....................��� ���� �ð��� ������ ������ �ͼ������� �̾߱� ���ּ���
-----------------------------------------------------------------------------
--�Լ� END ------------------------------------------------------------------
--�߿��մϴ� ^^
--RDBMS ����ϸ� �ݵ�� ���Ǵ� ..join
--JOIN(����) �ϳ� �̻��� ���̺��� ����� ���
--������ ����
--1. equi join(�����) => 70% (1 : 1 �� ���� �÷��� ����)

--2. non-equi join(�� ����) => �ǹ̸� ����  (1 : 1 �� ���� �÷��� ����(x))

--3. outer join(����� + null)  20%  (������ ���������� �Ǵ��Ѵ�)
      --full outer join
      --left outer join
      --right outer join

--4. self join(�ڱ��ڽ� ����) => �ǹ� 10% => ���� (�)
SELECT * FROM emp;

--5. cross join(������ ���� ����)(��ī��Ʈ�� �� :���� �� * ���� ��)
SELECT * FROM emp e , dept d ORDER BY ename  WHERE e.DEPTNO = d.DEPTNO;
--join ���� ����
--oracle join ����
--ANSI ǥ��  ����


-------------------------------------------------------------
--���� : ���̺� ���� �ľ� (���� �ľ�)
--����� (������)
--oracle join  =>
--ANSI  join =>  inner join  or   join

--oracle join ����
SELECT e.EMPNO , e.ename ,e.DEPTNO , d.DNAME
FROM emp e , dept d
WHERE e.deptno = d.deptno --AND sal > 1000

--ANSI join ����
SELECT  e.EMPNO , e.ename ,e.DEPTNO , d.DNAME
FROM emp e JOIN dept d
ON e.DEPTNO = d.DEPTNO
--WHERE sal > 1000

SELECT  e.EMPNO , e.ename ,e.DEPTNO , d.DNAME
FROM emp e INNER JOIN dept d
ON e.DEPTNO = d.DEPTNO
--WHERE sal > 1000

--�޿��� 1000�޶� �̻��̰� ������ 'CLERK' �� ����� ���, �̸�, �μ���ȣ , �μ��̸�
--�� ����ϼ���
SELECT e.EMPNO ,e.ENAME ,d.DNAME ,e.deptno
FROM emp e , dept d
WHERE e.deptno = d.DEPTNO
          AND sal >= 1000
          AND job ='CLERK'

SELECT e.EMPNO ,e.ENAME ,d.DNAME ,e.deptno
FROM emp e JOIN dept d
ON e.DEPTNO = d.DEPTNO
WHERE  sal >= 1000 AND job='CLERK';
---------------------------------------------------------
--����� ��� , �޿� , �޿���� �� ����ϼ���
SELECT * FROM SALGRADE;
--join (��) : �ǹ̷������� ��
SELECT e.empno , e.sal , s.grade
FROM emp e JOIN SALGRADE s
ON e.SAL  BETWEEN s.losal AND s.hisal

SELECT e.empno , e.sal , s.grade
FROM emp e , SALGRADE s
WHERE e.sal BETWEEN s.LOSAL AND s.HISAL
---------------------------------------------------------------------------
---------------------------------------------------------------------------
--5���� JOIN---------------------------------------------------------------
--���� ���ظ� ���� ���̺� ����
CREATE TABLE M (M1 CHAR(6) , M2 CHAR(10));
CREATE TABLE S (S1 CHAR(6) ,   S2 CHAR(10));
CREATE TABLE X (X1 CHAR(6) ,   X2 CHAR(10));

INSERT INTO M VALUES('A','1');
INSERT INTO M VALUES('B','1');
INSERT INTO M VALUES('C','3');
INSERT INTO M VALUES(Null,'3');
COMMIT;
INSERT INTO S VALUES('A','X');
INSERT INTO S VALUES('B','Y');
INSERT INTO S VALUES(null,'Z');
COMMIT;
INSERT INTO X VALUES('A','DATA');
COMMIT;

SELECT * FROM M;
SELECT * FROM S;
SELECT * FROM X;

--oracle join
SELECT m.M1 , m.M2 , s.S2
FROM M , S
WHERE m.M1 =s.S1

--ansi join
SELECT m.M1 , m.M2 , s.S2
FROM M JOIN S
ON m.m1 = s.S1

--3�� �������� ���̺� ����
-- A = B ,  B = C , A = C
SELECT m.M1 , s.s2, x.X2
FROM M , S , X
WHERE m.m1 = s.S1 AND s.S1 = x.X1;

--ansi join
SELECT m.M1 , s.s2, x.X2
FROM m JOIN s ON m.M1 = s.S1
            JOIN x ON s.S1 = x.X1;
            --JOIN y ON x.x1 = y.y1
----------------------------------------------------------------------------
--hr �۰������� �����ؼ� TEST
SELECT * FROM EMPLOYEES;
SELECT * FROM DEPARTMENTS;
SELECT * FROM LOCATIONS;

--���, �̸�, �μ���ȣ , �μ��̸�
SELECT e.EMPLOYEE_ID , e.LAST_NAME , e.DEPARTMENT_ID ,
           d.department_name
FROM EMPLOYEES e JOIN DEPARTMENTS d
ON e.department_id = d.department_id

--��� , �̸�, �μ���ȣ, �μ��̸� , �����ڵ�, ���ø�
SELECT e.EMPLOYEE_ID ,
           e.LAST_NAME ,
           e.DEPARTMENT_ID ,
           d.department_name,
           d.location_id,
           l.CITY
FROM EMPLOYEES e JOIN DEPARTMENTS d
         ON e.DEPARTMENT_ID = d.DEPARTMENT_ID
         JOIN LOCATIONS l
         ON l.LOCATION_ID = d.LOCATION_ID;
--------------------------------------------------------------------------
--��
select * from emp;
select * from salgrade;

--------------------------------------------------------------------------
--outer join
--(���������� inner join ����ǰ� ���� �ΰ����̺���  ��/�� ���踦 �ľ�)
--null�����ο� ���� ������ �������� ���� ����
--ANSI ����
--1. full outer join (������ �Ѵ�)
--2. left outer join (������ ����)
--3. right outer join (�������� ����)

--oracle join
-- e.deptno (+)= d.deptno
--ms-sql join
--where e.deptno *= d.deptno

select *
from m join s
on m.m1 = s.s1

select *
from m left outer join s
on m.m1 = s.s1

select *
from m right outer join  s
on m.m1 = s.s1

select *
from m full outer join s
on m.m1 = s.s1


--*key point => outer join �� ���� ������ null
select * from emp;
--������̺��� ���, �̸� ,�����ڻ�� , �������̸� �� ����ϼ���
--join ���� ����� ���� 14�� -> ��µ� �����ʹ� 13�� -> mgr -> null -> king
select e.empno, e.ename, m.empno,m.ename
from emp e join emp m
on e.mgr = m.empno ;

select e.empno, e.ename, m.empno,m.ename
from emp e left outer join emp m
on e.mgr = m.empno ;


select * from emp  ;
------------------------------------------------------------------------
--�������� 20��
-- 1. ������� �̸�, �μ���ȣ, �μ��̸��� ����϶�.
SELECT E.ENAME, E.DEPTNO, D.DNAME
FROM EMP E  join DEPT D
on E.DEPTNO=D.DEPTNO

-- 2. DALLAS���� �ٹ��ϴ� ����� �̸�, ����, �μ���ȣ, �μ��̸���
-- ����϶�.
SELECT E.ENAME, E.JOB, D.DEPTNO, D.DNAME
FROM EMP E  join DEPT D
on E.DEPTNO=D.DEPTNO
WHERE  LOC='DALLAS'

-- 3. �̸��� 'A'�� ���� ������� �̸��� �μ��̸��� ����϶�.
SELECT E.ENAME, D.DNAME
FROM EMP E inner join DEPT D
on D.DEPTNO=E.DEPTNO
WHERE  E.ENAME LIKE '%A%'

-- 4. ����̸��� �� ����� ���� �μ��� �μ���, �׸��� ������
--����ϴµ� ������ 3000�̻��� ����� ����϶�.
SELECT E.ENAME, D.DNAME, E.SAL
FROM EMP E inner join DEPT D
on E.DEPTNO=D.DEPTNO
where SAL>=3000

-- 5. ������ 'SALESMAN'�� ������� ������ �� ����̸�, �׸���
-- �� ����� ���� �μ� �̸��� ����϶�.
SELECT E.JOB, E.ENAME, D.DNAME
FROM EMP E inner join DEPT D
on E.DEPTNO=D.DEPTNO
where E.JOB='SALESMAN'

-- 6. Ŀ�̼��� å���� ������� �����ȣ, �̸�, ����, ����+Ŀ�̼�,
-- �޿������ ����ϵ�, ������ �÷����� '�����ȣ', '����̸�',
-- '����','�Ǳ޿�', '�޿����'���� �Ͽ� ����϶�.
--(�� ) 1 : 1 ���� ��� �÷��� ����
SELECT E.EMPNO AS "�����ȣ",
           E.ENAME AS "����̸�",
	        E.SAL*12 AS "����",
           E.SAL*12+COMM AS "�Ǳ޿�", --E.SAL*12+NVL(COMM,0) AS "�Ǳ޿�",
	         S.GRADE AS "�޿����"
FROM EMP E inner join SALGRADE S
on E.SAL BETWEEN S.LOSAL AND S.HISAL
where COMM IS NOT NULL

-- 7. �μ���ȣ�� 10���� ������� �μ���ȣ, �μ��̸�, ����̸�,
-- ����, �޿������ ����϶�.
SELECT E.DEPTNO, D.DNAME, E.ENAME, E.SAL, S.GRADE
FROM EMP E   join DEPT D
on E.DEPTNO=D.DEPTNO
inner join SALGRADE S
on E.SAL BETWEEN S.LOSAL AND S.HISAL
WHERE E.DEPTNO=10

SELECT * FROM SALGRADE;


-- 8. �μ���ȣ�� 10��, 20���� ������� �μ���ȣ, �μ��̸�,
-- ����̸�, ����, �޿������ ����϶�. �׸��� �� ��µ�
-- ������� �μ���ȣ�� ���� ������, ������ ���� ������
-- �����϶�.
SELECT E.DEPTNO, D.DNAME, E.ENAME, E.SAL, S.GRADE
FROM EMP E inner join DEPT D
on E.DEPTNO=D.DEPTNO
inner join SALGRADE S
on E.SAL BETWEEN S.LOSAL AND S.HISAL
WHERE  E.DEPTNO<=20 --WHERE E.DEPTNO IN (10,20)
ORDER BY E.DEPTNO ASC,  E.SAL DESC



-- 9. �����ȣ�� ����̸�, �׸��� �� ����� �����ϴ� ��������
-- �����ȣ�� ����̸��� ����ϵ� ������ �÷����� '�����ȣ',
-- '����̸�', '�����ڹ�ȣ', '�������̸�'���� �Ͽ� ����϶�.
--SELF JOIN (�ڱ� �ڽ����̺��� �÷��� ���� �ϴ� ���)

SELECT E.EMPNO, E.ENAME , M.EMPNO, M.ENAME
FROM EMP E  left outer JOIN EMP M
ON e.MGR = m.EMPNO
--------------------------------------------------------------------------
--------------------------------------------------------------------------
--subquery(SQL �� �̶� �Ҹ���� ....)
--select �ȿ� select �� ��
--query ���� �ذ��

--����
--single row subquery : subquery ����� 1 ���� row (������ �����÷�)
--multi row subquery : subquery ����� �������� ��� (������ �����÷�)
--multi column subquery : ...

--1. ���������� ���� ���� ����(�ѹ���)
--2. �� ����� ������ ���� ������ ����
--3. ����) subquery�� ���������� ���� ���� �Ͽ��� �Ѵ�
--4. subquery�� ��ȣ�ȿ� ���δ�

--������̺��� ��ձ޿����� �� ���� �޿��� �޴� ����� ��� ,�̸� ,�޿�
--�� ����ϼ���
select avg(sal) from emp;    --2073
select empno, ename , sal
from emp where sal > (select avg(sal) from emp);

--1. single row subquery
--���Ǵ� ������ ( = , >  , <  , >= , <= )
--������̺��� jones�� �޿����� �� ���� �޿��� �޴� ��� ,�̸� ,�޿� ���� ���
select empno, ename, sal from emp
where sal > (select sal from emp where ename = 'JONES')

--2. Multi row subquery
--����� ������  (IN , NOT IN , ANY , ALL)
select * from emp
where sal in (select sal from emp where sal > 2000) ;

select * from emp
where sal not in (select sal  from emp where sal > 2000) ;

 --���������� �ִ� ����� �����ȣ�� �̸��� ����ϼ���
 select empno, ename from emp
 where empno in  (select mgr from emp)

 --���������� ���� ����� ����� �̸��� ����ϼ���
 select empno, ename from emp
 where empno not in  (select nvl(mgr,0) from emp)  --not in (and ... and  ... and

--king ���� �����ϴ� �� ���ӻ���� king�� ����� ��� , �̸� ,������ ����ϼ���
select empno ,ename, job
from emp
where mgr =  (select empno from emp where ename='KING')

--20�μ��� ����߿��� ���帹�� �޿��� �޴� ������� �� ���� �޿��� �޴�
--�����ȣ , �̸�, �޿� ������ ����ϼ���
select empno ,ename , sal
from emp where sal >  (select max(sal) from emp where deptno=20)

--������ salesman �� ����� [���� �μ�]�� �ٹ��ϰ� [���� ����]�� �޴� ���
--��� ,�̸� , ���� , �޿��� ����ϼ���
select empno ,ename ,job ,sal
from emp
where  deptno in (select deptno from emp where job='SALESMAN')
          and sal in(select sal from emp where job ='SALESMAN')

--�� �� ���� ���� ����
select empno ,ename ,job ,sal
from emp
where  deptno not in (select deptno from emp where job='SALESMAN')
          and sal not in(select sal from emp where job ='SALESMAN')

--QUIZ
--( IN LINE VIEW ,
-- Subquery �� Table ó�� ���ϼ� �ִ�   from (select .....) e   )
-- subquery �� join ���ؼ� .....
-- ���࿡  �̷� ���̺��� �����ϸ�
deptno , avgsal
10           2000
20          3500


--����� 3�� ******************************************************************************
--�ڱ� �μ��� ��� ���޺��� �� ���� ������ �޴� �����
--�̸� ,�޿� , �μ���ȣ, �μ��� ��տ����� ����ϼ���
select *
from emp e inner join
       (select deptno,avg(sal) as asal from emp group by deptno) s
on e.deptno = s.deptno
where e.sal > s.asal ;
--***********************************************************************************************
--��������
--1. 'SMITH'���� ������ ���� �޴� ������� �̸��� ������ ����϶�.
SELECT ENAME, SAL
FROM EMP
WHERE SAL>(SELECT SAL
		             FROM EMP
		             WHERE ENAME='SMITH')

--2. 10�� �μ��� ������ ���� ������ �޴� ������� �̸�, ����,
-- �μ���ȣ�� ����϶�.
SELECT ENAME, SAL, DEPTNO
FROM EMP
WHERE SAL IN(SELECT SAL
		               FROM EMP
		               WHERE DEPTNO=10)

--3. 'BLAKE'�� ���� �μ��� �ִ� ������� �̸��� ������� �̴µ�
-- 'BLAKE'�� ���� ����϶�.
SELECT ENAME, HIREDATE
FROM EMP
WHERE DEPTNO=(SELECT DEPTNO
		                   FROM EMP
		                   WHERE ENAME='BLAKE')
AND ENAME!='BLAKE'

--4. ��ձ޿����� ���� �޿��� �޴� ������� �����ȣ, �̸�, ������
-- ����ϵ�, ������ ���� ��� ������ ����϶�.
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL>(SELECT  AVG(SAL) 	FROM EMP)
ORDER BY SAL DESC

--5. �̸��� 'T'�� �����ϰ� �ִ� ������ ���� �μ����� �ٹ��ϰ�
-- �ִ� ����� �����ȣ�� �̸��� ����϶�.
SELECT EMPNO, ENAME
FROM EMP
WHERE DEPTNO IN(SELECT DEPTNO
		                     FROM EMP
		                     WHERE ENAME LIKE '%T%')
 --where deptno = 20 or deptno= 30
--6. 30�� �μ��� �ִ� ����� �߿��� ���� ���� ������ �޴� �������
-- ���� ������ �޴� ������� �̸�, �μ���ȣ, ������ ����϶�.
--(��, ALL(and) �Ǵ� ANY(or) �����ڸ� ����� ��)
SELECT ENAME, DEPTNO, SAL
FROM EMP
WHERE SAL > (SELECT MAX(SAL)
		              FROM EMP
		              WHERE DEPTNO=30)

SELECT ENAME, DEPTNO, SAL
FROM EMP
WHERE SAL >ALL(SELECT SAL
		FROM EMP
		WHERE DEPTNO=30)

--where sal > 1600 and sal > 1250 and sal > 2850 and sal > 1500 and sal > 950


--7. 'DALLAS'���� �ٹ��ϰ� �ִ� ����� ���� �μ����� ���ϴ� �����
-- �̸�, �μ���ȣ, ������ ����϶�.
SELECT ENAME, DEPTNO, JOB
FROM EMP
WHERE DEPTNO IN(SELECT DEPTNO
			                   FROM DEPT
			                   WHERE LOC='DALLAS')

--8. SALES �μ����� ���ϴ� ������� �μ���ȣ, �̸�, ������ ����϶�.
SELECT DEPTNO, ENAME, JOB
FROM EMP
WHERE DEPTNO IN(SELECT DEPTNO
			                   FROM DEPT
			                   WHERE DNAME='SALES')

--9. 'KING'���� �����ϴ� ��� ����� �̸��� �޿��� ����϶�.
--king �� ����� ��� (mgr �����Ͱ� king ���)
SELECT ENAME, SAL
FROM EMP
WHERE MGR=(SELECT EMPNO
		              FROM EMP
		              WHERE ENAME='KING')

--10. �ڽ��� �޿��� ��� �޿����� ����, �̸��� 'S'�� ����
-- ����� ������ �μ����� �ٹ��ϴ� ��� ����� �����ȣ, �̸�,
-- �޿��� ����϶�.
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL > (SELECT AVG(SAL)
		              FROM EMP)
AND DEPTNO IN(SELECT DEPTNO
		                 FROM EMP
		                 WHERE ENAME LIKE '%S%')

--select * from emp
--where  deptno in  (
 --                          select deptno from emp where sal > (select avg(sal) from emp)
 --                         and ename like '%S%'
                        )

--11. Ŀ�̼��� �޴� ����� �μ���ȣ, ������ ���� �����
-- �̸�, ����, �μ���ȣ�� ����϶�.
SELECT ENAME, SAL, DEPTNO
FROM EMP
WHERE DEPTNO IN(SELECT DEPTNO
		                    FROM EMP
		                    WHERE COMM IS NOT NULL)
AND SAL IN( SELECT SAL
		             FROM EMP
		             WHERE COMM IS NOT NULL)

--12. 30�� �μ� ������ ���ް� Ŀ�̼��� ���� ����
-- ������� �̸�, ����, Ŀ�̼��� ����϶�.
SELECT ENAME, SAL, COMM
FROM EMP
WHERE SAL NOT IN(SELECT SAL
		                      FROM EMP
		                      WHERE DEPTNO=30)
AND COMM NOT IN(SELECT NVL(COMM, 0)
		                       FROM EMP
		                       WHERE DEPTNO=30 and comm is not null);
--1 , 200         1, 200
--2, 300          2.300

--13. �����ȣ, �̸�, ����, �׸��� ���޴����� ����϶�.
SELECT E.EMPNO, E.ENAME, E.SAL, SUM(D.SAL)
FROM EMP E, (SELECT EMPNO, SAL
		               FROM EMP) D
WHERE E.EMPNO>=D.EMPNO
GROUP BY E.EMPNO, E.ENAME, E.SAL
ORDER BY SUM(d.sal)

----------------------------------------------------------
SELECT *
FROM EMP E, (SELECT EMPNO, SAL
		               FROM EMP) D
WHERE E.EMPNO>=D.EMPNO
order by e.empno

---------------------------------------------------------------------------
---------------------------------------------------------------------------
--����Ŭ 6����--------------------------------------------------------------
--DDL(������ ���Ǿ�) --CREATE , ALTER , DROP , TRUNCATE
--DML(������ ���۾�) --INSERT , UPDATE , DELETE
--DCL(������ ����� ) - ���� (GRANT , REVOKE)
--DQL(������ ���Ǿ��) --SELECT    �⺻���� ���� �۾�(JOIN, SUBQUERY...)
--TCL() - COMMIT , ROLLBACK

--^^
SELECT * FROM TAB;
SELECT * FROM TABS;
SELECT * FROM COL;
SELECT * FROM COL WHERE TNAME ='DEPT';
SELECT * FROM user_tables;
--------------------------------------------------------------------------
--DML
--Ʈ�����(TRANSACTION)
--���� : �ϳ��� ������ �۾� ����
--���� �ƴϸ� ����

BEGIN TRANSACTION
	INSERT
	UPDATE
	DELETE
COMMIT  OR ROLLBACK
--�ѹ��� ����Ǵ� ����
--����ó��
--�߸𸣰ڴ�
--���������� �ǹ� �ּ� ó�� ����
--�ɰ��� ���� ó�� ����
--��ȣ �ۿ��� ����
--ģ���� ������ ����
--�۾��� �⺻ ����
--------------------------------------------------------------------------
--����Ŭ
--INSERT , UPDATE , DELETE
--DEFAULT
--BEGIN TRAN
--INSERT
--ó�� :COMMIT(�ݿ�) , ROLLBACK(���)

--MSSQL
--INSERT , UPDATE , DELETE
--DEFAULT
--BEGIN TRAN
--INSERT
--DEFAULT COMMIT
--BEGIN TRAN ��� ����������

--APP( C , JAVA, NET, DELPI, .....)
--DB���ؼ� �۾� �Ҽ� �ִ� ����
-- CRUD
--C(create)  insert
--R(read)     select
--U            update
--D            delete

--------------------------------------------------------------------------
CREATE TABLE temp3
(
   id NUMBER PRIMARY KEY , --id �÷��� null �Ǵ� �ߺ������͸� ���� �� ����
   NAME VARCHAR2(20)
);
INSERT INTO temp3(id , name) VALUES(100,'ȫ�浿');
SELECT * FROM temp3;
COMMIT;
INSERT INTO temp3 VALUES(200,'������');
SELECT * FROM temp3;
ROLLBACK;

--BEGIN TRANSACTION --����� Ʈ�����
--	 INSERT INTO temp3(id , name) VALUES(200,'������');
--   INSERT INTO temp3(id , name) VALUES(100,'�ƹ���');
--�ڵ� rollback ó���ǵ���
SELECT * FROM temp3;

CREATE TABLE temp4(
	id VARCHAR2(20)
)

--java (for (int .....
--pl-sql
BEGIN
				FOR i IN 1..100 LOOP
        		INSERT INTO temp4(id) VALUES('A' || TO_CHAR(i));
				END LOOP;
END;
COMMIT;
SELECT * FROM temp4;
--------------------------------------------------------------------------
CREATE TABLE newTable(
  memberid number(3),  --default null
  NAME VARCHAR2(20),  --default null
  addr  VARCHAR2(30),  --default null
  reg_date DATE DEFAULT SYSDATE ,
  jumin CHAR(6) --default null
);

SELECT * FROM newTable;
--�÷� ����Ʈ ���� (���̺� �÷� ������ �°� ��� ������ insert)
INSERT INTO newTable VALUES(100,'ȫ�浿','����� ������','2014-04-23','123456');
COMMIT;
--Ư�� �÷��� ������ �ֱ�
INSERT INTO newTable(memberid ,name)
VALUES(200,'�ƹ���');
SELECT * FROM newTable;
COMMIT;
--------------------------------------------------------------------------
CREATE TABLE temp5(id number);
CREATE TABLE temp6(num  number);

INSERT INTO temp5 VALUES(1);
INSERT INTO temp5 VALUES(2);
INSERT INTO temp5 VALUES(3);
INSERT INTO temp5 VALUES(4);
INSERT INTO temp5 VALUES(5);
COMMIT;

--�߰� insert
--�뷮 ������ insert  �ϱ�---------------------------------------------------
INSERT INTO temp6
SELECT id FROM temp5; --������ values �־�� �ϴ� ����

SELECT * FROM temp6;
COMMIT;

--�뷮 ������ insert => Table ����, Insert ����
CREATE TABLE temp7
AS
	  SELECT * FROM temp6;

CREATE TABLE temp8  --������ ������ �״�� ���� �����ʹ� ���� �ϰ� ���� �ʴ�
AS
	 SELECT * FROM newTable  WHERE 1=2
SELECT * FROM temp8;
--------------------------------------------------------------------------
--update
--update ���̺��
--set �÷��� = �� , �÷��� = �� , ........
--where ������

UPDATE newTable
SET addr = '�Ǳ�'

SELECT * FROM newTable;
COMMIT;

UPDATE newTable
SET NAME = '����ѹ�'
WHERE memberid = 100;

SELECT * FROM newTable;
COMMIT;

UPDATE newTable
SET NAME='�ٺ�' , addr='����' , reg_date=SYSDATE ,jumin='135791'
WHERE memberid = 100;

SELECT * FROM newTable;
COMMIT;

----------------------
--emp �Ȱ��� ������ ���� copyemp �� ���弼��
CREATE TABLE copyemp
AS
	SELECT * FROM emp WHERE 1=2;

--emp ���̺� �ִ� ��� �����͸�  copyemp �� ��������
INSERT INTO copyemp
SELECT * FROM emp;

COMMIT;

SELECT * FROM copyemp;
--copyemp ���̺� �ִ� �޿� ������ ��ձ޿� ������ �����ϼ���
UPDATE copyemp
SET sal = (SELECT AVG(sal) FROM emp)

UPDATE copyemp
SET ename = ' '


SELECT * FROM copyemp;
COMMIT;


--update end
--------------------------------------------------------------------------
--DELETE
DELETE FROM copyemp
WHERE comm IS NULL;
SELECT * FROM copyemp;

DELETE FROM copyemp;
COMMIT;

--copyemp Table ũ�� (100MB)
--delete from copyemp
--delete ������ �����͸� �������� ������
--������������� �������� �ʴ´�
--------------------------------------------------------------------------
--DELETE * FROM copyemp (MS-ACCESS)
--------------------------------------------------------------------------
--DDL--------------------------------------------------------------------
--CREATE , ALTER , DROP
CREATE TABLE board
(
   boardid number,
   title      NVARCHAR2(20),
   content VARCHAR2(100),
   regdate DATE
);
SELECT * FROM user_tables WHERE table_name ='BOARD';
DESC board;
--�����÷�
--�����÷�
CREATE TABLE vTable
(
   no1  NUMBER,
   no2 number,
   no3 NUMBER GENERATED ALWAYS AS (no1 + no2) VIRTUAL
)
INSERT INTO vTable(no1, no2) VALUES(100,200);

--INSERT INTO vTable(no1, no2,no3) VALUES(100,300,500);
SELECT * FROM vTable;
COMMIT;

--�⺻ �÷� ����Ȯ���ϱ�
SELECT
column_name,
data_type,
data_default
FROM user_tab_columns WHERE table_name ='VTABLE'
ORDER BY column_id;

CREATE TABLE vtable2
(
   NO NUMBER,
   pcode char(4),
   pdate CHAR(8),
   pqty NUMBER,
   pbun NUMBER(1)  GENERATED ALWAYS AS
   		      (
              CASE
                     WHEN SUBSTR(pdate,5,2) IN ('01' , '02' , '03') THEN 1
                     WHEN SUBSTR(pdate,5,2) IN ('04' , '05' , '06') THEN 2
                     WHEN SUBSTR(pdate,5,2) IN ('07' , '08' , '09') THEN 3
                     ELSE 4
              END
            )  VIRTUAL
);
INSERT INTO vtable2(pdate) VALUES('20140101');
INSERT INTO vtable2(pdate) VALUES('20140712');
SELECT * FROM vtable2;
COMMIT;
--�����÷� �ʼ� ������ �ƴϰ� ����� �˾� �μ���
--------------------------------------------------------------------------
--Create���� (�ʼ�)
--1. ���̺� �����ϱ�
create table temp9(id number);

--2. �������̺� �÷� �߰��ϱ�
ALTER TABLE temp9
ADD NAME VARCHAR2(20);

--3. �������̺� ���� �÷��� ����
-- name -> ename
ALTER TABLE temp9
RENAME COLUMN NAME TO ename;

--4. ���� ���̺� ���� �÷��� ���� TYPE ����
ALTER TABLE temp9
MODIFY(ename  VARCHAR2(40));

--5. ���� ���̺� ���� �÷��� �����ϱ�
ALTER TABLE temp9
DROP COLUMN ename;

DESC temp9;
SELECT * FROM temp9;

--------------------------------------------------------------------------
--����
--1. delete ������ ����� ��������� ũ�� ����

--2. truncate ������ ����� ��������� ũ�� ����
--����) ������ ����� �� ����
TRUNCATE TABLE copyemp --(x)WHERE  sal > 1000;
--3. drop  ������ �� ���̺� ����
--------------------------------------------------------------------------
--��������-----------------------------------------------------------------
--CONSTRAINT
--[TABLE ������ ������ �Է� , ���� ��  ������ ���Ἲ�� Ȯ���ϱ� ���� ��� ]
--����Ŭ ����--
--NOT NULL (null���� �Է����� ���ϰ� �ϴ� ����)
--unique (�ߺ��� ���� �Էµ��� ���ϰ� �ϴ� ����)
--primary key ( unique + not null => null���� ������� �ʰ� �ߺ������͸� ������� �ʴ´�
--foreign key (��������) �ٸ� ���̺� �ִ� �÷��� �����ؼ� ���Ἲ�� Ȯ���ϴ� ����
--check ������ ���� �Է��� �ް� �ϴ� ����

--�� ��� ������ ���������� ���̺��� �����ɶ� �Ǵ�
--���̺��� ����� ���ٸ� �߰� �� �� �ִ�

CREATE TABLE emp3
(
   id NUMBER CONSTRAINT pk_emp3_id PRIMARY KEY ,
   NAME VARCHAR2(20) NOT NULL ,                -- default null
   addr VARCHAR2(20)
   --id number primary key
)
DROP TABLE emp3;
SELECT * FROM user_constraints WHERE table_name='EMP3';
--����
INSERT INTO emp3(id, NAME, addr)
VALUES(100,'ȫ�浿','����');

SELECT * FROM emp3;
COMMIT;

--INSERT INTO emp3(id, NAME, addr) VALUES(100,'������','�Ŷ�');
--(x) pk ����
--INSERT INTO emp3(id, addr) VALUES(200,'�Ŷ�');
--(x) not null ����
INSERT INTO emp3(id, NAME) VALUES(200,'������');
--����ó��(0)
SELECT * FROM emp3;
COMMIT;

CREATE TABLE emp4
(
   id NUMBER CONSTRAINT pk_emp4_id PRIMARY KEY ,
   NAME VARCHAR2(20) NOT NULL ,                -- default null
   jumin CHAR(6)  CONSTRAINT uk_emp4_jumin  UNIQUE ,
   addr VARCHAR2(20)
   --id number primary key
);
SELECT * FROM user_constraints WHERE table_name='EMP4';
INSERT INTO emp4(id,NAME,jumin) VALUES (100,'������','123456');
SELECT * FROM emp4;
COMMIT;
-- unique ���� (�ߺ� ������)
--INSERT INTO emp4(id,NAME,jumin) VALUES (200,'������','123456');
--unique ���� null �ߺ� ���
INSERT INTO emp4(id,NAME) VALUES (200,'������');
SELECT * FROM emp4
INSERT INTO emp4(id,NAME) VALUES (300,'�ڱ�');
COMMIT;
SELECT * FROM emp4;


CREATE TABLE emp5
(
   id NUMBER CONSTRAINT pk_emp5_id PRIMARY KEY ,
   NAME VARCHAR2(20) NOT NULL ,                -- default null
   jumin CHAR(6) NOT NULL  CONSTRAINT uk_emp5_jumin  UNIQUE ,
   addr VARCHAR2(20)
   --id number primary key
);
INSERT INTO emp5(id,NAME,jumin) VALUES (300,'�ڱ�','123456');

CREATE TABLE emp6 (id number);
--���̺��� ����� ���� ������ .......
--������ ���̺� �డ�ϱ�
ALTER TABLE emp6
ADD CONSTRAINT pk_emp6_id PRIMARY KEY(id);

--emp6���̺� name varchar2(10) �÷��� �߰��Ͻð�
ALTER TABLE emp6
ADD  NAME VARCHAR2(10);
--�� �� �Ǽ� �߰��� name �÷��� not null �߰��� �ɾ����
--not null ADD ���� �߰�(x)
ALTER TABLE emp6
MODIFY (NAME CONSTRAINT nn_emp6_name NOT null);


CREATE TABLE emp7
(
   id NUMBER CONSTRAINT pk_emp7_id PRIMARY KEY ,
   NAME VARCHAR2(20) NOT NULL ,                -- default null
   jumin CHAR(6)  CONSTRAINT uk_emp7_jumin  UNIQUE ,
   addr VARCHAR2(20),
   age NUMBER CONSTRAINT ck_emp7_age check(age >= 19) --where age >=19
);
INSERT INTO emp7(id,NAME,jumin,age) VALUES(100,'�ƹ���','123456',19);
SELECT * FROM emp7
COMMIT;

--emp ���̺��� c_emp���̺��� �����ϼ���(������ ���� : �������� ���� �ȵ�)
CREATE TABLE c_emp
AS
	  SELECT * FROM emp WHERE 1=2;
--�������� Ȯ��
SELECT * FROM user_constraints WHERE TABLE_name =UPPER('c_emp');

--dept ���̺��� c_dept���̺��� �����ϼ��� (������ ����)
CREATE TABLE c_dept
AS
	  SELECT * FROM dept WHERE 1=2;
--�������� Ȯ��
SELECT * FROM user_constraints WHERE TABLE_name =UPPER('c_emp');
SELECT * FROM user_constraints WHERE TABLE_name =UPPER('c_dept');

--���� ����(foreign key) ���� �ǽ�
--emp ���̺� �ִ� deptno �÷��� dept ���̺� �ִ� deptno �÷��� ����
--deptno �÷��� ����Ÿ��  dept ���̺� �ִ� deptno������ �� �ϳ�
--���� (�ŷڼ� ������) ���� (unique , primary key)
--c_dept(deptno)  primary key �߰�
ALTER TABLE c_dept
ADD CONSTRAINT pk_c_dept_deptno PRIMARY KEY(deptno);


ALTER TABLE c_emp
ADD CONSTRAINT fk_c_emp_deptno FOREIGN KEY(deptno)
       REFERENCES c_dept(deptno);

--c_dept ���̺� dept �����͸� insert �ϼ���
INSERT INTO c_dept
SELECT * FROM dept;

SELECT * FROM c_emp;
SELECT * FROM c_dept;

INSERT INTO c_emp(deptno)
VALUES(null); --null ���(x) not null

COMMIT;

INSERT INTO c_emp(deptno)
VALUES(56);

--Ȱ��ȭ / ��Ȱ��ȭ
ALTER TABLE c_emp
DISABLE NOVALIDATE CONSTRAINT FK_C_EMP_DEPTNO

ALTER TABLE c_emp
ENABLE NOVALIDATE CONSTRAINT FK_C_EMP_DEPTNO;

SELECT * FROM user_constraints WHERE TABLE_name =UPPER('c_emp');
SELECT * FROM user_constraints WHERE TABLE_name =UPPER('c_dept');

-----------------------------------------------------------------------
--�л� ���� ���̺�
--�й��� �����ʹ� �ߺ��ǰų� NULL ���� ����ϸ� �ȵȴ�
--�̸� NULL ���� ������� �ʴ´�
--����
--����
--���� ���� �÷��� ���� Ÿ���̰� NULL ���� ������� �ʴ´�
--�� ���� �Է����� ������  default�� 0���� ���´�
--���� ,��� �÷��� �����÷�����(�����÷�) �����Ѵ�
--�а��ڵ�� �а� ���̺� �а��ڵ带 �����Ѵ�
--�й� , �̸� , ���� , ���� , ���� , ���� , ��� , �а��ڵ�

--�а� ���̺�
--�а��ڵ� �����ʹ� �ߺ��ǰų� NULL ���� ����ϸ� �ȵȴ�,
--�а��� �� null���� ������� �ʴ´�

--�а��ڵ� , �а���

--�׸��� select �����
--�й� , �̸�  ����, ��� , �а��ڵ� , �а��� �� ����ϼ���
--------------------------------------------------------------------------
--------------------------------------------------------------------------
--VIEW-------------------------------------------------------------------
--view(��) : ���� ���̺� (subquery : Line View => from ������
--View ���̺� ó�� ������  �������� ���̺��� �ƴϰ� �޸� �󿡼� .....
--Ȥ�ڴ� view sql���� ��� .......
--�׷��� ����� ������ ���� ����  table ���� view���� �������� ���Ѵ�
--view ���Ȼ� �������ε� ���ȴ�
--����: ���ϰ� ������

--scott ������ ���ؼ� view ����� �ִ� ���� �ο�
--SYSTEM ���� ���� ����
--GRANT CREATE VIEW TO SCOTT;

CREATE [OR REPLACE] [FORCE | NOFORCE] VIEW view_name
[(alias, alias, alias, ...)]
AS subquery
[WITH CHECK OPTION]
[WITH READ ONLY];

SELECT * FROM user_views

--FORCE �ɼ� : �⺻ ���̺��� ������ �並 �����Ҽ� �ִ� �ɼ�
--NOFORCE �ɼ� : default ��  (���̺��� ������ ���� �Ұ�)

--1. ��� �������̺�(sql)
--2. �並 ����� ������ ����
--3. from (select ....) aaa  -- in line view
--4. view �� ���� DML���� (�� ���Ϻ�(���̺� �ϳ��� ���� ��)
--5. �ܼ� view (���̺� �ϳ�)   , ���� view(���̺� �ϳ� �̻�)
--6. view ���� (drop view v_emp)

CREATE OR REPLACE VIEW v_emp
AS
	  SELECT e.empno , e.ename , e.deptno , d.dname
    FROM EMP e join dept d
    ON e.deptno = d.deptno

CREATE OR REPLACE VIEW v2_emp
AS
	SELECT * FROM EMP WHERE sal > 2000;

--���Ի��
SELECT * FROM v2_emp;  --�並 ���� DML(insert , update, delete)

-- key point : �並 ���� DML �۾���  view ���� �ִ� ������ �� ����
--update ...
UPDATE v2_emp
SET sal = sal+100

ROLLBACK;

--view -> ���̺� (�÷����� �־��)
CREATE OR REPLACE VIEW  static_emp
AS
		SELECT AVG(sal) AS avgsal , SUM(sal) AS sumsal , max(sal) AS maxsal , min(sal) AS minsal ,
     COUNT(sal) AS countsal
    FROM EMP;

SELECT * FROM static_emp;

--key point (�ϳ��̻� (join , union) ���̺�� ������ view ���� DML �۾� �Ұ�)

CREATE OR REPLACE FORCE VIEW EMPDATA
( EMPNO, ENAME, JOB )
AS
SELECT empno ,ename, job FROM EMP


1. 30�� �μ� ������� ����, �̸�, ������ ��� VIEW�� ������.

CREATE OR REPLACE  VIEW VIEW100
AS
		SELECT JOB, ENAME, SAL
		FROM EMP
		WHERE DEPTNO=30

SELECT * FROM VIEW100



--2. 30�� �μ� �������  ����, �̸�, ������ ��� VIEW�� ����µ�,
-- ������ �÷����� ����, ����̸�, �������� ALIAS�� �ְ� ������
-- 300���� ���� ����鸸 �����ϵ��� �϶�.

CREATE OR REPLACE VIEW  VIEW101
( ����, ����̸� ,���� )
AS
	SELECT JOB , ENAME , SAL
	FROM EMP
	WHERE DEPTNO=30 AND SAL > 300;


SELECT * FROM VIEW101



--3. �μ��� �ִ����, �ּҿ���, ��տ����� ��� VIEW�� ������.

CREATE OR REPLACE VIEW VIEW102
AS
	SELECT DEPTNO, MAX(SAL) AS "�ִ����",
		MIN(SAL) AS "�ּҿ���",
		AVG(SAL) AS "��տ���"
	FROM EMP
	GROUP BY DEPTNO


SELECT * FROM VIEW102



--4. �μ��� ��տ����� ��� VIEW�� �����, ��տ����� 2000 �̻���
-- �μ��� ����ϵ��� �϶�.
--from ���� => where
--group by ���� => having

CREATE OR REPLACE VIEW VIEW103
AS
	SELECT DEPTNO, AVG(SAL) AS "��տ���"
	FROM EMP
	GROUP BY DEPTNO
	HAVING AVG(SAL) >=2000

----------------------------------------
SELECT v.deptno,v.��տ��� , d.dname
FROM view103 v JOIN dept d
ON v.deptno = d.deptno
-----------------------------------------

--5. ������ �ѿ����� ��� VIEW�� �����, ������ MANAGER��
-- ������� �����ϰ� �ѿ����� 3000�̻��� ������ ����ϵ��� �϶�.

CREATE OR REPLACE VIEW VIEW104
AS
	SELECT JOB, SUM(SAL) AS "�ѿ���"
	FROM EMP
	WHERE JOB!='MANAGER'
	GROUP BY JOB
	HAVING SUM(SAL)>=3000

SELECT * FROM VIEW104
--------------------------------------------------------------------------
--------------------------------------------------------------------------
--������ ------------------------------------------------------------------
--�⺻���� select(�Լ� , join  ,subquery)  , DML(inser ,update ,delete)
--�� ���� ...view , index , �ý��۱��� ..
--Ʃ�� (���� : index ) , �ý���Ʃ��
--------------------------------------------------------------------------
--SEQUENCE (������ ����� ��ü)
--ms-sql (create table board (id int identity(100,1) title varchar(20))
--insert into board(title) values('�ȳ�') -> 1
--mysql ( create table board ( auto-increment)

--1 SEQUENCE Ư¡
--1)	 �ڵ������� ���� ��ȣ�� �����մϴ�.
--2)	���� ������ ��ü
--3)	�ַ� �⺻ Ű ���� �����ϱ� ���� ���˴ϴ�.
--4)	���ø����̼� �ڵ带 ��ü�մϴ�.
--5)	�޸𸮿� CACHE�Ǹ� SEQUENCE ���� �׼��� �ϴ� ȿ������ ����ŵ�ϴ�.

CREATE  SEQUENCE  sequence_name
	[INCREMENT  BY  n]
	[START  WITH  n]
	[{MAXVALUE n | NOMAXVALUE}]
	[{MINVALUE n | NOMINVALUE}]
	[{CYCLE | NOCYCLE}]
	[{CACHE | NOCACHE}];

sequence_name		SEQUENCE�� �̸��Դϴ�.
INCREMENT  BY    n
���� ���� n���� SEQUENCE��ȣ ������ ������ ����.
�� ���� �����Ǹ� SEQUENCE�� 1�� ����.

START  WITH  n
�����ϱ� ���� ù��° SEQUENCE�� ����.
�� ���� �����Ǹ� SEQUENCE�� 1�� ����.

MAXVALUE n
SEQUENCE�� ������ �� �ִ� �ִ� ���� ����.

NOMAXVALUE
���������� 10^27 �ִ밪�� ����������-1�� �ּҰ��� ����.

MINVALUE n
�ּ� SEQUENCE���� ����.

NOMINVALUE
���������� 1�� ����������-(10^26)�� �ּҰ��� ����.

CYCLE | NOCYCLE
�ִ� �Ǵ� �ּҰ��� ������ �Ŀ� ��� ���� ������ ���� ���θ� ����. NOCYCLE�� ����Ʈ.

CACHE | NOCACHE
�󸶳� ���� ���� �޸𸮿� ����Ŭ ������ �̸� �Ҵ��ϰ� ����
�ϴ°��� ����. ����Ʈ�� ����Ŭ ������ 20�� CACHE.


1 NEXTVAL�� CURRVAL �ǻ翭
1)	 NEXTVAL�� ���� ��� ������ SEQUENCE ���� ��ȯ �Ѵ�.
2)	SEQUENCE�� ������ �� ����, �ٸ� ����ڿ��� ������ ������ ���� ��ȯ�Ѵ�.
3)	CURRVAL�� ���� SEQUENCE���� ��´�.
4)	CURRVAL�� �����Ǳ� ���� NEXTVAL�� ���Ǿ�� �Ѵ�.


--------------------------------------------------------------------------
--�Խ���
--create table board ( boardid number )
--insert ó�� ���� ������  1 , 2 , 3 , 4

--INSERT INTO board (boardid , title , content)
--VALUES(1 ,
--------------------------------------------------------------------------
SELECT COUNT(*) FROM board ���� ����  +1
-- 0 -> 1
-- 1  -> 2
-- 2 -> 3
--> �ߺ��� �߻�
1
2
3 (����)
4
--------------------------------------------------------------------------
SELECT MAX(boardid) +1 FROM board;

--1
--1(max)  -> 2(������ �۹�ȣ)
--2 -> 3 (����)
--3 -> 4
--4 -> 5
--------------------------------------------------------------------------
CREATE SEQUENCE sequence_num;

SELECT * FROM user_sequences;
SELECT SEQUENCE_NUM.NEXTVAL FROM dual;
SELECT SEQUENCE_NUM.CURRVAL FROM dual;

INSERT INTO board(id, title)
VALUES (SEQUENCE_NUM.NEXTVAL , '�ȳ� �����');

CREATE SEQUENCE SEQUENCE_num2
START WITH 10
INCREMENT BY 2


SELECT * FROM user_sequences;
SELECT SEQUENCE_num2.NEXTVAL FROM dual;
SELECT SEQUENCE_num2.CURRVAL FROM dual;
SELECT * FROM user_sequences;

-------------------------------------------------------------------------
CREATE TABLE multiboard
(
  boardid NUMBER(3),
  title   VARCHAR2(20)
);
CREATE TABLE multiboard2
(
  boardid NUMBER(3),
  title   VARCHAR2(20)
);


CREATE SEQUENCE multiSeq
START WITH 1
INCREMENT BY 1;

CREATE SEQUENCE multiSeq2
START WITH 1
INCREMENT BY 1;
SELECT MULTISEQ2.NEXTVAL FROM dual;


SELECT * FROM user_sequences;

INSERT INTO multiboard (boardid, title)
VALUES (MULTISEQ.NEXTVAL , 'ó�� ���Դϴ�');
COMMIT;

DELETE FROM multiboard

SELECT * FROM multiboard;
SELECT * FROM multiboard2;

INSERT INTO multiboard2 (boardid, title)
VALUES (MULTISEQ.NEXTVAL , 'ó�� ���Դϴ�');



--------------------------------------------------------------------------
--11g release2 �߻�  ���� >  SEQUENCE �����̺� ���� �ʱⰪ�� �ϳ� ������ ������
/*
 �� ���̺��� �츮�� ���� �׳� ����� ���̺��̶�� �����Ͻø� �˴ϴ� -
 11g R2 �������� ���̺��� ������ �� ���׸�Ʈ�� �ٷ� �Ҵ���� �ʰ� �����Ͱ�
 ���ʷ� ����(INSERT)�� �� ���׸�Ʈ�� �Ҵ�˴ϴ�.
 �̰��� Deferred Segment Creation �̶�� �մϴ�.
*/

CREATE SEQUENCE newseq;

CREATE TABLE KN_AUTHORITY (
  seq         VARCHAR2(20) NOT NULL,
  autho_name  VARCHAR2(20) NOT NULL
) SEGMENT CREATION IMMEDIATE;

INSERT INTO KN_AUTHORITY(seq, autho_name)
VALUES(NEWSEQ.NEXTVAL , 'aaa');
SELECT *FROM KN_AUTHORITY

--sequence END----------------------------------------------------------
--------------------------------------------------------------------------
--------------------------------------------------------------------------
--INDEX
--1.���� : �˻� �ӵ��� ��� (select ~)
--2.���� : DML(insert , delete , update) �ս�
--DBA : �ε��� �籸���ϴ� �ϴ� �۾��� �ֱ������� ....
--index ���� DBA���� �߿� �ϳ� ,,,
--�������� : ���̺� ������ �ε����� �����ϴ� ���� ���� �ʴ�

/*
1.4.2  �ε��� ������ ���� ��ħ
��) ���� ���� �׻� �� ���� ���� �ƴϴ�.
���̺��� ���� �ε����� ������ ���ǵ� ����� �� �ǹ��ϴ� ���� �ƴմϴ�.
�ε����� ������ �ִ� ���̺� ���� ��DML�۾��� �ε����� ���ŵǾ�� ���� �ǹ��մϴ�.
���� �ε����� ���̺�� ���õǾ� ������, ORACLE SERVER�� DML�Ŀ� ��� �ε�����
�����ϱ� ���� �� ���� ����� �ʿ��ϰ� �˴ϴ�.

��) ���� �ε����� �����ϴ°�?
1)	���� WHERE�� �Ǵ� ���� ���ǿ��� ���� ���˴ϴ�.
2)	���� �������� ���� �����մϴ�.
3)	���� ���� ���� null���� �����մϴ�.
4)	�� �Ǵ� �̻��� ���� WHERE�� �Ǵ� ���� ���ǿ��� ���� �Բ� ���˴ϴ�.
5)	���̺��� �����̰� ��κ��� ���ǵ��� ���� 2~4%���� ���� �о� ���� ������ ����˴ϴ�.

��) ���� �ε����� �����ؼ��� �ȵǴ°�
1)	���̺��� �۴�.
2)	���� ������ �������� ���� �������ʴ´�.
3)	��κ��� ���ǵ��� ���� 2~4%�̻��� �о� ���� ������ ����ȴ�.
4)	���̺��� ���� ���ŵ˴ϴ�. ���̺� �ϳ� �̻� �ε����� ������ �ִٸ�
���̺��� �������ϴ� DML������ �ε����� ���� ������ ��������� �� ���� �ð��� �ɸ��� �˴ϴ�.

*/


--���ݱ��� .....��� �ڵ� .....
--
SELECT * FROM user_indexes WHERE table_name='EMP';


CREATE TABLE index_T
(
	 id NUMBER ,
   NAME VARCHAR2(20)
);

INSERT INTO index_T VALUES(10,'AA');
INSERT INTO index_T VALUES(1,'BB');
INSERT INTO index_T VALUES(5,'CC');
INSERT INTO index_T VALUES(4,'DD');
COMMIT;

CREATE TABLE index_T2
(
	 id NUMBER CONSTRAINT pk_index_T2_id PRIMARY KEY  ,
   NAME VARCHAR2(20)
);
INSERT INTO index_T2 VALUES(10,'AA');
INSERT INTO index_T2 VALUES(1,'BB');
INSERT INTO index_T2 VALUES(5,'CC');
INSERT INTO index_T2 VALUES(4,'DD');
COMMIT;

--1
SELECT * FROM index_T;
SELECT * FROM index_T2;

--2
SELECT id FROM index_T;
SELECT id FROM index_T2; --PK -> ����(unique index)

SELECT * FROM index_T2 WHERE id = 10;

SELECT * FROM user_indexes WHERE table_name='INDEX_T';
SELECT * FROM user_indexes WHERE table_name='INDEX_T2';

----------------------------------------------------------------
--�ε����� ���� index_T �ε��� �����ϱ�
DROP INDEX idx_index_T_unique
CREATE UNIQUE  INDEX idx_index_T_unique -- �ߺ� ������ ������� �ʴ� index
ON
			index_t(id DESC);

CREATE INDEX idx_index_T_unique  --�ߺ� ������ ��� index
ON
			index_t(id DESC);


SELECT * FROM user_indexes WHERE table_name='INDEX_T';

SELECT * FROM INDEX_T;
SELECT id FROM INDEX_T;

INSERT INTO INDEX_T VALUES(50,'DD');
COMMIT;

---------------------------------------------------------------------------

SELECT * FROM user_indexes WHERE table_name='COPYEMP';

SELECT * FROM COPYemp;

--empno unique
--ename unique

CREATE UNIQUE INDEX idx_copy
ON
		copyemp(empno);

DROP INDEX idx_copy_ename
CREATE  INDEX idx_copy_ename
ON
		copyemp(ename);

SELECT * FROM user_indexes WHERE table_name='COPYEMP';

INSERT INTO copyemp(empno, ename)
VALUES(100,'AA');
INSERT INTO copyemp(empno, ename)
VALUES(20,'CC');

INSERT INTO copyemp(empno, ename)
VALUES(40,'Bb');

COMMIT;

SELECT * FROM copyemp;
SELECT * FROM COPYEMP WHERE empno=100;
SELECT * FROM COPYEMP WHERE ename='AA';
--------------------------------------------------------------------------






















































