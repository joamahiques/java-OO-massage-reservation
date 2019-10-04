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
public class OrderDateExit implements Comparator <Programs>{

	@Override
	public int compare (Programs u1, Programs u2) {
		return u1.getDateexit().compareDates(u2.getDateexit());
	}
}
