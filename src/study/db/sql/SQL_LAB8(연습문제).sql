select * from tab
select * from employees
select * from jobs
select * from locations
select * from departments
select * from countries

<< 연습문제 >>
1. 'Southlake'에서 근무하는 직원의 이름, 급여, 직책(job_title)을 조회하시오.
select e.first_name 이름, e.salary 급여, j.job_title 직책
from employees e, jobs j, locations l, departments d
where e.department_id = d.department_id and d.location_id = l.location_id and l.city = 'Southlake' and e.job_id = j.job_id 
-- 5건

2. 국가별 근무 인원수를 조회하시오. 단, 인원수가 3명 이상인 국가정보만 출력되어야함.
select c.country_name 국가, count(e.first_name)
from employees e, countries c, locations l, departments d
where e.department_id = d.department_id and d.location_id = l.location_id  and c.country_id = l.country_id
group by c.country_name
having count(e.first_name)>=3
-- 2건

3. 직원의 이름, 급여, 직원의 관리자 이름을 조회하시오. 단, 관리자가 없는 직원은
   '<관리자 없음>'이 출력되도록 해야 한다.
select e.first_name 이름, e.salary 급여, nvl(m.first_name,'<관리자 없음>') 관리자
from employees e, employees m
where e.manager_id = m.employee_id(+)


4. 직원의 이름, 부서명, 근무년수를 조회하되, 20년 이상 장기 근속자만 출력되록한다.
select e.first_name 이름, d.department_name 부서명, months_between(sysdate,hire_date)/12 근무년수
from employees e, departments d
where e.department_id = d.department_id and months_between(sysdate,hire_date)/12 >=10



5. 각 부서 이름별로 최대급여와 최소급여를 조회하시오. 단, 최대/최소급여가 동일한
   부서는 출력결과에서 제외시킨다.
select d.department_name 부서명, max(e.salary) 최대급여, min(e.salary) 최소급여
from employees e, departments d
where e.department_id = d.department_id
group by d.department_name
having  max(e.salary) != min(e.salary)




6. 자신이 속한 부서의 평균급여보다 많은 급여를 받는 직원정보만 조회하시오.
   단, 출력결과에 자신이 속한 부서의 평균 급여정보도 출력되어야한다. 
select first_name
from employees
where salary >= (select avg(e.salary) from employees e, departments d
where e.department_id = d.department_id group by d.department_id)




7. '월'별 최대급여자의 이름, 급여를 조회하시오.







8. 부서별, 직급별, 평균급여를 조회하시오. 
   단, 평균급여가 50번부서의 평균보다 많은 부서만 출력되어야 합니다.






9. 자신의 관리자보다 많은 급여를 받는 직원의 이름과 급여를 조회하시오.


10. 급여가 가장 많은 직원 6번째부터 10번째 직원만 출력하시오.



