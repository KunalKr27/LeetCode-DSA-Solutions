# Write your MySQL query statement below
select name 
from Employee as e

JOIN (
      SELECT managerId,
      COUNT(*) as totalReports
      FROM Employee
      GROUP BY managerId
      HAVING totalReports >= 5
     ) AS sub

ON e.id = sub.managerId;
