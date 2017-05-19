select * from tab
select * from employees
select * from jobs
select * from locations
select * from departments
select * from countries

========================================
		SubQuery
========================================
1. 'IT'�μ����� �ٹ��ϴ� �������� �̸�, �޿�, �Ի����� ��ȸ�Ͻÿ�.
select first_name �̸�, salary �޿�, hire_date �Ի���
from employees
where department_id = (select department_id from departments where department_name = 'IT')

2. 'Alexander' �� ���� �μ����� �ٹ��ϴ� ������ �̸��� �μ�id�� ��ȸ�Ͻÿ�.
select first_name �̸�, department_id �μ�id
from employees
where department_id in(select department_id from employees where first_name = 'Alexander')

3. 80���μ��� ��ձ޿����� ���� �޿��� �޴� ������ �̸�, �μ�id, �޿��� ��ȸ�Ͻÿ�.
select first_name �̸�, department_id �μ�id, salary �޿�
from employees
where salary > (select avg(salary) from employees where department_id = 80)

--��Į������
select first_name �̸�, department_id �μ�id, salary �޿�, (select avg(salary) from employees where department_id = 80) �μ���ձ޿�
from employees
where salary > (select avg(salary) from employees where department_id = 80)

--�ζ��κ�
select first_name �̸�, department_id �μ�id, salary �޿�, dept80.avgsal �μ���ձ޿�
from employees, (select avg(salary) avgsal from employees where department_id = 80) dept80
where salary > dept80.avgsal

4. 'South San Francisco'�� �ٹ��ϴ� ������ �ּұ޿����� �޿��� ���� �����鼭 
50 ���μ��� ��ձ޿����� ���� �޿��� �޴� ������ �̸�, �޿�, �μ���, 
�μ�id�� ��ȸ�Ͻÿ�.

select e.first_name �̸�, e.salary �޿�, d.department_name �μ���, d.department_id �μ�id
from employees e, departments d
where e.department_id = d.department_id
and salary > all((select min(e.salary) 
				from employees e, departments d, locations l 
				where e.department_id = d.department_id and d.location_id = l.location_id and l.city = 'South San Francisco')
				, (select avg(e.salary) 
					from employees e
					where e.department_id=50))


-------------------scott/tiger (emp, dept)

1. BLAKE�� ������ �μ��� ���� ��� ����� �̸��� �Ի����� ǥ���ϴ� ���Ǹ� �ۼ��Ͻÿ�.
������� BLAKE�� ���ܽ�ŵ�ϴ�.

 


2. �μ��� ��ġ�� DALLAS�� ��� ����� �̸�, �μ���ȣ , ������ ǥ���Ͻÿ� 





3. KING���� �����ϴ� ��� ����� �̸��� �޿��� ǥ���ϴ� ���Ǹ� �ۼ��Ͻÿ� 

 














 
