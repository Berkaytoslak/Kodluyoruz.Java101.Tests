SELECT AVG(rental_rate) FROM public.film
SELECT COUNT(*),title FROM public.film GROUP BY title
SELECT rental_rate, MAX(length) 
FROM film
GROUP BY rental_rate;

SELECT rental_rate, COUNT(*) 
FROM film
GROUP BY rental_rate
HAVING COUNT(*) > 325;