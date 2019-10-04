/**
 * 
 */
package framework.modules.settings.Dummies.DummPrograms;

import javax.swing.JOptionPane;

import framework.classes.Dates;
import framework.functions.Functions_menu;
import framework.modules.Programs.clases.Muscular;
import framework.modules.Programs.clases.Relax;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Programs.clases.Therapeutic;
import framework.modules.Programs.functions.FunctionsDates;
import framework.modules.Programs.functions.CRUD.FunctionsFind;

/**
 * @author joana
 *
 */
public class FunctionsDummies {

/////////////ASK DNIs
	
	public static Relax askDNIRelax () {//Settings config
		
		String [] Dnis = {"12345678Z", "12345678J", "12345678L", "12345678P", "12345678A", "12345678T","12345679Z", "12345679J", "12345679L", "12345679P", "12345679A", "12345679T","22345678Z", "22345678J", "22345678L", "22345678P", "22345678A", "22345678T","22345679Z", "22345679J", "22345679L", "22345679P", "22345679A", "22345679T" };
		
				int numRandom = (int) Math.round(Math.random() *22 )+1 ;
			
				SingletonPrograms.DNI=Dnis[numRandom];
				//System.out.println( SingletonPrograms.DNI+" dni relax");
				//SingletonPrograms.Dnis.add(SingletonPrograms.DNI);
				return new Relax(SingletonPrograms.DNI);
		
	}
	
	public static Therapeutic askDNIThera () {//Settings config
	
		String [] Dnis = {"12345678Z", "12345678J", "12345678L", "12345678P", "12345678A", "12345678T","12345679Z", "12345679J", "12345679L", "12345679P", "12345679A", "12345679T","22345678Z", "22345678J", "22345678L", "22345678P", "22345678A", "22345678T","22345679Z", "22345679J", "22345679L", "22345679P", "22345679A", "22345679T" };

				int numRandom = (int) Math.round(Math.random() *22)+1 ;
			
				SingletonPrograms.DNI=Dnis[numRandom];
				//System.out.println( SingletonPrograms.DNI+" dni tera");
				return new Therapeutic(SingletonPrograms.DNI);
		
	}
	public static Muscular askDNIMuscular () {//Settings config
	
		
		String [] Dnis = {"12345678Z", "12345678J", "12345678L", "12345678P", "12345678A", "12345678T","12345679Z", "12345679J", "12345679L", "12345679P", "12345679A", "12345679T","22345678Z", "22345678J", "22345678L", "22345678P", "22345678A", "22345678T","22345679Z", "22345679J", "22345679L", "22345679P", "22345679A", "22345679T"};

				int numRandom = (int) Math.round(Math.random() *22 )+1 ;
			
				SingletonPrograms.DNI=Dnis[numRandom];
				//System.out.println( SingletonPrograms.DNI+" dni muscular");
				return new Muscular(SingletonPrograms.DNI);
	}
	
//////////////CREATE	
	
