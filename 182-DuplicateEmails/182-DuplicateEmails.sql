-- Last updated: 7/9/2026, 3:11:07 PM
# Write your MySQL query statement below
SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(*) > 1;