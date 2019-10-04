package framework.modules.Programs.functions;
import javax.swing.JOptionPane;

import framework.SingletonApp;
import framework.functions.Functions_menu;
import framework.functions.Functions_valida;
import framework.modules.Programs.clases.Muscular;
import framework.modules.Programs.clases.Relax;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Programs.clases.Therapeutic;
import framework.modules.settings.Lan.Languages;

public class Functions_data {
	

	///massage:
		public static String askmassage(int i){
	
			String nameMa="";
		
			if(i==0) {	
				nameMa=Functions_menu.combobox(Languages.menu("massageRel"),Languages.menuTitle("massage"), Languages.menuTitleGe("massages"));
			}
			if(i==1) {	
				nameMa=Functions_menu.combobox(Languages.menu("massageTher"),Languages.menuTitle("massage"), Languages.menuTitleGe("massages"));
			}
			if(i==2) {	
				nameMa=Functions_menu.combobox(Languages.menu("massageMus"),Languages.menuTitle("massage"), Languages.menuTitleGe("massages"));
			}
			return nameMa;
			
		  }
	
	///name:
		public static String Name(){
			String name="";
			boolean res=false;
			
			do {
				 name=Functions_valida.validastring(Languages.menuTitle("name"), Languages.menuTitleGe("programs"));
				 res=Validate_data.validaName(name);
			
			}while(res==false);
			return name;
			
		  }
	
	///tf:
		public static String Tf(){
		String tf="";
		boolean res=false;
		
		do {
			 tf=Functions_valida.validastring(Languages.menuTitle("tf"),  Languages.menuTitleGe("programs"));
			 res=Validate_data.validaTf(tf);
		
		}while(res==false);
		return tf;
		
	  }
	
	///DNI:
		public static String dni(){
			String dni="";
			boolean res=false;
			
			do {
				 dni=Functions_valida.validastring(Languages.menuTitle("dni"), "DNI");
				 res=Validate_data.validaDNI(dni);
			
			}while(res==false);
			return dni;
			
		  }
	
	/// TOTAL PRICE: num dies+ 1 massage + una activity
		public static float price(String duration,int numdays, String activity){
			float pricexday=100;
			float price=0F;
			
			///num de noches
			price=pricexday*(numdays-1);
			
			//la duración del massaje
			if(duration=="60 min") {
				price=price+60;
			}
			if(duration=="30 min") {
				price=price+40;
			}
			
			///la actividad
			
			if(activity!="") {
				
				switch(activity) {
		
				case "Sauna":
					price=price+20;
					break;
				case "Yoga":
					price=price+50;
					break;
				case "Meditation":
					price=price+20;
					break;
				case "Gym":
					price=price+10;
					break;
				}
				
			}
			///descuentos por numero de noches
			if(numdays<9) {///7 noches
				price=(price*0.95F);//restamos un 5%
			}else if(numdays>16) {//15 noches
				price=(price*0.92F);//restamos un 8%
			}
			
			return price;
		}
		
	///Date	
		public static String askdate() {
			String date="";
			boolean res=false;
			do {
				date=Functions_valida.validastring("", "");
				res=Validate_data.validaDate(date);
			}while(res==false);
			return date;
		}
		