	public static void credumm(int i) {

		String tf="",duration="",activity="",nameClient="", hour="",dni="",nameMa="",ambient="",therapy="",zone="";
		String[] tipoN= {"Jose","Joana","Piluka","Sandy","Eliot","Ariadna","Mari","Pepe","Pepica","Lidia","Lola","Mauro"};
		String[] tipoD= {"30 min","60 min","30 min","60 min","30 min","60 min","30 min","60 min","30 min","60 min","30 min","60 min"};
		String[] tipoH= {"10:00","11:00","12:00","17:00","18:00","12:00","10:00","11:00","12:00","17:00","18:00","12:00"};
		String[] tipoA= {"Relax Music","Cromoteraphy","Scented candles","Music and candles","All","All","Relax Music","Cromoteraphy","Scented candles"};
		String[] tipoT= {"Cold Bandages","Acupuntura","Manual","Cold Bandages","Acupuntura","Manual","Cold Bandages","Acupuntura","Manual","Cold Bandages","Acupuntura","Manual"};
		String[] tipoZ= {"Total Body","Legs","Back","Neck","Arms","Total Body","Total Body","Legs","Back","Neck","Arms","Total Body"};
		String[] tipoAC= {"Sauna","Yoga","Meditation","Gym","Yoga","Meditation","Sauna","Yoga","Meditation","Gym","Yoga","Meditation"};
		Dates date;
		Dates dateexit;
		Dates dateactivity;
		Dates dateEndactivity;
		
		int numRandom = (int) Math.round(Math.random()*6) +1;
		
				nameClient=tipoN[numRandom];
				System.out.println(nameClient+" name");
				dni=SingletonPrograms.DNI;
				tf="612345678";
				date=FunctionsDates.todayDates();
				dateexit=FunctionsDates.randomDates();
				//System.out.println(date+" date");
				//System.out.println(dateexit+" dateexit");
			
			//relax
			if(SingletonPrograms.opt==0) {	
				nameMa="Balines";
				ambient=tipoA[numRandom];
				//System.out.println(ambient+" ambient");
			}
			//thera
			if(SingletonPrograms.opt==1) {	
				nameMa="Anticelulítico";
				therapy=tipoT[numRandom];
			}
			//muscular
			if(SingletonPrograms.opt==2) {	
				nameMa="Descontracturante";
				zone=tipoZ[numRandom];
			}
			
			hour=tipoH[numRandom];
			//System.out.println(hour+" hour");
			duration=tipoD[numRandom];
			activity=tipoAC[numRandom];
			///System.out.println(activity+" activity");
			dateactivity=FunctionsDates.randomDatesActivity(date,dateexit);
			//System.out.println(dateactivity+" date Activity");
			dateEndactivity=FunctionsDates.randomDatesActivity(dateactivity,dateexit);
			//System.out.println(dateactivity+" dateend Activity");
		
			if(SingletonPrograms.opt==0) {//relax
				
				SingletonPrograms.massage1=new Relax(nameMa,date,dateexit,hour,duration,activity,dateactivity,dateEndactivity,nameClient,dni,tf,ambient);
				
				SingletonPrograms.DummieRelax.add((Relax) SingletonPrograms.massage1);
				SingletonPrograms.programRelax.add((Relax) SingletonPrograms.massage1);
//				for(int x=0;x<SingletonPrograms.DummieRelax.size();x++) {
//					  System.out.println(SingletonPrograms.DummieRelax.get(x)+ "hay alguien?");
//					}
			}
			if(SingletonPrograms.opt==1) {//thera
				SingletonPrograms.massage1=new Therapeutic(nameMa,date,dateexit, hour,duration,activity,dateactivity,dateEndactivity,nameClient,dni,tf,therapy);
				SingletonPrograms.DummieThera.add((Therapeutic) SingletonPrograms.massage1);
				SingletonPrograms.programThera.add((Therapeutic) SingletonPrograms.massage1);
			}
			if(SingletonPrograms.opt==2) {//muscular
				SingletonPrograms.massage1=new Muscular(nameMa,date,dateexit, hour,duration,activity,dateactivity,dateEndactivity,zone,nameClient,dni,tf);
				SingletonPrograms.DummieMuscular.add((Muscular) SingletonPrograms.massage1);
				SingletonPrograms.programMuscular.add((Muscular) SingletonPrograms.massage1);
			}
		
	}
	
//////////UPDATE
	
