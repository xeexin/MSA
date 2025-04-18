--1> �μ����̺��� ��� �����͸� ����϶�.
SELECT *
FROM DEPT

--2> EMP���̺��� �� ����� ����, �����ȣ, �̸�, �Ի����� ����϶�.
SELECT JOB, EMPNO, ENAME, HIREDATE
FROM EMP

--3> EMP���̺��� ������ ����ϵ�, �� �׸�(ROW)�� �ߺ����� �ʰ� ����϶�.
SELECT DISTINCT JOB
FROM EMP

--4> �޿��� 2850 �̻��� ����� �̸� �� �޿��� ǥ���ϴ� ����϶�.
SELECT ENAME, SAL
FROM EMP
WHERE SAL >= 2850

--5> �����ȣ�� 7566�� ����� �̸� �� �μ���ȣ�� ǥ���ϴ� ����϶�.
SELECT ENAME, DEPTNO
FROM EMP
WHERE EMPNO=7566

--6> �޿��� 1500�̻� ~ 2850������ ������ ������ �ʴ� ��� ����� �̸� �� �޿��� ����϶�.
SELECT ENAME, SAL
FROM EMP
WHERE SAL NOT BETWEEN 1500 AND 2850

--7> 1981�� 2�� 20�� ~ 1981�� 5�� 1�Ͽ� �Ի��� ����� �̸�,���� �� �Ի����� ����϶�. �Ի����� �������� �ؼ� ������������ �����϶�.
SELECT ENAME, JOB, HIREDATE
FROM EMP
WHERE HIREDATE BETWEEN '1981-02-20' AND '1981-05-01'
ORDER BY HIREDATE

--8> 10�� �� 30�� �μ��� ���ϴ� ��� ����� �̸��� �μ� ��ȣ�� ����ϵ�, �̸��� ���ĺ������� �����Ͽ� ����϶�.

SELECT ENAME, DEPTNO
FROM EMP
WHERE DEPTNO IN(10,30)
ORDER BY ENAME

--9> 10�� �� 30�� �μ��� ���ϴ� ��� ��� �� �޿��� 1500�� �Ѵ� ����� �̸� �� �޿��� ����϶�.
--(�� �÷����� ���� employee �� Monthly Salary�� �����Ͻÿ�)
SELECT ENAME AS 'Employee', SAL AS ' Monthly Salary'
FROM EMP
WHERE DEPTNO IN(10,30) AND SAL>1500

--10> �����ڰ� ���� ��� ����� �̸� �� ������ ����϶�.
SELECT ENAME, JOB
FROM EMP
WHERE MGR IS NULL


--11> Ŀ�̼��� �޴� ��� ����� �̸�, �޿� �� Ŀ�̼��� ����ϵ�, �޿��� �������� ������������ �����Ͽ� ����϶�.
SELECT ENAME, SAL, COMM
FROM EMP
WHERE COMM IS NOT NULL
ORDER BY SAL DESC

--12> �̸��� �� ��° ���ڰ� A�� ��� ����� �̸��� ����϶�.
SELECT ENAME
FROM EMP
WHERE ENAME LIKE '__A%'

--13> �̸��� L�� �� �� ���� �μ� 30�� �����ִ� ����� �̸��� ����϶�.
SELECT ENAME
FROM EMP
WHERE ENAME LIKE '%L%L%' AND DEPTNO=30

--14> ������ Clerk �Ǵ� Analyst �̸鼭 �޿��� 1000,3000,5000 �� �ƴ� ��� ����� �̸�, ���� �� �޿��� ����϶�.

SELECT ENAME, JOB, SAL
FROM EMP
WHERE JOB IN('CLERK','ANALYST') AND SAL not IN(1000,3000,5000)

--15> �����ȣ, �̸�, �޿� �׸��� 15%�λ�� �޿��� ������ ǥ���ϵ� �÷����� New Salary�� �����Ͽ� ����϶�.
SELECT EMPNO, ENAME, SAL,
           ROUND(SAL+(SAL*0.15),0) AS "New Salary"
FROM EMP

--16> 15�� ������ ������ ����Ÿ���� �޿� �λ��(�� �޿����� ���� �޿��� �� ��)�� �߰��ؼ� ����϶�.(�÷����� Increase�� �϶�).
SELECT EMPNO, ENAME, SAL, ROUND(SAL+(SAL*0.15) ) AS "New Salary",
		(ROUND(SAL+(SAL*0.15)))-SAL AS "Increase"
