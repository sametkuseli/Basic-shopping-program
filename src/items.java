package exp2;

public class items {

	protected int itemID;
	protected double price;
	protected static int IDcounter =0;
	public items(){
		
		IDcounter++;
		this.itemID =IDcounter;
		
	}
	public String displayItem(){
		String printStr="Item ID: "+this.itemID+"\r\n"+"price: "+this.price+" $\r\n";
		
		return printStr;
	}
}
