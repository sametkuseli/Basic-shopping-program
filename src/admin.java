package exp2;

public class admin extends employee {

	private String password;
	public admin(String name, String email, String date, int salary,String password){
		this.name = name;
		this.email = email;
		this.dateOfBirth = date;
		this.salary = salary;
		this.password = password;
		
	}
public boolean equals(Object o){
		
		if(!(o instanceof admin)){
			
			return false;
		}
		
		admin ins = (admin) o;
		
		
		return this.name.equals(ins.name);
		
	}
public int hashCode(){
	
	return name.hashCode();
}
	
	public String displayPData(){
		
		String printStr="Admin Name: "+this.name+"\r\n"+"Admin e-mail: "+this.email+"\r\n"+"Admin Date of Birth: "+this.dateOfBirth+"\r\n";
		
		
		
		return printStr;
		
	}
}
