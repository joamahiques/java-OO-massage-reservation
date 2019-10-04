package framework.modules.Users.clases;

import framework.classes.Dates;
import framework.modules.settings.Lan.Languages;



public class Client extends UsersClass{
	
	private Dates dateSingin;
	private int antique;

//////////CONSTRUCTORS
	public Client(String DNI,String user,String password,String name,String email,String phone,Dates datebirthday,Dates dateSingin) {
		super(DNI,user,password,name,email,phone,datebirthday);
		this.dateSingin = dateSingin;
		this.antique = antique;
	}

	public Client() {
		super();
	}
	
	public Client(String dni) {
		super(dni);
	}
	
/////////////GETTERS AND SETTERS
	public Dates getDateSingin() {
	return dateSingin;
	}
	
	public void setDateSingin(Dates dateSingin) {
		this.dateSingin = dateSingin;
		this.setAntique(calculateAntique());
	}
	
	public int getAntique() {
		return antique=calculateAntique();
	}
	
	public void setAntique(int antique) {
		this.antique = this.calculateAntique();
	}
	
//////////Calculate Antique
public int calculateAntique (){
	int years = 0;
	
	years= this.getDateSingin().substyears();
	
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
		
		
			res= Languages.message("client")+"\n"
				+Languages.message("name")+getName()+"\n"
				+"Dni: "+getDNI()+"\n"+
				Languages.message("tf")+getPhone()+"\n"
				+ Languages.message("user")+ getUser()+"\n"//
				+Languages.message("pass")+ getPassword()+"\n"//
				+Languages.message("email") + getEmail()  +"\n"//
				+Languages.message("birthday")+ getDatebirthday()  +"\n"//
				+Languages.message("age")+ getAge()+ "\n"//
				+Languages.message("singin")+getDateSingin()+"\n"//
				+Languages.message("antique")+ getAntique()+".";//
				
		
		return res;
	}
	
	
}
