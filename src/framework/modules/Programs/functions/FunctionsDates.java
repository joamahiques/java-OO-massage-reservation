/**
 * 
 */
package framework.modules.Programs.functions;

import java.util.Calendar;

import javax.swing.JOptionPane;

import framework.SingletonApp;
import framework.classes.Dates;
import framework.functions.Functions_valida;
import framework.modules.Programs.clases.Muscular;
import framework.modules.Programs.clases.Relax;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Programs.clases.Therapeutic;
import framework.modules.settings.Lan.Languages;

/**
 * @author joana
 *
 */
public class FunctionsDates {

/////////////////Programs
	//Start Date
		public static Dates datestart(String message, String title) {
			String dstart="";
			boolean res=false;
			int days=0;
			
				do {
					dstart=Functions_valida.validastring(message, title);//pedimos fecha
					res=Validate_data.validaDate(dstart);// validamos formato
					//System.out.println(res+" validatedate1");
					if(res==true) {
						SingletonApp.date1 =new Dates(dstart);//creamos nuevo
						//System.out.println(SingletonApp.date1.toString()+" validatedate2");
						res=SingletonApp.date1.validateDate();//validamos la fecha
						//System.out.println(res+" validatedate3");
						///compare
						if(res==true) {
							days=SingletonApp.date1.compareSysDates();// restar la fecha introduida a la actual(-1=anterior a hoy, 0=hoy,1=posterior a hoy)
							//System.out.println(days+" -1 anterior, 0 hoy, 1 posterior");
							if(days==-1) {// si es menor -1 es por que es anterior a hoy y no se puede reservar
								res=false;
								//System.out.println(res+" res");
							}
						}
					}
					
				}while(res==false);
				
				return SingletonApp.date1;
		}
	////ENd Date
		public static Dates dateend(String message, String title,Dates dstart) {
			String dend="";
			boolean res=false;
			int days=0;
			Dates dateend=new Dates();
			do {
				dend=Functions_valida.validastring(message, title);
				res=Validate_data.validaDate(dend);//formato
				//System.out.println(res+" validatedate1");
			
				if(res) {
					dateend=new Dates(dend);
					res=dateend.validateDate();
					//comparacion
						if(res) {//////que compare con la fecha de entreda/// 1=true
							days=dateend.compareDates(dstart);///comparamos finicio con fsalida para ver si es antes o despues, si sale -1 o 0 es false.
							
							if((days==-1)||(days==0)) {
								res=false;
							}
							//days=dateend.subst2dates(dend);// restafechas para saber el numero de dias
							//Se hace automático en la clase
						}
				}
			}while(res==false);
			
			return dateend;
		}
		
///////////////ACTIVITY DATES
		
		////start and end activity///// 
		
		public static Dates datesActivity(String message,String title,String activity,Dates date1, Dates date2) {
			Dates dateactivity=new Dates();
			String dstart="";
			boolean res=false;
			
			if(activity!="") {////si quiere actividad que escoja el dia:
				do {
					dstart=Functions_valida.validastring(message, title);//pedimos fecha
					res=Validate_data.validaDate(dstart);// validamos formato
					//System.out.println(res+" validate");
					if(res==true) {
						dateactivity =new Dates(dstart);//creamos nuevo
						res=dateactivity.validateDate();//validamos la fecha
						//System.out.println(res+" validate2");
						///comparacion
						if(res==true) {//la comparamos con la fecha de entrada y salida
							res=dateactivity.compareDatesactivity(date1, date2, dateactivity);///comparamos fechas con las de la reserva
							//System.out.println(res+" res comparedates");
						}
					}
					
				}while(res==false);
			}
				
			return dateactivity;
		}
		
///////////////////////UPDATE DATES
		
		/// Update dateStart Programs
		public static Dates updatedatesPrograms(String message, String title, Dates dateCompare,Dates dateactivity, String funct) {
			String dstart="";
			boolean res=false;
			int days=0;
			
				do {
					dstart=Functions_valida.validastring(message, title);//pedimos fecha
					res=Validate_data.validaDate(dstart);// validamos formato
					//System.out.println(res+" validatedate1");
					if(res==true) {
						SingletonApp.date1 =new Dates(dstart);//creamos nuevo
						res=SingletonApp.date1.validateDate();//validamos la fecha
						//System.out.println(res+" validatedate2");
						
						if(res==true) {
						
						//si modificamos la fecha de entrada START
							if(funct=="start") {
								
									days=SingletonApp.date1.compareSysDates();// restar la fecha introduida a la actual(-1=anterior a hoy, 0=hoy,1=posterior a hoy)
									//System.out.println(days+" -1 anterior, 0 hoy, 1 posterior");
									if(days==-1) {// si es menor -1 es por que es anterior a hoy y no se puede reservar
										res=false;
										System.out.println(res+" res1");
									}
									days=SingletonApp.date1.compareDates(dateCompare);//comparamos si es anterior a la fecha de salida
									//para true tiene que sera anterior=-1;
									if((days==1)||(days==0)) {
										res=false;
										//System.out.println(res+" res2");
									}
									//compare activity
									if(dateactivity.getDay()!= 0) {
										days=SingletonApp.date1.compareDates(dateactivity);//comparamos con la de la actividad
										//para true tiene que sera anterior=-1 o igual=0
										if(days==1) {
											res=false;//si es después de la fecha inicio actividad
											//System.out.println(res+" res3");
										}
									}
								}
						//// si modificamos la fecha de salida END
							if(funct=="end") {
				
									days=SingletonApp.date1.compareDates(dateCompare);///comparamos finicio con fsalida para ver si es antes o despues, si sale 1 o 0 es false.
									//System.out.println(days+" n");
									if((days==-1)||(days==0)) {
										res=false;
									}//end if
									//compare activity
									if(dateactivity.getDay()!= 0) {
									days=SingletonApp.date1.compareDates(dateactivity);//comparamos con la de la actividad
									if(days==-1) {
										res=false;//si es antes de la fecha fin actividad, false
									}
									}
							}//end if	
								
						}//end if
					}//end if
				}while(res==false);
				
				return SingletonApp.date1;
		}
		
