update students set course_fees = 7200 where student_id = 101;

update students 
set student_email = 'madhuri_007@gmail.com' 
where student_email = 'madhuri@yahoo.com';

update students set student_course = 'Microservices', course_fees = 20000
where student_id = 107; 

delete from students where student_id = 106;