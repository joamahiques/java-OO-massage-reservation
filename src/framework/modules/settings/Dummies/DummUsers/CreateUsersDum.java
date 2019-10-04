/**
 * 
 */
package framework.modules.settings.Dummies.DummUsers;

import framework.modules.Users.clases.Admin;
import framework.modules.Users.clases.Client;
import framework.modules.Users.clases.SingletonUsers;

/**
 * @author joana
 *
 */
public class CreateUsersDum {

	public static void createDumm() {
		int find = -1;
		Admin admin=new Admin();
		Client client=new Client();
		//Admin
		if(SingletonUsers.opt==0) {
		
			find = FindUsersDum.findAdmin(admin);
			//System.out.println(find+" find relax1");
			
			if (find != -1) {
				//JOptionPane.showMessageDialog(null,Languages.menuTitle("errorDNI"),"ERROR", JOptionPane.ERROR_MESSAGE);
				
			} else {
				UsersDummie.createUser();
				
			}// end if
		}
	
		
		//client
		 find = -1;
		
		if(SingletonUsers.opt==1) {
			find = FindUsersDum.findClient(client);
			//System.out.println(find+" find relax1");
			
			if (find != -1) {
				//JOptionPane.showMessageDialog(null,Languages.menuTitle("errorDNI"),"ERROR", JOptionPane.ERROR_MESSAGE);
				
			} else {
				UsersDummie.createUser();
				
			}// end if
		}
	}
}