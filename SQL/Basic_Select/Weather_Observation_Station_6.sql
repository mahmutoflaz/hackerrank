-- https://www.hackerrank.com/challenges/weather-observation-station-6

select distinct city from station where regexp_like(city, '^[aeiou]', 'i');