FROM EMP

--18> ��� ����� �̸�(ù ���ڴ� �빮�ڷ�, ������ ���ڴ� �ҹ��ڷ� ǥ��) �� �̸� ���̸� ǥ���ϴ� ������ �ۼ��ϰ� �÷� ��Ī�� ������ �־ ����϶�.
SELECT UPPER(SUBSTR(ENAME,1,1)) || LOWER(SUBSTR(ENAME,2,12)) AS "NAME",
LENGTH(ENAME) AS "LENENAME"
FROM EMP


--19> ����� �̸��� Ŀ�̼��� ����ϵ�, Ŀ�̼��� å������ ���� ����� Ŀ�̼��� 'no commission'���� ����϶�.
SELECT ENAME, NVL(TO_CHAR(COMM),'no commission')
FROM EMP

--20> ��� ����� �̸�,�μ���ȣ,�μ��̸��� ǥ���ϴ� ���Ǹ� �ۼ��϶�.(DECODE)

SELECT empno, deptno , DECODE(deptno,10,'ACCOUNTING' ,
                                                    20,'RESEARCH',
                                                    30,'SALES',
                                                    40,'OPERATIONS') AS "dname"
FROM EMP;


SELECT E.ENAME, E.DEPTNO, D.DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO=D.DEPTNO

--21> 30�� �μ��� ���� ����� �̸��� �μ���ȣ �׸��� �μ��̸��� ����϶�.
SELECT E.ENAME, E.DEPTNO, D.DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO=D.DEPTNO AND E.DEPTNO=30

--22> 30�� �μ��� ���� ������� ��� ������ �μ���ġ�� ����϶�.
--(��, ���� ����� �ߺ����� �ʰ� �϶�.)
SELECT DISTINCT E.JOB, D.LOC
FROM EMP E, DEPT D
WHERE E.DEPTNO=D.DEPTNO AND D.DEPTNO=30

--23> Ŀ�̼��� å���Ǿ� �ִ� ��� ����� �̸�, �μ��̸� �� ��ġ�� ����϶�.
SELECT E.ENAME, D.DNAME, D.LOC
FROM EMP E, DEPT D
WHERE E.DEPTNO=D.DEPTNO AND COMM IS NOT NULL

--24> �̸��� A�� ���� ��� ����� �̸��� �μ� �̸��� ����϶�.
SELECT E.ENAME, D.DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO=D.DEPTNO AND E.ENAME LIKE '%A%'

--25> Dallas���� �ٹ��ϴ� ��� ����� �̸�, ����, �μ���ȣ �� �μ��̸��� ����϶�.
SELECT E.ENAME, E.JOB, E.DEPTNO, D.DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO=D.DEPTNO AND D.LOC='Dallas'

--26> ����̸� �� �����ȣ, �ش� �������̸� �� ������ ��ȣ�� ����ϵ�, �� �÷����� employee,emp#,manager,mgr#���� ǥ���Ͽ� ����϶�.
SELECT E.ENAME AS "EMPPLOYEE", E.EMPNO AS "EMP#",
M.ENAME AS "MANAGER", M.EMPNO AS "MGR#"
FROM EMP E, EMP M
WHERE E.MGR=M.EMPNO

--27> ��� ����� �̸�,����,�μ��̸�,�޿� �� ����� ����϶�.
SELECT E.ENAME, E.JOB, D.DNAME, E.SAL, S.GRADE
FROM EMP E, DEPT D, SALGRADE S
WHERE E.DEPTNO=D.DEPTNO
AND E.SAL BETWEEN S.LOSAL AND S.HISAL

--28> Smith���� �ʰ� �Ի��� ����� �̸� �� �Ի����� ����϶�.
SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE>(SELECT HIREDATE
			FROM EMP
			WHERE ENAME='SMITH')

--29> �ڽ��� �����ں��� ���� �Ի��� ��� ����� �̸�, �Ի���, �������� �̸�, �������� �Ի����� ����ϵ� ���� �÷����� Employee,EmpHiredate, Manager,MgrHiredate�� ǥ���Ͽ� ����϶�.
SELECT E.ENAME AS "Employee", E.HIREDATE AS "EmpHIredate",
M.ENAME AS "Manager",
	M.HIREDATE AS "MgrHiredate"
FROM EMP E, EMP M
WHERE E.MGR=M.EMPNO AND E.HIREDATE<M.HIREDATE

