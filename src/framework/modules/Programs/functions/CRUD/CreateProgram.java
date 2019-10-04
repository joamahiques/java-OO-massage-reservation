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
public class CreateProgram {

	public static void createPro() {
		
		int find = -1;
		
		if(SingletonPrograms.opt==0) {
			Relax relax1=new Relax();
			
			relax1 = FunctionsCrud.askDNIRelax();//tenemos el DNI de clase Relax
			//System.out.println(relax1.getDni()+" find relax1");
			find = FunctionsFind.findRelax(relax1);
			//System.out.println(find+" find relax1");
			
			if (find != -1) {
				JOptionPane.showMessageDialog(null, Languages.message("errorDNI"), "DNI", JOptionPane.ERROR_MESSAGE);
				
			} else {
				FunctionsCrud.createmassage(SingletonPrograms.opt);	
			}
		}//end if
		
		if(SingletonPrograms.opt==1) {
			Therapeutic thera1=new Therapeutic();
			
			thera1 = FunctionsCrud.askDNIThera();
			//System.out.println(thera1+ "askDNI thera");
			find = FunctionsFind.findThera(thera1);
			//System.out.println(find+" find");
			if (find != -1) {
				JOptionPane.showMessageDialog(null, Languages.message("errorDNI"), "DNI", JOptionPane.ERROR_MESSAGE);
			} else {
				FunctionsCrud.createmassage(SingletonPrograms.opt);
			}
		}//end if
		
		if(SingletonPrograms.opt==2) {
			Muscular muscular1=new Muscular();
			
			muscular1 = FunctionsCrud.askDNIMuscular();
			find = FunctionsFind.findMuscular(muscular1);
			if (find != -1) {
				JOptionPane.showMessageDialog(null, Languages.message("errorDNI"), "DNI", JOptionPane.ERROR_MESSAGE);
			} else {
				FunctionsCrud.createmassage(SingletonPrograms.opt);
			}
		}//end if
	}
		
}
