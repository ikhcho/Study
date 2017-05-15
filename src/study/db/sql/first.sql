--DDL
create table student2(id number, name varchar(30));
create table student3(id number, name varchar2(7), name2 char(7));

--Query
select * from student3;

--DML
insert into student2 values(1,'������');
insert into student3 values(1,'������','����');

select 40*2 from dual; -- �������̺� dual

select 10/5,sysdate from dual;

select '��������', employee_id as "�� �� ��" from EMPLOYEES --'' : ���ڰ�(literal), "" : �̸�
-- "employee_id" ��� ���� �����ͻ����� ����ɶ� �빮�ڷ� ����ȴ�.
-- �ҹ��ڸ� ����ϰ� ������ "�ҹ���"�� ����ϸ� ������ ����� ���� "�ҹ���"�δ� ã���� ����
-- ������ as ��������, ���� Ư�� ���� ���Խ� ""����ؾ���

select ename, hiredate �Ի���
from EMP
where deptno = 10
order by �Ի��� desc -- order by (Į����orĮ������) desc(���� or ASC(�ø�))

select ename, sal, comm, sal+sal*nvl(comm,0)/100 as total -- nvl(��1,��2) ��1�� null�̸� ��2�� ��ȯ
from emp
order by comm -- desc nulls last -- nulls first

select ename || '������' || job || '�Դϴ�' ������ro
from emp

--1981�� 1��1�� ���� �Ի���
select ename
from emp
where hiredate >= '81/01/01'

select ename, hiredate, to_char(hiredate,'MM/DD/YYYY')||'�⵵�Ի�' "�Ի���"
from emp
where to_char(hiredate,'MM/DD/YYYY')>='01/01/1981'

insert into emp values(7999,'test','test',7777,'1981/01/01',77,77,30)
insert into emp values(7998,'test2','test2',7777,'1981/12/31',77,77,30)

--1981�� �Ի���
select *
from EMP
where hiredate between '1981/01/01' and '1981/12/31'
where hiredate between '1981/01/01' and '1982/01/01'

--NOT > AND > OR
select *
from emp
where NOT deptno = 10 or deptno =20 and sal>=1500


select *
from emp
where comm in(300,500,1400)
--where comm=300 or comm=500 or comm=1400
--where comm NOT in(300,500,1400)
--where comm = null �ȵ� => where comm is not null

select *
from emp
--where ename like '%A%'
--where ename like '_A%'
--where ename like '_____'
where ename like 'A%'