/**
 * 
 */
package framework.modules.Programs.clases.Order;

import java.util.Comparator;

import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Programs.clases.Therapeutic;

/**
 * @author joana
 *
 */
public class OrderTotalPriceThera implements Comparator<Therapeutic>{

	@Override
	public int compare (Therapeutic t1, Therapeutic t2) {
		if(t1.getTotalPrice()>t2.getTotalPrice())
			return 1;
		if(t1.getTotalPrice()<t2.getTotalPrice())
			return -1;
		return 0;
	}

}
