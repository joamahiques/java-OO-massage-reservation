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
public class DeleteUser {
	
	public static void deleteUse() {
		int location = -1;
		///RELAX
		if(SingletonUsers.user instanceof Admin) {
				if(SingletonUsers.UserAdmin.isEmpty()){
					JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
				}else{
					location = -1;
					SingletonUsers.user = FunctionsCrudUsers.askDNIAdmin();
					location = FunctionsFindUsers.findAdmin((Admin)SingletonUsers.user);
					if (location != -1) {
						SingletonUsers.UserAdmin.remove(location);
						JOptionPane.showMessageDialog(null,Languages.message("delete"));
					}else {
						JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
					}
				}//end if
		}//end if
		///THERA
		if(SingletonUsers.user instanceof Client) {
				if(SingletonUsers.UserClient.isEmpty()){
					JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
				}else{
					location = -1;
					SingletonUsers.user = FunctionsCrudUsers.askDNIClient();
					location = FunctionsFindUsers.findClient((Client)SingletonUsers.user);
					if (location != -1) {
						SingletonUsers.UserClient.remove(location);
						JOptionPane.showMessageDialog(null,Languages.message("delete"));
					}else {
						JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
					}
				}//end if
		}//end if
		
	}
}
