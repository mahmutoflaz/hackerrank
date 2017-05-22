-- https://www.hackerrank.com/challenges/weather-observation-station-7

select distinct city from station where regexp_like(city, '[aeiou]$', 'i');