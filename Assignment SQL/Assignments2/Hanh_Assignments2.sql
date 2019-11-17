
-------------------- Exercise 1 --------------------------
-- Question 1:Design a table 
CREATE DATABASE IF NOT EXISTS FRESHER;
USE FRESHER;
CREATE TABLE Trainee (
			

          TraineeID			INT AUTO_INCREMENT PRIMARY KEY,
          Full_Name 		NVARCHAR(50) NOT NULL,
          Birth_Date 		DATE,
          Gender 			ENUM('MALE','FEMALE','UNKNOWN' ),
          ET_IQ 			TINYINT,
          ET_Gmath			TINYINT,
          ET_English		TINYINT,
          Training			VARCHAR(50),

          TraineeID		INT AUTO_INCREMENT PRIMARY KEY,
          Full_Name 		NVARCHAR(50) NOT NULL,
          Birth_Date 		DATE,
          Gender 		ENUM('MALE','FEMALE','UNKNOWN' ),
          ET_IQ 		TINYINT,
          ET_Gmath		TINYINT,
          ET_English		TINYINT,
          Training		VARCHAR(50),

          Evaluation_Notes	TEXT
);

-- Question 2: thêm trường VTI_Account với điều kiện not null & unique 
 ALTER TABLE Trainee
 ADD  VTI_Account VARCHAR(30) NOT NULL UNIQUE;
 
 
 ------------------ Exercise 2: Data Types----------------------
 
 CREATE DATABASE IF NOT  EXISTS Ex2_Data_Type;
 USE Ex2_Data_Type;
 
 CREATE TABLE IF NOT  EXISTS IN_4 (

	ID 				MEDIUMINT AUTO_INCREMENT,
	Name 			CHAR(50),
	Code			VARCHAR(5),
	ModifiedDate	DATETIME,

	ID 			MEDIUMINT AUTO_INCREMENT,
	Name 			CHAR(50),
	Code			VARCHAR(5),
	ModifiedDate		DATETIME,
	PRIMARY KEY(ID)
 );
 
--------------------- Excercise 3: Data Types(2) -----------------------
CREATE DATABASE IF NOT EXISTS Ex3_Data_Types2;
USE Ex3_Data_Types2;

CREATE TABLE INFO (
	ID				MEDIUMINT AUTO_INCREMENT,
	BirthDate 		DATE,
	Gender			ENUM('0','1','NULL'), -- 0= Male , 1 = Female , Null =Unknown;
	IsDeletedFlag	ENUM('0','1'),    -- 0 = Dang hoat dong , 1= Da xoa

	BirthDate 			DATE,
	Gender				ENUM('0','1','NULL'), -- 0= Male , 1 = Female , Null =Unknown;
	IsDeletedFlag			ENUM('0','1'),    -- 0 = Dang hoat dong , 1= Da xoa
	PRIMARY KEY(ID)
);
