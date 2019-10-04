/**
 * 
 */
package framework.modules.Programs.clases.Order;

import java.util.Comparator;

import framework.modules.Programs.clases.Therapeutic;

/**
 * @author joana
 *
 */
public class OrderActivityDateThera implements Comparator <Therapeutic>{
	@Override
	public int compare (Therapeutic t1, Therapeutic t2) {
		return t1.getDateActivity().compareDates(t2.getDateActivity());
	}

}
