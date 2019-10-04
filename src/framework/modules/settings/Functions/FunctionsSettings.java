/**
 * 
 */
package framework.modules.settings.Functions;

import framework.functions.Functions_menu;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.settings.Classes.Settings;
import framework.modules.settings.Dummies.DummPrograms.CrudoDummies.CreateDummies;
import framework.modules.settings.Dummies.DummPrograms.CrudoDummies.DeleteDummies;
import framework.modules.settings.Dummies.DummPrograms.CrudoDummies.OrderDummies;
import framework.modules.settings.Dummies.DummPrograms.CrudoDummies.ReadDummies;
import framework.modules.settings.Dummies.DummPrograms.CrudoDummies.UpdateDummies;
import framework.modules.settings.Lan.Languages;

/**
 * @author joana
 *
 */
public class FunctionsSettings {

	public static String language () {
		String lang="";
		String [] tipoL = { "English", "Español", "Valencià" };
		int menu = 0;
		
		menu = Functions_menu.validabot(tipoL,Languages.menuTitle("menu_setting"),Languages.menuTitleGe("options"));
		
		switch (menu) {
			case 0:
				lang = "en";
				break;
			case 1:
				lang = "es";
				break;
			case 2:
				lang = "val";
				break;
		}
		return lang;
	}
	
	public static String date () {
		String date="";
		String [] tipoD = { "dd/mm/yyyy", "dd-mm-yyyy", "yyyy/mm/dd", "yyyy-mm-dd" };
		int menu = 0;
		
		menu = Functions_menu.validabot(tipoD,Languages.menuTitle("menu_setting"),Languages.menuTitleGe("options"));
		
		switch (menu) {
			case 0:
				date = "dd/mm/yyyy";
				break;
			case 1:
				date = "dd-mm-yyyy";
				break;
			case 2:
				date = "yyyy/mm/dd";
				break;
			case 3:
				date = "yyyy-mm-dd";
				break;
		}
		return date;
	}
	
	public static char currency () {
		char currency=' ';
		String [] tipoC = { "€", "$", "£" };
		int menu = 0;
		
		menu = Functions_menu.validabot(tipoC,Languages.menuTitle("menu_setting"), Languages.menuTitleGe("options"));
		
		switch (menu) {
			case 0:
				currency = '€';
				break;
			case 1:
				currency = '$';
				break;
			case 2:
				currency = '£';
				break;
		}
		return currency;
	}
	
	public static int decimal () {
		int decimal=0, menu = 0;
		String [] tipoD = { "1", "2", "3" };
		
		menu = Functions_menu.validabot(tipoD,Languages.menuTitle("menu_setting"), Languages.menuTitleGe("options"));
		
		switch (menu) {
			case 0:
				decimal = 1;
				break;
			case 1:
				decimal = 2;
				break;
			case 2:
				decimal = 3;
				break;
		}
		return decimal;
		
	}
	
	public static int dummies (Settings set) {
		int menu = 0;
		
		do {
			menu = Functions_menu.validabot(Languages.menu("menu_crud"),Languages.menuTitle("menu_crud"),Languages.menuTitleGe("options")+" DUMMIES");
			
			switch (menu) {
			
					case -1:
							//JOptionPane.showMessageDialog(null, "You have chosen to leave.\n Thank you");
						break;
					//create
					case 0:
						CreateDummies.createDumm();
						break;
					//read
					case 1:
						ReadDummies.readDumm();
						break;
					//update
					case 2:
						UpdateDummies.updateDumm();
						break;
					//delete
					case 3:
						DeleteDummies.DeleteDumm();
						break;
					//Order
					case 4:
						OrderDummies.OrderDumm();
						break;
					//exit
					case 5:
						//JOptionPane.showMessageDialog(null, "You have chosen to leave.\n Thank you");
						break;
				}//end switch
				//repeat?
				SingletonPrograms.rep=Functions_menu.repeat(Languages.menu("repeat"),Languages.menuTitle("repeat"), Languages.menuTitleGe("options")+" DUMMIES");
		} while (SingletonPrograms.rep==0);
		if (SingletonPrograms.rep==2||SingletonPrograms.rep==-1) {
				SingletonPrograms.opt = -1;
		}//end if
			
		return menu;
	}
}
