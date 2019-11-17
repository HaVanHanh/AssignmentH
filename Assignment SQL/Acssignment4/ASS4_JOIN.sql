-- +------------------------------------------------------+
-- Exercise 1:Cho table sau:
-- Department (Department_Number, Department_Name)
-- Employee_Table (Employee_Number, Employee_Name,
-- Department_Number)
-- Employee_Skill_Table (Employee_Number, Skill_Code, Date Registered)
-- +------------------------------------------------------+
DROP DATABASE  IF  EXISTS	Assignment4 ;
CREATE DATABASE 		Assignment4;
USE 				Assignment4;
CREATE TABLE Department (
    Department_Number SMALLINT AUTO_INCREMENT PRIMARY KEY,
    Department_Name VARCHAR(30) NOT NULL
);

DROP TABLE IF EXISTS Employee_Table;
CREATE TABLE Employee_Table (
    Department_Number SMALLINT NOT NULL,
    Employee_Number SMALLINT AUTO_INCREMENT PRIMARY KEY,
    Employee_Name VARCHAR(50) NOT NULL,
    FOREIGN KEY (Department_Number)
        REFERENCES Department (Department_Number)
);

DROP TABLE IF EXISTS 		Employee_Skill_Table;
CREATE TABLE Employee_Skill_Table (
    Employee_Number SMALLINT NOT NULL,
    Skill_Code CHAR(10) NOT NULL,
    Date_Registered DATE NOT NULL,
    FOREIGN KEY (Employee_Number)
        REFERENCES Employee_Table (Employee_Number)
);
 
-- Question 2: Thêm ít nhất 10 bản ghi vào table

INSERT INTO Department (Department_Name)
VALUE  		('P1'),
			('P2'),
			('P3'),
			('P4'),
			('P5'),
			('P6'),
			('P7'),
			('P8'),
			('P9'),
			('P10');

INSERT INTO Employee_Table 
	(Department_Number,	Employee_Name)
VALUE
			(1,			'NGUYEN THI QUYNH'),
			(1,			'NGUYEN THI AN'),
			(1,			'NGUYEN THI LAN'),
			(1,			'NGUYEN THI HOA'),
			(2,			'NGUYEN THI HUYNH'),
			(3,			'NGUYEN THI TRANG'),
			(4,			'NGUYEN THI TU'),
			(5,			'NGUYEN THI HOANG'),
			(7,			'NGUYEN THI PHUONG'),
			(7,			'NGUYEN TUAN TRUONG');

INSERT INTO Employee_Skill_Table
			(Employee_Number ,	Skill_Code, Date_Registered)
VALUE
			(1 ,		'java',			'2018-09-12'),
                	(1 ,		'HTML',			'2018-09-12'),
                	(1 ,		'CSS',			'2018-09-12'),
                	(2 ,		'java ',		'2018-09-12'),
                	(3 ,		'java',			'2018-09-12'),
                	(4 ,		'java',			'2018-09-12'),
                	(5 ,		'python',		'2018-09-12'),
                	(6 ,		'java_scrip',	'2018-09-12'),
                	(7 ,		'ruby',			'2018-09-12'),
                	(8 ,		'c#',			'2018-09-12'),
					(9 ,		'html',			'2018-09-12'),
					(10 ,		'c',			'2018-09-12');
                    
                    
-- Question 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java
USE 			Assignment4;
SELECT 
    *
FROM
    employee_skill_table AS EK
        INNER JOIN
    employee_table AS ET ON EK.Employee_Number = ET.Employee_Number
        AND EK.Skill_Code = 'java';

-- so sánh = .. và so sánh LIKE thì cái nào nhanh hơn hả anh 
-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT 
    De.Department_Name,
    COUNT(Em.Department_Number) AS Number_Of_Employee
FROM
    Department AS De
        INNER JOIN
    employee_table AS Em ON De.Department_Number = Em.Department_Number
GROUP BY (De.Department_Number)
HAVING COUNT(Em.Department_Number) > 3;


-- Question 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban.

SELECT 
    D.Department_Number, Em.Employee_Number, Em.Employee_Name
FROM
    Department AS D
        INNER JOIN
    employee_table AS Em ON Em.Department_Number = D.Department_Number
GROUP BY Em.Employee_Name , D.Department_Number;


-- Question 6: Viết lệnh để lấy ra danh sách nhân viên có > 1 skills.
SELECT 
    Em.*, COUNT(Em_Skill.Employee_Number) AS NumberOfSkillCode
FROM
    employee_table AS Em,
    Employee_Skill_Table AS Em_Skill
WHERE
    Em.Employee_Number = Em_Skill.Employee_Number
GROUP BY (Em.Employee_Number)
HAVING COUNT(Em_Skill.Employee_Number) > 1;
    

    
