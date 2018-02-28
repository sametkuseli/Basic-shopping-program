package exp2;

public enum status {

	CLASSIC("Classic",0.0),
	SILVER("Silver",0.10),
	GOLDEN("Golden", 0.15);
	
	private final String statusType;
	private final double discountRate;
	
	status(String type , double rate){
		
		statusType = type;
		discountRate = rate;
	}
	
	public String getStatusType(){
		return statusType;
	}
	
	public double getDiscountRate(){
		return discountRate;
	}
}
