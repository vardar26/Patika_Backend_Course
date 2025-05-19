SELECT city.city, country.country FROM country
LEFT JOIN city ON city.city_id= country.country_id;

SELECT customer.first_name, customer.last_name, payment.payment_id FROM customer
RIGHT JOIN payment ON customer.customer_id=payment.payment_id;

SELECT customer.first_name, customer.last_name, rental.rental_id FROM customer
FULL JOIN rental ON customer.customer_id = rental_id;
