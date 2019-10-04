package framework.modules.Users.clases;

import framework.classes.Dates;
import framework.modules.settings.Lan.Languages;

public class Admin extends UsersClass {
	
	private Dates dateContract;
	private int antique;

//////////CONSTRUCTORS
	public Admin(String DNI,String user,String password,String name,String email,String phone,Dates datebirthday,Dates dateContract) {
		super(DNI,user,password,name,email,phone,datebirthday);
		this.dateContract = dateContract;
		this.antique = antique;
	}

	public Admin() {
		super();
	}
	
	public Admin(String dni) {
		super(dni);
	}

	
/////////////GETTERS AND SETTERS
	public Dates getDateContract() {
	return dateContract;
	}
	
	public void setDateContract(Dates dateContract) {
		this.dateContract = dateContract;
		this.setAntique(calculateAntique());
	}
	
	public int getAntique() {
		return antique=calculateAntique();
	}
	
	public void setAntique(int antique) {
		this.antique =  this.calculateAntique();;
	}
	
//////////Calculate Antique
	public int calculateAntique (){
		int years = 0;
		
		years= this.getDateContract().substyears();
		
		return years;
	}
	
/////////////to String
	//primary
		@Override
		public String toString(String dni) {
			String cad="";
			cad=cad+(getDNI()+"\n");
			return cad;
		}
	
	@Override
	public String toString() {
		String res="";
		
		
			res= Languages.message("admin")+"\n"
				+Languages.message("name")+getName()+"\n"
				+"Dni: "+getDNI()+"\n"+
				Languages.message("tf")+getPhone()+"\n"
				+ Languages.message("user")+ getUser()+"\n"//
				+Languages.message("pass")+ getPassword()+"\n"//
				+Languages.message("email") + getEmail()  +"\n"//
				+Languages.message("birthday")+ getDatebirthday()  +"\n"//
				+Languages.message("age")+ getAge()+ "\n"//
				+Languages.message("contract")+getDateContract()+"\n"
				+Languages.message("antique")+ getAntique()+".";
				
		
		return res;
	}
	
	
}
