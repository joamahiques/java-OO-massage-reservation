/**
 * 
 */
package framework.modules.settings.Lan.LangMod;

/**
 * @author joana
 *
 */
public class EnglishMod {
	
	public static String [] menu (String tra) {
		String [] menu = {};
		String[] MaTh= {"Twina","Anti-cellulite","Detox"};
		String[] MaRe= {"Balinés","Volcanic Rocks","Aromatherapy"};
		String[] MaMu= {"Decontracting Hook","Acupuntura","Manual Decontracting"};
		String[] tipoA= {"Relax Music","Cromoteraphy","Scented candles","Music and candles","All"};
		String[] tipoT= {"Cold Bandages","Acupuntura","Manual"};
		String[] tipoZ= {"Total Body","Legs","Back","Neck","Arms"};
		String [] tipoAC= {"Sauna","Yoga","Meditation","Gym"};
		String [] menuRelax = {"Massage","Client's name","Client's dni","Client's tf","Date","Exit Date","Duration","Activity","Activity Date","Ambient","EXIT"};
		String [] menuMusc = {"Massage","Client's name","Client's dni","Client's tf","Date","Exit Date","Duration","Activity","Activity Date","Zone","EXIT"};
		String [] menuThera = {"Massage","Client's name","Client's dni","Client's tf","Date","Exit Date","Duration","Activity","Activity Date","Therapy","EXIT"};
		String [] order={ "A) DNI", "B) Client Name", "C) Date", "D) Exit Date", "E) Num of Days", "F) Price", "G) Activity", "H) Activity Date", "I) Total Price" };

		String [] menuAdmin = {"Name","User","Password","DNI","Birthdate","Email","Tf","Date of hire","EXIT"};
		String [] menuClient = {"Name","User","Password","DNI","Birthdate","Email","Tf","Date of Sign In","EXIT"};
		String [] orderUsers ={ "A) DNI", "B) Name", "C) Age", "D) Antique", "E) User" };

		String [] menulogin= {"Invited","Register","Login","Settings","Exit"};
		String [] login= {"Admin","Client"};
		String [] invited= {"Read","Order"};
		String [] admin= {"Programs","Users","Profile","Settings","Logout"};
		String [] client= {"Programs","Profile","Settings","Logout"};
		String [] profile= {"Read User", "Update User"};
		String [] proclient= {"Read", "Update","Order"};
		
		switch (tra) {
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
			case "therapy":
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
		//////////
			case "setAdmin":
				menu = menuAdmin;
				break;
			case "setClient":
				menu = menuClient;
				break;
			case "orderUsers":
				menu=orderUsers;
				break;
		////////////	
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
		String  massage = "Choose a Massage";
		String  dni = "Enter DNI XXXXXXXX-X" ;
		String dateStart=  "Entry date" ;
		String dateEnd=  "Exit date" ;
		String activity=  "Do you want an Activity" ;
		String dateActivity= "Activity date" ;
		String dateEndActivity=  "Final date of the activity" ;
		String  duration = "Choose a Duration";
		String  hour = "Choose an hour";
		String  ambient = "Choose an Ambient";
		String  therapy = "Choose a Therapy";
		String  zone = "Choose a Zone";
		String order = "¿What order are you prefer?";
		//USER
		String  born = "When is your birthday?";
		String USER = "USER";
		String user= "Enter your User's name";
		String tf = "Enter the telephone number, please";
		String name = "Enter the name, please";
		String surname = "Enter the surname, please";
		String pass = "Enter the Password, please \nMinimum 8 characters, 1 uppercase, 1 lowercase and 1 number";
		String email = "Enter the email, please";
		String contract = "Date of hire";// fecha de contratacion
		String sign = "Date of Sign in";
		///Login
		String login="What type of user are you?";
		String option = "Choose an Option";
		String orderpro="What Programs do you want to Order?";
		
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
		String errorDNI="Error, this DNI already exists";
		String delete="Deleted";
		String empty="It's Empty";
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
				message="First Choose an Activity";
				break;
			///
			case "relax":
				message="RELAX";
				break;
			case "thera":
				message="THERAPEUTIC";
				break;
			case "muscular":
				message="MUSCULAR";
				break;
			case "name":
				message="Name: ";
				break;
			case "tf":
				message="Telephone: ";
				break;
			case "date":
				message="Entry Date: ";
				break;
			case "exitDate":
				message="Exit Date: ";
				break;
			case "days":
				message="Num of Days: ";
				break;
			case "massage":
				message="Massage: ";
				break;
			case "hour":
				message="hour: ";
				break;
			case "duration":
				message="Duration: ";
				break;
			case "price":
				message="Program's Price: ";
				break;
			case "activity":
				message="Activity: ";
				break;
			case "dateAct":
				message="Activity Date: ";
				break;
			case "dateEndAct":
				message="Activity End Date: ";
				break;
			case "daysAct":
				message="Num of Days of the Activity: ";
				break;
			case "priceAct":
				message="Activity Price: ";
				break;
			case "totalPrice":
				message="Total Price: ";
				break;
			case "ambient":
				message="Ambient: ";
				break;
			case "therapy":
				message="Therapy: ";
				break;
			case "zone":
				message="Zone: ";
				break;
			///
			case "admin":
				message="ADMIN";
				break;
			case "client":
				message="CLIENT";
				break;
			case "user":
				message="User: ";
				break;
			case "pass":
				message="Password: ";
				break;
			case "email":
				message="Email: ";
				break;
			case "birthday":
				message="Birthdate: ";
				break;
			case "age":
				message="Age: ";
				break;
			case "singin":
				message="SignIn date: ";
				break;
			case "contract":
				message="Contract date: ";
				break;
			case "antique":
				message="Antique: ";
				break;
		}
		
		return message;
	}
}
