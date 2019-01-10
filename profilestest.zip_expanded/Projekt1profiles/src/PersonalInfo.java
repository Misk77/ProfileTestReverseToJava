
public class PersonalInfo extends Profile { // extends make this a subclass and inherits everything from Profile(superclass)

private String hobbies;
private String sex;									
private double length;	


// get and setters
	public String getHobbies() {
	return hobbies;
}
public void setHobbies(String hobbies) {
	this.hobbies = hobbies;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
	// Subclass
	public PersonalInfo(String name,String yrke,int age, String country,String hobbies, String sex, double length) {
		super( name, yrke, age, country); // hänvisar till superclassens constructor
		// TODO Auto-generated constructor stub
		hobbies = null;
		sex = null;
		length = 0;
}
	//constructor
	PersonalInfo(String hobbies,String sex,double length){
			this.hobbies=hobbies;
			this.sex=sex;
			this.length=length;
		
		// END
	}

}
