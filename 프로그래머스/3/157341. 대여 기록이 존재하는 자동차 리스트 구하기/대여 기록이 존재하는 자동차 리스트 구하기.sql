SELECT DISTINCT(C.CAR_ID)
FROM CAR_RENTAL_COMPANY_CAR C
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY H
ON C.CAR_ID = H.CAR_ID
WHERE C.CAR_TYPE = '세단' AND H.START_DATE LIKE '2022-10%'
ORDER BY CAR_ID DESC