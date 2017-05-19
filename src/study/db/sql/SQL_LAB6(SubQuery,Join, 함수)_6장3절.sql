========================================
		SubQuery
========================================
select * from tab
select * from employees
select * from jobs
select * from locations
select * from departments
select * from countries

1. 직원들의 이름, 입사일, 부서명을 조회하시오.
단, 부서가 없는 직원이 있다면 그 직원정보도 출력결과에 포함시킨다.
그리고 부서가 없는 직원에 대해서는 '<부서없음>' 이 출력되도록 한다.
(outer-join , nvl() )
select e.first_name 이름, e.hire_date 입사일, nvl(d.department_name,'<부서없음>') 부서명
from employees e left outer join departments d on(e.department_id = d.department_id)


2. 직원의 직책에 따라 월급을 다르게 지급하려고 한다.
직책에 'Manager'가 포함된 직원은 급여에 0.5를 곱하고
나머지 직원들에 대해서는 원래의 급여를 지급하도록 한다. 
적절하게 조회하시오. (decode)
select e.first_name 이름, e.hire_date 입사일, j.job_title 직책, decode(substr(j.job_title,-7,7), 'Manager', e.salary*0.5, e.salary) 급여
from employees e left outer join jobs j on(e.job_id = j.job_id)

select e.first_name 이름, e.hire_date 입사일, j.job_title 직책, case when job_title like '%Manager' then salary*0.5 else salary end 급여
from employees e left outer join jobs j on(e.job_id = j.job_id)

3. 각 부서별로 최저급여를 받는 직원의 이름과 부서id, 급여를 조회하시오.
select first_name 이름, department_id 부서id, salary 급여
from employees
where (salary, department_id) in (select min(salary), department_id from employees group by department_id)

-----------------------------------------------------------------------------------------
-- 자신이 속한 부서의 평균 급여보다 급여가 적은 직원들을 대상으로 부서 이름 별 직원 수를 출력하시오
-- 출력결과는 부서이름을 오름차순 정렬해야 한다.
select department_name, count(*) 직원수
from employees emp, (select department_id, avg(salary) avgsal from employees group by department_id) aa, departments
where emp.department_id = aa.department_id
and salary<avgsal
and emp.department_id = departments.department_id
group by department_name
order by 1

-------------------------------------------------------------------------------------------------------


4. 각 직급별(job_title) 인원수를 조회하되 사용되지 않은 직급이 있다면 해당 직급도
출력결과에 포함시키시오. 그리고 직급별 인원수가 3명 이상인 직급만 출력결과에 포함시키시오.
select j.job_title  직급, count(e.job_id) 인원수
from jobs j left outer join employees e on(j.job_id = e.job_id)
group by j.job_title
having count(e.job_id) >=3


5. 각 부서별 최대급여를 받는 직원의 이름, 부서명, 급여를 조회하시오.
select e.first_name 이름, d.department_name 부서명, e.salary 급여
from employees e join departments d on(e.department_id = d.department_id)
where (e.department_id, e.salary) in (select department_id, max(salary) from employees group by department_id)

6. 직원의 이름, 부서id, 급여를 조회하시오. 그리고 직원이 속한 해당 부서의 
최소급여를 마지막에 포함시켜 출력 하시오.
select first_name 이름, department_id 부서id, salary 급여, (select min(salary)
															from employees 
															where department_id = emp.department_id) 최소급여
from employees emp

--
select emp.first_name 이름, emp.department_id 부서id, salary 급여, mintb.minsal
from employees emp, (select min(salary) minsal, department_id from employees group by department_id) mintb
where emp.department_id = mintb.department_id

 


