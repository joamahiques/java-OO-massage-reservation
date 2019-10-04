/**
 * 
 */
package framework.modules.Users.clases.Order;

import java.util.Comparator;

import framework.modules.Programs.clases.Programs;
import framework.modules.Users.clases.Admin;
import framework.modules.Users.clases.UsersClass;

/**
 * @author joana
 *
 */
public class OrderAntiqueAd implements Comparator <Admin> {

	@Override
	public int compare (Admin u1, Admin u2) {
		if(u1.getAntique()>u2.getAntique())
			return 1;
		if(u1.getAntique()<u2.getAntique())
			return -1;
		return 0;
	}
}
