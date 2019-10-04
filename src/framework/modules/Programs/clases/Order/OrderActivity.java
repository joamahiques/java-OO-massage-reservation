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
public class OrderActivity implements Comparator <Programs>{ 

	@Override
	public int compare (Programs u1, Programs u2) {
		if(u1.getActivity().compareTo(u2.getActivity())>0)
			return 1;
		if(u1.getActivity().compareTo(u2.getActivity())<0)
			return -1;
		return 0;
	}
}
