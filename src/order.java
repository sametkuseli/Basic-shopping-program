package exp2;

public class order extends shopping {

	private String orderDate;
	private int totalCost;
	private items[] purchasedItems;
	private int customerID;
	
	public void displayOrder(){
		System.out.println("Given Order Date: "+this.orderDate+"Ordered by : "+this.customerID+"Order total cost: "+this.totalCost+"Number of bought items :"+purchasedItems.length);
	}
}
