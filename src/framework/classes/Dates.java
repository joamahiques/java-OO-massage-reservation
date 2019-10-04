
package framework.classes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
//import java.util.Iterator;

import framework.SingletonApp;
//import java.util.ArrayList;
public class Dates {

	////attributes
	private String date;
	private int day;
	private int month;
	private int year;
	private SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
	
		
	///////////Constructores
	    
	public Dates() {
	}
	
	public Dates(int day, int month, int year) {
	    this.day = day;
	    this.month = month;
	    this.year = year;
	   
	}
	
	public Dates (String askdate) {
		
		   //String [] SplitArray = new String [3];
		    String[] SplitArray=null;
		    String fechaform=null;
		   
			switch (SingletonApp.set.getDate()) {
				case "dd/mm/yyyy":
					SplitArray=askdate.split("/");
					this.day=Integer.parseInt(SplitArray[0]);
					this.month=Integer.parseInt(SplitArray[1]);
					this.year=Integer.parseInt(SplitArray[2]);
					fechaform=day+"/"+month+"/"+year;
					this.date=fechaform;
					break;
				case "dd-mm-yyyy":
					SplitArray = askdate.split("-");
					this.day=Integer.parseInt(SplitArray [0]);
					this.month=Integer.parseInt(SplitArray [1]);
					this.year=Integer.parseInt(SplitArray [2]);
					fechaform=day+"-"+month+"-"+year;
					this.date=fechaform;
					break;
				
				case "yyyy/mm/dd":
					SplitArray = askdate.split("/");
					this.day=Integer.parseInt(SplitArray [2]);
					this.month=Integer.parseInt(SplitArray [1]);
					this.year=Integer.parseInt(SplitArray [0]);
					fechaform=day+"/"+month+"/"+year;
					this.date=fechaform;
					break;
				case "yyyy-mm-dd":
					SplitArray = askdate.split("-");
					this.day=Integer.parseInt(SplitArray [2]);
					this.month=Integer.parseInt(SplitArray [1]);
					this.year=Integer.parseInt(SplitArray [0]);
					fechaform=day+"-"+month+"-"+year;
					this.date=fechaform;
					break;
			}//end switch	
			
	}
	

	////le pasamos un calendar
	public Dates(Calendar date1) {
	    this.day = date1.get(Calendar.DATE);
	    this.month = date1.get(Calendar.MONTH) + 1;
	    this.year = date1.get(Calendar.YEAR);
	}
	//le pasamos un gregorian
	public Dates(GregorianCalendar fecha) {
	    this.day = fecha.get(Calendar.DATE);
	    this.month = fecha.get(Calendar.MONTH) + 1;
	    this.year = fecha.get(Calendar.YEAR);
	}
	
	//le pasamos un Date
	public Dates(Date fecha) {// evito utilizar métodos obsoletos
	    
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(fecha);
	
	    this.day = cal.get(Calendar.DAY_OF_MONTH);
	    this.month = cal.get(Calendar.MONTH) + 1;
	    this.year= cal.get(Calendar.YEAR);
	}
	
	////getters and setters
		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			
			String [] datearray = new String [3];
			switch (SingletonApp.set.getDate()) {
				case "dd/mm/yyyy":
					datearray = date.split("/");
					this.day=Integer.parseInt(datearray [0]);
					this.month=Integer.parseInt(datearray [1]);
					this.year=Integer.parseInt(datearray [2]);
					this.date=day+"/"+month+"/"+year;
					break;
				
				case "dd-mm-yyyy":
					datearray = date.split("-");
					this.day=Integer.parseInt(datearray [0]);
					this.month=Integer.parseInt(datearray [1]);
					this.year=Integer.parseInt(datearray [2]);
					this.date=day+"/"+month+"/"+year;
					break;
				
				case "yyyy/mm/dd":
					datearray = date.split("/");
					this.day=Integer.parseInt(datearray [2]);
					this.month=Integer.parseInt(datearray [1]);
					this.year=Integer.parseInt(datearray [0]);
					this.date=day+"/"+month+"/"+year;
					break;
				case "yyyy-mm-dd":
					datearray = date.split("-");
					this.day=Integer.parseInt(datearray [2]);
					this.month=Integer.parseInt(datearray [1]);
					this.year=Integer.parseInt(datearray [0]);
					this.date=day+"/"+month+"/"+year;
					break;
			}
		}
		

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
			this.date = (day+"/"+this.month+"/"+this.year);
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
			this.date = (this.day+"/"+month+"/"+this.year);
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
			this.date = (this.day+"/"+this.month+"/"+year);
		}

		public SimpleDateFormat getFormat() {
			return format;
		}

		public void setFormat(SimpleDateFormat format) {
			this.format = format;
		}
	

