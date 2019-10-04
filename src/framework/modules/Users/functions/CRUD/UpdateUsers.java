/**
 * 
 */
package framework.modules.Users.functions.CRUD;

import javax.swing.JOptionPane;

import framework.modules.Users.clases.Admin;
import framework.modules.Users.clases.Client;
import framework.modules.Users.clases.SingletonUsers;
import framework.modules.settings.Lan.Languages;


/**
 * @author joana
 *
 */
public class UpdateUsers {

	public static void updateUsers() {
		
		int location1 = -1;
		//ADmin
				if(SingletonUsers.opt==0) {
					if(SingletonUsers.UserAdmin.isEmpty()){
						JOptionPane.showMessageDialog(null,Languages.message("empty"), "ERROR", JOptionPane.ERROR_MESSAGE);
					}else{
						location1 = -1;
						SingletonUsers.user = FunctionsCrudUsers.askDNIAdmin();
						location1 = FunctionsFindUsers.findAdmin((Admin)SingletonUsers.user);//lo encuentra
						if (location1 != -1) {
							SingletonUsers.user = SingletonUsers.UserAdmin.get(location1);//lo coje
							FunctionsCrudUsers.updateUsers();//modifica
							SingletonUsers.UserAdmin.set(location1,((Admin) SingletonUsers.user));//modifica
						}else {
							JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
				
				//CLIENT
				if(SingletonUsers.opt==1) {
					if(SingletonUsers.UserClient.isEmpty()){
						JOptionPane.showMessageDialog(null,Languages.message("empty"), "ERROR", JOptionPane.ERROR_MESSAGE);
					}else{
						location1 = -1;
						SingletonUsers.user = FunctionsCrudUsers.askDNIClient();
						location1 = FunctionsFindUsers.findClient((Client)SingletonUsers.user);//lo encuentra
						if (location1 != -1) {
							SingletonUsers.user = SingletonUsers.UserClient.get(location1);//lo coje
							FunctionsCrudUsers.updateUsers();//config//modifica
							SingletonUsers.UserClient.set(location1,((Client)SingletonUsers.user));//modifica
						}else {
							JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
					
		
		
	}
}
