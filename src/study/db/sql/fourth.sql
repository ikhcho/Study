---DDL

CREATE table sam02(id number, mycol interval year(3) to month);

insert into sam02(id, mycol) values(1, interval '36' month(3));

insert into sam02(id, mycol) values(1, interval '5' year(3));

select id,mycol, sysdate+mycol "3년후"
from sam02

select id,mycol, sysdate+mycol
from sam02
---------------------------------------------------------------------------------------------------------------------

CREATE table sam03(day01 interval day(3) to second);

insert into sam03 values(interval '100' day(3));

select day01, sysdate+day01 "100일후"
from sam03

---------------------------------------------------------------------------------------------------------------------

create table emp01(empno number(4), ename varchar2(20), sal number(7,2));

insert into emp01 values(123,'비트컴퓨터',123.12);

insert into emp01 values(1234,'비트컴퓨터ㅍㅍㅍ',123.12);

select * from emp01

---------------------------------------------------------------------------------------------------------------------

create table emp02(차 char(20), 바차1 varchar(20), 바차2 varchar2(20));

insert into emp02 values('a','a','a');
insert into emp02 values('aaaaaaaaaaaaaaaaaaaa','aaaaaaaaaaaaaaaaaaaa','aaaaaaaaaaaaaaaaaaaa');

select '$'||차||'$', '$'||바차1||'$', '$'||바차2||'$' from emp02
select * from emp02 where 차 ='a'
select * from emp02 where 바차1 ='a'
select * from emp02 where 바차2 ='a'

select * from emp02 where 차 ='a  ' --O
select * from emp02 where 바차1 ='a  ' --X
select * from emp02 where 바차2 ='a  ' --X

---------------------------------------------------------------------------------------------------------------------

create table emp03 as select * from emp02;

alter table emp03 add (mgr number(4))

alter table emp03 modify(mgr varchar2(4))

alter table emp03 set unused(차)

alter table emp03 drop unused column
select * from emp03

---------------------------------------------------------------------------------------------------------------------

truncate table emp03;
rename emp03 to emp04;
select * from emp04

SELECT OWNER, TABLE_NAME FROM ALL_TABLES;

create table sam01 as select empno, ename, job, sal from emp where 0=1

insert into sam01 values(1000,'apple','police',10000)

insert into sam01 (empno)values(1000);
insert into sam01 values(2000,null,null,null);

select * from sam01

insert into sam01 select empno, ename, job, sal from emp where rownum<=3

---------------------------------------------------------------------------------------------------------------------

create table emp_hire as select * from emp where 1=10
create table emp_mgr as select * from emp where 1=10

insert all 
	into emp_hire(empno, ename, hiredate) values(empno, ename, hiredate) 
	into emp_mgr(empno, ename, mgr) values(empno, ename, mgr)
select empno, ename, mgr, hiredate from emp

select * from emp_hire
select * from emp_mgr

---------------------------------------------------------------------------------------------------------------------

create table dept02 as select * from dept

update dept02 set loc = (select loc from dept02 where deptno=40) where deptno=20

select * from dept02