--DDL
create table student2(id number, name varchar(30));
create table student3(id number, name varchar2(7), name2 char(7));

--Query
select * from student3;

--DML
insert into student2 values(1,'조익현');
insert into student3 values(1,'조익현','익현');

select 40*2 from dual; -- 더미테이블 dual

select 10/5,sysdate from dual;

select '직원정보', employee_id as "아 이 디" from EMPLOYEES --'' : 문자값(literal), "" : 이름
-- "employee_id" 모든 글은 데이터사전에 저장될때 대문자로 저장된다.
-- 소문자를 사용하고 싶으면 "소문자"로 사용하며 기존에 저장된 값은 "소문자"로는 찾을수 없다
-- 별명은 as 생략가능, 별명에 특수 문자 삽입시 ""사용해야함

select ename, hiredate 입사일
from EMP
where deptno = 10
order by 입사일 desc -- order by (칼람명or칼람순서) desc(내림 or ASC(올림))

select ename, sal, comm, sal+sal*nvl(comm,0)/100 as total -- nvl(값1,값2) 값1이 null이면 값2로 변환
from emp
order by comm -- desc nulls last -- nulls first

select ename || '직업은' || job || '입니다' 직원소ro
from emp

--1981년 1월1일 이후 입사자
select ename
from emp
where hiredate >= '81/01/01'

select ename, hiredate, to_char(hiredate,'MM/DD/YYYY')||'년도입사' "입사일"
from emp
where to_char(hiredate,'MM/DD/YYYY')>='01/01/1981'

insert into emp values(7999,'test','test',7777,'1981/01/01',77,77,30)
insert into emp values(7998,'test2','test2',7777,'1981/12/31',77,77,30)

--1981년 입사자
select *
from EMP
where hiredate between '1981/01/01' and '1981/12/31'
where hiredate between '1981/01/01' and '1982/01/01'

--NOT > AND > OR
select *
from emp
where NOT deptno = 10 or deptno =20 and sal>=1500


select *
from emp
where comm in(300,500,1400)
--where comm=300 or comm=500 or comm=1400
--where comm NOT in(300,500,1400)
--where comm = null 안됨 => where comm is not null

select *
from emp
--where ename like '%A%'
--where ename like '_A%'
--where ename like '_____'
where ename like 'A%'