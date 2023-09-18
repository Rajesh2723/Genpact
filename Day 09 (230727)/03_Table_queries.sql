# Copying the table structure into a new table (data not copied)
create table students_2 like students;

# Copying the table structure and the data
create table students_3 select * from students; 

# Copying specific columns from the table and adding some more columns
create table courses 
(course_id int not null auto_increment, 
primary key (course_id))
select student_course, course_fees from students;

#shows the query that created the table
show create table courses;