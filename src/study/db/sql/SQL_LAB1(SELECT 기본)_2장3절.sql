
hr/hr
========================================
		SELECT �⺻
========================================

1. �޿��� 15000 �̻��� �������� �̸�, �޿�, �μ�id�� ��ȸ�Ͻÿ�.
select first_name as "�̸�", salary as "�޿�", department_id as "�μ�id"
from employees
where salary >=15000
--3��

2. ���� �߿��� ������ 170000 �̻��� �������� �̸�, ������ ��ȸ�Ͻÿ�.
   ������ �޿�(salary)�� 12�� ���� ���Դϴ�.

select first_name as "�̸�", salary*12 as "����"
from employees
where (salary*12) >=170000
--3��

3. ���� �߿��� �μ�id�� ���� ������ �̸��� �޿��� ��ȸ�Ͻÿ�.
select first_name as "�̸�", salary as "�޿�"
from employees
where department_id is null 
--1��

4. 2004�� ������ �Ի��� ������ �̸�, �޿�, �Ի����� ��ȸ�Ͻÿ�.
select first_name as "�̸�", salary as "�޿�", hire_date as "�Ի���"
from employees
where hire_date <= '2004/12/31'
--24��

-- �������� -- 
1. 80, 50 �� �μ��� ���������鼭 �޿��� 13000 �̻��� ������ �̸�, �޿�, �μ�id
�� ��ȸ�Ͻÿ�.
select first_name as "�̸�", salary as "�޿�", department_id as "�μ�id"
from employees
where (department_id = 80 or department_id = 50) and salary >=13000
--2��


2. 2005�� ���Ŀ� �Ի��� ������ �߿��� �޿��� 1300 �̻� 20000 ������ �������� 
�̸�, �޿�, �μ�id, �Ի����� ��ȸ�Ͻÿ�.
select first_name as "�̸�", salary as "�޿�", department_id as "�μ�id", hire_date as "�Ի���"
from employees
where hire_date >='2005/01/01' and (salary >= 1300 and salary <= 20000) 
--83��


-- SQL �񱳿����� --
1. 80, 50 �� �μ��� ���������鼭 �޿��� 13000 �̻��� ������ �̸�, �޿�, �μ�id
�� ��ȸ�Ͻÿ�.
select first_name as "�̸�", salary as "�޿�", department_id as "�μ�id", hire_date as "�Ի���"
from employees
where (department_id = 80 or department_id = 50) and salary >= 13000
--2��

2. 2005�� ���Ŀ� �Ի��� ������ �߿��� �޿��� 1300 �̻� 30000 ������ �������� 
�̸�, �޿�, �μ�id, �Ի����� ��ȸ�Ͻÿ�.
select first_name as "�̸�", salary as "�޿�", department_id as "�μ�id", hire_date as "�Ի���"
from employees
where hire_date >='2005/01/01' and (salary >= 1300 and salary <= 20000) 
--83��



3. 2005�⵵ �Ի��� ������ ������ ����Ͻÿ�.
select *
from employees
where hire_date between '2005/01/01' and '2005/12/31'
--29��


4. �̸��� D�� �����ϴ� ������ �̸�, �޿�, �Ի����� ��ȸ�Ͻÿ�.
select first_name as "�̸�", salary as "�޿�", hire_date as "�Ի���"
from employees
where first_name like 'D%'
--9��


5. 12���� �Ի��� ������ �̸�, �޿�, �Ի����� ��ȸ�Ͻÿ�.
select first_name as "�̸�", salary as "�޿�", hire_date as "�Ի���"
from employees
where  to_char(hire_date,'YYYYMMDD') like '____12%'
--7��

6. �̸��� le �� �� ������ �̸�, �޿�, �Ի����� ��ȸ�Ͻÿ�.
select first_name as "�̸�", salary as "�޿�", hire_date as "�Ի���"
from employees
where  first_name like '%le%'
--9��


7. �̸��� m���� ������ ������ �̸�, �޿�, �Ի����� ��ȸ�Ͻÿ�.
select first_name as "�̸�", salary as "�޿�", hire_date as "�Ի���"
from employees
where  first_name like '%m'
--4��


8. �̸��� ����° ���ڰ� r�� �̸�, �޿�, �Ի����� ��ȸ�Ͻÿ�.
select first_name as "�̸�", salary as "�޿�", hire_date as "�Ի���"
from employees
where  first_name like '__r%'
--11��


9. Ŀ�̼��� �޴� ������ �̸�, Ŀ�̼�, �޿��� ��ȸ�Ͻÿ�.
select first_name as "�̸�", commission_pct as "Ŀ�̼�", salary as "�޿�"
from employees
where  commission_pct is not null
--35��


10. Ŀ�̼��� ���� �ʴ� ������ �̸�, Ŀ�̼�, �޿��� ��ȸ�Ͻÿ�.
select first_name as "�̸�", commission_pct as "Ŀ�̼�", salary as "�޿�"
from employees
where  commission_pct is null
--72��


11. 2000��뿡 �Ի��ؼ� 30, 50, 80 �� �μ��� ���������鼭, 
�޿��� 5000 �̻� 17000 ���ϸ� �޴� ������ ��ȸ�Ͻÿ�. 
��, Ŀ�̼��� ���� �ʴ� �������� �˻� ��󿡼� ���ܽ�Ű��, ���� �Ի��� ������ 
���� ��µǾ�� �ϸ� �Ի����� ���� ��� �޿��� ���� ������ ���� ��µǷ� �Ͻÿ�.
select * 
from employees
where to_char(hire_date, 'yyyy')>='2000' and to_char(hire_date, 'yyyy')<'2010' and (department_id = 30 or department_id = 50 or department_id = 80)
and salary>5000 and salary<=17000 and (commission_pct is not null)
order by hire_date, salary desc
--34�� 
select * 
from (select * from employees where commission_pct is not null)
where to_char(hire_date, 'yyyy')>='2000' and to_char(hire_date, 'yyyy')<'2010' and (department_id = 30 or department_id = 50 or department_id = 80)
and salary>5000 and salary<=17000
order by hire_date, salary desc
