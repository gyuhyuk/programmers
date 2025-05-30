SELECT I.ID, N.FISH_NAME, I.LENGTH
FROM FISH_NAME_INFO N
INNER JOIN FISH_INFO I
ON N.FISH_TYPE = I.FISH_TYPE
WHERE (I.FISH_TYPE, I.LENGTH) IN
(
    SELECT FISH_TYPE, MAX(LENGTH) AS LENGTH
    FROM FISH_INFO
    GROUP BY FISH_TYPE
)
ORDER BY I.ID