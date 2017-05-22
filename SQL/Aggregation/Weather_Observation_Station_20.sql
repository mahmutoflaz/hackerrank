-- https://www.hackerrank.com/challenges/weather-observation-station-20

select round(LAT_N, 4) from STATION where LAT_N = (select median(LAT_N) from STATION) order by rownum;