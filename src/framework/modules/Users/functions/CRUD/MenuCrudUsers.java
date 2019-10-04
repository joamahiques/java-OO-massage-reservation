/**
 * 
 */
package framework.modules.Users.functions.CRUD;

import javax.swing.JOptionPane;

import framework.functions.Functions_menu;
import framework.modules.Users.clases.SingletonUsers;
import framework.modules.settings.Lan.Languages;

/**
 * @author joana
 *
 */
public class MenuCrudUsers {
	
public static void Users() {
		///Admins Clients Exit
		//SingletonApp.set= new Settings();
		
		String[] users= {"Admins", "Clients", "Exit"};
		
		do {
			///Options:
			SingletonUsers.opt = Functions_menu.validabot(users, Languages.menuTitle("option"), Languages.menuTitle("USER"));
			
			switch (SingletonUsers.opt) {

///////////////////////---EXIT		
			
			case -1:
				
				//function
				JOptionPane.showMessageDialog(null, Languages.message("exit"));
				break;

/////////////////////---ADmins	
			case 0:
				
				//function 
				CrudoUsers.crudUsers();//singletonUsers.opt=0
				break;
				
///////////////////---CLients
			case 1:
				
				//function 
				CrudoUsers.crudUsers();//singletonUsers.opt=1
				break;

///////////////////---EXIT			
			case 2:
				
				JOptionPane.showMessageDialog(null, Languages.message("exit"));
				SingletonUsers.opt=-1;
				break;
				

			}//end switch

		} while (SingletonUsers.opt != -1);// button X

		
	}

}



