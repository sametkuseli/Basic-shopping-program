package exp2;

public class laptop extends computer {

	public boolean isHDMIsupport;
	
public laptop(int cost, String manufacturer, String brand,int maxVolt, int maxWatt,String os,String cpuType, int ramCap,int hddCap,boolean isHDMI){
		
		this.price = cost;
		this.manufacturer = manufacturer;
		this.brand = brand;
		this.maxInputVoltage = maxVolt;
		this.maxPowerCons = maxWatt;
		this.operatingSystem = os;
		this.cpuType = cpuType;
		this.ramCapacity = ramCap;
		this.hddCapacity = hddCap;
		this.isHDMIsupport = isHDMI;
		
	}
}
