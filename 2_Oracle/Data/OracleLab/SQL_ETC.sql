--�ǻ��÷� (^^):
--ROWNUM : ������ ���̺� �����ϴ� �÷��� �ƴ� ( ���� ��������� ���ȣ �ο�)
--ROWID : �ּҷμ� ���� ������ ����Ǿ� �ִ� ���� �����ּ�
SELECT  ROWNUM , empno , ename FROM EMP;

--Top-n ����(^^)
--���̺��� ���ǿ� �´� �ֻ��� (Top) ���ڵ� n�� , ������ n���� ���ڵ带 ����
--Top-n : rownum
SELECT  ROWNUM , empno , ename FROM EMP;

--�Խ��Ǽ� ������ ��������  ���
--rownum , order by , where �� �̿�
--����
/*
SELECT [column_list] , ROWNUM
FROM (SELECT [column_list]
         FROM TABLE
         ORDER BY top_N column)
WHERE ROWNUM <= N(NUMBER)
 */

SELECT *
FROM (
					 SELECT e.*
           FROM EMP e ORDER BY sal DESC
         )
WHERE ROWNUM <=5

--------------------------------------------------------------------------
--�Խ��� ����
--�Ϲ� ���� �Խ���
--board (boardnum , title , content , writer , regdate , readcount ,,,,,)
--1
--2
--3 ........ 100�۱��� ...

--�ֽű� : select * from board order by boardnum desc
--page :  ��ȭ�鿡 �����ټ� �ִ� �Խù��� �Ǽ�
--pagesize : 5
--pagecount : 20���� ������
--[1] [2] [3] [4] [5]
--currpage = 1 => 5�� (1~5)
--currpage =2 => 5�� (6~10)

select * from board order by boardnum desc

--rownum , boardnum
      1           100
      2           99
      ..
      6
      ..
      10
SELECT * FROM
									  (SELECT ROWNUM num , a.* FROM
                    					(
                    						  SELECT * FROM board  ORDER BY boardnum desc
                      				) a WHERE ROWNUM <=10
                     ) WHERE num >= 5
--1 . SELECT * FROM board  ORDER BY boardnum desc ����
--2. �ι�° subquery rownum <= 10    10��  (100 ~ 91)
--3.
--rownum    boardnum
--------------------------------------------------------------------------
--�亯�� �Խ���(������ �Խ���)
--Multiboard (boardnum , title , content , writer , regdate , readcount ,,,,,)
--ref(����)  , step(����)  , depth(���� ����:�鿩����)

--boardnum    ,    ref    ,  step   , depth

--select * from Multiboard order by ref desc , step asc
--�ֽű� �������� ���� ,
--------------------------------------------------------------------------
--(~~!)
--rollup �Լ�   --cube
--�Ұ� , �հ� (��輺)
--OLAP  <-> OLTP (DML)

SELECT  deptno, job,COUNT(*),SUM(sal)
FROM EMP
GROUP BY ROLLUP(deptno,job);

SELECT  deptno, job,COUNT(*),SUM(sal)
FROM EMP
GROUP BY cube(deptno,job);

--------------------------------------------------------------------------
--(~^)
--PIVOT(11g ����)
--row ������ colum ������ ����

CREATE TABLE CAL
(
  WEEK NUMBER(1),  --�S��° �� , �ι��� ��
  DAY  VARCHAR2(10), --����
  NUM_DAY NUMBER(2) --1�� , 2��  , 3��
);

