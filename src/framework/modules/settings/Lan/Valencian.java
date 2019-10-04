/**
 * 
 */
package framework.modules.settings.Lan;

/**
 * @author joana
 *
 */
public class Valencian {

	public static String [] menu (String opt) {
		String [] menu = null;
		String [] menu_primary = {"RELAIXANT", "TERAPEUTIC", "MUSCULAR","SETTINGS", "SORTIR"};
		String [] menu_crud = { "CREAR", "LLEGIR", "ACTUALITZAR","BORRAR","ORDENAR","SORTIR" };
		String [] menu_setting = {"Idioma","Format de Data","Moneda","Decimals","Dummies" };
		String [] menu_print = { "Llegir-los tots", "Llegir-ne un" };
		String [] menuDumm = {"RELAIXANT", "TERAPEUTIC", "MUSCULAR"};
		String[] menu_repeat= { "SI", "TORNAR ENRERRE", "SORTIR" };
		String [] menu_yes_no= { "SI", "NO" };
		
		switch (opt) {
			/* Main_user
			 * @return message
			 */
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
		String  menu_primary = "Tria un Programa";
		String  menu_crud = "Tria que vols fer" ;
		String  menu_setting ="Tria les teves preferències" ;
		String  menu_print = "Que vols llegir?" ;
		String menu_repeat=  "Necessites alguna cosa mes?" ;
		
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
			menu="OPCIONS";
			break;
		case "welcome":
			menu="BENVINGUT";
			break;
		case "programs":
			menu="PROGRAMES";
			break;
		case "users":
			menu="USUARI";
			break;
		case "admin":
			menu="ADMINISTRADOR";
			break;
		case "profile":
			menu="PERFIL";
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
				message="Has escollit sortir.\n Gràcies";
				break;
			
		}
		return message;
	}
}
