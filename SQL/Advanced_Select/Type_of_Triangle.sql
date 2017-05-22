-- https://www.hackerrank.com/challenges/what-type-of-triangle

select 
    case
        when 2 * greatest(A, B, C) >= (A + B + C) then 'Not A Triangle'
        when A = B and A = C then 'Equilateral'
        when A = B or A = C or B = C then 'Isosceles'
        else 'Scalene' 
    end
from TRIANGLES;