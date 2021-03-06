========================================
		JOIN
========================================
select * from tab
select * from employees
select * from emp_details_view
select * from jobs
select * from countries
select * from departments
select * from regions
select * from locations

1.직원들의 이름과 직급명(job_title)을 조회하시오.
select e.first_name, j.job_title
from employees e, jobs j
where e.job_id = j.job_id
--107건

2.부서이름과 부서가 속한 도시명(city)을 조회하시오.
select d.department_name, l.city
from departments d, locations l
where d.location_id = l.location_id
--27건

3. 직원의 이름과 근무국가명을 조회하시오. (employees, departments, locations,countries)
select e.first_name, c.country_name
from employees e, departments d, countries c, locations l
where e.department_id = d.department_id and d.location_id = l.location_id and l.country_id = c.country_id
--106건

4. 직책(job_title)이 'manager' 인 사람의 이름, 직책, 부서명을 조회하시오.
select e.first_name, j.job_title, d.department_name
from employees e, jobs j, departments d
where e.job_id = j.job_id and e.department_id = d.department_id and j.job_title like '%Manager'
--14건

5. 직원들의 이름, 입사일, 부서명을 조회하시오.
select e.first_name 이름, e.hire_date 입사일, d.department_name 부서명
from employees e, departments d
where e.department_id = d.department_id
--106건

6. 직원들의 이름, 입사일, 부서명을 조회하시오.
단, 부서가 없는 직원이 있다면 그 직원정보도 출력결과에 포함시킨다.
select e.first_name 이름, e.hire_date 입사일, d.department_name 부서명
from employees e, departments d
where e.department_id = d.department_id(+)


7. 직원의 이름과 직책(job_title)을 출력하시오.
단, 사용되지 않는 직책이 있다면 그 직책정보도 출력결과에 포함시키시오.
select e.first_name 이름, j.job_title 직책
from employees e, jobs j
where e.job_id(+) = j.job_id


