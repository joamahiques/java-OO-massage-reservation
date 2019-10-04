/**
 * 
 */
package framework.modules.Users.functions.CRUD;

import java.util.Collections;

import javax.swing.JOptionPane;

import framework.functions.Functions_menu;
import framework.modules.Users.clases.Admin;
import framework.modules.Users.clases.SingletonUsers;
import framework.modules.Users.clases.Order.OrderAge;
import framework.modules.Users.clases.Order.OrderAntiqueAd;
import framework.modules.Users.clases.Order.OrderAntiqueCli;
import framework.modules.Users.clases.Order.OrderName;
import framework.modules.settings.Lan.Languages;


/**
 * @author joana
 *
 */
public class OrderUsers {

	public static void orderUse() {
		
		//{ "A) DNI", "B) Name", "C) Age", "D) Antique" };
		String menu = "";
		char order = ' ';
		
		if(SingletonUsers.user instanceof Admin) {
			
			if(SingletonUsers.UserAdmin.isEmpty()){
				JOptionPane.showMessageDialog(null,Languages.message("empty"), "ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
				menu = Functions_menu.combobox(Languages.menu("orderUsers"), Languages.menuTitle("order"), Languages.menuTitleGe("users"));
				order = menu.charAt(0);
				switch (order) {
					case 'A':
						Collections.sort(SingletonUsers.UserAdmin);
						break;
					case 'B':
						Collections.sort(SingletonUsers.UserAdmin, new OrderName());
						break;
					case 'C':
						Collections.sort(SingletonUsers.UserAdmin, new OrderAge());
						break;
					case 'D':
						Collections.sort(SingletonUsers.UserAdmin, new OrderAntiqueAd());
						break;
					
				}//end switch
			}//end if
		}//end if
		
		if(SingletonUsers.user instanceof Admin) {
			
			if(SingletonUsers.UserClient.isEmpty()){
				JOptionPane.showMessageDialog(null,Languages.message("empty"), "ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
				menu = Functions_menu.combobox(Languages.menu("orderUsers"), Languages.menuTitle("order"), Languages.menuTitleGe("users"));
				order = menu.charAt(0);
				switch (order) {
					case 'A':
						Collections.sort(SingletonUsers.UserClient);
						break;
					case 'B':
						Collections.sort(SingletonUsers.UserClient, new OrderName());
						break;
					case 'C':
						Collections.sort(SingletonUsers.UserClient, new OrderAge());
						break;
					case 'D':
						Collections.sort(SingletonUsers.UserClient, new OrderAntiqueCli());
						break;
					
				}//end switch
			}//end if
		}//end if
		
	}
}
