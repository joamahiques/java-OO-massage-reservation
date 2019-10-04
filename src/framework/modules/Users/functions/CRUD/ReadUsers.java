/**
 * 
 */
package framework.modules.Users.functions.CRUD;

import javax.swing.JOptionPane;

import framework.functions.Functions_menu;
import framework.modules.Users.clases.Admin;
import framework.modules.Users.clases.Client;
import framework.modules.Users.clases.SingletonUsers;
import framework.modules.settings.Lan.Languages;


/**
 * @author joana
 *
 */
public class ReadUsers {
	
	public static void readUsers() {
		
		int menu = 0, location = -1;
		
		if(SingletonUsers.opt==0) {
			if(SingletonUsers.UserAdmin.isEmpty()){
				JOptionPane.showMessageDialog(null,Languages.message("empty"), "ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
				
				menu = Functions_menu.validabot(Languages.menu("menu_print"), Languages.menuTitle("menu_print"), "");
				switch (menu){
					case 0://Leerlos todos
						for (int j = 0; j <SingletonUsers.UserAdmin.size();j++){
							String cad = "";
							cad = cad + (SingletonUsers.UserAdmin.get(j).toString());
							JOptionPane.showMessageDialog(null, cad);
						}
						
						break;
					case 1://leer uno
						location = -1;
						SingletonUsers.user = FunctionsCrudUsers.askDNIAdmin();//preguntamos cual
						location = FunctionsFindUsers.findAdmin((Admin) SingletonUsers.user);//lo buscamos
						if (location != -1) {
							SingletonUsers.user = SingletonUsers.UserAdmin.get(location);
							JOptionPane.showMessageDialog(null, SingletonUsers.user .toString());
						}else {//si no existe
							JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
						}
						break;
				}
			}//end if
		}//end if
		
		if(SingletonUsers.opt==1) {
			System.out.println(SingletonUsers.user.getDNI().toString()+" forDNI");
			if(SingletonUsers.UserClient.isEmpty()){
				JOptionPane.showMessageDialog(null,Languages.message("empty"), "ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
				
				menu = Functions_menu.validabot(Languages.menu("menu_print"), Languages.menuTitle("menu_print"), "");
				switch (menu){
					case 0:
						for (int j = 0; j <SingletonUsers.UserClient.size();j++){
							String cad = "";
							cad = cad + (SingletonUsers.UserClient.get(j).toString());
							JOptionPane.showMessageDialog(null, cad);
						}
						
						break;
					case 1:
						location = -1;
						SingletonUsers.user = FunctionsCrudUsers.askDNIClient();
						location = FunctionsFindUsers.findClient((Client) SingletonUsers.user);
						if (location != -1) {
							SingletonUsers.user = SingletonUsers.UserClient.get(location);
							JOptionPane.showMessageDialog(null, SingletonUsers.user .toString());
						}else {
							JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
						}
						break;
				}
			}//end if
		}//end if
		
	}

}
