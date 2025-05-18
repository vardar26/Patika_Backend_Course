SELECT title , description FROM Film;
SELECT * FROM Film WHERE length <75 AND length >60;
SELECT * FROM Film WHERE rental_rate = 0.99 AND replacement_cost = 12.99 OR replacement_cost = 28.99;
SELECT last_name FROM Customer WHERE first_name = 'Mary';
SELECT * FROM film WHERE length <= 50 AND rental_rate NOT IN  (2.99,4.99);