	public static void upDumm() {
		//options
		String[] tipo2= {"Massage","Client's name","Client's dni","Client's tf","Date","Exit Date","Duration","Activity","Activity Date","Ambient","EXIT"};
		String[] tipo1= {"Massage","Client's name","Client's dni","Client's tf","Date","Exit Date","Duration","Activity","Activity Date","Therapy","EXIT"};
		String[] tipo= {"Massage","Client's name","Client's dni","Client's tf","Date","Exit Date","Duration","Activity","Activity Date","Zone","EXIT"};
		//options
		String[] tipoN= {"Jose","Joana","Piluka","Sandy","Eliot","Ariadna","Mari","Pepe","Pepica","Lidia","Lola","Mauro"};
		String[] tipoD= {"30 min","60 min","30 min","60 min","30 min","60 min","30 min","60 min","30 min","60 min","30 min","60 min"};
		String[] tipoH= {"10:00","11:00","12:00","17:00","18:00","12:00","10:00","11:00","12:00","17:00","18:00","12:00"};
		String[] tipoA= {"Relax Music","Cromoteraphy","Scented candles","Music and candles","All","All","Relax Music","Cromoteraphy","Scented candles"};
		String[] tipoT= {"Cold Bandages","Acupuntura","Manual","Cold Bandages","Acupuntura","Manual","Cold Bandages","Acupuntura","Manual","Cold Bandages","Acupuntura","Manual"};
		String[] tipoZ= {"Total Body","Legs","Back","Neck","Arms","Total Body","Total Body","Legs","Back","Neck","Arms","Total Body"};
		String[] tipoAC= {"Sauna","Yoga","Meditation","Gym","Yoga","Meditation","Sauna","Yoga","Meditation","Gym","Yoga","Meditation"};
		String opt2;
		
		int numRandom = (int) Math.round(Math.random()*6) +1;
		/////////RELAX
		if(SingletonPrograms.massage1 instanceof Relax) {
			opt2=Functions_menu.combobox(tipo2, "Chosse an option", "options");
				
			switch(opt2){
					case "Massage":
						((Relax)SingletonPrograms.massage1).setNameMa("Piedras Volcánicas");
						break;
					case "Client's name":
						((Relax)SingletonPrograms.massage1).setNameClient(tipoN[numRandom]);
						break;
					case "Client's dni":
						updateDniRelaxDumm((Relax)SingletonPrograms.massage1);
						break;
					case "Client's tf":
						((Relax)SingletonPrograms.massage1).setTf("692536143");
						break;
					case "Date":
						((Relax)SingletonPrograms.massage1).setDate(FunctionsDates.todayDates());
						break;
					case "Exit Date":
						((Relax)SingletonPrograms.massage1).setDateexit(FunctionsDates.randomDates());
						break;
					case "Hour":
						((Relax)SingletonPrograms.massage1).setHour(tipoH[numRandom]);
						break;
					case "Duration":
						((Relax)SingletonPrograms.massage1).setDuration(tipoD[numRandom]);
						break;
					case "Activity":
						((Relax)SingletonPrograms.massage1).setActivity(tipoAC[numRandom]);;
						break;
					case "Activity Date":
						((Relax)SingletonPrograms.massage1).setDateActivity(FunctionsDates.randomDatesActivity(((Relax)SingletonPrograms.massage1).getDate(),((Relax)SingletonPrograms.massage1).getDateexit()));
						((Relax)SingletonPrograms.massage1).setDateActivity(FunctionsDates.randomDatesActivity(((Relax)SingletonPrograms.massage1).getDateActivity(),((Relax)SingletonPrograms.massage1).getDateexit()));
						break;
					case "Ambient":
						((Relax)SingletonPrograms.massage1).setAmbient(tipoA[numRandom]);
						break;
					case "Exit":
						
						break;
			}//end switch
		}
		///////////Therapeutic
		if(SingletonPrograms.massage1 instanceof Therapeutic) {
			opt2=Functions_menu.combobox(tipo1, "Chosse an option", "options");
				
			switch(opt2){
					case "Massage":
						((Therapeutic)SingletonPrograms.massage1).setNameMa("Acupuntura");
						break;
					case "Client's name":
						((Therapeutic)SingletonPrograms.massage1).setNameClient(tipoN[numRandom]);
						break;
					case "Client's dni":
						updateDniTheraDumm((Therapeutic)SingletonPrograms.massage1);
						break;
					case "Client's tf":
						((Therapeutic)SingletonPrograms.massage1).setTf("621458781");
						break;
					case "Date":
						((Therapeutic)SingletonPrograms.massage1).setDate(FunctionsDates.todayDates());
						break;
					case "Exit Date":
						((Therapeutic)SingletonPrograms.massage1).setDateexit(FunctionsDates.randomDates());
						break;
					case "Hour":
						((Therapeutic)SingletonPrograms.massage1).setHour(tipoH[numRandom]);
						break;
					case "Duration":
						((Therapeutic)SingletonPrograms.massage1).setDuration(tipoD[numRandom]);
						break;
					case "Activity":
						((Relax)SingletonPrograms.massage1).setActivity(tipoAC[numRandom]);
						break;
					case "Activity Date":
						((Relax)SingletonPrograms.massage1).setDateActivity(FunctionsDates.randomDatesActivity(((Relax)SingletonPrograms.massage1).getDate(),((Relax)SingletonPrograms.massage1).getDateexit()));
						((Relax)SingletonPrograms.massage1).setDateActivity(FunctionsDates.randomDatesActivity(((Relax)SingletonPrograms.massage1).getDateActivity(),((Relax)SingletonPrograms.massage1).getDateexit()));
						break;
					case "Therapy":
						((Therapeutic)SingletonPrograms.massage1).setTherapy(tipoT[numRandom]);
						break;
					case "Exit":
						
						break;
			}//end switch
		}//end if
		///////////////Muscular
		if(SingletonPrograms.massage1 instanceof Muscular) {
		opt2=Functions_menu.combobox(tipo, "Chosse an option", "options");
				
			switch(opt2){
					case "Massage":
						((Muscular)SingletonPrograms.massage1).setNameMa("Twina");
						break;
					case "Client's name":
						((Muscular)SingletonPrograms.massage1).setNameClient(tipoN[numRandom]);
						break;
					case "Client's dni":
						updateDniMuscularDumm((Muscular)SingletonPrograms.massage1);
						break;
					case "Client's tf":
						((Muscular)SingletonPrograms.massage1).setTf("658894751");
						break;
					case "Date":
						((Muscular)SingletonPrograms.massage1).setDate(FunctionsDates.todayDates());
						break;
					case "Exit Date":
						((Muscular)SingletonPrograms.massage1).setDateexit(FunctionsDates.randomDates());
						break;
					case "Hour":
						((Muscular)SingletonPrograms.massage1).setHour(tipoH[numRandom]);
						break;
					case "Duration":
						((Muscular)SingletonPrograms.massage1).setDuration(tipoD[numRandom]);
						break;
					case "Activity":
						((Muscular)SingletonPrograms.massage1).setActivity(tipoAC[numRandom]);
						break;
					case "Activity Date":
						((Muscular)SingletonPrograms.massage1).setDateActivity(FunctionsDates.randomDatesActivity(((Relax)SingletonPrograms.massage1).getDate(),((Relax)SingletonPrograms.massage1).getDateexit()));
						((Muscular)SingletonPrograms.massage1).setDateActivity(FunctionsDates.randomDatesActivity(((Relax)SingletonPrograms.massage1).getDateActivity(),((Relax)SingletonPrograms.massage1).getDateexit()));
						break;
					case "Zone":
						((Muscular)SingletonPrograms.massage1).setZone(tipoZ[numRandom]);
						break;
					case "Exit":
						
						break;
			}//end switch
		}//end if
	}

////Update DNI:relax
	public static void updateDniRelaxDumm (Relax r1){//Settings config
		
		int loc = -1;
		
		do {
			r1 = askDNIRelax();
			loc = FunctionsFind.findRelax(r1);
			if (loc!= -1) {
				JOptionPane.showMessageDialog(null, "error");
			}
		}while(loc!= -1);
		
			SingletonPrograms.massage1.setDni(SingletonPrograms.DNI);
		
	}
	////Update DNI:Thera
	public static void updateDniTheraDumm (Therapeutic t1){//Settings config
		int loc = -1;
		t1 = askDNIThera();

		loc = FunctionsFind.findThera(t1);

		if (loc != -1) {
			JOptionPane.showMessageDialog(null, "error");
		}else {
			SingletonPrograms.massage1.setDni(SingletonPrograms.DNI);
		}
	}
	////Update DNI:Muscular
	public static void updateDniMuscularDumm (Muscular m1){//Settings config
		int loc = -1;
		m1 = askDNIMuscular();
		loc = FunctionsFind.findMuscular(m1);
		if (loc != -1) {
			JOptionPane.showMessageDialog(null, "error");
		}else {
			SingletonPrograms.massage1.setDni(SingletonPrograms.DNI);
		}
	}

}
