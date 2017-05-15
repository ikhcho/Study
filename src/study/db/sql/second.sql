--function

select lower('ORACLE') 소문자로변경,
		upper('oracle java') "대문자로 변경",
		initcap('oracle java') "단어의 첫글자 대문자",
		concat(concat('oracle', 'java'), 'web') 연결,
		'oracle'||'java'||'web' 연결2
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