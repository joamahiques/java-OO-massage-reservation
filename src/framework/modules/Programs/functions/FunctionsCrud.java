package framework.modules.Programs.functions;

import javax.swing.JOptionPane;

import framework.classes.Dates;
import framework.functions.Functions_menu;
import framework.functions.Functions_valida;
import framework.modules.Programs.clases.Muscular;
import framework.modules.Programs.clases.Relax;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Programs.clases.Therapeutic;
import framework.modules.Programs.functions.CRUD.FunctionsFind;
import framework.modules.settings.Lan.Languages;

public class FunctionsCrud {
	


/////////////ASK DNIs
	
	public static Relax askDNIRelax () {

		SingletonPrograms.DNI=Functions_data.dni();
		//System.out.println(SingletonPrograms.DNI+ "askDNI relax");
		
		return new Relax (SingletonPrograms.DNI);
	}
	
	public static Therapeutic askDNIThera () {
		
		SingletonPrograms.DNI=Functions_data.dni();
		
		return new Therapeutic (SingletonPrograms.DNI);
	}
	public static Muscular askDNIMuscular () {
		
		SingletonPrograms.DNI=Functions_data.dni();
		
		return new Muscular(SingletonPrograms.DNI);
	}
	
//////////////CREATE	
	
	public static void createmassage(int i) {
		

		String tf="",duration="",activity="",nameClient="", hour="",dni="",nameMa="",ambient="",therapy="",zone="";
		String[] tipoD= {"30 min","60 min"};
		String[] tipoH= {"10:00","11:00","12:00","17:00","18:00"};
		Dates date;
		Dates dateexit;
		Dates dateactivity;
		Dates dateEndactivity;
		
				nameClient=Functions_data.Name();
				dni=SingletonPrograms.DNI;
				tf=Functions_data.Tf();
				date=FunctionsDates.datestart(Languages.menuTitle("dateStart"),  Languages.menuTitleGe("programs"));
				dateexit=FunctionsDates.dateend(Languages.menuTitle("dateEnd"), Languages.menuTitleGe("programs"),date);				
			
			//relax
			if(SingletonPrograms.opt==0) {	
				nameMa=Functions_data.askmassage(0);
				ambient=Functions_menu.combobox(Languages.menu("ambient"),Languages.menuTitle("ambient"),  Languages.menuTitleGe("programs"));
			}
			//thera
			if(SingletonPrograms.opt==1) {	
				nameMa=Functions_data.askmassage(1);
				therapy=Functions_menu.combobox(Languages.menu("therapy"), Languages.menuTitle("therapy"),  Languages.menuTitleGe("programs")); 
			}
			//muscular
			if(SingletonPrograms.opt==2) {	
				nameMa=Functions_data.askmassage(2);
				zone=Functions_menu.combobox(Languages.menu("zone"), Languages.menuTitle("zone"),  Languages.menuTitleGe("programs"));
			}
			
			hour=Functions_menu.combobox(tipoH,Languages.menuTitle("hour"),  Languages.menuTitleGe("programs"));
			duration=Functions_menu.combobox(tipoD,Languages.menuTitle("duration"),  Languages.menuTitleGe("programs"));
			activity=Functions_data.OptionsActivity(Languages.menuTitle("activity"),  Languages.menuTitleGe("programs"));
			dateactivity=FunctionsDates.datesActivity(Languages.menuTitle("dateActivity"), Languages.menuTitleGe("programs"),activity,date, dateexit);
			dateEndactivity=FunctionsDates.datesActivity(Languages.menuTitle("dateEndActivity"), Languages.menuTitleGe("programs"), activity, dateactivity, dateexit);
			
			if(SingletonPrograms.opt==0) {//relax
				SingletonPrograms.massage1=new Relax(nameMa,date,dateexit,hour,duration,activity,dateactivity,dateEndactivity,nameClient,dni,tf,ambient);
				SingletonPrograms.programRelax.add((Relax) SingletonPrograms.massage1);
//				for(int x=0;x<SingletonPrograms.programRelax.size();x++) {
//					  System.out.println(SingletonPrograms.programRelax.get(x));
//					}
			}
			if(SingletonPrograms.opt==1) {//thera
				SingletonPrograms.massage1=new Therapeutic(nameMa,date,dateexit, hour,duration,activity,dateactivity,dateEndactivity,nameClient,dni,tf,therapy);
				SingletonPrograms.programThera.add((Therapeutic) SingletonPrograms.massage1);
			}
			if(SingletonPrograms.opt==2) {//muscular
				SingletonPrograms.massage1=new Muscular(nameMa,date,dateexit, hour,duration,activity,dateactivity,dateEndactivity,zone,nameClient,dni,tf);
				SingletonPrograms.programMuscular.add((Muscular) SingletonPrograms.massage1);
			}
	
	}

	
///////////////UPDATE
	
