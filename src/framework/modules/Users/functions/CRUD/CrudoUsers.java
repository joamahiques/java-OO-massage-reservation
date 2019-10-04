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
public class CrudoUsers {
	
	public static int crudUsers() {
		
		int opt=0;
		
		do {
			opt = Functions_menu.validabot(Languages.menu("menu_crud"),Languages.menuTitle("menu_crud"),Languages.menuTitleGe("users"));	
			
			
			switch(opt) {
			
				case -1:
						JOptionPane.showMessageDialog(null, Languages.message("exit"));
				
					break;
				//create
				case 0:
						
						RegisterUser.register();
					
					break;
				
				//read
				case 1:
				
						ReadUsers.readUsers();
						
					break;
				
				//update
				case 2:
					
						UpdateUsers.updateUsers();
					
					break;
				
				//delete
				case 3:
					
						DeleteUser.deleteUse();;
					
					break;
				//Order
				case 4:
					
						OrderUsers.orderUse();;
					
					break;
				//exit
				case 5:
					
					JOptionPane.showMessageDialog(null, Languages.message("exit"));
					
					break;
			}//end switch
			//repeat?
		SingletonUsers.rep=Functions_menu.repeat(Languages.menu("repeat"),Languages.menuTitle("repeat"), Languages.menuTitleGe("users"));
	} while (SingletonUsers.rep==0);
	if (SingletonUsers.rep==2||SingletonUsers.rep==-1) {
		SingletonUsers.opt = -1;
	}//end if
		
	return opt;

}

}
