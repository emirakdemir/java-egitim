/* city tablosu ile country tablosunda bulunan 
şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız. */


SELECT city.city, country.country 
FROM city 
INNER JOIN country ON city.country_id=country.id;


/* customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki 
first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız. */
<
SELECT customer.payment_id, customer.first_name, customer.last_name 
FROM customer JOIN payment ON customer.payment_id = payment.id;

/* customer tablosu ile rental tablosunda bulunan rental_id ile customer 
tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız. */

SELECT customer.rental_id, customer.first_name, customer.last_name 
FROM customer JOIN rental ON customer.rental_id = rental.id;