///////////////////////////	    
		
	    // String To Calendar
		public Calendar StringToCalendar(String date){//string date
			Date DDate = new Date();
			Calendar cal=new GregorianCalendar();
			try{
				DDate = format.parse(date);
				cal.setTime(DDate);
			}catch (ParseException e){
				e.printStackTrace();
			}
			return cal;
			
		}
		
		///Calendar TO String
		public static String CalendartoString(){
		      Calendar cal = Calendar.getInstance();
		      return (cal.getTime().toString());
		   }
		
		///de DATES to CALENDAR
		public static Calendar datestocalendar(Dates date) {
	        Calendar fec = Calendar.getInstance();

	        fec.set(date.getYear(), date.getMonth()-1, date.getDay());

	        return fec;
	    }
		
	     // CALENDAR TO DATES
	   public static Dates pideCal(Calendar date1) {
	 
	        return new Dates(date1);
	    }
	   
	   ////Gregorian to DAtes
	   public static Dates pideGregCal(GregorianCalendar fecha) {
	        return new Dates(fecha);
	    }
	    
		///DATES TO STRING
	    public String toStringDate(){
			String date=null;
			date=this.day+"/"+this.month+"/"+this.year;
			return date;
		}
	    
	    
	    //Transforma una fecha DATES a Date.// Obsoleto
	     
	    public Date DatesToDate(Dates date1) {
	        // obsoleto Date
	        Date fec;
	        
	        Calendar cal = Calendar.getInstance();
	        cal.set(date1.getYear(), date1.getMonth(), date1.getDay());

	        fec = cal.getTime();

	        return fec;
	    }
		
	    ///De Date a DATES
	    public Dates DateToDates(Date fecha) {
	        
	    	return new Dates(fecha);
	    }
		
	    /*Compara la fecha Fecha con la del sistema. Si la fecha de
	      refencia es anterior a la del sistema, devuelve -1. Si la fecha de
	      refencia es posterior a la del sistema, devuelve 1. Si la fecha de
	      refencia es igual a la del sistema, devuelve 0.*/
		public int compareSysDates() {
	        int res;
	        Calendar system = Calendar.getInstance();
	        Calendar date = Calendar.getInstance();

	        date.set(this.year, this.month - 1, this.day);

	        res = date.compareTo(system);

	        return res;
	    }
		
		
//		 Compara la fecha Fecha de referencia con una segunda fecha Fecha. Si la
//	     * fecha de refencia es anterior a la segunda fecha, devuelve -1. Si la
//	     * fecha de refencia es posterior a la segunda fecha, devuelve 1. Si la
//	     * fecha de refencia es igual a la segunda fecha, devuelve 0.
//		 
		//comparafechas de inicio y salida o dos fechas
		public int compareDates(Dates date2){
			 
			 int resultado;
		        Calendar fecha1 = Calendar.getInstance();
		        Calendar fecha2 = Calendar.getInstance();

		        fecha1.clear();
		        fecha2.clear();

		        fecha1.set(this.year, this.month - 1, this.day);//fecha salida
		        fecha2.set(date2.getYear(), date2.getMonth() - 1, date2.getDay());//fecha entrada

		        resultado = fecha1.compareTo(fecha2);

		        return resultado;//1=true
		}
			
