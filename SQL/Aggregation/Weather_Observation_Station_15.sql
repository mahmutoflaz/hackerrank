-- https://www.hackerrank.com/challenges/weather-observation-station-15

select round(LONG_W, 4) from STATION WHERE LAT_N=(select max(LAT_N) from STATION where LAT_N<137.2345);