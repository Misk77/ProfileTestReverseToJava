
public class Profile {
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	 private String name;
	 private String yrke;
	 private int age;
	 private String country;

	 public void print() {
			System.out.println("\nname: " +"\nyrke: "+"age: "+"country: " );
		}
	//constructor
	 Profile(String name,String yrke,int age,String country){
		this.name=name;
		this.yrke=yrke;
		this.age=age;
		this.country=country;
		
		
	
		
		
	}
	// getter and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYrke() {
		return yrke;
	}

	public void setYrke(String yrke) {
		this.yrke = yrke;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	
	
	
	// END
}
