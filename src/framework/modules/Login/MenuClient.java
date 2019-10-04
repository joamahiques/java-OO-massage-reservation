/**
 * 
 */
package framework.modules.Login;

import javax.swing.JOptionPane;

import framework.LoginMain;
import framework.functions.Functions_menu;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Programs.functions.CRUD.OrderPrograms;
import framework.modules.Programs.functions.CRUD.ReadPrograms;
import framework.modules.Programs.functions.CRUD.UpdateProgram;
import framework.modules.Users.clases.Client;
import framework.modules.Users.clases.SingletonUsers;
import framework.modules.Users.functions.CRUD.FunctionsCrudUsers;
import framework.modules.settings.Functions.SettingsOptions;
import framework.modules.settings.Lan.Languages;

/**
 * @author joana
 *
 */
public class MenuClient {
	
	public static void menuClient() {
	
		int menu=0;
		int menu2=0;
		int menuCLient=0;
		//String [] client= {"Programs","Profile","Settings","Logout"};
		//String [] menudumm= {"Relax", "Therapeutic","Muscular"};
		//String [] ProClient= {"Read", "Update","Order"};
		//String [] profile= {"Read User", "Update User"};
		
		
		do {
			menu= Functions_menu.validabot(Languages.menu("client"), Languages.menuTitle("options"), Languages.menuTitleGe("client"));
			//Programs Profile Settings Logout
			switch (menu) {
				
			case -1://Exit
		
					JOptionPane.showMessageDialog(null, Languages.message("exit"));
					break;
			
			//programs
			case 0://Read, Update, Order
					
					menuCLient= Functions_menu.validabot(Languages.menu("proclient"),  Languages.menuTitle("options"), Languages.menuTitleGe("programs"));
					//read
					if(menuCLient==0) {
							menu2= Functions_menu.validabot(Languages.menu("menuDumm"), Languages.menuTitle("menu_print"), Languages.menuTitleGe("programs"));
						
						if(menu2==0) {
							SingletonPrograms.opt=0;
							ReadPrograms.readPro();
						}
						if(menu2==1) {
							SingletonPrograms.opt=1;
							ReadPrograms.readPro();
						}
						if(menu2==2) {
							SingletonPrograms.opt=2;
							ReadPrograms.readPro();
						}
					}//ENd If
					
					//Update
					if(menuCLient==1) {
						menu2= Functions_menu.validabot(Languages.menu("menuDumm"), "What Program do you want to update?", Languages.menuTitleGe("programs"));
						
						if(menu2==0) {
							SingletonPrograms.opt=0;
							UpdateProgram.updatePro();
						}
						if(menu2==1) {
							SingletonPrograms.opt=1;
							UpdateProgram.updatePro();
						}
						if(menu2==2) {
							SingletonPrograms.opt=2;
							UpdateProgram.updatePro();
						}
						
					}//end if update
					
					//Order
					if(menuCLient==2) {
						menu2= Functions_menu.validabot(Languages.menu("menuDumm"), Languages.menuTitle("orderpro"), Languages.menuTitleGe("programs"));
		
						if(menu2==0) {
							SingletonPrograms.opt=0;
							OrderPrograms.OrderPro();
						}
						if(menu2==1) {
							SingletonPrograms.opt=1;
							OrderPrograms.OrderPro();
						}
						if(menu2==2) {
							SingletonPrograms.opt=2;
							OrderPrograms.OrderPro();
						}
					}//end if Order
					
				break;
				
				//PROFILE
				case 1:
					menuCLient= Functions_menu.validabot(Languages.menu("profile"), Languages.menuTitle("options"), Languages.menuTitleGe("profile"));
					//read
					if(menuCLient==0) {
							JOptionPane.showMessageDialog(null, SingletonUsers.ClientRegistered.toString());//leer su profile
					}//ENd If
					
					//Update
					if(menuCLient==1) {
						SingletonUsers.user = SingletonUsers.UserClient.get(SingletonUsers.location);//lo coje
						FunctionsCrudUsers.updateUsers();//modifica
						SingletonUsers.UserClient.set(SingletonUsers.location,((Client) SingletonUsers.user));//modifica
						
					}//end if update
					break;
				
				//Settings
				case 2:
					
					SettingsOptions.settingsOpt();
				
				//Logout
				case 3:
					
					LoginMain.main(null);
						
			}// end switch
			
			SingletonUsers.rep=Functions_menu.repeat(Languages.menu("repeat"),Languages.menuTitle("repeat"), Languages.menuTitleGe("options"));
		} while (SingletonUsers.rep==0);
		if (SingletonUsers.rep==2||SingletonUsers.rep==-1) {
			SingletonUsers.opt = -1;
		}//end if
	
	}
}

