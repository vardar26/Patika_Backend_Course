SELECT  DISTINCT replacement_cost FROM film;

SELECT COUNT (DISTINCT replacement_cost) FROM film;

SELECT * FROM film
WHERE title LIKE 'T%'
AND rating = 'G';

SELECT COUNT(country)  FROM country
WHERE LENGTH(country) = 5;

SELECT COUNT(city)  FROM city
WHERE city ILIKE 'r%r';
