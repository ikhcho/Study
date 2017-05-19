select * from tab
select * from employees
select * from jobs
select * from locations
select * from departments
select * from countries

<< �������� >>
1. 'Southlake'���� �ٹ��ϴ� ������ �̸�, �޿�, ��å(job_title)�� ��ȸ�Ͻÿ�.
select e.first_name �̸�, e.salary �޿�, j.job_title ��å
from employees e, jobs j, locations l, departments d
where e.department_id = d.department_id and d.location_id = l.location_id and l.city = 'Southlake' and e.job_id = j.job_id 
-- 5��

2. ������ �ٹ� �ο����� ��ȸ�Ͻÿ�. ��, �ο����� 3�� �̻��� ���������� ��µǾ����.
select c.country_name ����, count(e.first_name)
from employees e, countries c, locations l, departments d
where e.department_id = d.department_id and d.location_id = l.location_id  and c.country_id = l.country_id
group by c.country_name
having count(e.first_name)>=3
-- 2��

3. ������ �̸�, �޿�, ������ ������ �̸��� ��ȸ�Ͻÿ�. ��, �����ڰ� ���� ������
   '<������ ����>'�� ��µǵ��� �ؾ� �Ѵ�.
select e.first_name �̸�, e.salary �޿�, nvl(m.first_name,'<������ ����>') ������
from employees e, employees m
where e.manager_id = m.employee_id(+)


4. ������ �̸�, �μ���, �ٹ������ ��ȸ�ϵ�, 20�� �̻� ��� �ټ��ڸ� ��µǷ��Ѵ�.
select e.first_name �̸�, d.department_name �μ���, months_between(sysdate,hire_date)/12 �ٹ����
from employees e, departments d
where e.department_id = d.department_id and months_between(sysdate,hire_date)/12 >=10



5. �� �μ� �̸����� �ִ�޿��� �ּұ޿��� ��ȸ�Ͻÿ�. ��, �ִ�/�ּұ޿��� ������
   �μ��� ��°������ ���ܽ�Ų��.
select d.department_name �μ���, max(e.salary) �ִ�޿�, min(e.salary) �ּұ޿�
from employees e, departments d
where e.department_id = d.department_id
group by d.department_name
having  max(e.salary) != min(e.salary)




6. �ڽ��� ���� �μ��� ��ձ޿����� ���� �޿��� �޴� ���������� ��ȸ�Ͻÿ�.
   ��, ��°���� �ڽ��� ���� �μ��� ��� �޿������� ��µǾ���Ѵ�. 
select e.first_name �̸�, a.department_name �μ���, e.salary �޿�, a.avg �μ���ձ޿�
from employees e, ( select  d.department_name, d.department_id id, avg(e.salary) avg
				from employees e, departments d
				where e.department_id = d.department_id
				group by d.department_id, d.department_name ) a
where e.department_id=a.id and e.salary>=a.avg




7. '��'�� �ִ�޿����� �̸�, �޿��� ��ȸ�Ͻÿ�.
select e.first_name �̸�, e.salary �޿�
from employees e
where 






8. �μ���, ���޺�, ��ձ޿��� ��ȸ�Ͻÿ�. 
   ��, ��ձ޿��� 50���μ��� ��պ��� ���� �μ��� ��µǾ�� �մϴ�.






9. �ڽ��� �����ں��� ���� �޿��� �޴� ������ �̸��� �޿��� ��ȸ�Ͻÿ�.


10. �޿��� ���� ���� ���� 6��°���� 10��° ������ ����Ͻÿ�.



