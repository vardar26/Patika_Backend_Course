SELECT * FROM film
WHERE title LIKE '%n'
ORDER BY length desc
LIMIT 5;

SELECT * FROM film
WHERE title LIKE '%n'
ORDER BY length desc
LIMIT 5
OFFSET 5;

SELECT * FROM customer
WHERE store_id = 1
ORDER BY last_name desc
LIMIT 4;
