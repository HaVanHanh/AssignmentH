DROP DATABASE IF  EXISTS 		Final_Exam_1;
CREATE DATABASE 				Final_Exam_1;
USE 							Final_Exam_1;

DROP TABLE IF  EXISTS Student;
CREATE TABLE Student(
    RN			INT PRIMARY KEY AUTO_INCREMENT,
    Name		NVARCHAR(50) NOT NULL,
    Age 		TINYINT ,
    Gender 		ENUM('0', '1') 
    );

DROP TABLE IF  EXISTS `Subject`;
CREATE TABLE Subject(
    sID			TINYINT PRIMARY KEY AUTO_INCREMENT,
    sName		NVARCHAR(50) NOT NULL
    );

DROP TABLE IF  EXISTS StudentSubject;
CREATE TABLE StudentSubject(
   RN 			INT ,
   sID 			TINYINT,
   Mark 		FLOAT,
   `Date` 		DATE,
   FOREIGN KEY (RN) REFERENCES Student (RN) ON UPDATE CASCADE ON DELETE CASCADE,
   FOREIGN KEY (sID) REFERENCES `Subject` (sID) ON UPDATE CASCADE
    );
    
/*
a) Tạo table với các ràng buộc và kiểu dữ liệu
Thêm ít nhất 3 bản ghi vào table
*/
-- RN,Name,Age,Gender)
USE Final_Exam_1;
INSERT INTO Student
	(Name,					Age,		Gender)
VALUES 
	('Nguyễn Xuân Trường', 	19, 		'1'),
	('Nguyễn Hoàng Anh', 	19, 		'1'),
	('Đào Đức Khánh', 		19, 		'1');

USE Final_Exam_1;
INSERT INTO `Subject`
	( sName)
VALUE
	('TOÁN'),
    ('LÍ'),
    ('HÓA');

USE Final_Exam_1;
INSERT INTO `StudentSubject`
			( RN,		sID,		Mark,		`Date`)
VALUE
			(1,			1,			9.5,		'2019-02-05'),
            (1,			2,			8.5,		'2019-02-05'),
            (3,			2,			7.0,		'2019-02-05');
            
/*
b) Viết lệnh để
a. Lấy tất cả các môn học không có bất kì điểm nào
b. Lấy danh sách các môn học có ít nhất 2 điểm
*/
-- A
USE 	Final_Exam_1;
SELECT 	Sb.sID, Sb.sName
FROM 	`Subject` Sb
WHERE	Sb.sID NOT IN 
		(	SELECT 	S.sID 
			FROM StudentSubject S);
-- B

SELECT DISTINCT S.sID AS Mark_more_than_2_points

FROM 		StudentSubject S 
GROUP BY 	S.sID
HAVING      COUNT(S.sID)>=2;


/*
c) Tạo "StudentInfo" view có các thông tin về học sinh bao gồm:
RN,sID,Name, Age, Gender, sName, Mark, Date. Với cột Gender show
Male để thay thế cho 0, Female thay thế cho 1 và Unknow thay thế cho
null
*/
DROP VIEW IF  EXISTS StudentInfo;
CREATE VIEW StudentInfo AS
SELECT 		ST.RN,		Sb.sID,	ST.Name,	ST.Age,	ST.Gender,	Sb.sName,	s.Mark, s.`Date`
FROM 		Student ST ,	`Subject` Sb,		StudentSubject	S;

SELECT * FROM StudentInfo;
/*
d) Tạo trigger cho table Subject:
a. Trigger CasUpdate: khi thay đổi data của cột sID, thì giá trị của
cột sID của table StudentSubject cũng thay đổi theo
b. Trigger casDel: Khi xóa 1 student, các dữ liệu của table
StudentSubject cũng sẽ bị xóa theo
*/
-- a
USE Final_Exam_1;
DROP TRIGGER IF EXISTS CasUpdate ;
DELIMITER $$
		CREATE TRIGGER CasUpdate AFTER  UPDATE  ON `Subject`
		FOR EACH ROW
		BEGIN
			UPDATE StudentSubject S
			SET	 S.sID=NEW.sID 
			WHERE S.sID=OLD.sID;
		END;$$
DELIMITER ;

-- chay thử
	UPDATE `Subject` S
	SET S.sID=5
	WHERE S.sID=1;
    
    
    
-- b
USE Final_Exam_1;
DROP TRIGGER IF EXISTS casDel ;
DELIMITER ;
DELIMITER $$
CREATE TRIGGER casDel 
    AFTER DELETE ON Student
    FOR EACH ROW 
BEGIN
   DELETE FROM StudentSubject S
   WHERE S.RN = OLD.RN;
	
END$$
DELIMITER ;
-- CHAY THU 
DELETE FROM Student WHERE RN = 1;

/*
e) Viết 1 thủ tục (có 2 parameters: student name, mark). Thủ tục sẽ xóa tất cả
các thông tin liên quan tới học sinh có cùng tên như parameter và tất cả
các điểm nhỏ hơn của các học sinh đó.
Trong trường hợp nhập vào "*" thì thủ tục sẽ xóa tất cả các học sinh
*/

DROP PROCEDURE IF EXISTS Delete_Student;
DELIMITER $$
CREATE PROCEDURE Delete_Student( IN in_student_name NVARCHAR(50) ,IN in_mark  FLOAT )
BEGIN
	DELETE FROM StudentSubject  S 
    WHERE S.Name = in_student_name AND S.Mark < in_mark ;
END ;$$
DELIMITER ;	
CALL Delete_Student('Đào Đức Khánh',10);