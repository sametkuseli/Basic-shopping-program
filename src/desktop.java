package exp2;

public class desktop extends computer {

	public String boxColor;
	
	public desktop(int cost, String manufacturer, String brand,int maxVolt, int maxWatt,String os,String cpuType, int ramCap,int hddCap,String boxColor){
		
		this.price = cost;
		this.manufacturer = manufacturer;
		this.brand = brand;
		this.maxInputVoltage = maxVolt;
		this.maxPowerCons = maxWatt;
		this.operatingSystem = os;
		this.cpuType = cpuType;
		this.ramCapacity = ramCap;
		this.hddCapacity = hddCap;
		this.boxColor = boxColor;
		
	}
}
