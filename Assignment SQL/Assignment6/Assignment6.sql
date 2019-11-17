/*---------------------------------------------------
					SQL – Assignment 6
-----------------------------------------------------*/

-- Tạo table với các ràng buộc và kiểu dữ liệu và thêm ít nhất 3 bản ghi vào mỗi table trên
DROP DATABASE IF  EXISTS 		Assignment6;
CREATE DATABASE 			Assignment6;
USE 					Assignment6;

CREATE TABLE Employee (
    EmployeeID SMALLINT AUTO_INCREMENT PRIMARY KEY,
    EmployeeLastName VARCHAR(20) NOT NULL,
    EmployeeFirstName VARCHAR(20) NOT NULL,
    EmployeeHireDate DATE,
    EmployeeStatus ENUM('1', '0'),
    SupervisorID SMALLINT NOT NULL,
    SocialSecurityNumber INT,
    FOREIGN KEY (SupervisorID)
        REFERENCES Employee (EmployeeID)
);

CREATE TABLE Projects (
    ProjectID SMALLINT AUTO_INCREMENT PRIMARY KEY,
    EmployeeID SMALLINT NOT NULL,
    ProjectName VARCHAR(50) NOT NULL,
    ProjectStartDate DATE,
    ProjectDescription VARCHAR(1000),
    ProjectDetailt VARCHAR(1000),
    ProjectCompletedOn DATE,
    FOREIGN KEY (EmployeeID)
    REFERENCES Employee (EmployeeID) ON DELETE CASCADE
);
/*	ProjectModulesDate: ngày nhân viên hoàn thành module (theo kế hoạch).
	ProjectCompletedOne: ngày thời gian hoàn thành project
    ProjectModulesCompletedOn: ngày thực tế nhân viên hoàn thành module.
*/
CREATE TABLE Project_Modules (
    ModuleID FLOAT PRIMARY KEY,
    ProjectID SMALLINT NOT NULL,
    EmployeeID SMALLINT NOT NULL,
    ProjectModulesDate DATE,
    ProjectModulesCompledOn DATE,
    ProjectModulesDescription VARCHAR(1000),
    FOREIGN KEY (EmployeeID)
    REFERENCES Employee (EmployeeID) ON DELETE CASCADE,
    FOREIGN KEY (ProjectID)
    REFERENCES Projects (ProjectID)  ON DELETE CASCADE
);
CREATE TABLE Work_Done (
    WorkDoneID TINYINT AUTO_INCREMENT PRIMARY KEY,
    EmployeeID SMALLINT NOT NULL,
    ModuleID FLOAT NOT NULL,
    WorkDoneDate DATE,
    WorkDoneDescription VARCHAR(1000),
    WorkDoneStatus VARCHAR(20),
    FOREIGN KEY (EmployeeID)
    REFERENCES Employee (EmployeeID) ON DELETE CASCADE,
    FOREIGN KEY (ModuleID)
    REFERENCES Project_Modules (ModuleID) ON DELETE CASCADE
);
-- --------------------------
USE Assignment6;
INSERT INTO Employee 
(EmployeeLastName,	EmployeeFirstName,	EmployeeHireDate,	EmployeeStatus,		SupervisorID,	SocialSecurityNumber)	
('NAM',			'PHAM HOANG',		'2009-09-19',			'1'	,	1,		1710310009),
('THANH',		'NGUYEN TUAN',		'2018-07-29',			'1'	,	2,		1710310010),
('QUYNH',		'NGUYEN THI',		'2017-08-29',			'1'	,	2,		1710310011),
('HOA',			'NGUYEN TUAN',		'2008-07-29',			'1'	,	2,		1710310012),
('THANH',		'NGUYEN VAN',		'2005-09-13',			'0'	,	1,		1710310013),
('HUNG',		'VU TUAN',		'2014-07-29',			'1'	,	1,		1710310014),
('LAN',			'NGUYEN THI',		'2013-07-29',			'1'	,	1,		1710310015),
('QUANG',		'VU TUAN',		'2014-07-29',			'1'	,	1,		1710310016);

SELECT * FROM Employee;
-- --------------------------
USE Assignment6;
INSERT INTO Projects
(EmployeeID,	ProjectName,		ProjectStartDate,	ProjectDescription,		ProjectDetailt,		ProjectCompletedOn)
VAL
(1,		'Office Update',	'2019-05-05',		'Office Update 2019-05',	'Cap nhat',		'2020-01-05'),
(3,		'Windows Update',	'2019-04-05',		'Win Update version 1903',	'Update win base', 	'2019-09-05'),
(7,		'SkyDrive',		'2018-03-05',		'Update Sky',			'PHAN MEM MCS',		'2018-12-05');

