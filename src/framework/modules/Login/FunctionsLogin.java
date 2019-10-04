/**
 * 
 */
package framework.modules.Login;

import javax.swing.JOptionPane;

import framework.functions.Functions_menu;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Programs.functions.CRUD.OrderPrograms;
import framework.modules.Programs.functions.CRUD.ReadPrograms;
import framework.modules.Users.clases.Admin;
import framework.modules.Users.clases.Client;
import framework.modules.Users.clases.SingletonUsers;
import framework.modules.Users.functions.CRUD.FunctionsCrudUsers;
import framework.modules.Users.functions.CRUD.FunctionsFindUsers;
import framework.modules.Users.functions.CRUD.RegisterUser;
import framework.modules.settings.Lan.Languages;

/**
 * @author joana
 *
 */
public class FunctionsLogin {
	
	public static void login() {
		
		int menu=0;
		int menu2=0;
		int location=0;
		
		do {
		
		///SI es invitado
		if(SingletonUsers.opt==0) {
			
			do {
					menu= Functions_menu.validabot(Languages.menu("invited"), Languages.menuTitle("menu_crud"), Languages.menuTitleGe("options"));
					
					switch (menu) {
			
							case -1://Exit
			
								JOptionPane.showMessageDialog(null, Languages.message("exit"));
								break;
							
							case 0://Read
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
								break;
							case 1://order
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
				
								}//ens switch
				}while(menu!=-1);
			}//end if Invited
		
	
			///REGISTER
			if(SingletonUsers.opt==1) {
						
						//Client
						SingletonUsers.opt=1;
						RegisterUser.register();
						///almacena su prefil en ClientREgistered
						location = FunctionsFindUsers.findClient((Client)SingletonUsers.user);
						SingletonUsers.location=location;
						SingletonUsers.ClientRegistered=SingletonUsers.UserClient.get(location);
						MenuClient.menuClient();
						
			}
			
			///LOGIN
			if(SingletonUsers.opt==2) {
					
				menu2= Functions_menu.validabot(Languages.menu("login"), Languages.menuTitle("login"), "LOGIN");
				
				//admin
				if(menu2==0) {
					if(SingletonUsers.UserAdmin.isEmpty()){
						JOptionPane.showMessageDialog(null,Languages.message("empty"), "ERROR", JOptionPane.ERROR_MESSAGE);
					}else{
						location = -1;
						
						SingletonUsers.user = FunctionsCrudUsers.askDNIAdmin();
						location = FunctionsFindUsers.findAdmin((Admin)SingletonUsers.user);
						if (location != -1) {
							///si existe
							SingletonUsers.location=location;
							SingletonUsers.AdminRegistered=SingletonUsers.UserAdmin.get(location);///Almacenamos el registrado para poder mostrar su perfil y actualizarlo
							MenuAdmin.menuAdmin();
						}else {
							JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
						}
					}//end if
					
				}//end if
				//Client
				if(menu2==1) {
					if(SingletonUsers.UserClient.isEmpty()){
						JOptionPane.showMessageDialog(null,Languages.message("empty"), "ERROR", JOptionPane.ERROR_MESSAGE);
					}else{
						location = -1;
						SingletonUsers.user = FunctionsCrudUsers.askDNIClient();
						location = FunctionsFindUsers.findClient((Client)SingletonUsers.user);
						if (location != -1) {
							///si existe
							SingletonUsers.location=location;
							SingletonUsers.ClientRegistered=SingletonUsers.UserClient.get(location);///Almacenamos el registrado para poder mostrar su perfil y actualizarlo
							MenuClient.menuClient();
						}else {
							JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
						}
					}//end if
					
				}//end if
				
			}	
			SingletonUsers.rep=Functions_menu.repeat(Languages.menu("repeat"),Languages.menuTitle("repeat"), Languages.menuTitleGe("options"));
		} while (SingletonUsers.rep==0);
		if (SingletonUsers.rep==2||SingletonUsers.rep==-1) {
			SingletonUsers.opt = -1;
		}//end if
}
}
