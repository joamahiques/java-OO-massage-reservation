/**
 * 
 */
package framework.modules.Programs.functions.CRUD;

import javax.swing.JOptionPane;

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
public class DeleteProgram {
	
	public static void DeletePro() {
		int location = -1;
		///RELAX
		if(SingletonPrograms.opt==0) {
				if(SingletonPrograms.programRelax.isEmpty()){
					JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
				}else{
					location = -1;
					SingletonPrograms.massage1 = FunctionsCrud.askDNIRelax();
					location = FunctionsFind.findRelax((Relax)SingletonPrograms.massage1);
					if (location != -1) {
						SingletonPrograms.programRelax.remove(location);
						JOptionPane.showMessageDialog(null,Languages.message("delete"));
					}else {
						JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
					}
				}//end if
		}//end if
		///THERA
		if(SingletonPrograms.opt==1) {
				if(SingletonPrograms.programThera.isEmpty()){
					JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
				}else{
					location = -1;
					SingletonPrograms.massage1 = FunctionsCrud.askDNIThera();
					location = FunctionsFind.findThera((Therapeutic)SingletonPrograms.massage1);
					if (location != -1) {
						SingletonPrograms.programThera.remove(location);
						JOptionPane.showMessageDialog(null,Languages.message("delete"));
					}else {
						JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
					}
				}//end if
		}//end if
		////MUSCULAR
		if(SingletonPrograms.opt==2) {
				if(SingletonPrograms.programMuscular.isEmpty()){
					JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
				}else{
					location = -1;
					SingletonPrograms.massage1 = FunctionsCrud.askDNIMuscular();
					location = FunctionsFind.findMuscular((Muscular)SingletonPrograms.massage1);
					if (location != -1) {
						SingletonPrograms.programMuscular.remove(location);
						JOptionPane.showMessageDialog(null,Languages.message("delete"));
					}else {
						JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
					}
				}//end if
		}//end if
	}
}
