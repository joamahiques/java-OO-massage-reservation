/**
 * 
 */
package framework.modules.settings.Functions;

import javax.swing.JOptionPane;

import framework.SingletonApp;
import framework.functions.Functions_menu;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.settings.Lan.Languages;
/**
 * @author joana
 *
 */
public class SettingsOptions {
	
	public static int settingsOpt() {
		
		int opt=0;
		
	do {
		
		opt=Functions_menu.validabot(Languages.menu("menu_setting"), Languages.menuTitle("menu_setting"), Languages.menuTitleGe("options")+" SETTINGS");
		
		switch (opt) {
			case 0:
				SingletonApp.set.setLanguage(FunctionsSettings.language());
				break;
			case 1:
				SingletonApp.set.setDate(FunctionsSettings.date());
				break;
			case 2:
				SingletonApp.set.setCurrency(FunctionsSettings.currency());
				break;
			case 3:
				SingletonApp.set.setDecimal(FunctionsSettings.decimal());
				break;
			case 4:
				SingletonPrograms.opt=Functions_menu.validabot(Languages.menu("menuDumm"), Languages.menuTitle("menu_primary"), Languages.menuTitleGe("options")+" DUMMIES");
				FunctionsSettings.dummies(SingletonApp.set);
				break;
			case 5:
				JOptionPane.showMessageDialog(null, Languages.message("exit"));
				break;
		}
		
		SingletonPrograms.rep=Functions_menu.repeat(Languages.menu("repeat"),Languages.menuTitle("repeat"), Languages.menuTitleGe("options")+" SETTINGS");
	} while (SingletonPrograms.rep==0);
	if (SingletonPrograms.rep==2||SingletonPrograms.rep==-1) {
		SingletonPrograms.opt = -1;
	}//end if
	return opt;
}
}

