-- https://www.hackerrank.com/challenges/binary-search-tree-1

select
    N,
    case
        when P is null then 'Root'
        when not exists (select * from BST x where x.P=bst.N) then 'Leaf'
        else 'Inner'
    end
from BST order by N;