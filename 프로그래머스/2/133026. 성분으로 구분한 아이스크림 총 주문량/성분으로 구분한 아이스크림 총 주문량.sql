SELECT INGREDIENT_TYPE, SUM(TOTAL_ORDER) TOTAL_ORDER
FROM FIRST_HALF F JOIN ICECREAM_INFO I USING(FLAVOR)
GROUP BY 1
ORDER BY 2;