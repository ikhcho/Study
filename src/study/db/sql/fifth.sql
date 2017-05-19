--제약조건

select 

create table emp_copy
as
select * from emp

alter table emp_copy
add constraint emp_dopy_pk primary key(empno)

create table dept01 as select * from dept

create table emp01(
	empno number(4) constraint emp01_empno_pk primary key,
	ename varchar2(10) constraint emp01_ename_nn not null,
	job varchar2(9),
	deptno number(4) constraint emp01_deptno_fk references dept01(deptno)
);

select * from dept01

alter table emp01
disable constraint emp01_deptno_fk;

create or replace view dept_emp
as
select ename, dname
from emp,DEPTwhere emp.deptno = dept.deptno

-----------------------------------------------------------------------------------------

create table indextest as select * from emp

insert into indextest select * from indextest

select * from indextest
where ename ='SCOTT'


create index idx_indextest_ename on indextest(ename)


----------------------------------------------------------
set serveroutput on

declare
v_empno number(4) := 100;
v_name varchar2(10) := 'name';
v_deptno emp.deptno%type;
v_job emp.job%type;
v_emprec emp%rowtype;
begin
dbms_output.put_line(v_empno);
dbms_output.put_line(v_name);
v_empno := 300;
v_name := 'blue';
dbms_output.put_line(v_empno);
dbms_output.put_line(v_name);


end;
/