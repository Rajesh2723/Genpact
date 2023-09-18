# Query to fetch/get/retrieve data
#select <column-name> from <table-name> where <condition>
#getting all columns of all records
select * from students;

select student_name , student_course from students;

select student_name, student_course from students where student_id > 104;

select * from students where course_enrollment_date > '2023-09-01';

select student_name, student_course, course_enrollment_date 
from students
where course_enrollment_date >= '2023-05-16' 
and student_course like '%Java%';

select student_name, student_course, course_enrollment_date 
from students
where course_enrollment_date >= '2023-07-16' 
or student_course like '%Java%';

select student_name, course_enrollment_date from students 
where course_enrollment_date 
between '2023-01-01' and '2023-07-27' 
order by course_enrollment_date desc;

#Aggregate functions-count, sum, min, max, avg
select count(*) from students;

select count(*) from students where student_course like '%Java%';

select min(course_fees) from students;

select max(course_enrollment_date) from students;

select sum(course_fees) from students;

select avg(course_fees) from students;