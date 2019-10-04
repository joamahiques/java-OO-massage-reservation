/**
 * 
 */
package framework.modules.Programs.clases.Order;

import java.util.Comparator;

import framework.modules.Programs.clases.Programs;
import framework.modules.Programs.clases.Relax;

/**
 * @author joana
 *Provar si funciona per a totes les clases
 */
public class OrderTotalPriceRelax implements Comparator<Relax>{
	
	@Override
	public int compare (Relax r1, Relax r2) {
		if(r1.getTotalPrice()>r2.getTotalPrice())
			return 1;
		if(r1.getTotalPrice()<r2.getTotalPrice())
			return -1;
		return 0;
	}

}

	
	