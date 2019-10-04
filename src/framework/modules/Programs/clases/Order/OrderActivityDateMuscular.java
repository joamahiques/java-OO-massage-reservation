/**
 * 
 */
package framework.modules.Programs.clases.Order;

import java.util.Comparator;

import framework.modules.Programs.clases.Muscular;

/**
 * @author joana
 *
 */
public class OrderActivityDateMuscular implements Comparator <Muscular>{
	@Override
	public int compare (Muscular m1, Muscular m2) {
		return m1.getDateActivity().compareDates(m2.getDateActivity());
	}

}
