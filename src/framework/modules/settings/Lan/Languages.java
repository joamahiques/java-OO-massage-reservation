/**
 * 
 */
package framework.modules.settings.Lan;

import framework.SingletonApp;
import framework.modules.settings.Lan.LangMod.EnglishMod;
import framework.modules.settings.Lan.LangMod.SpanishMod;
import framework.modules.settings.Lan.LangMod.ValencianMod;



/**
 * @author joana
 *
 */
public class Languages {
	
	public static String message (String tra) {
		String message = "";
		
		switch (SingletonApp.set.getLanguage()) {
			case "en":
				message = English.message(tra);
				if (message == "") {
					message = EnglishMod.message(tra);
				}
				break;
			case "es":
				message = Spanish.message(tra);
				if (message == "") {
					message = SpanishMod.message(tra);
				}
				break;
			case "val":
				message = Valencian.message(tra);
				if (message == "") {
					message = ValencianMod.message(tra);
				}
				break;
		}
		return message;
	}
	
	public static String [] menu (String tra) {
		String [] menu = null;
		switch (SingletonApp.set.getLanguage()) {
			case "en":
				menu = English.menu(tra);
				if (menu == null) {
					menu = EnglishMod.menu(tra);
				}				
				break;
			case "es":
				menu = Spanish.menu(tra);
				if (menu == null) {
					menu = SpanishMod.menu(tra);
				}
				break;
			case "val":
				menu = Valencian.menu(tra);
				if (menu == null) {
					menu = ValencianMod.menu(tra);
				}
				break;
		}
		return menu;
	}
	
	public static String  menuTitle (String tra) {
		String  menu = null;
		switch (SingletonApp.set.getLanguage()) {
			case "en":
				menu = English.menuTitle(tra);
				if (menu == null) {
					menu = EnglishMod.menuTitle(tra);
				}
				break;
			case "es":
				menu = Spanish.menuTitle(tra);
				if (menu == null) {
					menu = SpanishMod.menuTitle(tra);
				}
				break;
			case "val":
				menu = Valencian.menuTitle(tra);
				if (menu == null) {
					menu = ValencianMod.menuTitle(tra);
				}
				break;
		}
		return menu;
	}
	
	public static String  menuTitleGe (String tra) {
		String  menu = null;
		switch (SingletonApp.set.getLanguage()) {
			case "en":
				menu = English.menuTitleGe(tra);
				
				break;
			case "es":
				menu = Spanish.menuTitleGe(tra);
				
				break;
			case "val":
				menu = Valencian.menuTitleGe(tra);
				
				break;
		}
		return menu;
	}
}
