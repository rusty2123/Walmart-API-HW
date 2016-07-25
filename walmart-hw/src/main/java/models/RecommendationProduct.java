package models;

public class RecommendationProduct {
	
	private int itemId;
	private int parentItemId;
	private String name;
	private float msrp;
	private float salePrice;
	private String upc;
	private String categoryPath;
	private String shortDescription;
	private String longDescription;
	private String brandName;
	private String thumbnailImage;
	private String mediumImage;
	private String largeImage;
	private String productTrackingUrl;
	private boolean ninetySevenCentShipping;
	private float standardShipRate;
	private float twoThreeDayShippingRate;
	private float overnightShippingRate;
	private boolean marketplace;
	private boolean shipToStore;
	private boolean freeShipToStore;
	private String modelNumber;
	private String productUrl;
	private String customerRating;
	private int numReviews;
	private String customerRatingImage;
	private String categoryNode;
	private boolean rollBack;
	private boolean bundle;
	private boolean clearance;
	private boolean preOrder;
	private String stock;
	private boolean availableOnline;

	public RecommendationProduct() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getParentItemId() {
		return parentItemId;
	}

	public void setParentItemId(int parentItemId) {
		this.parentItemId = parentItemId;
	}

	public float getMsrp() {
		return msrp;
	}

	public void setMsrp(float msrp) {
		this.msrp = msrp;
	}

	public float getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getCategoryPath() {
		return categoryPath;
	}

	public void setCategoryPath(String categoryPath) {
		this.categoryPath = categoryPath;
	}

	public String getCustomerRating() {
		return customerRating;
	}

	public void setCustomerRating(String customerRating) {
		this.customerRating = customerRating;
	}

	public int getNumReviews() {
		return numReviews;
	}

	public void setNumReviews(int numReviews) {
		this.numReviews = numReviews;
	}
	
	

}
