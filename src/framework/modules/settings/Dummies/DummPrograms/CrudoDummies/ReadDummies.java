/**
 * 
 */
package framework.modules.settings.Dummies.DummPrograms.CrudoDummies;

import javax.swing.JOptionPane;

import framework.functions.Functions_menu;
import framework.modules.Programs.clases.Muscular;
import framework.modules.Programs.clases.Relax;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Programs.clases.Therapeutic;
import framework.modules.settings.Dummies.DummPrograms.FindDummies;
import framework.modules.settings.Dummies.DummPrograms.FunctionsDummies;
import framework.modules.settings.Lan.Languages;

/**
 * @author joana
 *
 */
public class ReadDummies {

public static void readDumm() {
		
		int menu = 0, location = -1;
		
		
		if(SingletonPrograms.opt==0) {
			
			if(SingletonPrograms.DummieRelax.isEmpty()){
				JOptionPane.showMessageDialog(null,Languages.menuTitle("empty"),"ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
				
				menu = Functions_menu.validabot(Languages.menu("menu_print"), Languages.menuTitle("menu_print"), "");
				switch (menu){
					case 0:
						for (int j = 0; j <SingletonPrograms.DummieRelax.size();j++){
							String cad = "";
							cad = cad + (SingletonPrograms.DummieRelax.get(j).toString(/*config*/));
							JOptionPane.showMessageDialog(null, cad);
						}
						
						break;
					case 1:
						location = -1;
						SingletonPrograms.massage1 = FunctionsDummies.askDNIRelax();
						location = FindDummies.findRelax((Relax) SingletonPrograms.massage1);
						if (location != -1) {
							SingletonPrograms.massage1 = SingletonPrograms.DummieRelax.get(location);
							JOptionPane.showMessageDialog(null, SingletonPrograms.massage1 .toString());
						}else {
							JOptionPane.showMessageDialog(null,"Error","ERROR", JOptionPane.ERROR_MESSAGE);
						}
						break;
				}
			}//end if
		}//end if
		
		if(SingletonPrograms.opt==1) {
			
			if(SingletonPrograms.DummieThera.isEmpty()){
				JOptionPane.showMessageDialog(null,Languages.menuTitle("empty"),"ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
				
				menu = Functions_menu.validabot(Languages.menu("menu_print"), Languages.menuTitle("menu_print"), "");
				switch (menu){
					case 0:
						for (int j = 0; j <SingletonPrograms.DummieThera.size();j++){
							String cad = "";
							cad = cad + (SingletonPrograms.DummieThera.get(j).toString());
							JOptionPane.showMessageDialog(null, cad);
						}
						
						break;
					case 1:
						location = -1;
						SingletonPrograms.massage1 = FunctionsDummies.askDNIThera();
						location = FindDummies.findThera((Therapeutic) SingletonPrograms.massage1);
						if (location != -1) {
							SingletonPrograms.massage1 = SingletonPrograms.DummieThera.get(location);
							JOptionPane.showMessageDialog(null, SingletonPrograms.massage1 .toString());
						}else {
							JOptionPane.showMessageDialog(null,"Error","ERROR", JOptionPane.ERROR_MESSAGE);
						}
						break;
				}
			}//end if
		}//end if
		
		if(SingletonPrograms.opt==2) {
			
			if(SingletonPrograms.DummieMuscular.isEmpty()){
				JOptionPane.showMessageDialog(null,Languages.menuTitle("empty"),"ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
				
				menu = Functions_menu.validabot(Languages.menu("menu_print"), Languages.menuTitle("menu_print"), "");
				switch (menu){
					case 0:
						for (int j = 0; j <SingletonPrograms.DummieMuscular.size();j++){
							String cad = "";
							cad = cad + (SingletonPrograms.DummieMuscular.get(j).toString());
							JOptionPane.showMessageDialog(null, cad);
						}
						
						break;
					case 1:
						location = -1;
						SingletonPrograms.massage1 =FunctionsDummies.askDNIMuscular();
						location = FindDummies.findMuscular((Muscular) SingletonPrograms.massage1);
						if (location != -1) {
							SingletonPrograms.massage1 = SingletonPrograms.DummieMuscular.get(location);
							JOptionPane.showMessageDialog(null, SingletonPrograms.massage1 .toString());
						}else {
							JOptionPane.showMessageDialog(null,"Error","ERROR", JOptionPane.ERROR_MESSAGE);
						}
						break;
				}
			}//end if
		}//end if
	}
}
