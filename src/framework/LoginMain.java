/**
 * 
 */
package framework;

import javax.swing.JOptionPane;

import framework.functions.Functions_menu;
import framework.modules.Login.FunctionsLogin;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Users.clases.SingletonUsers;
import framework.modules.settings.Classes.Settings;
import framework.modules.settings.Dummies.DummPrograms.CrudoDummies.CreateDummies;
import framework.modules.settings.Dummies.DummUsers.CreateUsersDum;
import framework.modules.settings.Functions.SettingsOptions;
import framework.modules.settings.Lan.Languages;

/**
 * @author joana
 *
 */
public class LoginMain {
	
	public static void main(String[] args) {
		
		SingletonApp.set= new Settings();
		
		//String [] menulogin= {"Invited","Register","Login","Settings","Exit"};
		//create programs
		if(SingletonPrograms.DummieRelax.isEmpty()) {
		
			SingletonPrograms.opt=0;
			CreateDummies.createDumm();
			SingletonPrograms.opt=1;
			CreateDummies.createDumm();
			SingletonPrograms.opt=2;
			CreateDummies.createDumm();
		}
		///CreateUsers
		if(SingletonUsers.UserAdmin.isEmpty()) {
			SingletonUsers.opt=0;
			CreateUsersDum.createDumm();
			SingletonUsers.opt=1;
			CreateUsersDum.createDumm();//Estos dummies se guardan en el array de users principal, no hay uno especifico para dummies, así lo podemos update etc como si lo hubieramos creado de forma manual.
		}
		
		do {
			///Options:
			SingletonUsers.opt = Functions_menu.validabot(Languages.menu("menulogin"), Languages.menuTitle("menu_crud"), Languages.menuTitleGe("welcome"));
			
			switch (SingletonUsers.opt) {

///////////////////////---EXIT		
			
			case -1:
				
				//function
				JOptionPane.showMessageDialog(null, Languages.message("exit"));
				break;

/////////////////////---INVITED		
			case 0:
				
				//function 
				FunctionsLogin.login();
				break;
				
///////////////////---REGISTER
			case 1:
				
				//function 
				FunctionsLogin.login();
				break;

///////////////////---lOGIN		
			case 2:
				
				//function 
				FunctionsLogin.login();
				break;

///////////////////---SETTINGS		
			case 3:
				
				//function 
				SettingsOptions.settingsOpt();
				break;

///////////////////---EXIT			
			case 4:
				
				JOptionPane.showMessageDialog(null, Languages.message("exit"));
				SingletonUsers.opt=-1;
				break;
				

			}//end switch

		} while (SingletonUsers.opt != -1);// button X

		
	}

}


