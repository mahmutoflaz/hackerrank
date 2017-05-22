-- https://www.hackerrank.com/challenges/occupations

SELECT D_N, P_N, S_N, A_N FROM
(
  select row_number() over (partition by occupation order by name) rnm, name, occupation from occupations
)
PIVOT
(
  max(name) N
  FOR occupation IN ('Doctor' D, 'Professor' P, 'Singer' S, 'Actor' as A)
)
ORDER BY rnm;