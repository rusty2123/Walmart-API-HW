package models;
import java.util.ArrayList;

public class SearchResult {
	
	private String query;
	private String sort;
	private String format;
	private String responseGroup;
	private int totalResults;
	private int start;
	private int numItems;
	private ArrayList<WalmartProduct> items;

	public SearchResult() {
	}
	
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getResponseGroup() {
		return responseGroup;
	}

	public void setResponseGroup(String responseGroup) {
		this.responseGroup = responseGroup;
	}

	public int getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getNumItems() {
		return numItems;
	}

	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}

	public ArrayList<WalmartProduct> getItems() {
		return items;
	}

	public void setItems(ArrayList<WalmartProduct> items) {
		this.items = items;
	}

}