--30> ��� ����� �޿� �ְ��,������,�Ѿ� �� ��վ��� ����ϵ� �� �÷����� Maximum, Minimum, Sum, Average�� �����Ͽ� ����϶�.
SELECT MAX(SAL) AS "Maximum", MIN(SAL) AS "Minimum",
	SUM(SAL) AS "Sum", AVG(SAL) AS "Average"
FROM EMP

--31> �� �������� �޿� ������.�ְ��,�Ѿ� �� ��վ��� ����϶�.
SELECT JOB, MAX(SAL), MIN(SAL), SUM(SAL), AVG(SAL)
FROM EMP
GROUP BY JOB

--32> ������ ������ ��� ���� ������ ���� ����϶�.
SELECT JOB, COUNT(JOB)
FROM EMP
GROUP BY JOB

--33> �������� ���� ����ϵ�, ������ ��ȣ�� �ߺ����� �ʰ��϶�. �׸���, �÷����� Number of Manager�� �����Ͽ� ����϶�.
SELECT COUNT(DISTINCT(MGR)) AS "Number of Manager"
FROM EMP

--34> �ְ� �޿��� ���� �޿��� ������ ����϶�.
SELECT MAX(SAL)-MIN(SAL) FROM EMP

--35> ������ ��ȣ �� �ش� �����ڿ� ���� ������� ���� �޿��� ����϶�. ��, �����ڰ� ���� ��� �� ���� �޿��� 1000 �̸��� �׷��� ���ܽ�Ű�� �޿��� �������� ��� ����� ������������ �����϶�.
SELECT MGR, MIN(SAL)
FROM EMP
WHERE MGR IS NOT NULL
GROUP BY MGR
HAVING MIN(SAL)>=1000
ORDER BY MIN(SAL)

--36> �μ����� �μ��̸�, �μ���ġ, ��� �� �� ��� �޿��� ����϶�. �׸��� ������ �÷����� �μ���,��ġ,����� ��,��ձ޿��� ǥ���϶�.
SELECT E.DEPTNO AS "�μ���", D.DNAME AS "�μ��̸�", D.LOC AS "��ġ",
	COUNT(E.EMPNO) AS "����� ��", AVG(E.SAL) AS "��ձ޿�"
FROM EMP E, DEPT D
WHERE E.DEPTNO=D.DEPTNO
GROUP BY E.DEPTNO, D.DNAME, D.LOC

--37> Smith�� ������ �μ��� ���� ��� ����� �̸� �� �Ի����� ����϶�. ��, Smith�� �����ϰ� ����Ͻÿ�
SELECT ENAME, TO_CHAR(HIREDATE,'YYYY-MM-DD')
FROM EMP
WHERE DEPTNO IN(SELECT DEPTNO
			FROM EMP
			WHERE ENAME='SMITH')
AND ENAME!='SMITH'

--38> �ڽ��� �޿��� ��� �޿����� ���� ��� ����� ��� ��ȣ, �̸�, �޿��� ǥ���ϴ� ���Ǹ� �ۼ��ϰ� �޿��� �������� ����� ������������ �����϶�.
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL>(SELECT AVG(SAL)
		FROM EMP)
ORDER BY SAL DESC

--39> �̸��� T�� ���� ����� ���� �μ����� �ٹ��ϴ� ��� ����� �����ȣ �� �̸��� ����϶�.
SELECT EMPNO, ENAME
FROM EMP
WHERE DEPTNO IN(SELECT DEPTNO
			FROM EMP
			WHERE ENAME LIKE '%T%')

--40> �μ���ġ�� Dallas�� ��� ����� �̸�,�μ���ȣ �� ������ ����϶�.
SELECT E.ENAME, E.DEPTNO, E.JOB
FROM EMP E, DEPT D
WHERE E.DEPTNO=D.DEPTNO
AND D.LOC='DALLAS'

--41> KING���� �����ϴ� ��� ����� �̸��� �޿��� ����϶�.
SELECT ENAME, SAL
FROM EMP
WHERE MGR=(SELECT EMPNO
		FROM EMP
		WHERE ENAME='KING')

--42> Sales �μ��� ��� ����� ���� �μ���ȣ, �̸� �� ������ ����϶�.
SELECT E.DEPTNO, E.ENAME, E.JOB
FROM EMP E, DEPT D
WHERE E.DEPTNO=D.DEPTNO
	AND D.DNAME='SALES'

