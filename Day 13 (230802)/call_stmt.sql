create schema training;

use training;

CREATE TABLE trainees (
  student_id int NOT NULL AUTO_INCREMENT,
  student_name varchar(30) NOT NULL,
  student_fees double NOT NULL,
  student_course varchar(15) NOT NULL,
  PRIMARY KEY (student_id)
);

INSERT INTO trainees VALUES 
(1,'Jay',10000,'Java'),
(2,'Yash',12000,'Java'),
(3,'Ram',8000,'PHP'),
(4,'Megha',10000,'Python'),
(5,'Sapna',11000,'Java'),
(6,'Madhav',9000,'PHP'),
(7,'Harsh',6000,'PHP'),
(8,'Jitesh',7000,'Java');