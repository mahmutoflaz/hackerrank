-- https://www.hackerrank.com/challenges/weather-observation-station-10

select distinct city from station where not regexp_like(city, '[aeiou]$', 'i');