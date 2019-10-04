/**
 * 
 */
package framework.modules.Programs.clases.Order;

import java.util.Comparator;

import framework.modules.Programs.clases.Relax;

/**
 * @author joana

 */
public class OrderActivityDateRelax implements Comparator <Relax>{

	@Override
	public int compare (Relax u1, Relax u2) {
		return u1.getDateActivity().compareDates(u2.getDateActivity());
	}
}
