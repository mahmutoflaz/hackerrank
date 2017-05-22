-- https://www.hackerrank.com/challenges/the-pads

select 
    NAME || '(' || substr(OCCUPATION,1,1) || ')' 
    from OCCUPATIONS 
    order by NAME;
select 
    'There are total' || ' ' || count(*) || ' ' || lower(OCCUPATION) || 's.' 
    from OCCUPATIONS 
    group by occupation 
    order by count(*) asc, OCCUPATION asc;