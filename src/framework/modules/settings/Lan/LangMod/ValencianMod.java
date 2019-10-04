/**
 * 
 */
package framework.modules.settings.Lan.LangMod;

/**
 * @author joana
 *
 */
public class ValencianMod {
	
	public static String [] menu (String valor) {
		String [] menu = {};
		String[] MaTh= {"Twina","Anticel.lulític","Detox"};
		String[] MaRe= {"Balinés","Pedres Volcàniques","Aromateràpia"};
		String[] MaMu= {"Ganxo Descontracturant","Acupuntura","Descontracturant Manual"};
		String[] tipoA= {"Música Relaixant","Cromoterapia","Ciris aromàtics","Música y Ciris","Tot"};
		String[] tipoT= {"Benes fredes","Acupuntura","Manual"};
		String[] tipoZ= {"cos sencer","Cames","Esquena","Coll","Braços"};
		String [] tipoAC= {"Sauna","Ioga","Meditació","Gimnàs"};

		String [] menuRelax = {"Massatge","Nom del Client","DNI del client","Telèfon","Data d'entrada","Data de sortida","Duració del massatge","Activitat","Data de l'activitat","Ambient","Salir"};
		String [] menuThera = {"Massatge","Nom del Client","DNI del client","Telèfon","Data d'entrada","Data de sortida","Duració del massatge","Activitat","Data de l'activitat","Terapia","Salir"};
		String [] menuMusc = {"Massatge","Nom del Client","DNI del client","Telèfon","Data d'entrada","Data de sortida","Duració del massatge","Activitat","Data de l'activitat","Zona del massatge","Salir"};
		String [] order={ "A) DNI", "B) Nom del Client", "C) Data", "D) Data de sortida", "E) Num de dies", "F) Preu", "G) Activitat", "H) Data de l'Activitat", "I) Preu Total" };

		String [] menuAdmin = {"Nom","Usuari","Contrasenya","DNI","Data de naixement","Email","Tf","Data de contractació","Sortir"};
		String [] menuClient = {"Nom","Usuari","Contrassenya","DNI","Data de naixement","Email","Tf","Data de registre","Sortir"};
		String [] orderUsers ={ "A) DNI", "B) Nom", "C) Edat", "D) Antiquitat", "E) Usuari" };

		String [] menulogin= {"Convidat","Registrat","Entrar","Settings","Sortir"};
		String [] login= {"Administrador","Client"};
		String [] invited= {"Llegir","Ordenar"};
		String [] admin= {"Programes","Usuaris","Perfil","Settings","Tancar sessió"};
		String [] client= {"Programes","Perfil","Settings","Tancar Sessió"};
		String [] proclient= {"Llegir", "Actualitzar","Ordenar"};
		String [] profile= {"Llegir perfil", "Actualitzar perfil"};

		switch (valor) {
			case "massageRel":
				menu=MaRe;
				break;
			case "massageTher":
				menu=MaTh;
				break;
			case "massageMus":
				menu=MaMu;
				break;
			case "ambient":
				menu=tipoA;
				break;
			case "thera":
				menu=tipoT;
				break;
			case "zone":
				menu=tipoZ;
				break;
			case "activity":
				menu=tipoAC;
				break;
			
			case "setRelax":
				menu = menuRelax;
				break;
			
			case "setThera":
				menu = menuThera;
				break;
			
			case "setMuscular":
				menu = menuMusc;
				break;
			case "order":
				menu=order;
				break;
		/////////////////
			case "setAdmin":
				menu = menuAdmin;
				break;
			case "setClient":
				menu = menuClient;
				break;
			case "orderUsers":
				menu=orderUsers;
				break;
			//////////////	
			case "menulogin":
				menu=menulogin;
				break;
			case "login":
				menu=login;
				break;
			case "invited":
				menu=invited;
				break;
			case "admin":
				menu=admin;
				break;
			case "profile":
				menu=profile;
				break;
			case "client":
				menu=client;
				break;
			case "proclient":
				menu=proclient;
				break;
		}
		
	return menu;
}


