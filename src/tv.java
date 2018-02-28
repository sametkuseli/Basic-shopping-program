package exp2;

public class tv extends electronic {
	
	public int screenSize;
	
	public tv(int cost, String manuf,String brand, int maxVolt,int maxWatt,int screenSize){
		
		this.price = cost;
		this.manufacturer = manuf;
		this.brand = brand;
		this.maxInputVoltage = maxVolt;
		this.maxPowerCons = maxWatt;
		this.screenSize = screenSize;
		
	}

}
