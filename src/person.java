package exp2;

public class person {

	protected String name ;
	protected String email;
	protected String dateOfBirth;
	
	public String displayPData(){
		
		return "Person Name: "+this.name+"Person E-mail: "+this.email+"Person date of birth: "+this.dateOfBirth;
	}
}
