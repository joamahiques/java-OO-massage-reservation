/**
 * 
 */
package framework.modules.Programs.clases.Order;

import java.util.Comparator;

import framework.modules.Programs.clases.Programs;

/**
 * @author joana
 *
 */
public class OrderName implements Comparator <Programs>{
	
	@Override
	public int compare (Programs u1, Programs u2) {
		if(u1.getNameClient().compareTo(u2.getNameClient())>0)
			return 1;
		if(u1.getNameClient().compareTo(u2.getNameClient())<0)
			return -1;
		return 0;
	}
}
