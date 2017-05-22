-- https://www.hackerrank.com/challenges/african-cities

select i.NAME from CITY i join COUNTRY o on i.COUNTRYCODE = o.CODE where o.CONTINENT = 'Africa';