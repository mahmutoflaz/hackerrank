-- https://www.hackerrank.com/challenges/average-population-of-each-continent

select o.CONTINENT, floor(avg(i.POPULATION)) from CITY i join COUNTRY o on i.COUNTRYCODE = o.CODE group by o.CONTINENT;