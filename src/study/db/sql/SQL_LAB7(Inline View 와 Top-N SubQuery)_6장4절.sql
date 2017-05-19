==========================================
	Inline View �� Top-N SubQuery
==========================================

1. �޿��� ���� ���� �޴� ���� 5���� ���� ������ ��ȸ�Ͻÿ�.

-- rownum�� order by ������ row�� ���ڰ� �ް��� �ǹ̰� ���� (X)
select rownum, first_name, salary
from employees
where rownum<=5
order by 3 desc

select rownum, first_name, salary
from (select first_name, salary from employees order by 2 desc)
where rownum<=5

select *
from (select rownum grade, first_name, salary
	 from (select first_name, salary from employees order by 2 desc))
where grade=5

2. Ŀ�̼��� ���� ���� �޴� ���� 3���� ���� ������ ��ȸ�Ͻÿ�.

select *
from (select * from employees order by commission_pct desc nulls last)
where rownum<=3


3. ���� �Ի��� ���� ��ȸ�ϵ�, �Ի��� ���� 5�� �̻��� ���� ����Ͻÿ�.
select *
from(
	select to_char(hire_date, 'mm') ��, count(*)
	from employees 
	group by to_char(hire_date,'mm')
	having count(5)>=5
	order by 2 desc)
where rownum<=3

4. �⵵�� �Ի��� ���� ��ȸ�Ͻÿ�. 
��, �Ի��ڼ��� ���� �⵵���� ��µǵ��� �մϴ�.
select *
from (
		select to_char(hire_date, 'yyyy') �⵵, count(*)
		from employees 
		group by to_char(hire_date,'yyyy')
		order by 2 desc)
where rownum<=3


