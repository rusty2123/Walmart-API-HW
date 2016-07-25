import java.io.IOException;
import java.util.Collections;
import java.util.List;

import Deserializers.WalmartClient;
import models.RecommendationProduct;
import models.SearchResult;
import models.WalmartProduct;
import requests.Request;

public class App {

	public static void main(String[] args) {
		
		/*int custInputSize = args.length;
		String query = "&query=";
		
		//concat all of the cmd line arguments
		for(int i = 0; i < custInputSize; i++){
			query = query + args[i] + " ";
		}*/
		String query = "&query=";
		System.out.print("Please enter your search: ");
		try {
			query = query + System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//build a query string. the customer input is a cmd line argument.
		final String apiKey = "apiKey=swe4m5bpedqczu6mn8zxr4u3";
		final String searchApiUrl = "http://api.walmartlabs.com/v1/search?";
		final String recommendApiUrl = "http://api.walmartlabs.com/v1/nbp?";
		final String format = "&format=json";
		final String searchUrl = searchApiUrl + apiKey + query + format;
		
		final String searchResults;
		final String recommendResults;
		
		//Send the http request and store the response string.
		Request search = new Request(searchUrl);
		searchResults = search.getResponse();
		
		//Convert the response String to a SearchResult object.
		WalmartClient walmartClient = new WalmartClient();
		walmartClient.setSearchResult(searchResults);
		
		//Store the SearchResult object as an array of WalmartProjects.
		SearchResult searchResult = walmartClient.getSearchResult();
		
		//Store the first item of the Array as a WalmartProduct.
		WalmartProduct firstItem = searchResult.getItems().get(0);
		
		//Extract the item ID of the first object so that it may be used in the new query String.
		String itemId = "&itemId=" + firstItem.getItemId();
		
		//Build the new query Url to find the recommended Products.
		String recommendUrl = recommendApiUrl + apiKey + itemId;
		
		//Send the request and store the response in a String.
		Request recommend = new Request(recommendUrl);
		recommendResults = recommend.getResponse();
		
		//Deserialize the first 10 items in the Response String into an a List of RecommendationProducts.
		walmartClient.setFirstTenRecommends(recommendResults);
		List<RecommendationProduct> recommendations = walmartClient.getFirstTenRecommends();
		
		//Find the average Rating of recommended items because it is needed for the custom made
		//product ranking algorithm.
		float averageRating = 0;
		for (RecommendationProduct item : recommendations) {
			if(item.getCustomerRating() == null){
				;
			}
			else{
				averageRating += Float.parseFloat(item.getCustomerRating());
			}
		}
		averageRating /= 10;
		
		//Use a custom made comparator to help sort the list
		ProductByRatingsComparator productComparator = new ProductByRatingsComparator(averageRating);
		Collections.sort(recommendations, productComparator);
	
		//Print out the recommendations in order from highest ranking to least;
		for (RecommendationProduct item : recommendations) {
			System.out.println(item.getName());
		}	
	}
}










