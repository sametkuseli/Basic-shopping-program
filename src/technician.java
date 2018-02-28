package exp2;

public class technician extends employee {

	
	private boolean isSenior ;
	
	public technician(String name,String email, String date,int salary,boolean senior){
		this.name = name;
		this.email = email;
		this.dateOfBirth = date;
		this.salary = salary;
		this.isSenior = senior;
		
	}
public boolean equals(Object o){
		
		if(!(o instanceof technician)){
			
			return false;
		}
		
		technician ins = (technician) o;
		
		
		return this.name.equals(ins.name);
		
	}
public int hashCode(){
	
	return name.hashCode();
}
}
