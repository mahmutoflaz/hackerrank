-- https://www.hackerrank.com/challenges/asian-population

select 
    sum(i.POPULATION) 
    from CITY i join COUNTRY o on i.COUNTRYCODE = o.CODE
    where o.CONTINENT = 'Asia';