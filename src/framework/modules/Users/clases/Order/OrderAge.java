/**
 * 
 */
package framework.modules.Users.clases.Order;

import java.util.Comparator;

import framework.modules.Users.clases.UsersClass;

/**
 * @author joana
 *
 */
public class OrderAge implements Comparator<UsersClass> {
	
	@Override
	public int compare (UsersClass u1, UsersClass u2) {
		if(u1.getAge()>u2.getAge())
			return 1;
		if(u1.getAge()<u2.getAge())
			return -1;
		return 0;
	}

}
