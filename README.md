# Walmart-API-HW
homework for the Reston office position

This is a console application that asks for a user inputted search String. It then builds a query String to send 
as an http request to the Walmart API. It then deserializes the JSON response into an ArrayList of my WalmartProducts
objects by using GSON and my WalmartClient class. I then retrieve the first object in the ArrayList, and use that item's ID to
query recommended products in the API. I also deserialize this response string into an ArrayList of my RecommendedProducts 
objects with GSON and my WalmartClient class. I store the first 10 results into a list. I then sort these using a custom made
Comparator. I sort them based on an equation as follows:

First I find the average rating across the 10 products. Let's say it is a 3. Now just count the total number of reviews 
for a single product and subtract 3 times that number of reviews. Your single review of 4.5 is then 1.5 points above 
average for the number of reviews it has gotten. The 100 reviews of 4 are 100 points better than average. etc.

I then print the names of the List to console from highest points to lowest points.




I have not build any test cases because I had a busy weekend, and I could not get my API key to work while I am in the office.
I also did not see that there is an entire Review API until I was about to turn it in. I first assumed I had to rank items based
on their rating and their amount of ratings.
My project uses Maven and has GSON as a dependency. It runs as a Java console application for simplicity and ease of use.