	public static String menuTitle (String opt) {
		String  menu = null;
		String  massage = "Tria un Massatge";
		String  name = "Introdueix el nom" ;
		String  tf ="Introdueix el teléfon" ;
		String  dni = "Introdueix el DNI XXXXXXXX-X" ;
		String dateStart=  "Data d'Entrada" ;
		String dateEnd=  "Data de Sortida" ;
		String activity=  "Vols una activitat" ;
		String dateActivity= "Data de l'activitat" ;
		String dateEndActivity=  "Data final de l'activitat" ;
		String  duration = "Tria una duració";
		String  hour = "Tria una hora";
		String  ambient = "Tria un Ambient";
		String  therapy = "Tria una Terapia";
		String  zone = "Tria una zona";
		String order = "¿Quin ordre preferixes?";
		//USER
		String  born = "Quan és la teva data de naixement??";
		String USER = "USUARI";
		String user= "Introdueix el teu nom d'usuari";
		String surname = "Introdueix el teu cognom";
		String pass = "Introdueix la teva contrassenya \nMinim 8 caràcters, 1 majúscula, 1 minúscula i 1 numero";
		String email = "Introdueix el teu email";
		String contract = "Data de contractació";// fecha de contratacion
		String sign = "Data de registre";
		
		String login="Quin tipus d'usuari eres?";
		String orderpro="Quins programes vols ordenar?";

		String option = "Tría una opció";
		
		switch (opt) {
		
		case "massage":
			menu = massage;
			break;
			
		case "name":
			menu = name;
			break;

		case "tf":
			menu = tf;
			break;

		case "dni":
			menu = dni;
			break;
		case "dateStart":
			menu = dateStart;
			break;
		case "dateEnd":
			menu = dateEnd;
			break;
		case "activity":
			menu = activity;
			break;
		case "dateActivity":
			menu = dateActivity;
			break;
		case "dateEndActivity":
			menu = dateEndActivity;
			break;
		case "duration":
			menu = duration;
			break;
			
		case "hour":
			menu = hour;
			break;

		case "ambient":
			menu = ambient;
			break;
		case "therapy":
			menu = therapy;
			break;
		case "zone":
			menu =zone;
			break;
		case "order":
			menu =order;
			break;
	////////////		
			
		case "born":
			menu = born;
			break;
			
		case "USER":
			menu = USER;
			break;
		case "user":
			menu = user;
			break;

		case "surname":
			menu = surname;
			break;
		case "pass":
			menu = pass;
			break;
		case "email":
			menu = email;
			break;
		case "contract":
			menu = contract;
			break;
		case "sign":
			menu = sign;
			break;
		
		case "option":
			menu =option;
			break;
////////////////		
		case "login":
			menu=login;
			break;
		case "orderpro":
			menu=orderpro;
			break;
		default:
			menu = null;
			break;
	}
	
	return menu;
	}
	public static String  message (String tra) {
		String message="";
		String error="Error";
		String errorDNI="Error, aquest DNI ja existeix";
		String delete="Borrat";
		String empty="Està Buit";
		switch (tra) {
		
			case "error":
				message =error;
				break;
			case "errorDNI":
				message =errorDNI;
				break;
			case "delete":
				message =delete;
				break;
			case "empty":
				message=empty;
				break;
			case "activitynull":
				message="Primer tria una Activitat";
				break;
			///to String
			case "relax":
				message="RELAIXANT";
				break;
			case "thera":
				message="TERAPEUTIC";
				break;
			case "muscular":
				message="MUSCULAR";
				break;
			case "name":
				message="Nom: ";
				break;
			case "tf":
				message="Telèfon: ";
				break;
			case "date":
				message="Data d'entrada: ";
				break;
			case "exitDate":
				message="Data de Sortida: ";
				break;
			case "days":
				message="Num de dies: ";
				break;
			case "massage":
				message="Massatge: ";
				break;
			case "hour":
				message="Hora: ";
				break;
			case "duration":
				message="Duració: ";
				break;
			case "price":
				message="Preu del Programa: ";
				break;
			case "activity":
				message="Activitat: ";
				break;
			case "dateAct":
				message="AData de l'Activitat: ";
				break;
			case "dateEndAct":
				message="Data de Fi de l'Activitat: ";
				break;
			case "daysAct":
				message="Num de Dies de l'Activitat: ";
				break;
			case "priceAct":
				message="Preu de l'Activitat: ";
				break;
			case "totalPrice":
				message="Preu Total: ";
				break;
			case "ambient":
				message="Ambient: ";
				break;
			case "therapy":
				message="Terapia: ";
				break;
			case "zone":
				message="Zona del Massatge: ";
				break;
				
			case "admin":
				message="ADMINISTRADOR";
				break;
			case "client":
				message="CLIENT";
				break;
			case "user":
				message="Usuari: ";
				break;
			case "pass":
				message="Contrassenya: ";
				break;
			case "email":
				message="Email: ";
				break;
			case "birthday":
				message="Data de naixement: ";
				break;
			case "age":
				message="Edat: ";
				break;
			case "singin":
				message="Data de registre: ";
				break;
			case "contract":
				message="Data de contractació: ";
				break;
			case "antique":
				message="Antigüetat: ";
				break;
		}
		
		return message;
	}
}
