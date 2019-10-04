/**
 * 
 */
package framework.modules.Programs.functions.CRUD;

import javax.swing.JOptionPane;

import framework.functions.Functions_menu;
import framework.modules.Programs.clases.Muscular;
import framework.modules.Programs.clases.Relax;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Programs.clases.Therapeutic;
import framework.modules.Programs.functions.FunctionsCrud;
import framework.modules.settings.Lan.Languages;


/**
 * @author joana
 *
 */
public class ReadPrograms {
	
	public static void readPro() {
		
		int menu = 0, location = -1;
		//String[] tipo ={"all"," one"};
	
		if(SingletonPrograms.opt==0) {
			
			if(SingletonPrograms.programRelax.isEmpty()){
				JOptionPane.showMessageDialog(null,Languages.message("empty"), "ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
				
				menu = Functions_menu.validabot(Languages.menu("menu_print"), Languages.menuTitle("menu_print"), "");
				switch (menu){
					case 0://Leerlos todos
						for (int j = 0; j <SingletonPrograms.programRelax.size();j++){
							String cad = "";
							cad = cad + (SingletonPrograms.programRelax.get(j).toString());
							JOptionPane.showMessageDialog(null, cad);
						}
						
						break;
					case 1://leer uno
						location = -1;
						SingletonPrograms.massage1 = FunctionsCrud.askDNIRelax();//preguntamos cual
						location = FunctionsFind.findRelax((Relax) SingletonPrograms.massage1);//lo buscamos
						if (location != -1) {
							SingletonPrograms.massage1 = SingletonPrograms.programRelax.get(location);
							JOptionPane.showMessageDialog(null, SingletonPrograms.massage1 .toString());
						}else {//si no existe
							JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
						}
						break;
				}
			}//end if
		}//end if
		
		if(SingletonPrograms.opt==1) {
			
			if(SingletonPrograms.programThera.isEmpty()){
				JOptionPane.showMessageDialog(null,Languages.message("empty"), "ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
				
				menu = Functions_menu.validabot(Languages.menu("menu_print"), Languages.menuTitle("menu_print"), "");
				switch (menu){
					case 0:
						for (int j = 0; j <SingletonPrograms.programThera.size();j++){
							String cad = "";
							cad = cad + (SingletonPrograms.programThera.get(j).toString());
							JOptionPane.showMessageDialog(null, cad);
						}
						
						break;
					case 1:
						location = -1;
						SingletonPrograms.massage1 = FunctionsCrud.askDNIThera();
						location = FunctionsFind.findThera((Therapeutic) SingletonPrograms.massage1);
						if (location != -1) {
							SingletonPrograms.massage1 = SingletonPrograms.programThera.get(location);
							JOptionPane.showMessageDialog(null, SingletonPrograms.massage1 .toString());
						}else {
							JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
						}
						break;
				}
			}//end if
		}//end if
		
		if(SingletonPrograms.opt==2) {
			
			if(SingletonPrograms.programMuscular.isEmpty()){
				JOptionPane.showMessageDialog(null,Languages.message("empty"), "ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
				
				menu = Functions_menu.validabot(Languages.menu("menu_print"), Languages.menuTitle("menu_print"), "");
				switch (menu){
					case 0:
						for (int j = 0; j <SingletonPrograms.programMuscular.size();j++){
							String cad = "";
							cad = cad + (SingletonPrograms.programMuscular.get(j).toString());
							JOptionPane.showMessageDialog(null, cad);
						}
						
						break;
					case 1:
						location = -1;
						SingletonPrograms.massage1 = FunctionsCrud.askDNIMuscular();
						location = FunctionsFind.findMuscular((Muscular) SingletonPrograms.massage1);
						if (location != -1) {
							SingletonPrograms.massage1 = SingletonPrograms.programMuscular.get(location);
							JOptionPane.showMessageDialog(null, SingletonPrograms.massage1 .toString());
						}else {
							JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
						}
						break;
				}
			}//end if
		}//end if
	}

}
