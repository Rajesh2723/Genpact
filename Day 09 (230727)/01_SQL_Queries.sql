create database school;

create table students(
_id int not null auto_increment,
name varchar(45) null,
email varchar (45) null,
course varchar(45) not null,
fees varchar(45) not null,
enrollment_date date not null,
primary key (_id),
unique index email_unique (email) visible
);

alter table students
change column _id student_id int not null,
change column name student_name varchar(30) not null,
change column email student_email varchar(30) not null,
change column course student_course varchar(20) null,
change column fees course_fees double null,
change column enrollment_date course_enrollment_date date null,
ADD UNIQUE INDEX `student_email_UNIQUE` (`student_email`) VISIBLE;
;

insert into students
values
(104, 'Ashutosh', 'ashu@hotmail.com', 'Advanced Python', 18000, '2023-09-09'),
(105, 'Devesh', 'dev@gmail.com', 'Java Spring', 25000, '2023-10-01'),
(106, 'Ketan', 'keta@yahoo.com', 'Java Hibernate', 7000, '2023-07-27'),
(107, 'Ritu', 'ritu@rediff.com', 'Spring Boot', 15000, '2023-06-12'),
(108, 'Ruchi', 'ruchi@gmail.com', 'Spring MVC', 12000, '2023-08-15');

#YYYY-MM-DD => ISO Format