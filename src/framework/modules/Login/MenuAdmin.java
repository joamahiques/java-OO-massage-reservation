/**
 * 
 */
package framework.modules.Login;

import javax.swing.JOptionPane;

import framework.LoginMain;
import framework.functions.Functions_menu;
import framework.modules.Programs.functions.MenuPrograms;
import framework.modules.Users.clases.Admin;
import framework.modules.Users.clases.SingletonUsers;
import framework.modules.Users.functions.CRUD.FunctionsCrudUsers;
import framework.modules.Users.functions.CRUD.MenuCrudUsers;
import framework.modules.settings.Functions.SettingsOptions;
import framework.modules.settings.Lan.Languages;

/**
 * @author joana
 *
 */
public class MenuAdmin {
		
	public static void menuAdmin() {
		int menu=0;
		int menuCLient=0;
		//String [] register= {"Programs","Users","Profile","Settings","Logout"};
		//String [] ProProfile= {"Read User", "Update User"};
		do {
			menu= Functions_menu.validabot(Languages.menu("admin"), Languages.menuTitle("option"), Languages.menuTitleGe("admin"));
			//Programs Users Profile Settings Logout
			switch (menu) {
				
			case -1://Exit
				JOptionPane.showMessageDialog(null, Languages.message("exit"));
				break;
			//programs
			case 0:
				MenuPrograms.Programs();
				break;	
			//Users
			case 1:
				MenuCrudUsers.Users();
				break;
			//PROFILE
			case 2:
				menuCLient= Functions_menu.validabot(Languages.menu("profile"),  Languages.menuTitle("option"), Languages.menuTitleGe("profile"));//client
				//read
				if(menuCLient==0) {
						JOptionPane.showMessageDialog(null, SingletonUsers.AdminRegistered.toString());//arreglar, para que solo lea el perfil del que ha ingresado.
				}//ENd If
				
				//Update
				if(menuCLient==1) {
					SingletonUsers.user = SingletonUsers.UserAdmin.get(SingletonUsers.location);//lo coje
					FunctionsCrudUsers.updateUsers();//modifica
					SingletonUsers.UserAdmin.set(SingletonUsers.location,((Admin) SingletonUsers.user));//modifica
				}//end if update
				break;
			
			//Settings
			case 3:
				SettingsOptions.settingsOpt();
				break;
			//Logout
			case 4:
				LoginMain.main(null);
				break;	
			}// end switch
			SingletonUsers.rep=Functions_menu.repeat(Languages.menu("repeat"),Languages.menuTitle("repeat"), Languages.menuTitleGe("options"));
		} while (SingletonUsers.rep==0);
		if (SingletonUsers.rep==2||SingletonUsers.rep==-1) {
			SingletonUsers.opt = -1;
		}//end if
		
		}
}

