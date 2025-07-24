use AdventureWorksLT2022;
GO

-- Query 1
SELECT * FROM SalesLT.Customer;

-- Query 2
SELECT * FROM SalesLT.Customer ORDER BY FirstName;

-- Query 3
SELECT * FROM SalesLT.Customer ORDER BY FirstName ASC;

-- Query 4
SELECT * FROM SalesLT.Customer ORDER BY FirstName DESC;

-- Query 5
SELECT * FROM SalesLT.Customer ORDER BY 3;

-- Query 6
SELECT * FROM SalesLT.Customer ORDER BY 3 DESC;

-- Query 7
SELECT * FROM SalesLT.Customer WHERE CustomerID < 6;

-- Query 8
SELECT * FROM SalesLT.Customer WHERE LastName = 'GUINESS';

-- Query 9
SELECT * FROM SalesLT.Customer ORDER BY FirstName;

-- Query 10
SELECT * FROM SalesLT.Customer ORDER BY FirstName ASC, LastName DESC;

-- Query 11
SELECT * FROM SalesLT.Customer ORDER BY 3 ASC, 2 DESC;

-- Query 12
SELECT * FROM SalesLT.Customer WHERE 1 = 2;

-- Query 13
SELECT * FROM SalesLT.Customer WHERE 1 = 1;

-- Query 14
SELECT * FROM SalesLT.Customer WHERE 1 = 1;

-- Query 15
SELECT * FROM SalesLT.Customer WHERE 1 = 2;

-- Query 16
SELECT COUNT(*) FROM SalesLT.Customer;

-- Query 17
SELECT SalesOrderID AS ID, OrderDate, TotalDue FROM SalesLT.SalesOrderHeader;

-- Query 18
SELECT * FROM SalesLT.SalesOrderHeader;

-- Query 19
SELECT 'Test' AS Value1, 123 AS Value2 FROM SalesLT.SalesOrderHeader;

-- Query 20
SELECT * FROM SalesLT.SalesOrderDetail;

-- Query 21
SELECT LineTotal, ROUND(LineTotal, 0) AS RoundedLineTotal FROM SalesLT.SalesOrderDetail;

-- Query 22
SELECT ROUND(8.45, 1) FROM SalesLT.SalesOrderDetail;

-- Query 23
SELECT ROUND(8.5, 1) FROM SalesLT.SalesOrderDetail;

-- Query 24
SELECT ROUND(-14.33, 0);

-- Query 25
SELECT ROUND(1.234, 0);

-- Query 26
SELECT ROUND(-14.73, 0);

-- Query 27
SELECT ROUND(1.234, 1);

-- Query 28
SELECT ROUND(1234.567, -1);

-- Query 29
SELECT ROUND(1256.567, -2) AS RoundedToNearest100;

-- Query 30
SELECT LineTotal FROM SalesLT.SalesOrderDetail;

-- Query 31
SELECT ROUND(LineTotal, 0) AS Rounded0, ROUND(LineTotal, 1) AS Rounded1 FROM SalesLT.SalesOrderDetail;

-- Query 32
SELECT FLOOR(1.2);

-- Query 33
SELECT CEILING(1.2);

-- Query 34
SELECT FLOOR(-1.2);

-- Query 35
SELECT CEILING(-1.2);

-- Query 36
SELECT 1 + 1 AS [ADD];

-- Query 37
SELECT CAST('1' AS INT) + CAST('1' AS INT) AS [ADD];

-- Query 38
-- Will error if not convertible
SELECT TRY_CAST('1A' AS INT) + CAST('1' AS INT) AS [ADD];

-- Query 39
SELECT '1A' + 'B' AS [ADD]; -- string concatenation

-- Query 40
SELECT 'A2' + '1' AS [ADD];

-- Query 41
SELECT 'A2' + '2' AS [ADD];

-- Query 42
SELECT 'A2' + 'A2' AS [ADD];

-- Query 43
SELECT CONCAT(1, 1) AS [CONCATENATE];

-- Query 44
SELECT CONCAT('1', '1') AS [CONCATENATE];

-- Query 45
SELECT CONCAT('A2', '2') AS [CONCATENATE];

-- Query 46
SELECT CONCAT('RED', ' GREEN', ' BLUE') AS COLORS;

-- Query 47
SELECT * FROM SalesLT.Customer;

-- Query 48
SELECT CustomerID, FirstName + ' ' + LastName AS FullName FROM SalesLT.Customer;

-- Query 49
SELECT LOWER(FirstName) FROM SalesLT.Customer;

-- Query 50
SELECT UPPER(FirstName) FROM SalesLT.Customer;

-- Query 51
SELECT LEFT(FirstName, 2) FROM SalesLT.Customer;

-- Query 52
SELECT LOWER(LEFT(FirstName, 2)) FROM SalesLT.Customer;

-- Query 54
SELECT REVERSE(LastName + FirstName) AS ReversedName FROM SalesLT.Customer;

