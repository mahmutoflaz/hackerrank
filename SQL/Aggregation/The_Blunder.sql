-- https://www.hackerrank.com/challenges/the-blunder

select ceil(avg(Salary) - avg(replace(Salary,'0',''))) from EMPLOYEES;