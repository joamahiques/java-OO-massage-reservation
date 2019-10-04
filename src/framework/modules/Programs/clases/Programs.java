package framework.modules.Programs.clases;

import framework.classes.Dates;
//import framework.classes.Settings;
//import framework.functions.Languages.Languages;

public abstract class Programs implements Comparable<Programs>{
	
////////attributes
	private String dni;
	private String nameMa;
	private float price;
	private Dates date;
	private Dates dateexit;
	private int days;
	private String hour;
	private String duration;
	private String activity;
	private String nameClient;
	private String tf;

	
//////constructor
	public Programs(String nameMa,Dates date,Dates dateexit,String hour,String duration,String activity,String nameClient,String dni,String tf) {
		this.dni=dni;
		this.nameMa=nameMa;
		this.date=date;
		this.dateexit=dateexit;
		this.setDays(calculateDays());
		this.hour=hour;
		this.duration=duration;
		this.activity=activity;
		this.nameClient=nameClient;
		this.tf=tf;
		this.setPrice(calculatePriceProgram());
	}
	
	//buit
	public Programs() {
		
	}
	
	//Primary
	public Programs(String dni) {
		this.dni = dni;
	}
	
	
	
//////getters
	public String getNameMa() {
		return this.nameMa;
	}
	public float getPrice() {
		return price = calculatePriceProgram();
		//return price;
	}
	public Dates getDate() {
		return this.date;
	}
	public Dates getDateexit() {
		return this.dateexit;
	}
	public int getDays() {
		return days = calculateDays();
	}
	public String getHour() {
		return this.hour;
	}
	public String getDuration() {
		return this.duration;
	}
	public String getActivity() {
		return this.activity;
	}
	public String getNameClient() {
		return this.nameClient;
	}
	public String getDni() {
		return this.dni;
	}
	public String getTf() {
		return this.tf;
	}
	
///////setters
	public void setNameMa(String nameMa) {
		this.nameMa = nameMa;
	}
	public void setPrice(float price) {
		this.price = this.calculatePriceProgram();
	}
	public void setDate(Dates date) {
		this.date = date;
		//this.setDays(calculateDays());
	}
	public void setDateexit(Dates dateexit) {
		this.dateexit = dateexit;
		//this.setDays(calculateDays());
	}
	public void setDays(int days) {
		this.days= this.calculateDays();
		//this.setPrice(calculatePrice());
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public void setDuration(String duration) {
		this.duration = duration;
		this.setPrice(calculatePriceProgram());
	}
	public void setActivity(String activity) {
		this.activity = activity;
		this.setPrice(calculatePriceProgram());
	}
	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}
	public void setDni(String Dni) {
		dni = Dni;
	}
	public void setTf(String tf) {
		this.tf = tf;
	}

////////////Metodos
	
	///Calcula dias
	public int calculateDays() {
		
		Dates diference=new Dates();
		this.days=diference.subst2datesDates(this.date, this.dateexit);
		System.out.println(this.days+" days");
		return this.days;	
	}
	
	///calcula precio
	public float calculatePriceProgram() {
		float pricexnigth=100;///100€ la noche
		float price=0F;
		
		///num de noches
		price=pricexnigth*(this.days-1);//el precio es por noche
		System.out.println(this.days+" days precio");
		//System.out.println(price+" price");
		
		///descuentos por numero de noches al precio de las noches, No al total.
				if((this.days>=8)&&(this.days<16)) {///8-15 dies(7-14nits)
					price=(price*0.95F);//restamos un 5%
					System.out.println(price+" precio");
				}else if(this.days>=16) {//15 noches o +
					price=(price*0.92F);//restamos un 8%
				}
		
		//la duración del massaje
		if(this.getDuration()=="60 min") {
			price=price+60;
		}
		if(this.getDuration()=="30 min") {
			price=price+40;
		}
	
		//System.out.println(price+" price");
		return price;
	}
	
///////CompareTO
	@Override
	public int compareTo(Programs param) {//para ordenar los programas por nombre de cliente
		if(this.getDni().compareTo(param.getDni())>0)
			return 1;
		if(this.getDni().compareTo(param.getDni())<0)
			return -1;
		return 0;
	  }
	
//	//Relax
//	public int compareTo(Relax rel) {
//		if(this.getDni().compareTo(rel.getDni())>0)
//			return 1;
//		if(this.getDni().compareTo(rel.getDni())<0)
//			return -1;
//		return 0;
//	}
//	//Thera
//		public int compareTo(Therapeutic thera) {
//			if(this.getDni().compareTo(thera.getDni())>0)
//				return 1;
//			if(this.getDni().compareTo(thera.getDni())<0)
//				return -1;
//			return 0;
//		}
//	//Thera
//		public int compareTo(Muscular mus) {
//			if(this.getDni().compareTo(mus.getDni())>0)
//				return 1;
//			if(this.getDni().compareTo(mus.getDni())<0)
//				return -1;
//			return 0;
//		}
///////////Equals
	@Override
	public boolean equals(Object param){
		return getDni().equals(((Programs)param).getDni());
	}	

	
//////////toString

	@Override
	public String toString() {
	return null;
}
	
	//CLau
	public String toString(String dni) {
		String cad="";
		cad=cad+(this.getDni()+"\n");
		return cad;
	}

}
