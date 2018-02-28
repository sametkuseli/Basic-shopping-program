package exp2;

public class smartPhone extends electronic {

	public String screenType;
public smartPhone(int cost, String manuf,String brand, int maxVolt,int maxWatt,String screenType){
		
		this.price = cost;
		this.manufacturer = manuf;
		this.brand = brand;
		this.maxInputVoltage = maxVolt;
		this.maxPowerCons = maxWatt;
		this.screenType = screenType;
		
	}
}