	////Update DNI:relax
	public static void updateDniRelax (Relax r1){
		int location = -1;
		r1 = askDNIRelax();
		location = FunctionsFind.findRelax(r1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, Languages.message("error"), Languages.message("error"), JOptionPane.ERROR_MESSAGE);
		}else {
			SingletonPrograms.massage1.setDni(SingletonPrograms.DNI);
		}
	}
	////Update DNI:Thera
	public static void updateDniThera (Therapeutic t1){
		int location = -1;
		t1 = askDNIThera();
		location = FunctionsFind.findThera(t1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, Languages.message("error"), Languages.message("error"), JOptionPane.ERROR_MESSAGE);
		}else {
			SingletonPrograms.massage1.setDni(SingletonPrograms.DNI);
		}
	}
	////Update DNI:Muscular
	public static void updateDniMuscular (Muscular m1){
		int location = -1;
		m1 = askDNIMuscular();
		location = FunctionsFind.findMuscular(m1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, Languages.message("error"), Languages.message("error"), JOptionPane.ERROR_MESSAGE);
		}else {
			SingletonPrograms.massage1.setDni(SingletonPrograms.DNI);
		}
	}
	
	///General Update
	public static void updateMassage() {
		//massages
		String[] tipo3= {"Twina","Anticelulitico","Detox"};
		String[] tipo4= {"Balinés","Piedras Volcanicas","Aromaterapia"};
		String[] tipo5= {"Decontracting Hook","Acupuntura","Manual Decontracting"};
		//
		String[] tipoD= {"30 min","60 min"};
		String[] tipoH= {"10:00","11:00","12:00","17:00","18:00"};
		String[] tipoA= {"Relax Music","Cromoteraphy","Scented candles","Music and candles","All"};
		String[] tipoT= {"Cold Bandages","Acupuntura","Manual"};
		String[] tipoZ= {"Total Body","Legs","Back","Neck","Arms"};
		String opt2="";
		int index=0;
	
		
		
		
		/////////RELAX
		if(SingletonPrograms.massage1 instanceof Relax) {
			
			opt2=Functions_menu.combobox(Languages.menu("setRelax"), Languages.menuTitle("menu_crud"), Languages.menuTitleGe("programs"));
			//sacamos el index del array para que nos valga para todos los idiomas. Con el String no nos servia
			for(int i = 0; i < Languages.menu("setRelax").length; i++) {
				  if(Languages.menu("setRelax")[i].equals(opt2)) {
				    index = i;
				    
				  }
				}
			
			switch(index){
					case -1:
						break;
					case 0:
						((Relax)SingletonPrograms.massage1).setNameMa(Functions_menu.combobox(Languages.menu("massageRel"),Languages.menuTitle("massages"), Languages.menuTitleGe("massages")));
						break;
					case 1:
						((Relax)SingletonPrograms.massage1).setNameClient(Functions_valida.validastring(Languages.menuTitle("name"), Languages.menuTitleGe("programs")));
						break;
					case 2:
						updateDniRelax((Relax)SingletonPrograms.massage1);
						break;
					case 3:
						((Relax)SingletonPrograms.massage1).setTf(Functions_data.Tf());
						break;
					case 4:
						((Relax)SingletonPrograms.massage1).setDate(FunctionsDates.updatedatesPrograms(Languages.menuTitle("date"), Languages.menuTitleGe("programs"),((Relax)SingletonPrograms.massage1).getDateexit(),((Relax)SingletonPrograms.massage1).getDateActivity(),"start"));
						break;
					case 5:
						((Relax)SingletonPrograms.massage1).setDateexit(FunctionsDates.updatedatesPrograms(Languages.menuTitle("dateEnd"), Languages.menuTitleGe("programs"),((Relax)SingletonPrograms.massage1).getDate(),((Relax)SingletonPrograms.massage1).getDateEndActivity(),"end"));
						break;
					case 6:
						((Relax)SingletonPrograms.massage1).setHour(Functions_menu.combobox(tipoH,Languages.menuTitle("hour"), Languages.menuTitleGe("programs")));
						break;
					case 7:
						((Relax)SingletonPrograms.massage1).setDuration(Functions_menu.combobox(tipoD, Languages.menuTitle("duration"), Languages.menuTitleGe("programs")));
						break;
					case 8:
						Functions_data.UpdateActivity();
						break;
					case 9:
						FunctionsDates.updateDateActivity();
						break;
					case 10:
						((Relax)SingletonPrograms.massage1).setAmbient(Functions_menu.combobox(Languages.menu("ambient"),Languages.menuTitle("ambient"), Languages.menuTitleGe("programs")));
						break;
					case 11:
						
						break;
			}//end switch
		}
		///////////Therapeutic
		if(SingletonPrograms.massage1 instanceof Therapeutic) {
			opt2=Functions_menu.combobox(Languages.menu("setThera"), Languages.menuTitle("menu_crud"), Languages.menuTitleGe("programs"));
			for(int i = 0; i < Languages.menu("setThera").length; i++) {
				  if(Languages.menu("setThera")[i].equals(opt2)) {
				    index = i;
				    
				  }
				}
			switch(index){
					case 0:
						((Therapeutic)SingletonPrograms.massage1).setNameMa(Functions_menu.combobox(Languages.menu("massageTher"),Languages.menuTitle("massages"), Languages.menuTitleGe("massages")));
						break;
					case 1:
						((Therapeutic)SingletonPrograms.massage1).setNameClient(Functions_valida.validastring(Languages.menuTitle("name"), Languages.menuTitleGe("programs")));
						break;
					case 2:
						updateDniThera((Therapeutic)SingletonPrograms.massage1);
						break;
					case 3:
						((Therapeutic)SingletonPrograms.massage1).setTf(Functions_data.Tf());
						break;
					case 4:
						((Therapeutic)SingletonPrograms.massage1).setDate(FunctionsDates.updatedatesPrograms(Languages.menuTitle("date"), Languages.menuTitleGe("programs"),((Therapeutic)SingletonPrograms.massage1).getDateexit(),((Therapeutic)SingletonPrograms.massage1).getDateActivity(),"start"));
						break;
					case 5:
						((Therapeutic)SingletonPrograms.massage1).setDateexit(FunctionsDates.updatedatesPrograms(Languages.menuTitle("dateEnd"), Languages.menuTitleGe("programs"),((Therapeutic)SingletonPrograms.massage1).getDate(),((Therapeutic)SingletonPrograms.massage1).getDateEndActivity(),"end"));
						break;
					case 6:
						((Therapeutic)SingletonPrograms.massage1).setHour(Functions_menu.combobox(tipoH,Languages.menuTitle("hour"), Languages.menuTitleGe("programs")));
						break;
					case 7:
						((Therapeutic)SingletonPrograms.massage1).setDuration(Functions_menu.combobox(tipoD, Languages.menuTitle("duration"), Languages.menuTitleGe("programs")));
						break;
					case 8:
						Functions_data.UpdateActivity();
						break;
					case 9:
						FunctionsDates.updateDateActivity();
						break;
					case 10:
						((Therapeutic)SingletonPrograms.massage1).setTherapy(Functions_menu.combobox(Languages.menu("therapy"), Languages.menuTitle("therapy"), Languages.menuTitleGe("programs")));
						break;
					case 11:
						
						break;
			}//end switch
		}//end if
		///////////////Muscular
		if(SingletonPrograms.massage1 instanceof Muscular) {
		opt2=Functions_menu.combobox(Languages.menu("setMuscular"), Languages.menuTitle("menu_crud"), Languages.menuTitleGe("programs"));
		for(int i = 0; i < Languages.menu("setMuscular").length; i++) {
			  if(Languages.menu("setMuscular")[i].equals(opt2)) {
			    index = i; 
			  }
			}
				
			switch(index){
					case 0:
						((Muscular)SingletonPrograms.massage1).setNameMa(Functions_menu.combobox(Languages.menu("massageMus"),Languages.menuTitle("massages"), Languages.menuTitleGe("massages")));
						break;
					case 1:
						((Muscular)SingletonPrograms.massage1).setNameClient(Functions_valida.validastring(Languages.menuTitle("name"), Languages.menuTitleGe("programs")));
						break;
					case 2:
						updateDniMuscular((Muscular)SingletonPrograms.massage1);
						break;
					case 3:
						((Muscular)SingletonPrograms.massage1).setTf(Functions_data.Tf());
						break;
					case 4:
						((Muscular)SingletonPrograms.massage1).setDate(FunctionsDates.updatedatesPrograms(Languages.menuTitle("date"), Languages.menuTitleGe("programs"),((Muscular)SingletonPrograms.massage1).getDateexit(),((Muscular)SingletonPrograms.massage1).getDateActivity(),"start"));
						break;
					case 5:
						((Muscular)SingletonPrograms.massage1).setDateexit(FunctionsDates.updatedatesPrograms(Languages.menuTitle("dateEnd"), Languages.menuTitleGe("programs"),((Muscular)SingletonPrograms.massage1).getDate(),((Muscular)SingletonPrograms.massage1).getDateEndActivity(),"end"));
						break;
					case 6:
						((Muscular)SingletonPrograms.massage1).setHour(Functions_menu.combobox(tipoH,Languages.menuTitle("hour"), Languages.menuTitleGe("programs")));
						break;
					case 7:
						((Muscular)SingletonPrograms.massage1).setDuration(Functions_menu.combobox(tipoD, Languages.menuTitle("duration"), Languages.menuTitleGe("programs")));
						break;
					case 8:
						Functions_data.UpdateActivity();
						break;
					case 9:
						FunctionsDates.updateDateActivity();
						break;
					case 10:
						((Muscular)SingletonPrograms.massage1).setZone(Functions_menu.combobox(Languages.menu("zone"), Languages.menuTitle("zone"), Languages.menuTitleGe("programs")));
						break;
					case 11:
						
						break;
			}//end switch
		}//end if
	}


}
