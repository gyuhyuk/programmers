# -- 코드를 입력하세요
SELECT I.FOOD_TYPE, REST_ID, REST_NAME, I.FAVORITES
FROM REST_INFO I JOIN (SELECT FOOD_TYPE, MAX(FAVORITES) AS FAVORITES FROM REST_INFO GROUP BY FOOD_TYPE) R
ON I.FOOD_TYPE = R.FOOD_TYPE AND I.FAVORITES = R.FAVORITES
ORDER BY FOOD_TYPE DESC
