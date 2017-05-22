-- https://www.hackerrank.com/challenges/weather-observation-station-5

select * from (select city, length(city) as l from station order by l, city ) where rownum =1;
select * from (select city, length(city) as l from station order by l desc, city asc) where rownum =1;