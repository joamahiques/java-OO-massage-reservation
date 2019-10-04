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


public class OrderNumDays implements Comparator <Programs>{

	
	@Override
	public int compare (Programs u1, Programs u2) {
		if(u1.getDays()>u2.getDays())
			return 1;
		if(u1.getDays()<u2.getDays())
			return -1;
		return 0;
	}
}