	///ACTIVITIES
		//choose
		public static String OptionsActivity(String message, String title) {//// yes=true, not=false

			String activities="";
			int opt=0;
			
			int confirm = JOptionPane.showConfirmDialog(null,message);//preguntamos si queremos actividades
			
			if (JOptionPane.OK_OPTION == confirm) {///cuales?
				
				opt=Functions_menu.validabot(Languages.menu("activity"), Languages.menuTitle("menu_crud"), Languages.menuTitleGe("programs"));
				
				switch(opt) {
				case -1:
					break;
				case 0:
					activities="Sauna";
					break;
				case 1:
					if(SingletonApp.set.getLanguage()=="en") {
						activities="Yoga";
					}
					if(SingletonApp.set.getLanguage()=="es") {
						activities="Yoga";
					}
					if(SingletonApp.set.getLanguage()=="val") {
						activities="Ioga";
					}
					break;
				case 2:
					if(SingletonApp.set.getLanguage()=="en") {
						activities="Meditation";
					}
					if(SingletonApp.set.getLanguage()=="es") {
						activities="Meditación";
					}
					if(SingletonApp.set.getLanguage()=="val") {
						activities="Meditació";
					}
					break;
				case 3:
					if(SingletonApp.set.getLanguage()=="en") {
						activities="Gym";
					}
					if(SingletonApp.set.getLanguage()=="es") {
						activities="Gimnasio";
					}
					if(SingletonApp.set.getLanguage()=="val") {
						activities="Gimnàs";
					}
					break;
				}
			}
			System.out.println(SingletonApp.set.getLanguage()+ " lang");
			System.out.println(activities+ " activityang");
			return activities;
		}
		
		
		//Update
		public static void UpdateActivity() {
			if(SingletonPrograms.massage1 instanceof Relax) {
				((Relax)SingletonPrograms.massage1).setActivity(Functions_data.OptionsActivity(Languages.menuTitle("activity"),  Languages.menuTitleGe("programs")));
				if(((Relax) SingletonPrograms.massage1).getDateActivity().getDay()== 0) {//si es de NO a SI, pregunta las fechas
					((Relax)SingletonPrograms.massage1).setDateActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateActivity"), Languages.menuTitleGe("programs"),(((Relax)SingletonPrograms.massage1).getActivity()),(((Relax)SingletonPrograms.massage1).getDate()), (((Relax)SingletonPrograms.massage1).getDateexit())));
					((Relax)SingletonPrograms.massage1).setDateEndActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateEndActivity"), Languages.menuTitleGe("programs"),(((Relax)SingletonPrograms.massage1).getActivity()),(((Relax)SingletonPrograms.massage1).getDateActivity()), (((Relax)SingletonPrograms.massage1).getDateexit())));
				}else if (((Relax) SingletonPrograms.massage1).getActivity()=="") {//si es de SI a NO
					((Relax)SingletonPrograms.massage1).setDateActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateActivity"), Languages.menuTitleGe("programs"),(((Relax)SingletonPrograms.massage1).getActivity()),(((Relax)SingletonPrograms.massage1).getDate()), (((Relax)SingletonPrograms.massage1).getDateexit())));
					((Relax)SingletonPrograms.massage1).setDateEndActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateEndActivity"), Languages.menuTitleGe("programs"),(((Relax)SingletonPrograms.massage1).getActivity()),(((Relax)SingletonPrograms.massage1).getDateActivity()), (((Relax)SingletonPrograms.massage1).getDateexit())));
				}
			}
			if(SingletonPrograms.massage1 instanceof Therapeutic) {
				((Therapeutic)SingletonPrograms.massage1).setActivity(Functions_data.OptionsActivity(Languages.menuTitle("activity"),  Languages.menuTitleGe("programs")));
				if(((Therapeutic) SingletonPrograms.massage1).getDateActivity().getDay()== 0) {//si es de NO a SI, pregunta las fechas
					((Therapeutic)SingletonPrograms.massage1).setDateActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateActivity"), Languages.menuTitleGe("programs"),(((Therapeutic)SingletonPrograms.massage1).getActivity()),(((Therapeutic)SingletonPrograms.massage1).getDate()), (((Therapeutic)SingletonPrograms.massage1).getDateexit())));
					((Therapeutic)SingletonPrograms.massage1).setDateEndActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateEndActivity"), Languages.menuTitleGe("programs"),(((Therapeutic)SingletonPrograms.massage1).getActivity()),(((Therapeutic)SingletonPrograms.massage1).getDateActivity()), (((Therapeutic)SingletonPrograms.massage1).getDateexit())));
				}else if (((Therapeutic) SingletonPrograms.massage1).getActivity()=="") {//si es de SI a NO
					((Therapeutic)SingletonPrograms.massage1).setDateActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateActivity"), Languages.menuTitleGe("programs"),(((Therapeutic)SingletonPrograms.massage1).getActivity()),(((Therapeutic)SingletonPrograms.massage1).getDate()), (((Therapeutic)SingletonPrograms.massage1).getDateexit())));
					((Therapeutic)SingletonPrograms.massage1).setDateEndActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateEndActivity"), Languages.menuTitleGe("programs"),(((Therapeutic)SingletonPrograms.massage1).getActivity()),(((Therapeutic)SingletonPrograms.massage1).getDateActivity()), (((Therapeutic)SingletonPrograms.massage1).getDateexit())));
				}
			}
			if(SingletonPrograms.massage1 instanceof Muscular) {
				((Muscular)SingletonPrograms.massage1).setActivity(Functions_data.OptionsActivity(Languages.menuTitle("activity"), Languages.menuTitleGe("programs")));
				if(((Muscular) SingletonPrograms.massage1).getDateActivity().getDay()== 0) {//si es de NO a SI, pregunta las fechas
					((Muscular)SingletonPrograms.massage1).setDateActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateActivity"), Languages.menuTitleGe("programs"),(((Muscular)SingletonPrograms.massage1).getActivity()),(((Muscular)SingletonPrograms.massage1).getDate()), (((Muscular)SingletonPrograms.massage1).getDateexit())));
					((Muscular)SingletonPrograms.massage1).setDateEndActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateEndActivity"), Languages.menuTitleGe("programs"),(((Muscular)SingletonPrograms.massage1).getActivity()),(((Muscular)SingletonPrograms.massage1).getDateActivity()), (((Muscular)SingletonPrograms.massage1).getDateexit())));
				}else if (((Muscular) SingletonPrograms.massage1).getActivity()=="") {//si es de SI a NO
					((Muscular)SingletonPrograms.massage1).setDateActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateActivity"), Languages.menuTitleGe("programs"),(((Muscular)SingletonPrograms.massage1).getActivity()),(((Muscular)SingletonPrograms.massage1).getDate()), (((Muscular)SingletonPrograms.massage1).getDateexit())));
					((Muscular)SingletonPrograms.massage1).setDateEndActivity(FunctionsDates.datesActivity(Languages.menuTitle("dateEndActivity"), Languages.menuTitleGe("programs"),(((Muscular)SingletonPrograms.massage1).getActivity()),(((Muscular)SingletonPrograms.massage1).getDateActivity()), (((Muscular)SingletonPrograms.massage1).getDateexit())));
				}
			}
		}
		
}