INSERT INTO CAL VALUES(1,'��',1);
INSERT INTO CAL VALUES(1,'��',2);
INSERT INTO CAL VALUES(1,'ȭ',3);
INSERT INTO CAL VALUES(1,'��',4);
INSERT INTO CAL VALUES(1,'��',5);
INSERT INTO CAL VALUES(1,'��',6);
INSERT INTO CAL VALUES(1,'��',7);
COMMIT;
INSERT INTO CAL VALUES(2,'��',8);
INSERT INTO CAL VALUES(2,'��',9);
INSERT INTO CAL VALUES(2,'ȭ',10);
INSERT INTO CAL VALUES(2,'��',11);
INSERT INTO CAL VALUES(2,'��',12);
INSERT INTO CAL VALUES(2,'��',13);
INSERT INTO CAL VALUES(2,'��',14);
COMMIT;
INSERT INTO CAL VALUES(3,'��',15);
INSERT INTO CAL VALUES(3,'��',16);
INSERT INTO CAL VALUES(3,'ȭ',17);
INSERT INTO CAL VALUES(3,'��',18);
INSERT INTO CAL VALUES(3,'��',19);
INSERT INTO CAL VALUES(3,'��',20);
INSERT INTO CAL VALUES(3,'��',21);
COMMIT;
INSERT INTO CAL VALUES(4,'��',22);
INSERT INTO CAL VALUES(4,'��',23);
INSERT INTO CAL VALUES(4,'ȭ',24);
INSERT INTO CAL VALUES(4,'��',25);
INSERT INTO CAL VALUES(4,'��',26);
INSERT INTO CAL VALUES(4,'��',27);
INSERT INTO CAL VALUES(4,'��',28);
COMMIT;
INSERT INTO CAL VALUES(5,'��',29);
INSERT INTO CAL VALUES(5,'��',30);
INSERT INTO CAL VALUES(5,'ȭ',31);
COMMIT;

SELECT * FROM cal;

��	�� 	�� 	ȭ 	�� 	�� 	�� 	��
1	  1	  2	    3   	4	  5	  6   	7
2	 8	 9	  10	  11	 12	 13  	14
3	 15 	16	17	   18	 19	 20	  21

SELECT MAX(DECODE(day,'��',num_day)) AS sun ,
					 MAX(DECODE(day,'��',num_day)) AS mon,
           MAX(DECODE(day,'ȭ',num_day)) AS tue ,
           MAX(DECODE(day,'��',num_day)) AS wed ,
           MAX(DECODE(day,'��',num_day)) AS thu ,
           MAX(DECODE(day,'��',num_day)) AS fri ,
           MAX(DECODE(day,'��',num_day)) AS sat
FROM cal
GROUP BY week
ORDER BY week;

SELECT * FROM (SELECT week "��" , day, num_day FROM cal)
PIVOT(
				MAX(num_day)
        FOR day IN('��' AS "��",
        						   '��' AS "��",
                       'ȭ' AS "ȭ",
                       '��' AS "��",
                       '��' AS "��",
                       '��' AS "��",
                       '��' AS "��" )
        )
ORDER BY "��";

--������̺��� �μ����� �� ������ �ο��� ����� ����ؼ� ���
--deptno , clerk ,......
detpno   clierk  man....
10           1        2
20           0      3

SELECT deptno ,
           COUNT(DECODE(job,'CLERK',0)) AS "CLERK",
           COUNT(DECODE(job,'MANAGER',0)) AS "MANAGER",
           COUNT(DECODE(job,'SALESMAN',0)) AS "SALESMAN",
           COUNT(DECODE(job,'ANALYST',0)) AS "ANALYST",
           COUNT(DECODE(job,'PRESIDENT',0)) AS "PRESIDENT"
FROM EMP
GROUP BY deptno
ORDER BY deptno;

--PIVOT���
SELECT * FROM (SELECT deptno , job, empno FROM emp)
PIVOT(
				count(empno)
        FOR job  IN('CLERK' AS "CLERK",
        						   'MANAGER' AS "MANAGER",
                       'SALESMAN' AS "SALESMAN",
                       'ANALYST' AS "ANALYST",
                       'PRESIDENT' AS "PRESIDENT"
                        )
        )
ORDER BY deptno;

--------------------------------------------------------------------------
--������ �����
create table professor
(profno number(4) primary key,
 name  varchar2(10) not null,
 id  varchar2(15) not null,
 position varchar2 (10) not null,
 pay number (3) not null,
 hiredate  date not null,
 bonus number(4) ,
 deptno  number(3),
 email  varchar2(50),
 hpage  varchar2(50)) tablespace users;

insert into professor
values(1001,'������','captain','������',550,to_date('1980-06-23','YYYY-MM-DD'),100,101,'captain@abc.net','http://www.abc.net');

