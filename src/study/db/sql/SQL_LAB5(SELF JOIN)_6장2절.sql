select * from tab
select * from employees

-- SELF JOIN
1. 직원의 이름과 관리자 이름을 조회하시오.
select e.first_name 직원, m.first_name 관리자
from employees e, employees m
where e. manager_id = m.employee_id

select e.first_name 직원, m.first_name 관리자
from employees e join employees m on(e. manager_id = m.employee_id)


2. 직원의 이름과 관리자 이름을 조회하시오.
관리자가 없는 직원정보도 모두 출력하시오.
select e.first_name 직원, m.first_name 관리자
from employees e, employees m
where e. manager_id = m.employee_id(+)

select e.first_name 직원, m.first_name 관리자
from employees e left join employees m on(e. manager_id = m.employee_id)

3. 관리자 이름과 관리자가 관리하는 직원의 수를 조회하시오.
단, 관리직원수가 3명 이상인 관리자만 출력되도록 하시오.
select m.first_name 관리자, count(m.first_name)직원의수
from employees e, employees m
where e. manager_id = m.employee_id(+)
group by m.first_name
having count(m.first_name) >=3

select m.first_name 관리자, count(m.first_name)직원의수
from employees e left join employees m on(e. manager_id = m.employee_id)
group by m.first_name
having count(m.first_name) >=3
