SELECT CTY.city,CNT.country FROM public.city AS CTY LEFT JOIN public.country AS CNT
ON CTY.country_id=CNT.country_id;

SELECT CUS.first_name,CUS.last_name FROM public.payment AS PY RIGHT JOIN public.customer AS CUS
ON PY.customer_id=CUS.customer_id;