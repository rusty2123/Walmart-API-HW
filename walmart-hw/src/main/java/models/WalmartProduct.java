package models;

public class WalmartProduct {

	public WalmartProduct() {
		
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}

	public String getCategoryPath() {
		return categoryPath;
	}

	public void setCategoryPath(String categoryPath) {
		this.categoryPath = categoryPath;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getThumbnailImage() {
		return thumbnailImage;
	}

	public void setThumbnailImage(String thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}

	public String getProductTrackingUrl() {
		return productTrackingUrl;
	}

	public void setProductTrackingUrl(String productTrackingUrl) {
		this.productTrackingUrl = productTrackingUrl;
	}

	public float getStandardShipRate() {
		return standardShipRate;
	}

	public void setStandardShipRate(float standardShipRate) {
		this.standardShipRate = standardShipRate;
	}

	public boolean isMarketplace() {
		return marketplace;
	}

	public void setMarketplace(boolean marketplace) {
		this.marketplace = marketplace;
	}

	public String getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	public String getCategoryNode() {
		return categoryNode;
	}

	public void setCategoryNode(String categoryNode) {
		this.categoryNode = categoryNode;
	}

	public boolean isBundle() {
		return bundle;
	}

	public void setBundle(boolean bundle) {
		this.bundle = bundle;
	}

	public boolean isAvailableOnline() {
		return availableOnline;
	}

	public void setAvailableOnline(boolean availableOnline) {
		this.availableOnline = availableOnline;
	}

	private int itemId;
	private int parentItemId;
	private String name;
	private float salePrice;
	private String categoryPath;
	private String shortDescription;
	private String longDescription;
	private String thumbnailImage;
	private String productTrackingUrl;
	private float standardShipRate;
	private boolean marketplace;
	private String productUrl;
	private String categoryNode;
	private boolean bundle;
	private boolean availableOnline;

}
