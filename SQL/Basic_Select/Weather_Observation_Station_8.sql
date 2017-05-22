-- https://www.hackerrank.com/challenges/weather-observation-station-8

select distinct city from station where regexp_like(city, '(^[aeiou])(.*)([aeiou]$)', 'i');