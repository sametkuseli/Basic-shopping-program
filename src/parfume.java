package exp2;

public class parfume extends cosmetic {

	public int lastingDuration;
	
	public parfume(int cost,String manuf,String brand,boolean isOrganic,String expirationYear,int weight,int lastingDur){
		this.price = cost;
		this.manufacturer = manuf;
		this.brand = brand;
		this.isOrganic = isOrganic;
		this.weight = weight;
		this.lastingDuration = lastingDur;
		
		
	}
}