insert into professor
values(1002,'�̼���','sweety','������',380,to_date('1987-01-30','YYYY-MM-DD'),60,101,'sweety@abc.net','http://www.abc.net');

insert into professor
values (1003,'�۵���','powerman','���Ӱ���',270,to_date('1998-03-22','YYYY-MM-DD'),null,101,'pman@power.com','http://www.power.com');

insert into professor
values (2001,'�缱��','lamb1','���Ӱ���',250,to_date('2001-09-01','YYYY-MM-DD'),null,102,'lamb1@hamail.net',null);

insert into professor
values (2002,'�迵��','number1','������',350,to_date('1985-11-30','YYYY-MM-DD'),80,102,'number1@naver.com','http://num1.naver.com');

insert into professor
values (2003,'�ֽ���','bluedragon','������',490,to_date('1982-04-29','YYYY-MM-DD'),90,102,'bdragon@naver.com',null);

insert into professor
values (3001,'�赵��','angel1004','������',530,to_date('1981-10-23','YYYY-MM-DD'),110,103,'angel1004@hanmir.com',null);

insert into professor
values (3002,'���ѿ�','naone10','������',330,to_date('1997-07-01','YYYY-MM-DD'),50,103,'naone10@empal.com',null);

insert into professor
values (3003,'������','only-u','���Ӱ���',290,to_date('2002-02-24','YYYY-MM-DD'),null,103,'only_u@abc.com',null);

insert into professor
values (4001,'�ɽ�','simson','������',570,to_date('1981-10-23','YYYY-MM-DD'),130,201,'chebin@daum.net',null);

insert into professor
values (4002,'�ֽ���','gogogo','������',330,to_date('2009-08-30','YYYY-MM-DD'),null,201,'gogogo@def.com',null);

insert into professor
values (4003,'�ڿ���','mypride','������',310,to_date('1999-12-01','YYYY-MM-DD'),50,202,'mypride@hanmail.net',null);

insert into professor
values (4004,'����ö','ironman','���Ӱ���',260,to_date('2009-01-28','YYYY-MM-DD'),null,202,'ironman@naver.com',null);

insert into professor
values (4005,'�ٺ�','standkang','������',500,to_date('1985-09-18','YYYY-MM-DD'),80,203,'standkang@naver.com',null);

insert into professor
values (4006,'����','napeople','���Ӱ���',220,to_date('2010-06-28','YYYY-MM-DD'),null,301,'napeople@jass.com',null);

insert into professor
values (4007,'����','silver-her','������',290,to_date('2001-05-23','YYYY-MM-DD'),30,301,'silver-her@daum.net',null);

commit;

SELECT * FROM professor;
--�����Լ�(~^)
--RANK()
--RANK(���ǰ�) WITHIN GROUP(ORDER BY ���ǰ� �÷��� [ASC | DESC]
SELECT * FROM professor ORDER BY NAME;

SELECT RANK('�̼���') WITHIN GROUP(ORDER BY NAME ASC) "RANK"
FROM professor;

SELECT RANK(330) WITHIN GROUP(ORDER BY PAY DESC) "RANK"
FROM PROFESSOR;

SELECT profno , NAME, pay,
					 RANK() OVER(ORDER BY pay ASC) AS "rank1",
           RANK() OVER(ORDER BY pay DESC ) AS "rank2"
FROM professor;

--quiz
--��� ���̺� ���, �̸� , �޿� , �μ���ȣ , �μ������� [������] �޿� ���� ���
SELECT empno, ename , sal ,deptno ,
           RANK() OVER(PARTITION BY deptno ORDER BY sal desc) AS "rank"
FROM EMP;
--------------------------------------------------------------------------
--��Ƽ�� ���̺� �����----------------------------------------------------------
--�����ڰ� ���� �ϱ�� �����ϴ� (DBA �� ó���ϴ� ����)
--�����ڰ� �˰� �ִٸ� PLUS �����Դϴ�
--��뷮 ������ ���� ���Ǵ� ���
--��Ƽ�� ���̺� (ADMIN)
--�⺻���
--������ ��ȸ �� ������  �������� ������ ����ҿ� �����Ͽ� �����͸� ������ ��
--�޸𸮿� �÷� ���� �۾� (�� �޸� ������ Buffer) �� �մϴ�
--����Ŭ���� ���Ǵ� Buffer�� => DataBase Buffer Cache
--����Ŭ�� DataBase Buffer Cache ��� �޸� ������ TableSpace��� ����
--�������� ������ ���

--EX) ��ȭ��
--������ ���õǾ� �ִ� ���� (TABLESPACE)
--����â�� (������ ����)
--�մ��� ���ϴ� ���� : ���̺� .....
--�׷��� ����â�� ������ ���� ���� ������ ���� ������
--����â�� ��û���� ���� ��ǰ�� �ִٸ� ?????
--���� ���� (����) ... �������� �۾�

--��ȸ �۾���  SYSTEM �������� ���� �ؼ� Ȯ��
--SELECT * FROM dba_data_files;
--SELECT * FROM dba_tab_partitions WHERE table_owner ='HR';
------------------------------------------------------------------------------
SELECT * FROM user_tables;
--�������� ������ ���� ����
--C:\APP\KOSTA\ORADATA\ORCL\USERS01.DBF

--�Ǹſ� ���̺�
--������ ���������� Range partition(���� ��Ƽ��)
--�����͸� ��¥�� ��������  [�������� ����]�� ��ġ�ϴ� �۾�
--�۾�����
--1.  �������� ������ ���� Ȯ�� �۾�
---- SYSTEM �������� ���� ��ȸ Ȯ��
--SELECT * FROM dba_data_files;
--SELECT * FROM dba_tab_partitions WHERE table_owner ='HR';
-- ��� �ľ� : C:\APP\KOSTA\ORADATA\ORCL\USERS01.DBF

--2.  ��Ȱ ������ ������ ����� ���̺� �����̽� Ȯ��
--������ ����
--�۾���  SYSTEM ����
/*
CREATE TABLESPACE ts_q1
DATAFILE 'C:\APP\KOSTA\ORADATA\ORCL\ts_q101.DBF' SIZE 2M;

CREATE TABLESPACE ts_q2
DATAFILE 'C:\APP\KOSTA\ORADATA\ORCL\ts_q201.DBF' SIZE 2M;

CREATE TABLESPACE ts_q3
DATAFILE 'C:\APP\KOSTA\ORADATA\ORCL\ts_q301.DBF' SIZE 2M;

CREATE TABLESPACE ts_q4
DATAFILE 'C:\APP\KOSTA\ORADATA\ORCL\ts_q401.DBF' SIZE 2M;

CREATE TABLESPACE ts_q5
DATAFILE 'C:\APP\KOSTA\ORADATA\ORCL\ts_q501.DBF' SIZE 2M;
*/

CREATE TABLE panmae
(
    pdate VARCHAR2(8),
    pcode NUMBER(3),
    pqty   NUMBER(5))
  	PARTITION BY RANGE(pdate) -- ������ �������� ����(��Ƽ���� �� ���̳�)
    ( PARTITION q1 VALUES LESS THAN ('20100401') TABLESPACE ts_q1,
      PARTITION q2 VALUES LESS THAN ('20100701') TABLESPACE ts_q2,
      PARTITION q3 VALUES LESS THAN ('20101001') TABLESPACE ts_q3,
      PARTITION q4 VALUES LESS THAN ('20110101') TABLESPACE ts_q4,
      PARTITION q5 VALUES LESS THAN (MAXVALUE) TABLESPACE ts_q5
 );


SELECT * FROM panmae;

INSERT INTO panmae
VALUES('20100404',100,50);

INSERT INTO panmae
VALUES('20100920',200,30);

INSERT INTO panmae
VALUES('20131010',800,2);

COMMIT;

SELECT * FROM panmae;

SELECT * FROM panmae PARTITION(q2);
SELECT * FROM panmae PARTITION(q3);
SELECT * FROM panmae PARTITION(q5);
--------------------------------------------------------------------------