USE Assignment6;
INSERT INTO Project_Modules
(ModuleID,	ProjectID,	EmployeeID,	ProjectModulesDate,	ProjectModulesCompledOn,	ProjectModulesDescription)
(1.1,		1,		1,		'2019-05-05',		'2019-08-05',			'Giai doan phan tich thiet ke'),
(1.2,		1,		6,		'2019-08-05',		'2019-11-05',			'Giai doan code'),
(1.3,		1,		7,		'2019-11-05',		'2020-01-05',			'Hoan thanh san pham'
(2.1,		2,		2,		'2019-04-05',		'2019-06-05',			'Giai doan phan tich thiet ke'),
(2.2,		2,		3,		'2019-06-05',		'2019-08-05',			'Giai doan code'),
(2.3,		2,		4,		'2019-08-05',		'2019-09-05',			'Hoan thanh san pham'
(3.1,		3,		2,		'2018-03-05',		'2018-06-05',			'Giai doan phan tich thiet ke'),
(3.2,		3,		3,		'2018-06-05',		'2018-10-05',			'Giai doan code'),
(3.3,		3,		4,		'2018-10-05',		'2018-12-05',			'Hoan thanh san pham');


USE Assignment6;
INSERT INTO Work_Done
(	EmployeeID,		ModuleID,		WorkDoneDate,		WorkDoneDescription,		WorkDoneStatus)
VALUE
(	1,				1.1,			'2019-08-05',		'Giai doan 1',			'Done'	),
(	6,				1.2,			NULL,			'Giai doan 2',			'Working'),
(	7,				1.3,			NULL,			'Giai doan 3',			'Not ready'),

(	2,				2.1,			'2019-06-05',		'Hoan thanh gd 1',		'Done'),
(	3,				2.2,			'2019-08-05',		'Hoan thanh gd 2',		'Done'),
(	4,				2.3,			'2019-09-05',		'Hoan thanh gd 3',		'Done'),
(	2,				3.1,			'2018-06-05',		'Hoan thanh gd 1',		'Done'),
(	3,				3.2,			'2018-10-05',		'Hoan thanh gd 2',		'Done'),
(	4,				3.3,			'2018-12-05',		'Hoan thanh gd 3',		'Done'),
(	8,				3.3,			'2018-12-05',		'Phu giup giai doan 3',		'Done');

/* *****************************************************************
Viết stored procedure (không có parameter) để Remove tất cả thông tin
project đã hoàn thành sau 3 tháng kể từ ngày hiện. In số lượng record 
đã remove từ các table liên quan trong khi removing (dùng lệnh print)
******************************************************************** */


USE Assignment6;
DROP PROCEDURE IF EXISTS Delete_Project;
DELIMITER $$
CREATE PROCEDURE Delete_Project()
BEGIN

SELECT  P.* 
    FROM	Projects AS P
    WHERE	DATEDIFF(CURDATE(),P.ProjectCompletedOn ) >90;
     
DELETE P.* 
    FROM	Projects AS P
    WHERE	DATEDIFF(CURDATE(),P.ProjectCompletedOn )>90;
    
END$$
DELIMITER ;
CALL Assignment6.Delete_Project();

 

/***************************************
 Viết stored procedure (có parameter) để 
 in ra các module đang được thực hiện
*****************************************/
USE Assignment6;
DROP PROCEDURE IF EXISTS ProjectIsRun;
DELIMITER $$
CREATE PROCEDURE ProjectIsRun()
BEGIN
SELECT 	PM.ModuleID
    FROM 	Project_Modules PM 
    WHERE 	PM.ProjectModulesCompledOn > CURDATE();
END ;$$
DELIMITER ;	
CALL Assignment6.ProjectIsRun();
    
/*
d) Viết hàm (có parameter) trả về thông tin 1 nhân viên đã tham gia làm mặc
dù không ai giao việc cho nhân viên đó (trong bảng Works)
*/
SET GLOBAL log_bin_trust_function_creators = 1;
USE Assignment6;
DROP FUNCTION IF EXISTS  EmSupport;
DELIMITER $$
CREATE FUNCTION EmSupport() RETURNS SMALLINT

BEGIN
DECLARE V_EmSP 	SMALLINT;
SELECT 	WD.EmployeeID  INTO V_EmSP
    FROM 	Project_Modules PM 
    RIGHT 	JOIN Work_Done WD ON PM.EmployeeID = WD.EmployeeID
    WHERE	PM.EmployeeID IS NULL ;
    
    RETURN V_EmSP;
END $$
DELIMITER ;
SELECT EmSupport();
