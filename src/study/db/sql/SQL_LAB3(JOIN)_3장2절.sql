========================================
		JOIN
========================================
select * from tab
select * from employees
select * from emp_details_view
select * from jobs
select * from countries
select * from departments
select * from regions
select * from locations

1.�������� �̸��� ���޸�(job_title)�� ��ȸ�Ͻÿ�.
select e.first_name, j.job_title
from employees e, jobs j
where e.job_id = j.job_id
--107��

2.�μ��̸��� �μ��� ���� ���ø�(city)�� ��ȸ�Ͻÿ�.
select d.department_name, l.city
from departments d, locations l
where d.location_id = l.location_id
--27��

3. ������ �̸��� �ٹ��������� ��ȸ�Ͻÿ�. (employees, departments, locations,countries)
select e.first_name, c.country_name
from employees e, departments d, countries c, locations l
where e.department_id = d.department_id and d.location_id = l.location_id and l.country_id = c.country_id
--106��

4. ��å(job_title)�� 'manager' �� ����� �̸�, ��å, �μ����� ��ȸ�Ͻÿ�.
select e.first_name, j.job_title, d.department_name
from employees e, jobs j, departments d
where e.job_id = j.job_id and e.department_id = d.department_id and j.job_title like '%Manager'
--14��

5. �������� �̸�, �Ի���, �μ����� ��ȸ�Ͻÿ�.
select e.first_name �̸�, e.hire_date �Ի���, d.department_name �μ���
from employees e, departments d
where e.department_id = d.department_id
--106��

6. �������� �̸�, �Ի���, �μ����� ��ȸ�Ͻÿ�.
��, �μ��� ���� ������ �ִٸ� �� ���������� ��°���� ���Խ�Ų��.
select e.first_name �̸�, e.hire_date �Ի���, d.department_name �μ���
from employees e, departments d
where e.department_id = d.department_id(+)


7. ������ �̸��� ��å(job_title)�� ����Ͻÿ�.
��, ������ �ʴ� ��å�� �ִٸ� �� ��å������ ��°���� ���Խ�Ű�ÿ�.
select e.first_name �̸�, j.job_title ��å
from employees e, jobs j
where e.job_id(+) = j.job_id


