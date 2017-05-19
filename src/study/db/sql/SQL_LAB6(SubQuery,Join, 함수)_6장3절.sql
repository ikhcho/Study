========================================
		SubQuery
========================================
select * from tab
select * from employees
select * from jobs
select * from locations
select * from departments
select * from countries

1. �������� �̸�, �Ի���, �μ����� ��ȸ�Ͻÿ�.
��, �μ��� ���� ������ �ִٸ� �� ���������� ��°���� ���Խ�Ų��.
�׸��� �μ��� ���� ������ ���ؼ��� '<�μ�����>' �� ��µǵ��� �Ѵ�.
(outer-join , nvl() )
select e.first_name �̸�, e.hire_date �Ի���, nvl(d.department_name,'<�μ�����>') �μ���
from employees e left outer join departments d on(e.department_id = d.department_id)


2. ������ ��å�� ���� ������ �ٸ��� �����Ϸ��� �Ѵ�.
��å�� 'Manager'�� ���Ե� ������ �޿��� 0.5�� ���ϰ�
������ �����鿡 ���ؼ��� ������ �޿��� �����ϵ��� �Ѵ�. 
�����ϰ� ��ȸ�Ͻÿ�. (decode)
select e.first_name �̸�, e.hire_date �Ի���, j.job_title ��å, decode(substr(j.job_title,-7,7), 'Manager', e.salary*0.5, e.salary) �޿�
from employees e left outer join jobs j on(e.job_id = j.job_id)

select e.first_name �̸�, e.hire_date �Ի���, j.job_title ��å, case when job_title like '%Manager' then salary*0.5 else salary end �޿�
from employees e left outer join jobs j on(e.job_id = j.job_id)

3. �� �μ����� �����޿��� �޴� ������ �̸��� �μ�id, �޿��� ��ȸ�Ͻÿ�.
select first_name �̸�, department_id �μ�id, salary �޿�
from employees
where (salary, department_id) in (select min(salary), department_id from employees group by department_id)

-----------------------------------------------------------------------------------------
-- �ڽ��� ���� �μ��� ��� �޿����� �޿��� ���� �������� ������� �μ� �̸� �� ���� ���� ����Ͻÿ�
-- ��°���� �μ��̸��� �������� �����ؾ� �Ѵ�.
select department_name, count(*) ������
from employees emp, (select department_id, avg(salary) avgsal from employees group by department_id) aa, departments
where emp.department_id = aa.department_id
and salary<avgsal
and emp.department_id = departments.department_id
group by department_name
order by 1

-------------------------------------------------------------------------------------------------------


4. �� ���޺�(job_title) �ο����� ��ȸ�ϵ� ������ ���� ������ �ִٸ� �ش� ���޵�
��°���� ���Խ�Ű�ÿ�. �׸��� ���޺� �ο����� 3�� �̻��� ���޸� ��°���� ���Խ�Ű�ÿ�.
select j.job_title  ����, count(e.job_id) �ο���
from jobs j left outer join employees e on(j.job_id = e.job_id)
group by j.job_title
having count(e.job_id) >=3


5. �� �μ��� �ִ�޿��� �޴� ������ �̸�, �μ���, �޿��� ��ȸ�Ͻÿ�.
select e.first_name �̸�, d.department_name �μ���, e.salary �޿�
from employees e join departments d on(e.department_id = d.department_id)
where (e.department_id, e.salary) in (select department_id, max(salary) from employees group by department_id)

6. ������ �̸�, �μ�id, �޿��� ��ȸ�Ͻÿ�. �׸��� ������ ���� �ش� �μ��� 
�ּұ޿��� �������� ���Խ��� ��� �Ͻÿ�.
select first_name �̸�, department_id �μ�id, salary �޿�, (select min(salary)
															from employees 
															where department_id = emp.department_id) �ּұ޿�
from employees emp

--
select emp.first_name �̸�, emp.department_id �μ�id, salary �޿�, mintb.minsal
from employees emp, (select min(salary) minsal, department_id from employees group by department_id) mintb
where emp.department_id = mintb.department_id

 


