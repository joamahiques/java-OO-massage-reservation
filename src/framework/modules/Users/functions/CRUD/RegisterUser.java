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
public class RegisterUser {

	public static void register() {
		
		int find = -1;
		
		if(SingletonUsers.opt==0) {
			Admin admin=new Admin();
			
			admin = FunctionsCrudUsers.askDNIAdmin();//tenemos el DNI de clase Relax
			//System.out.println(relax1.getDni()+" find relax1");
			find = FunctionsFindUsers.findAdmin(admin);
			//System.out.println(find+" find relax1");
			
			if (find != -1) {
				JOptionPane.showMessageDialog(null, Languages.message("errorDNI"), "DNI", JOptionPane.ERROR_MESSAGE);
				
			} else {
				FunctionsCrudUsers.createUser();	
			}
		}//end if
		
		if(SingletonUsers.opt==1) {
			Client client=new Client();
		
			client = FunctionsCrudUsers.askDNIClient();
			//System.out.println(client+ " Register 1");
			find = FunctionsFindUsers.findClient(client);
			System.out.println(find+" register 2");
			if (find != -1) {
				JOptionPane.showMessageDialog(null, Languages.message("errorDNI"), "DNI", JOptionPane.ERROR_MESSAGE);
			} else {
				FunctionsCrudUsers.createUser();
			}
		}//end if
		
		
	}
		
}
