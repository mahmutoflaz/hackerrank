-- https://www.hackerrank.com/challenges/weather-observation-station-3

select city from station where mod(id , 2) = 0 group by city;