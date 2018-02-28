package exp2;

public class campaign extends shopping {

	public String startDate;
	public String endDate;
	public String itemType;
	public double discountRate;
	
	public campaign(String sDate,String eDate,String itemType,double disRate){
		
		if(disRate >50.0||disRate <0.0){
			return;
		}else{
			
			this.startDate = sDate;
			this.endDate = eDate;
			this.itemType = itemType;
			this.discountRate=disRate;
			
		}
		
		
	}
	public String displayCampaign(){
		String printStr =this.discountRate*100.0+"% sale of "+this.itemType+" until "+this.endDate;
		return printStr;
		
	}
}