/////Calcular edad	
		
		public int substyears (/*Dates datebirt*/){
			int rest, year1,year2;
			
//			Calendar today=new GregorianCalendar();
//			Calendar dateBirthday=new GregorianCalendar();
//			
//			dateBirthday=datestocalendar(datebirt);
//			year1=today.get(Calendar.YEAR);
//			year2=dateBirthday.get(Calendar.YEAR);

			Calendar fecha1 = Calendar.getInstance();
			Calendar fecha2 = this.StringToCalendar(date);

			year1 = fecha1.get(Calendar.YEAR);
			year2 = fecha2.get(Calendar.YEAR);
			rest=(year1-year2);
			
			return rest;
		}
		
		
		
		/// NUM of DAYS restafechas Fechas intro por el usuario 
		///Para la función dateend!!!
		//NO LA UTILIZAMOS AL CALCULARSE SOLO LOS DIAS
		
		public int subst2dates(String date2){
			int rest, day1,day2;
			
			Calendar cal1=new GregorianCalendar();
			Calendar cal2=new GregorianCalendar();
			cal1=(datestocalendar(framework.SingletonApp.date1));
			cal2=(StringToCalendar(date2));
	
			day1=cal1.get(Calendar.DAY_OF_YEAR);
			//System.out.println(day1+" day1");
			day2=cal2.get(Calendar.DAY_OF_YEAR);
			//System.out.println(day2+" day2");
			
			rest=(day2-day1)+1;
			
			///por si cambiamos de año
			if(rest<=0) {
				rest=rest+365;
			}
			
			return rest;
		}
		
		/// NUM of DAYS restafechas Fechas intro por el usuario 
		///Para la función para sacar los dias en el CRUD
		
		public int subst2datesDates(Dates date1, Dates date2){
			int  rest ,day1,day2;
			
			Calendar cal1=new GregorianCalendar();
			Calendar cal2=new GregorianCalendar();
			cal1=(datestocalendar(date1));
			cal2=(datestocalendar(date2));
	
			day1=cal1.get(Calendar.DAY_OF_YEAR);
			//System.out.println(day1+" day1");
			day2=cal2.get(Calendar.DAY_OF_YEAR);
			//System.out.println(day2+" day2");
			
			rest=(day2-day1)+1;
			///por si cambiamos de año
			if(rest<=0) {
				rest=rest+365;
			}
			
			return rest;
		}

	
		//Valida si una fecha Fecha es correcta (el día existe en el mes indicado).
		public boolean validateDate() {
	        boolean res= true;
	        GregorianCalendar date = new GregorianCalendar();
	        int dias_mes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	        if ((this.month < 1) || (this.month > 12)) {
	            res = false;
	        }

	        if (res) {
	            date.set(this.year, this.month, this.day);

	            if (date.isLeapYear(this.year)) {
	                dias_mes[2] = 29;
	            }

	            if ((this.day < 1) || (this.day > dias_mes[this.month])) {
	                res = false;
	            }
	        }

	        return res;
	    }
		
/////////////////FOR ACTIVITIES		
	
		////Comparafechas de actividades  True or False
	
			
				public boolean compareDatesactivity(Dates date1,Dates date2,Dates startactivity) {
					int i=0;
					int j=0;
					boolean res=false;
					Calendar enter=Calendar.getInstance();
					Calendar exit=Calendar.getInstance();
					Calendar activity=Calendar.getInstance();
					enter.clear();
					exit.clear();
					activity.clear();
					enter.set(date1.getYear(), date1.getMonth() - 1, date1.getDay());
					exit.set(date2.getYear(), date2.getMonth() - 1, date2.getDay());
					activity.set(startactivity.getYear(), startactivity.getMonth() - 1, startactivity.getDay());
//					System.out.println(enter.getTime()+" calentrada");
//					System.out.println(exit.getTime()+" calsalida");
//					System.out.println(activity.getTime()+" fecha between");
					i=activity.compareTo(enter);
					j=activity.compareTo(exit);
//					System.out.println(i+" i");
//					System.out.println(j+" j");
					if((i==0||i==1) && (j==0||j==-1)) {///si la fecha de la actividad es igual o está comprendida entre las fechas de reserva
						res=true;
					}
					return res;
				}
			
			
	    /////TO STRING
		@Override
		public String toString() {//string date
			
			String cad = "";
			switch (SingletonApp.set.getDate()) {
				case "dd/mm/yyyy":
					cad =String.format("%02d", this.getDay())+"/"+String.format("%02d", this.getMonth())+"/"+this.getYear();
					break;
				case "dd-mm-yyyy":
					cad = String.format("%02d", this.getDay())+"-"+String.format("%02d", this.getMonth())+"-"+this.getYear();
					break;
				case "yyyy/mm/dd":
					cad = this.getYear()+"/"+String.format("%02d", this.getMonth())+"/"+String.format("%02d", this.getDay());
					break;
				case "yyyy-mm-dd":
					cad = this.getYear()+"-"+String.format("%02d", this.getMonth())+"-"+String.format("%02d", this.getDay());
					break;
			}
			return cad;
		
			//return "Date=" + date + ", day=" + day + ", month=" + month + ", year=" + year+".";
		}
			
			
}
