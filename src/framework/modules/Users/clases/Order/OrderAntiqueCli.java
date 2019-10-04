/**
 * 
 */
package framework.modules.Users.clases.Order;

import java.util.Comparator;

import framework.modules.Programs.clases.Therapeutic;
import framework.modules.Users.clases.Client;

/**
 * @author joana
 *
 */
public class OrderAntiqueCli implements Comparator<Client>{

	@Override
	public int compare (Client u1, Client u2) {
		if(u1.getAntique()>u2.getAntique())
			return 1;
		if(u1.getAntique()<u2.getAntique())
			return -1;
		return 0;
	}

}