		public static void updateDateActivity() {
			if(SingletonPrograms.massage1 instanceof Relax) {
				((Relax)SingletonPrograms.massage1).setDateActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateActivity"), Languages.menuTitleGe("programs"),(((Relax)SingletonPrograms.massage1).getActivity()),(((Relax)SingletonPrograms.massage1).getDate()), (((Relax)SingletonPrograms.massage1).getDateexit())));
				((Relax)SingletonPrograms.massage1).setDateEndActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateEndActivity"), Languages.menuTitleGe("programs"),(((Relax)SingletonPrograms.massage1).getActivity()),(((Relax)SingletonPrograms.massage1).getDateActivity()), (((Relax)SingletonPrograms.massage1).getDateexit())));
				if (((Relax) SingletonPrograms.massage1).getActivity()=="") {
					JOptionPane.showMessageDialog(null,  Languages.message("activitynull"));
				}
			}
			if(SingletonPrograms.massage1 instanceof Therapeutic) {
				((Therapeutic)SingletonPrograms.massage1).setDateActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateActivity"), Languages.menuTitleGe("programs"),(((Therapeutic)SingletonPrograms.massage1).getActivity()),(((Therapeutic)SingletonPrograms.massage1).getDate()), (((Therapeutic)SingletonPrograms.massage1).getDateexit())));
				((Therapeutic)SingletonPrograms.massage1).setDateEndActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateEndActivity"), Languages.menuTitleGe("programs"),(((Therapeutic)SingletonPrograms.massage1).getActivity()),(((Therapeutic)SingletonPrograms.massage1).getDateActivity()), (((Therapeutic)SingletonPrograms.massage1).getDateexit())));
				if (((Therapeutic) SingletonPrograms.massage1).getActivity()=="") {
					JOptionPane.showMessageDialog(null,  Languages.message("activitynull"));
				}
			}
			if(SingletonPrograms.massage1 instanceof Muscular) {
				((Muscular)SingletonPrograms.massage1).setDateActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateActivity"), Languages.menuTitleGe("programs"),(((Muscular)SingletonPrograms.massage1).getActivity()),(((Muscular)SingletonPrograms.massage1).getDate()), (((Muscular)SingletonPrograms.massage1).getDateexit())));
				((Muscular)SingletonPrograms.massage1).setDateEndActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateEndActivity"), Languages.menuTitleGe("programs"),(((Muscular)SingletonPrograms.massage1).getActivity()),(((Muscular)SingletonPrograms.massage1).getDateActivity()), (((Muscular)SingletonPrograms.massage1).getDateexit())));
				if (((Muscular) SingletonPrograms.massage1).getActivity()=="") {
					JOptionPane.showMessageDialog(null, Languages.message("activitynull"));
				}
			}
		}
///////////////////RANDOM Dates for DUMMIES
		public static Dates todayDates() {
			Calendar system = Calendar.getInstance();
			SingletonApp.date1=new Dates(system);
			return SingletonApp.date1;
			
		}
		public static Dates randomDates() {
			int dias=0;
			Calendar system = Calendar.getInstance();
			dias = (int) (Math.random() * 20) + 1;
			system.add(Calendar.DAY_OF_YEAR, dias);  
			SingletonApp.date1=new Dates(system);
			
			
			return SingletonApp.date1;
			
		}
		
		public static Dates randomDatesActivity(Dates date1,Dates date2) {
			int dias=0;
			boolean res=true;
			
			do {
					Calendar system = Calendar.getInstance();
					dias = (int) (Math.random() * 15) + 1;
					system.add(Calendar.DAY_OF_YEAR, dias);  
					SingletonApp.date1=new Dates(system);
					
					res=SingletonApp.date1.compareDatesactivity(date1, date2,SingletonApp.date1);
					
			}while(res==false);
			
			return SingletonApp.date1;
		}
		
}
