-- https://www.hackerrank.com/challenges/the-report

select
    case 
        when Grade > 7 then Name 
        else 'NULL' end, 
    Grade, Marks
    from Students s
    inner join Grades g
    on Min_mark <= Marks AND Marks <= Max_Mark
    order by Grade desc, Name asc;