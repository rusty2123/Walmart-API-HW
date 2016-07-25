import java.util.Comparator;

import models.RecommendationProduct;

public class ProductByRatingsComparator implements Comparator<RecommendationProduct> {

	private float averageRating;
	public ProductByRatingsComparator(float averageRating) {
		// TODO Auto-generated constructor stub
		this.averageRating = averageRating;
	}
	
	
	 public int compare(RecommendationProduct x, RecommendationProduct y) {
	    // TODO: Handle null x or y values
		 float xScore, yScore;
		 
		 if (x.getCustomerRating() != null){
			xScore = (Float.parseFloat(x.getCustomerRating()) * x.getNumReviews()) 
							- (averageRating * x.getNumReviews());
		 }
		 else{
			 xScore = 0;
		 }
		
		 if (y.getCustomerRating() != null){
			yScore = (Float.parseFloat(y.getCustomerRating()) * y.getNumReviews()) 
					- (averageRating * y.getNumReviews());
		 }
		 else{
			 yScore = 0;
		 }
		
	    return compare(Math.round(xScore), Math.round(yScore));
	    
	  }
	
	  // I don't know why this isn't in Long...
	  private static int compare(int a, int b) {
	    return a < b ? 1
	         : a > b ? -1
	         : 0;
	  }
}
