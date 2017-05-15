--�������Լ� : 1�� �ָ� 1�� �ݳ�
select abs(-200)
form emp;

--�׷��Լ�
select sum(sal) �հ�, avg(sal) ���, 
		sum(sal)/count(sal) ���2,
		count(empno), count(comm), count(*),
		max(sal),min(sal)
from emp

select sum(comm)
from emp
where comm is not null

select ename, sum(sal)
from emp
group by ename

-- �����Լ��� ������� ���� Į���� select�� �´ٸ� �ݵ�� group by�� �ۼ��ؾ��Ѵ�.
select deptno, job, sum(sal)
from emp
group by rollup(deptno, job)
order by 1,2

select ename, max(hiredate) �ֱ��Ի�, min(hiredate) ����������Ի�
from emp
group by ename, deptno

select count(*)
from emp
where deptno = 10

select count(distinct job)
from emp

select job,count(job)
from emp
group by job

--�μ��� ��ձ޿�..... �׷��Լ��� ����� ���ǿ� �����Ҷ� having
select deptno, avg(sal)
from emp
where sal>100
group by deptno
having avg(sal)>=2000
order by 1


select deptno, max(sal), min(sal),(select ename from emp where ename=like 'A%')
from EMP,(select deptno from emp)
where (select )
group by deptno 
having max(sal)>=3000



-- join

--cross join
select *
from emp, dept

-- equi join(db����)
select empno, ename, dept.deptno
from emp, dept
where emp.deptno = dept.deptno

--Ansi join
select empno, ename, deptno
from emp join dept using (deptno)

select empno, ename, emp.deptno
from emp join dept on emp.deptno = dept.deptno
where emp.deptno>=10

select first_name, salary, department_name, job_title
from employees e, departments d, jobs j
where e.department_id = d.department_id and e.job_id = j.job_id

select first_name, salary, department_name, job_title
from employees e join departments d on e.department_id = d.department_id
	join jobs j on e.job_id = j.job_id
	
select *
from emp, salgrade
where emp.sal between salgrade.losal and salgrade.hisal

select *
from emp join salgrade
on emp.sal between salgrade.losal and salgrade.hisal

create table salgrade (grade number, losal number, hisal number)

insert into salgrade values(1,2000,4000);
insert into salgrade values(2,4001,5000);
insert into salgrade values(3,5001,7000);
insert into salgrade values(4,7001,10000);
insert into salgrade values(5,10001,2000);


select employees.first_name, salgrade.grade
from employees, salgrade
where employees.salary between salgrade.losal and salgrade.hisal

select *
from emp

select e.ename �̸�, m.ename
from emp e, emp m
where e.mgr = m.empno and m.ename = 'KING'

SCOTT�� ������ �ٹ������� �ٹ��ϴ� ����� �̸��� ����Ͻÿ�

select e.ename �̸�, m.ename
from emp e, emp m
where e.deptno = m.deptno and e.ename = 'SCOTT' and m.ename<>'SCOTT'

select *
from emp
where deptno = (select deptno from emp where ename = 'SCOTT')