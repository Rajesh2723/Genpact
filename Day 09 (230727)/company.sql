create schema company;
create table employees (
id int not null, 
name varchar(15), 
primary key (id));
insert into employees values 
(1, 'Harsh'),
(2, 'Madhav'),
(3, 'Megha'),
(4, 'Sapna'),
(5, 'Jitesh');
truncate table employees;
drop table employees;
drop schema company;

