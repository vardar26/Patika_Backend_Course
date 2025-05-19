SELECT country.country, city.city
FROM country
INNER JOIN city ON  country.country_id = city.city_id;

SELECT payment.payment_id, customer.first_name, customer.last_name
FROM customer
INNER JOIN payment ON customer.customer_id = payment.payment_id ;

SELECT rental.rental_id, customer.first_name, customer.last_name
FROM rental
INNER JOIN customer ON rental.rental_id = customer.customer_id;

