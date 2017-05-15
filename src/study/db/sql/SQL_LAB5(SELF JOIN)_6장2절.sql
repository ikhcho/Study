select * from tab
select * from employees

-- SELF JOIN
1. ������ �̸��� ������ �̸��� ��ȸ�Ͻÿ�.
select e.first_name ����, m.first_name ������
from employees e, employees m
where e. manager_id = m.employee_id

select e.first_name ����, m.first_name ������
from employees e join employees m on(e. manager_id = m.employee_id)


2. ������ �̸��� ������ �̸��� ��ȸ�Ͻÿ�.
�����ڰ� ���� ���������� ��� ����Ͻÿ�.
select e.first_name ����, m.first_name ������
from employees e, employees m
where e. manager_id = m.employee_id(+)

select e.first_name ����, m.first_name ������
from employees e left join employees m on(e. manager_id = m.employee_id)

3. ������ �̸��� �����ڰ� �����ϴ� ������ ���� ��ȸ�Ͻÿ�.
��, ������������ 3�� �̻��� �����ڸ� ��µǵ��� �Ͻÿ�.
select m.first_name ������, count(m.first_name)�����Ǽ�
from employees e, employees m
where e. manager_id = m.employee_id(+)
group by m.first_name
having count(m.first_name) >=3

select m.first_name ������, count(m.first_name)�����Ǽ�
from employees e left join employees m on(e. manager_id = m.employee_id)
group by m.first_name
having count(m.first_name) >=3
