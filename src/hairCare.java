package exp2;

public class hairCare extends cosmetic {

	public boolean isMedicated;
	
	public hairCare(int cost,String manuf,String brand,boolean isOrganic,String expirationYear,int weight,boolean isMadicated){
		this.price = cost;
		this.manufacturer = manuf;
		this.brand = brand;
		this.isOrganic = isOrganic;
		this.weight = weight;
		this.isMedicated = isMedicated;
		
		
	}
}
