# Write your MySQL query statement below
select distinct a.Email from Person a inner join Person b on a.Email = b.Email where a.Id != b.Id
