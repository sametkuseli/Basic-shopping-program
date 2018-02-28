package exp2;

public class skinCare extends cosmetic {

	public boolean isBabySensitive;
	
	public skinCare(int cost,String manuf,String brand,boolean isOrganic,String expirationYear,int weight,boolean isBabySens){
		this.price = cost;
		this.manufacturer = manuf;
		this.brand = brand;
		this.isOrganic = isOrganic;
		this.weight = weight;
		this.isBabySensitive = isBabySens;
		
		
	}
}
