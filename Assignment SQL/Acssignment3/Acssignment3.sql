
-- +---------------------- Assignment 3 ------------------------ +
-- Exercise 1: Tiếp tục với Database quản lý Fresher
-- Question 1: Thêm ít nhất 10 bản ghi vào table
-- +-------------------------------------------------------------+
 USE FRESHER;
-- DELETE FROM  Trainee;
 INSERT INTO Trainee
	(Full_Name,	Birth_Date,	Gender,	ET_IQ,	ET_Gmath,	ET_English,	Training,	Evaluation_Notes,	VTI_Account )
    
VALUE('Nguyễn Hoàng Anh',		19990902,'FEMALE',	20,20,35,'F123','OK','N_AnhVTI99' ),
	 ('Phạm Thị Hương',			19991202,'MALE',	20,20,35,'F345','OK','HuongVTI99' ),
     ('Lê Thị Hà',				19991102,'MALE',	20,20,35,'F567','OK','HaVTI99' ),
     ('Vũ Mai Anh',				19991102,'MALE',	20,20,35,'F235','OK','M_AnhVTI99' ),
     ('Phạm Thị Trà',			19991202,'MALE',	20,20,35,'F183','OK','TraVTI99' ),
     ('Phạm Thị Trà',			19990702,'MALE',	20,20,35,'F923','OK','P_TraVTI99' ),
	 ('Vũ Thị Lan Anh',			19990508,'MALE',	20,20,35,'F723','OK','L_AnhVTI99'),
	 ('Nguyễn Thị Mai',			19991202,'MALE',	20,20,35,'F146','OK','N_MaiVTI99' ),
     ('Phạm Thị Hương',			19991002,'MALE',	20,20,35,'F673','OK','P_HuongVTI99' ),
	 ('Nguyễn Văn Dũng',		19990502,'FEMALE',	20,20,35,'F123','OK','DungVTI99');

-- +-----------------------------------------------------------------------------------------+
-- EX_1_Question 2: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào,
-- 					nhóm chúng thành các tháng sinh khác nhau. 			
-- +-----------------------------------------------------------------------------------------+

USE 	 		FRESHER;
SELECT 			MONTH(Birth_Date) AS Month_of_birth ,COUNT(MONTH(Birth_Date)) AS amount
FROM 			Trainee
GROUP BY (		MONTH(Birth_Date))
ORDER BY (		MONTH(Birth_Date));
-- +-----------------------------------------------------------------------------------------+
-- Question 3: Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau:
-- 				tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table)
-- +-----------------------------------------------------------------------------------------+

USE 		FRESHER;
SELECT   	Full_Name, YEAR(CURRENT_DATE())-YEAR(Birth_Date) AS year_old, 
			TraineeID, Gender 
FROM    	Trainee
GROUP BY 	Full_Name
ORDER BY 	LENGTH(Full_Name )desc
LIMIT 		1;
-- +-----------------------------------------------------------------------------------------+
-- Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh là
-- những người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau:
-- ET_IQ + ET_Gmath>=20
-- ET_IQ>=8
-- ET_Gmath>=8
-- ET_English>=18
-- +-----------------------------------------------------------------------------------------+
USE 			FRESHER ;
SELECT *
FROM 			Trainee 
WHERE 			ET_IQ + ET_Gmath>=20 AND ET_IQ>=8 AND ET_Gmath>=8 AND ET_English>=18;
-- +-----------------------------------------------------------------------------------------+
-- CURDATE trả về ngày tháng năm hiện tại
-- DATEDIFF Trừ ngày tháng năm trả về giá trị là ngày 
-- Question 5: xóa thực tập sinh có TraineeID = 3
-- +-----------------------------------------------------------------------------------------+

USE 			FRESHER ;
DELETE FROM 		Trainee 
WHERE 			TraineeID =3;

-- +-----------------------------------------------------------------------------------------+
-- Question 6: Thực tập sinh có TraineeID = 5 được chuyển sang lớp "2". Hãy cập nhật
-- thông tin vào database
-- +-----------------------------------------------------------------------------------------+

USE 		FRESHER;
UPDATE 		Trainee
SET 		Training=2
WHERE 		TraineeID=5;




