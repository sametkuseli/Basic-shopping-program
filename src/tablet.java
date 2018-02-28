package exp2;

public class tablet extends computer {

	public int dimension;
public tablet(int cost, String manufacturer, String brand,int maxVolt, int maxWatt,String os,String cpuType, int ramCap,int hddCap,int dim){
		
		this.price = cost;
		this.manufacturer = manufacturer;
		this.brand = brand;
		this.maxInputVoltage = maxVolt;
		this.maxPowerCons = maxWatt;
		this.operatingSystem = os;
		this.cpuType = cpuType;
		this.ramCapacity = ramCap;
		this.hddCapacity = hddCap;
		this.dimension = dim;
		
	}
}
