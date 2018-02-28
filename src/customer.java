package exp2;



public class customer extends person {

	private int customerID ;
	private String password;
	private double balance;
	private static int customerIDcounter ;
	protected status customerStatus ;
	
	public customer(String name,String email,String dateOfBirth,double balance,String password ){
		
		this.customerIDcounter ++;
		super.name 	= name;
		super.email	= email;
		super.dateOfBirth = dateOfBirth;
		this.password = password;
		this.balance = balance;
		this.customerID =customerIDcounter;
		this.customerStatus = status.CLASSIC;
		
		
	}
	public String getPassword(){
		return this.password;
	}
public int getCustomerID(){
	return this.customerID;
}
	
public boolean equals(Object o){
		
		if(!(o instanceof customer)){
			
			return false;
		}
		
		customer ins = (customer) o;
		
		
		return customerID==ins.customerID&&name.equals(ins.name);
		
	}
public int hashCode(){
	
	return name.hashCode();
}
public void depositMoney(double amount){
	
	this.balance = this.balance+amount;
}

public String displayPData(){
	
	String printStr="Customer Name: "+this.name+"\t"+"ID: "+this.customerID+"\t"+"e-mail: "+this.email+"\t"+"Date of Birth: "+this.dateOfBirth+"\t"+"Status: "+this.customerStatus;
	
	
	
	return printStr;
	
}
	
	public boolean changePass(String newPass, String oldPass){
		
		if(checkPass(oldPass)){
			this.password = newPass;
			return true;
		}else{
			
			return false;
		}
		
		
	}
	
	public boolean checkPass(String pass){
		
		return pass == this.password;
	}
	
	public double updateBalance(double moneyAmount){
		
		this.balance = this.balance+moneyAmount;
		
		return this.balance;
	}
	
	public void viewCampaigns(){
		
		System.out.println("Campaigns!!!! some code here");
	}
	
	public boolean addToChartItem(){
		System.out.println("here some code!!!");
		
		return false;
	}
	
	public boolean clearChart(){
		System.out.println("here some code!!!");
		
		return false;
	}
	
	public boolean placeOrder(String pass){
		
		if(checkPass(pass)){
			
			return false;
		}
		System.out.println("something here!!!");
		
		return false;
	}
	
	public boolean checkoutOrder(){
		
		return false;
	}
}
