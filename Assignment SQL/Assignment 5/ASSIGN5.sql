/* Exercise 1: Subquery
		Question 1: Viết 1 query lấy thông tin "Name" từ bảng Production.Product có name
		của ProductSubcategory là 'Saddles'.
*/


USE 		adventureworks;
SELECT  	P.Name
FROM 		Product AS P
WHERE	 	P.ProductSubcategoryID
IN(
SELECT 		PSC.ProductSubCategoryID
FROM 		productsubcategory AS PSC
WHERE 		PSC.Name ='Saddles'
);


/*
Question 2: Thay đổi câu Query 1 để lấy được kết quả sau.
In this exercise you can change the previous query to deliver the following result set. 
*/

USE 		adventureworks;
SELECT  	P.Name
FROM 		Product AS P
WHERE	 	P.ProductSubcategoryID
IN (
SELECT 		PSC.ProductSubCategoryID
FROM 		productsubcategory AS PSC
WHERE 		PSC.Name  LIKE '%Bo'
);

/*
Question 3:
Viết câu query trả về tất cả các sản phẩm có giá rẻ nhất (lowest ListPrice) và Touring
Bike (nghĩa là ProductSubcategoryID = 3)

*/
USE 		adventureworks;
SELECT 		P.Name, P.ProductSubcategoryID, P.ListPrice
FROM		Product AS P
            
WHERE		P.ProductSubcategoryID = 3

AND 		P.ListPrice 
IN(
SELECT 		MIN(ListPrice)
FROM		Product
WHERE		ProductSubcategoryID = 3
	);
/*
Exercise 2: JOIN nhiều bảng
Question 1: Viết query lấy danh sách tên country và province được lưu trong
AdventureWorks2008sample database.
*/
USE 			adventureworks;
SELECT 			Cou.Name 				AS 	Country ,
				Provi.Name 				AS	Province
FROM 			countryregion			AS 	Cou
INNER JOIN 		stateprovince 			AS 	Provi
ON 				Cou.CountryRegionCode	=		Provi.CountryRegionCode;
	

/*
Question 2: Tiếp tục với câu query trước và thêm điều kiện là chỉ lấy country
Germany và Canada
Chú ý: sủ dụng sort order và column headings
*/

USE 			adventureworks;

SELECT 			Cou_Region.Name 				AS 	Country ,
				Provi.Name 						AS	Province
FROM 			countryregion					AS 	Cou_Region
INNER JOIN 		stateprovince 					AS 	Provi
		
ON 				Cou_Region.CountryRegionCode	=		Provi.CountryRegionCode
GROUP BY		Provi.Name,	Cou_Region.CountryRegionCode
HAVING 			Cou_Region.Name ="Germany" 		OR Cou_Region.Name ="Canada"
ORDER BY		Cou_Region.Name ASC
;
/*
Question 3:
SalesOrderID, OrderDate and SalesPersonID. Từ bảng SalesPerson, chúng ta lấy cột
BusinessEntityID (là định danh của người sales), Bonus and the SalesYTD (là đã sale
được bao nhiêu người trong năm nay)
*/
SELECT 		SOH.SalesOrderID,	SOH.OrderDate,		S.SalesPersonID , S.Bonus,s.SalesYTD
FROM 		SalesPerson 		AS S		
INNER JOIN 	SalesOrderHeader	AS SOH ON 	S.SalesPersonID		=SOH.SalesPersonID
ORDER BY	SOH.SalesOrderID	ASC;



/*
Question 4:
Sử dụng câu query, thêm cột JobTitle and xóa cột SalesPersonID và
BusinessEntityID.
EM CHẢ THẤY BẢNG BusinessEntityID ĐÂU CẢ 
*/
SELECT 		SOH.SalesOrderID,	SOH.OrderDate,	 S.Bonus,s.SalesYTD
FROM 		SalesPerson 		AS S		
INNER JOIN 	SalesOrderHeader	AS SOH ON 	S.SalesPersonID	=SOH.SalesPersonID
ORDER BY	SOH.SalesOrderID	ASC;
