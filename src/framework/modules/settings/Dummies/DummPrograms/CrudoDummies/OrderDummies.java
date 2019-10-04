/**
 * 
 */
package framework.modules.settings.Dummies.DummPrograms.CrudoDummies;

import java.util.Collections;

import javax.swing.JOptionPane;

import framework.functions.Functions_menu;
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
public class OrderDummies {
	
	public static void OrderDumm() {
			
			//String [] options = { "A) DNI", "B) Client Name", "C) Date", "D) Exit Date", "E) Num of Days", "F) Price", "G) Activity", "H) Activity Date", "I) Total Price" };
			String menu = "";
			char order = ' ';
			menu = Functions_menu.combobox(Languages.menu("order"),Languages.menuTitle("order"), Languages.menuTitleGe("programs"));
			
			if(SingletonPrograms.opt==0) {
				
				if(SingletonPrograms.DummieRelax.isEmpty()){
					JOptionPane.showMessageDialog(null,Languages.menuTitle("empty"),"ERROR", JOptionPane.ERROR_MESSAGE);
				}else{
					//menu = Functions_menu.combobox(Languages.menu("order"),Languages.menuTitle("order"), Languages.menuTitleGe());
					order = menu.charAt(0);
					switch (order) {
						case 'A':
							Collections.sort(SingletonPrograms.DummieRelax);
							break;
						case 'B':
							Collections.sort(SingletonPrograms.DummieRelax, new OrderName());
							break;
						case 'C':
							Collections.sort(SingletonPrograms.DummieRelax, new OrderDate());
							break;
						case 'D':
							Collections.sort(SingletonPrograms.DummieRelax, new OrderDateExit());
							break;
						case 'E':
							Collections.sort(SingletonPrograms.DummieRelax, new OrderNumDays());
							break;
						case 'F':
							Collections.sort(SingletonPrograms.DummieRelax, new OrderPriceProgram());
							break;
						case 'G':
							Collections.sort(SingletonPrograms.DummieRelax, new OrderActivity());
							break;
						case 'H':
							Collections.sort(SingletonPrograms.DummieRelax, new OrderActivityDateRelax());
							break;
						case 'I':
							Collections.sort(SingletonPrograms.DummieRelax, new OrderTotalPriceRelax());
							break;
					}//end switch
				}//end if
			}//end if
			
			if(SingletonPrograms.opt==1) {
				
				if(SingletonPrograms.DummieThera.isEmpty()){
					JOptionPane.showMessageDialog(null,Languages.menuTitle("empty"),"ERROR", JOptionPane.ERROR_MESSAGE);
				}else{
					//menu = Functions_menu.combobox(Languages.menu("order"),Languages.menuTitle("order"), Languages.menuTitleGe());
					order = menu.charAt(0);
					switch (order) {
						case 'A':
							Collections.sort(SingletonPrograms.DummieThera);
							break;
						case 'B':
							Collections.sort(SingletonPrograms.DummieThera, new OrderName());
							break;
						case 'C':
							Collections.sort(SingletonPrograms.DummieThera, new OrderDate());
							break;
						case 'D':
							Collections.sort(SingletonPrograms.DummieThera, new OrderDateExit());
							break;
						case 'E':
							Collections.sort(SingletonPrograms.DummieThera, new OrderNumDays());
							break;
						case 'F':
							Collections.sort(SingletonPrograms.DummieThera, new OrderPriceProgram());
							break;
						case 'G':
							Collections.sort(SingletonPrograms.DummieThera, new OrderActivity());
							break;
						case 'H':
							Collections.sort(SingletonPrograms.DummieThera, new OrderActivityDateThera());
							break;
						case 'I':
							Collections.sort(SingletonPrograms.DummieThera, new OrderTotalPriceThera());
							break;
					}//end switch
				}//end if
			}//end if
			if(SingletonPrograms.opt==2) {
				
				if(SingletonPrograms.DummieMuscular.isEmpty()){
					JOptionPane.showMessageDialog(null,Languages.menuTitle("empty"),"ERROR", JOptionPane.ERROR_MESSAGE);
				}else{
					//menu = Functions_menu.combobox(Languages.menu("order"),Languages.menuTitle("order"), Languages.menuTitleGe());
					order = menu.charAt(0);
					switch (order) {
						case 'A':
							Collections.sort(SingletonPrograms.DummieMuscular);
							break;
						case 'B':
							Collections.sort(SingletonPrograms.DummieMuscular, new OrderName());
							break;
						case 'C':
							Collections.sort(SingletonPrograms.DummieMuscular, new OrderDate());
							break;
						case 'D':
							Collections.sort(SingletonPrograms.DummieMuscular, new OrderDateExit());
							break;
						case 'E':
							Collections.sort(SingletonPrograms.DummieMuscular, new OrderNumDays());
							break;
						case 'F':
							Collections.sort(SingletonPrograms.DummieMuscular, new OrderPriceProgram());
							break;
						case 'G':
							Collections.sort(SingletonPrograms.DummieMuscular, new OrderActivity());
							break;
						case 'H':
							Collections.sort(SingletonPrograms.DummieMuscular, new OrderActivityDateMuscular());
							break;
						case 'I':
							Collections.sort(SingletonPrograms.DummieMuscular, new OrderTotalPriceMuscular());
							break;
					}//end switch
				}//end if
			}//end if
		}

}
