/**
 * 
 */
package framework.modules.settings.Lan;

/**
 * @author joana
 *
 */
public class English {

	public static String [] menu (String opt) {
		String [] menu = null;
		String [] menu_primary = {"RELAX", "THERAPEUTICS", "MUSCULARS","SETTINGS", "EXIT"};
		String [] menu_crud = { "CREATE", "READ", "UPDATE","DELETE","ORDER","EXIT" };
		String [] menu_setting = {"Language","Date Format","Currency","Decimal","Dummies" };
		String [] menu_print = { "All", "One" };
		String [] menuDumm = {"RELAX", "THERAPEUTICS", "MUSCULARS"};
		String[] menu_repeat= { "YES", "COME BACK", "EXIT" };
		String[] menu_continue= {"Return", "Finish" };
		String [] menu_yes_no= { "YES", "NO" };
		
		switch (opt) {
			//
			case "menu_primary":
				menu = menu_primary;
				break;
				
			case "menu_crud":
				menu = menu_crud;
				break;
				
			case "menu_setting":
				menu = menu_setting;
				break;
				
			case "menu_print":
				menu = menu_print;
				break;
				
			case "menuDumm":
				menu = menuDumm;
				break;
			 
			case "repeat":
				menu = menu_repeat;
				break;
				
			case "menu_continue":
				menu = menu_continue;
				break;
				
			case "yes_no":
				menu = menu_yes_no;
				break;
				
			default:
				menu = null;
				break;
		}
		
		return menu;
	}
	public static String menuTitle (String opt) {
		String  menu = null;
		String  menu_primary = "Choose a Program";
		String  menu_crud = "Choose an option" ;
		String  menu_setting ="Choose your preferences" ;
		String  menu_print = "What do you want to read?" ;
		String menu_repeat=  "Do you need to do something else?" ;
		
		switch (opt) {
			
			case "menu_primary":
				menu = menu_primary;
				break;
				
			case "menu_crud":
				menu = menu_crud;
				break;
				
			case "menu_setting":
				menu = menu_setting;
				break;
				
			case "menu_print":
				menu = menu_print;
				break;
	
			case "repeat":
				menu = menu_repeat;
				break;
				
			default:
				menu = null;
				break;
		}
		
		return menu;
	}
	
	public static String menuTitleGe (String opt) {
		String  menu = null;
		
		switch (opt) {
		
		case "options":
			menu="OPTIONS";
			break;
		case "welcome":
			menu="WELCOME";
			break;
		case "programs":
			menu="PROGRAMS";
			break;
		case "users":
			menu="USERS";
			break;
		case "admin":
			menu="ADMIN";
			break;
		case "profile":
			menu="PROFILE";
			break;
		case "client":
			menu="CLIENT";
			break;
		case "massages":
			menu="MASSAGES";
			break;
		}
		
		
		
		
		return menu;
	}
	public static String message (String valor) {
		String message = "";
		
		switch (valor) {
			case "exit":
				message="You have chosen to leave.\n Thank you";
				break;
			
		}
		return message;
	}
}
