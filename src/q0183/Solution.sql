# Write your MySQL query statement below
select c.Name as Customers from Customers c where not c.Id in (select CustomerId from Orders)
