package Deserializers;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import models.RecommendationProduct;
import models.SearchResult;

public class WalmartClient {
	
	private SearchResult searchResult;
		
	private ArrayList<RecommendationProduct> recommendResults;
	
	private List<RecommendationProduct> firstTenRecommends;
	
	public WalmartClient() {
		
	}
	
	public void setSearchResult(String json){
		Gson gson = new Gson();
		this.searchResult = gson.fromJson(json, SearchResult.class);
	}
	
	public SearchResult getSearchResult(){
		return this.searchResult;
	}
	
	public void setFirstTenRecommends(String json) {
		Gson gson = new Gson();
		Type collectionType = new TypeToken<ArrayList<RecommendationProduct>>(){}.getType();
		this.recommendResults = gson.fromJson(json, collectionType);
		
		 this.firstTenRecommends = this.recommendResults.subList(0, 10);
	}

	public List<RecommendationProduct> getFirstTenRecommends() {
		return this.firstTenRecommends;
	}
}
