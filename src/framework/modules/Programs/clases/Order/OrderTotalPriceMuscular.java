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
public class OrderTotalPriceMuscular implements Comparator<Muscular> {
	
	@Override
	public int compare (Muscular m1, Muscular m2) {
		if(m1.getTotalPrice()>m2.getTotalPrice())
			return 1;
		if(m1.getTotalPrice()<m2.getTotalPrice())
			return -1;
		return 0;
	}

}
