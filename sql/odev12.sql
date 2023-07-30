/* film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır? */

SELECT COUNT(*) FROM film
WHERE length > (SELECT AVG(length) FROM film);

/* film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır? */

SELECT COUNT(*) FROM film
WHERE rental_rate = (SELECT MAX(rental_rate) FROM film);

/* film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız. */

SELECT * 
FROM film 
WHERE rental_rate = (SELECT MIN(rental_rate) FROM film)
AND replacement_cost = (SELECT MIN(replacement_cost)FROM film);

/* payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız. */

SELECT customer_id, COUNT(*) AS transaction_count 
FROM payment
GROUP BY customer_id
ORDER BY transaction_count DESC;