-- Query 55
SELECT REVERSE(FirstName + ' ' + LastName) AS [REVERSE FULL NAME] FROM SalesLT.Customer;

-- Query 57
SELECT REVERSE(FirstName) FROM SalesLT.Customer;

-- Query 58
SELECT ModifiedDate FROM SalesLT.Customer;

-- Query 59
SELECT FORMAT(ModifiedDate, 'MM/dd/yy') AS [LAST UPDATE] FROM SalesLT.Customer;

-- Query 60
SELECT FORMAT(ModifiedDate, 'MM-dd-yy') AS [LAST UPDATE] FROM SalesLT.Customer;

-- Query 61
SELECT DATEPART(WEEK, ModifiedDate) AS WeekNumber FROM SalesLT.Customer;

-- Query 62
SELECT ModifiedDate AS SalesOrderDetail_DATE FROM SalesLT.SalesOrderDetail;

-- Query 63
SELECT * FROM SalesLT.Customer;

-- Query 64
SELECT FirstName FROM SalesLT.Customer ORDER BY FirstName;

-- Query 65
SELECT DISTINCT FirstName FROM SalesLT.Customer ORDER BY FirstName;

-- Query 66
SELECT COUNT(*) FROM SalesLT.Customer;

-- Query 67
SELECT COUNT(FirstName) FROM SalesLT.Customer;

-- Query 68
SELECT COUNT(DISTINCT FirstName) FROM SalesLT.Customer;

-- Query 69
SELECT COUNT(*) FROM SalesLT.Customer WHERE FirstName = 'NICK';

-- Query 70
SELECT * FROM SalesLT.Customer WHERE FirstName = 'NICK';

-- Query 71
SELECT * FROM SalesLT.Customer WHERE CustomerID < 5;

-- Query 72
SELECT * FROM SalesLT.Customer WHERE CustomerID BETWEEN 1 AND 5;

-- Query 73
SELECT * FROM SalesLT.Customer WHERE CustomerID NOT BETWEEN 1 AND 5;

-- Query 74
SELECT * FROM SalesLT.Customer WHERE FirstName LIKE 'A%' ORDER BY FirstName ASC;

-- Query 75
SELECT * FROM SalesLT.Customer WHERE FirstName <= 'AL%';

-- Query 76
SELECT * FROM SalesLT.Customer WHERE LEN(FirstName) = 4;

-- Query 78
SELECT * FROM SalesLT.Customer WHERE LEN(LastName) = 5 AND LastName LIKE '%y' ORDER BY FirstName;

-- Query 79
SELECT * FROM SalesLT.Customer WHERE LEN(LastName) = 5 AND LastName LIKE '%y' ORDER BY LastName;

-- Query 80
SELECT * FROM SalesLT.Customer WHERE FirstName = 'KENNETH';

-- Query 81
SELECT * FROM SalesLT.Customer
WHERE FirstName = 'KENNETH' AND CustomerID < 100 AND (LastName LIKE '%I' OR LastName LIKE '%W');

-- Query 82
SELECT * FROM SalesLT.Customer WHERE CustomerID IN (1, 2, 3, 4);

-- Query 83
SELECT * FROM SalesLT.Customer WHERE CustomerID NOT IN (1, 2, 3, 4);

-- Query 86
SELECT * FROM SalesLT.Customer
WHERE LastName IN (SELECT LastName FROM SalesLT.Customer WHERE FirstName = 'CUBA');

-- Query 87
SELECT * FROM SalesLT.Customer
WHERE LastName IN ('OLIVIER', 'ALLEN', 'BIRCH') ORDER BY CustomerID;

-- Query 88
SELECT * FROM SalesLT.Customer
WHERE LastName IN (SELECT LastName FROM SalesLT.Customer WHERE FirstName = 'CUBA');

-- Query 89
SELECT * FROM SalesLT.Customer ORDER BY LastName;

-- Query 90
SELECT * FROM SalesLT.Address;

-- Query 91
UPDATE SalesLT.Address SET AddressLine2 = NULL;

-- Query 92
UPDATE SalesLT.Address SET AddressLine2 = 'DEMO Address' WHERE AddressID = 1;

-- Query 93
UPDATE SalesLT.Address SET AddressLine2 = 'DEMO Address 2' WHERE AddressID = 2;

-- Query 94
SELECT * FROM SalesLT.Address WHERE AddressLine2 IS NOT NULL;

-- Query 95
SELECT * FROM SalesLT.Address WHERE AddressLine2 IS NULL;

-- Query 96
UPDATE SalesLT.Address SET AddressLine2 = '' WHERE AddressID = 3;

-- Query 97
SELECT * FROM SalesLT.Address WHERE AddressLine2 IS NULL;

-- Query 98
SELECT * FROM SalesLT.Address WHERE AddressLine2 IS NOT NULL;

-- Query 99
SELECT * FROM SalesLT.Address WHERE AddressLine2 = '';
