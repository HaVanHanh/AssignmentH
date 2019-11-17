/**************************ASSIGNMENT 7*********************************

Exercise 1: Tiếp tục với Database ở buổi 6
Viết triggers để tránh trường hợp người dùng nhập thông tin 
module Project không hợp lệ
(Project_Modules.ProjectModulesDate < Projects.ProjectStartDate,
Project_Modules.ProjectModulesCompletedOn > Projects.ProjectCompletedOn)
************************************************************************/
USE ASSIGNMENT6;

DROP TRIGGER IF EXISTS Check_In_ModuneProject ;
DELIMITER $$
	CREATE TRIGGER Check_In_ModuneProject BEFORE INSERT ON Project_Modules
       FOR EACH ROW
       BEGIN
          DECLARE 	ProjectModulesDate 			DATE;
          DECLARE 	ProjectModulesCompletedOn 	DATE;
          DECLARE 	ProjectStartDate 			DATE;
          DECLARE 	ProjectCompletedOn 			DATE;
          
          SET 		ProjectModulesDate 			= NEW.ProjectModulesDate ; 
          SET 		ProjectModulesCompletedOn 	= NEW.ProjectModulesCompledOn;
          
          SELECT 	ProjectStartDate	INTO ProjectStartDate 
          FROM		Projects ;
          SELECT 	ProjectCompletedOn	INTO ProjectCompletedOn
          FROM	 	Projects ;
          
          IF ((ProjectModulesDate < ProjectStartDate) OR ( ProjectModulesCompletedOn > ProjectCompletedOn ))THEN
          SIGNAL SQLSTATE '12345'
			SET MESSAGE_TEXT='Nhập ngày tháng của Project Modune không hợp lệ , so sánh với thông tin ngày tháng trong Project';
            
			END IF;
       END;$$
DELIMITER ;


INSERT  INTO `assignment6`.project_modules 
(ModuleID,		ProjectID,		EmployeeID,		ProjectModulesDate,		ProjectModulesCompledOn,	ProjectModulesDescription)
VALUE
(1.4,			1,				4,				'2019-12-05',			'2019-12-05',				'123');


/*
Exercise 2: View
Trong database phần Assignment 3, Tạo 1 VIEW để lấy ra tất cả các thực tập sinh là
ET, 1 ET thực tập sinh là những người đã vượt qua bài test đầu vào và thỏa mãn số
điểm như sau:
 ET_IQ + ET_Gmath>=20
 ET_IQ>=8
 ET_Gmath>=8
 ET_English>=18

*/
USE FRESHER;
DROP VIEW IF EXISTS Fresher_OK;
CREATE VIEW Fresher_OK
   AS
SELECT *
FROM trainee
WHERE ET_IQ + ET_Gmath>=20 AND ET_IQ>=8 AND ET_Gmath>=8 AND  ET_English>=18;


