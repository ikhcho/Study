--function

select lower('ORACLE') �ҹ��ڷκ���,
		upper('oracle java') "�빮�ڷ� ����",
		initcap('oracle java') "�ܾ��� ù���� �빮��",
		concat(concat('oracle', 'java'), 'web') ����,
		'oracle'||'java'||'web' ����2
from dual


select *
from emp
where job = upper('manager')
------------------------------------
select *
from emp
where lower(job) = 'manager'


select *
from jobs
where job_title like '%Manager'