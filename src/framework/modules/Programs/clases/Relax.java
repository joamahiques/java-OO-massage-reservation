package framework.modules.Programs.clases;

import framework.SingletonApp;
import framework.classes.Dates;
import framework.functions.Format;
import framework.modules.settings.Lan.Languages;



public class Relax extends Programs{
	private String ambient;
	private Dates dateActivity;
	private Dates dateEndActivity;
	private int daysActivity;
	private float priceActivity;
	private float totalPrice;
//////////constructor	
	public Relax(String nameMa,Dates date,Dates dateexit, String hour, String duration, String activity,Dates dateActivity,Dates dateEndActivity,String nameClient,String dni,String tf, String ambient) {
		super(nameMa, date,dateexit, hour, duration, activity, nameClient, dni,tf);
		this.ambient = ambient;
		this.dateActivity=dateActivity;
		this.dateEndActivity = dateEndActivity;
		this.daysActivity=calculateDaysActivity();
		this.priceActivity=calculatePriceActivity();
		this.totalPrice=calculateTotalPrice();
	}
	public Relax() {
		super();
	}
	
	public Relax(String dni) {
		super(dni);
	}
	
	public Relax(int i, Object param) {
		switch(i){
			case 12:
				this.ambient=(String) param;
				break;
			case 13:
				this.dateActivity=(Dates)param;
				break;
			case 14:
				this.dateEndActivity=(Dates)param;
				break;
		}
	}
//////////getters i setters
	public Dates getDateActivity() {
		return dateActivity;
	}

	public void setDateActivity(Dates dateActivity) {
		this.dateActivity = dateActivity;;
	}

	public Dates getDateEndActivity() {
		return dateEndActivity;
	}

	public void setDateEndActivity(Dates dateEndActivity) {
		this.dateEndActivity = dateEndActivity;;
	}
	
	public int getDaysActivity() {
		return daysActivity = calculateDaysActivity();
	}
	
	public void setDaysActivity(int daysActivity) {
		this.daysActivity = this.calculateDaysActivity();
	}
	
	public float getPriceActivity() {
		return priceActivity = calculatePriceActivity();
	}
	
	public void setPriceActivity(float priceActivity) {
		this.priceActivity = this.calculatePriceActivity();
	}
	
	public float getTotalPrice() {
		return totalPrice = calculateTotalPrice();
	}
	
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = this.calculateTotalPrice();
	}
	
	public String getAmbient() {
		return ambient;
	}

	public void setAmbient(String ambient) {
		this.ambient = ambient;
	}

	
	
	public int calculateDaysActivity() {
		
		Dates diference=new Dates();
		this.daysActivity=diference.subst2datesDates(this.dateActivity, this.dateEndActivity);
		if(dateActivity.getDay()== 0) {
			this.daysActivity=0;
		}
		//System.out.println(this.daysActivity+" days");
		return this.daysActivity;
		
	}
	
	public float calculatePriceActivity() {
		float price=0F;
	
		if(getActivity()!="") {
			
			switch(getActivity()) {
	
			case "Sauna":
				price=price+(20*this.daysActivity);
				break;
			case "Yoga":
				price=price+(50*this.daysActivity);
				break;
			case "Ioga":
				price=price+(50*this.daysActivity);
				break;
			case "Meditation":
				price=price+(20*this.daysActivity);
				break;
			case "Meditación":
				price=price+(20*this.daysActivity);
				break;
			case "Meditació":
				price=price+(20*this.daysActivity);
				break;
			case "Gym":
				price=price+(10*this.daysActivity);
				break;
			case "Gimnasio":
				price=price+(10*this.daysActivity);
				break;
			case "Gimnàs":
				price=price+(10*this.daysActivity);
				break;
			}
			
			//descuento por numero de dias (5 o +) de actividad al precio de la actividad
			if(this.daysActivity>6) {
				price=price*0.95F;
			}
		}
		return price;
	}
	
	public float calculateTotalPrice() {
		float totalPrice=0F;
		totalPrice=getPrice()+getPriceActivity();
		
		return totalPrice;
	}
		
	//primary
	@Override
	public String toString(String dni) {
		String cad="";
		cad=cad+(getDni()+"\n");
		return cad;
	}

	@Override
	public String toString() {
		String res="";
		
		if(getActivity()!="") {
			res= Languages.message("relax")+"\n"
				+Languages.message("name")+getNameClient()+"\n"
				+"Dni: "+getDni()+"\n"+
				Languages.message("tf")+getTf()+"\n"
				+ Languages.message("massage")+ getNameMa()+"\n"
				+Languages.message("date")+ getDate()+"\n"
				+Languages.message("exitDate") + getDateexit()  +"\n"
				+Languages.message("days")+ getDays()  +"\n"
				+Languages.message("hour")+ getHour()+ "\n"
				+Languages.message("ambient")+getAmbient()+"\n"
				+Languages.message("duration")+ getDuration()+"\n"
				+Languages.message("price") + getPrice()+"\n"
				+Languages.message("activity")+getActivity()+"\n"
				+Languages.message("dateAct") +getDateActivity()+"\n"
				+Languages.message("dateEndAct")+getDateEndActivity()+"\n"
				+Languages.message("daysAct")+getDaysActivity()+"\n"
				+Languages.message("priceAct")+Format.formatCurrency(this.getPriceActivity(), SingletonApp.set)+"\n"
				+Languages.message("totalPrice")+Format.formatCurrency(this.getTotalPrice(), SingletonApp.set)+".";
				}else {
			res= Languages.message("relax")+"\n"
					+Languages.message("name")+getNameClient()+"\n"
					+"Dni: "+getDni()+"\n"+
					Languages.message("tf")+getTf()+"\n"
					+ Languages.message("massage")+ getNameMa()+"\n"
					+Languages.message("date")+ getDate()+"\n"
					+Languages.message("exitDate") + getDateexit()  +"\n"
					+Languages.message("days")+ getDays()  +"\n"
					+Languages.message("hour")+ getHour()+ "\n"
					+Languages.message("ambient")+getAmbient()+"\n"
					+Languages.message("duration")+ getDuration()+"\n"
					+Languages.message("price") +Format.formatCurrency(this.getPrice(), SingletonApp.set)+"\n";
		}
		
		return res;
	}
	
	
	
}

	
	
	
	
