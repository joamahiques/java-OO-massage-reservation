/**
 * 
 */
package framework.modules.settings.Lan;

/**
 * @author joana
 *
 */
public class Spanish {

	public static String [] menu (String opt) {
		String [] menu = null;
		String [] menu_primary = {"RELAJANTE", "TERAPEUTICO", "MUSCULAR","SETTINGS", "SALIR"};
		String [] menu_crud = { "CREAR", "LEER", "ACTUALIZAR","BORRAR","ORDENAR","SALIR" };
		String [] menu_setting = {"Idioma","Formato de Fecha","Moneda","Decimales","Dummies" };
		String [] menu_print = { "Todos", "Uno" };
		String [] menuDumm = {"RELAJANTE", "TERAPEUTICO", "MUSCULAR"};
		String[] menu_repeat= { "SI", "VOLVER ATRÁS", "SALIR" };
		String [] menu_yes_no= { "SI", "NO" };
		
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
		String  menu_primary = "Escoge un Programa";
		String  menu_crud = "Escoge que quieres hacer" ;
		String  menu_setting ="Escoge tus preferencias" ;
		String  menu_print = "Que quieres leer?" ;
		String menu_repeat=  "Necesitas hacer alguna cosa más?" ;
		
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
			menu="OPCIONES";
			break;
		case "welcome":
			menu="BIENVENIDO";
			break;
		case "programs":
			menu="PROGRAMAS";
			break;
		case "users":
			menu="USUARIO";
			break;
		case "admin":
			menu="ADMINISTRADOR";
			break;
		case "profile":
			menu="PERFIL";
			break;
		case "client":
			menu="CLIENTE";
			break;
		case "massages":
			menu="MASAJES";
			break;
		}
		
		
		
		
		return menu;
	}
	
	public static String message (String valor) {
		String message = "";
		
		switch (valor) {
			case "exit":
				message="Has escogido salir. \nGracias";
				break;
			
		}
		return message;
	}
}