SELECT E.DEPTNO, E.ENAME, E.JOB
FROM EMP E inner join DEPT D on E.DEPTNO=D.DEPTNO
where  D.DNAME='SALES'

--43> �ڽ��� �޿��� ��� �޿����� ���� �̸��� T�� ���� ����� ������ �μ��� �ٹ��ϴ� ��� ����� ��� ��ȣ, �̸� �� �޿��� ����϶�.
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL > (SELECT AVG(SAL)
		FROM EMP)
AND DEPTNO IN(SELECT DEPTNO
		FROM EMP
		WHERE ENAME LIKE '%T%')

--44> Ŀ�̼��� �޴� ����� �޿��� ��ġ�ϴ� ����� �̸�,�μ���ȣ,�޿��� ����϶�.
SELECT ENAME, DEPTNO, SAL
FROM EMP
WHERE SAL IN(SELECT SAL
		FROM EMP
		WHERE COMM IS NOT NULL)

--45> Dallas���� �ٹ��ϴ� ����� ������ ��ġ�ϴ� ����� �̸�,�μ��̸�, �� �޿��� ����Ͻÿ�
SELECT E.ENAME, D.DNAME, E.SAL
FROM EMP E, DEPT D
WHERE E.DEPTNO=D.DEPTNO
AND E.JOB IN(SELECT E.JOB
		FROM EMP E, DEPT D
		WHERE E.DEPTNO=D.DEPTNO
		AND D.LOC='DALLAS')

--46> Scott�� ������ �޿� �� Ŀ�̼��� �޴� ��� ����� �̸�, �Ի��� �� �޿��� ����Ͻÿ�
SELECT ENAME, HIREDATE, SAL
FROM EMP
WHERE SAL=(SELECT SAL
		FROM EMP
		WHERE ENAME='SCOTT')
AND NVL(COMM,0)=(SELECT NVL(COMM,0)
		FROM EMP
		WHERE ENAME='SCOTT')

--47> ������ Clerk �� ����麸�� �� ���� �޿��� �޴� ����� �����ȣ, �̸�, �޿��� ����ϵ�, ����� �޿��� ���� ������ �����϶�.
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL>ALL(SELECT SAL
		FROM EMP
		WHERE JOB='CLERK') --�ᱹ �ִ밪�� �� any �ּҰ��� ��
ORDER BY SAL DESC

--48> �̸��� A�� ���� ����� ���� ������ ���� ����� �̸��� ����, �μ���ȣ�� ����϶�.
SELECT ENAME, SAL, DEPTNO
FROM EMP
WHERE SAL IN(SELECT SAL
		FROM EMP
		WHERE ENAME LIKE '%A%')

--49> New  York ���� �ٹ��ϴ� ����� �޿� �� Ŀ�̼��� ���� ����� ����̸��� �μ����� ����϶�.
SELECT E.ENAME, D.DNAME
FROM EMP E, DEPT D
WHERE
e.deptno= d.deptno
AND E.SAL IN(
 									SELECT E.SAL
		              FROM EMP E, DEPT D
		              WHERE E.DEPTNO=D.DEPTNO AND LOC='NEW YORK'
                  )
AND NVL(COMM,0) IN(
															SELECT NVL(COMM,0)
															FROM EMP E, DEPT D
															WHERE E.DEPTNO=D.DEPTNO
                              AND LOC='NEW YORK')

--50> Dallas���� �ٹ��ϴ� ����� ���� �� �����ڰ� ���� ����� �����ȣ,����̸�, ����,����,�μ���,Ŀ�̼��� ����ϵ� Ŀ�̼��� å������ ���� ����� NoCommission���� ǥ���ϰ�, Ŀ�̼��� �÷����� Comm���� ������ ����Ͻÿ�. (��, �ְ���޺��� ��µǰ� �Ͻÿ�)
SELECT E.EMPNO, E.ENAME, E.JOB, E.SAL, D.DNAME,
NVL((TO_CHAR(E.COMM)),'NoCommision') AS "COMM"
FROM EMP E, DEPT D
WHERE E.DEPTNO=D.DEPTNO
AND JOB IN(SELECT JOB
		FROM EMP E, DEPT D
		WHERE E.DEPTNO=D.DEPTNO AND LOC='DALLAS')
AND MGR IN(SELECT MGR
		FROM EMP E, DEPT D
		WHERE E.DEPTNO=D.DEPTNO AND LOC='DALLAS')



