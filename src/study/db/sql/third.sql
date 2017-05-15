--단일행함수 : 1건 주면 1건 반납
select abs(-200)
form emp;

--그룹함수
select sum(sal) 합계, avg(sal) 평균, 
		sum(sal)/count(sal) 평균2,
		count(empno), count(comm), count(*),
		max(sal),min(sal)
from emp

select sum(comm)
from emp
where comm is not null

select ename, sum(sal)
from emp
group by ename

-- 집계함수를 사용하지 않은 칼럼이 select에 온다면 반드시 group by에 작성해야한다.
select deptno, job, sum(sal)
from emp
group by rollup(deptno, job)
order by 1,2

select ename, max(hiredate) 최근입사, min(hiredate) 가장오래된입사
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

--부서별 평균급여..... 그룹함수의 결과를 조건에 참여할때 having
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

-- equi join(db벤더)
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

select e.ename 이름, m.ename
from emp e, emp m
where e.mgr = m.empno and m.ename = 'KING'

SCOTT과 동일한 근무지에서 근무하는 사원의 이름을 출력하시오

select e.ename 이름, m.ename
from emp e, emp m
where e.deptno = m.deptno and e.ename = 'SCOTT' and m.ename<>'SCOTT'

select *
from emp
where deptno = (select deptno from emp where ename = 'SCOTT')