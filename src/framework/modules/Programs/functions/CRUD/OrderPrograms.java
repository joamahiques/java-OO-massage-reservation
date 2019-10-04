/**
 * 
 */
package framework.modules.Programs.functions.CRUD;

import java.util.Collections;

import javax.swing.JOptionPane;

import framework.functions.Functions_menu;
import framework.modules.Programs.clases.Relax;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Programs.clases.Order.OrderActivity;
import framework.modules.Programs.clases.Order.OrderActivityDateMuscular;
import framework.modules.Programs.clases.Order.OrderActivityDateRelax;
import framework.modules.Programs.clases.Order.OrderActivityDateThera;
import framework.modules.Programs.clases.Order.OrderDate;
import framework.modules.Programs.clases.Order.OrderDateExit;
import framework.modules.Programs.clases.Order.OrderName;
import framework.modules.Programs.clases.Order.OrderNumDays;
import framework.modules.Programs.clases.Order.OrderPriceProgram;
import framework.modules.Programs.clases.Order.OrderTotalPriceMuscular;
import framework.modules.Programs.clases.Order.OrderTotalPriceRelax;
import framework.modules.Programs.clases.Order.OrderTotalPriceThera;
import framework.modules.settings.Lan.Languages;


/**
 * @author joana
 *
 */
public class OrderPrograms {

	public static void OrderPro() {
		
		//String [] options = { "A) DNI", "B) Client Name", "C) Date", "D) Exit Date", "E) Num of Days", "F) Price", "G) Activity", "H) Activity Date", "I) Total Price" };
		String menu = "";
		char order = ' ';
		
		if(SingletonPrograms.massage1 instanceof Relax) {
			
			if(SingletonPrograms.programRelax.isEmpty()){
				JOptionPane.showMessageDialog(null,Languages.message("empty"), "ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
				menu = Functions_menu.combobox(Languages.menu("order"), Languages.menuTitle("order"), Languages.menuTitleGe("programs"));
				order = menu.charAt(0);
				switch (order) {
					case 'A':
						Collections.sort(SingletonPrograms.programRelax);
						break;
					case 'B':
						Collections.sort(SingletonPrograms.programRelax, new OrderName());
						break;
					case 'C':
						Collections.sort(SingletonPrograms.programRelax, new OrderDate());
						break;
					case 'D':
						Collections.sort(SingletonPrograms.programRelax, new OrderDateExit());
						break;
					case 'E':
						Collections.sort(SingletonPrograms.programRelax, new OrderNumDays());
						break;
					case 'F':
						Collections.sort(SingletonPrograms.programRelax, new OrderPriceProgram());
						break;
					case 'G':
						Collections.sort(SingletonPrograms.programRelax, new OrderActivity());
						break;
					case 'H':
						Collections.sort(SingletonPrograms.programRelax, new OrderActivityDateRelax());
						break;
					case 'I':
						Collections.sort(SingletonPrograms.programRelax, new OrderTotalPriceRelax());
						break;
				}//end switch
			}//end if
		}//end if
		
		if(SingletonPrograms.opt==1) {
			
			if(SingletonPrograms.programThera.isEmpty()){
				JOptionPane.showMessageDialog(null,Languages.message("empty"), "ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
				menu = Functions_menu.combobox(Languages.menu("order"), Languages.menuTitle("order"), Languages.menuTitleGe("programs"));
				order = menu.charAt(0);
				switch (order) {
					case 'A':
						Collections.sort(SingletonPrograms.programThera);
						break;
					case 'B':
						Collections.sort(SingletonPrograms.programThera, new OrderName());
						break;
					case 'C':
						Collections.sort(SingletonPrograms.programThera, new OrderDate());
						break;
					case 'D':
						Collections.sort(SingletonPrograms.programThera, new OrderDateExit());
						break;
					case 'E':
						Collections.sort(SingletonPrograms.programThera, new OrderNumDays());
						break;
					case 'F':
						Collections.sort(SingletonPrograms.programThera, new OrderPriceProgram());
						break;
					case 'G':
						Collections.sort(SingletonPrograms.programThera, new OrderActivity());
						break;
					case 'H':
						Collections.sort(SingletonPrograms.programThera, new OrderActivityDateThera());
						break;
					case 'I':
						Collections.sort(SingletonPrograms.programThera, new OrderTotalPriceThera());
						break;
				}//end switch
			}//end if
		}//end if
		if(SingletonPrograms.opt==2) {
			
			if(SingletonPrograms.programThera.isEmpty()){
				JOptionPane.showMessageDialog(null,Languages.message("empty"), "ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
				menu = Functions_menu.combobox(Languages.menu("order"), Languages.menuTitle("order"), Languages.menuTitleGe("programs"));
				order = menu.charAt(0);
				switch (order) {
					case 'A':
						Collections.sort(SingletonPrograms.programMuscular);
						break;
					case 'B':
						Collections.sort(SingletonPrograms.programMuscular, new OrderName());
						break;
					case 'C':
						Collections.sort(SingletonPrograms.programMuscular, new OrderDate());
						break;
					case 'D':
						Collections.sort(SingletonPrograms.programMuscular, new OrderDateExit());
						break;
					case 'E':
						Collections.sort(SingletonPrograms.programMuscular, new OrderNumDays());
						break;
					case 'F':
						Collections.sort(SingletonPrograms.programMuscular, new OrderPriceProgram());
						break;
					case 'G':
						Collections.sort(SingletonPrograms.programMuscular, new OrderActivity());
						break;
					case 'H':
						Collections.sort(SingletonPrograms.programMuscular, new OrderActivityDateMuscular());
						break;
					case 'I':
						Collections.sort(SingletonPrograms.programMuscular, new OrderTotalPriceMuscular());
						break;
				}//end switch
			}//end if
		}//end if
	}
}
