SELECT title,description FROM public.film; /* title and description*/
SELECT * FROM public.film AS F WHERE F.length > 60 AND F.length < 75; /*lengt*/
SELECT * FROM public.film WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost = 28.99); /*rental_rate,replacement_cost*/
SELECT last_name FROM public.customer WHERE first_name = 'Mary'; /*Mary last_name*/
SELECT * FROM public.film AS F WHERE NOT F.length > 50 AND NOT(F.rental_rate = 2.99 OR F.rental_rate = 4.99);/*NOT length and rental_rate*/