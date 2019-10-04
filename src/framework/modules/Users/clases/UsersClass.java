package framework.modules.Users.clases;

import framework.classes.Dates;
//import framework.classes.Settings;
//import framework.functions.Languages.Languages;

public abstract class UsersClass implements Comparable<UsersClass>{
	
////////attributes
	private String DNI;
	private String user;
	private String password;
	private String name;
	private String email;
	private String phone;
	private Dates datebirthday;
	private int age;


	
//////constructor
	
	
	//buit
	public UsersClass() {
		
	}
	
	public UsersClass(String dni, String user, String password, String name, String email,
		String phone, Dates datebirthday) {
	
	this.DNI = dni;
	this.user = user;
	this.password = password;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.datebirthday = datebirthday;
	this.age = calculateAge();
	
}

	//Primary
	public UsersClass(String dni) {
		this.DNI = dni;
	}

////////////Getters y Setters
	
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Dates getDatebirthday() {
		return datebirthday;
	}

	public void setDatebirthday(Dates datebirthday) {
		this.datebirthday = datebirthday;
		this.setAge(calculateAge());
	}

	public int getAge() {
		return age=calculateAge();
	}

	public void setAge(int age) {
		this.age = this.calculateAge();
	}

////////////Methods
	public int calculateAge (){
		int age = 0;
		
		age= this.getDatebirthday().substyears();
		
		return age;
	}

///////CompareTO
	@Override
	public int compareTo(UsersClass user) {
		if(this.getDNI().compareTo(user.getDNI())>0)
			return 1;
		if(this.getDNI().compareTo(user.getDNI())<0)
			return -1;
		return 0;
	  }
	
///////////Equals
	@Override
	public boolean equals(Object user){
		return getDNI().equals(((UsersClass)user).getDNI());
	}
	
	
	public boolean equalsUser(Object user){
		return getUser().equals(((UsersClass)user).getUser());
	}
	public boolean equalsPass(Object user){
		return getPassword().equals(((UsersClass)user).getPassword());
	}
	
	
	
	
//////////toString

	@Override
	public String toString() {
	return null;
}
	
	//CLau
	public String toString(String dni) {
		String cad="";
		cad=cad+(this.getDNI()+"\n");
		return cad;
	}

}
