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
public class UpdateProgram {

	public static void updatePro() {
		
		int location1 = -1;
		Object [] options=null;
		Object value = null;
		//Relax
				if(SingletonPrograms.opt==0) {
					options=SingletonPrograms.DnisRel.toArray();
					value = JOptionPane.showInputDialog(null, "", "Choose", JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
					
					if(SingletonPrograms.programRelax.isEmpty()){
						JOptionPane.showMessageDialog(null,Languages.message("empty"), "ERROR", JOptionPane.ERROR_MESSAGE);
					}else{
						for (int i = 0; i<=(SingletonPrograms.programRelax.size()-1); i++){
							
							if((SingletonPrograms.programRelax.get(i).getDni()).equals(value) ) {
								 location1=i;
								 
							}	
						}//end for
						if(location1!=-1) {
							SingletonPrograms.massage1 = SingletonPrograms.programRelax.get(location1);//lo coje
							FunctionsCrud.updateMassage();//config//modifica
							SingletonPrograms.programRelax.set(location1,((Relax) SingletonPrograms.massage1));//modifica
						}
							
					
					}
				}
				
				//THERA
				if(SingletonPrograms.opt==1) {
					options=SingletonPrograms.DnisThera.toArray();
					value = JOptionPane.showInputDialog(null, "", "Choose", JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
					if(SingletonPrograms.programThera.isEmpty()){
						JOptionPane.showMessageDialog(null,Languages.message("empty"), "ERROR", JOptionPane.ERROR_MESSAGE);
					}else{
						for (int i = 0; i<=(SingletonPrograms.DummieThera.size()-1); i++){
							
							if((SingletonPrograms.DummieThera.get(i).getDni()).equals(value) ) {
								 location1=i;
								 
							}	
						}//end for
						if(location1!=-1) {
							SingletonPrograms.massage1 = SingletonPrograms.programThera.get(location1);//lo coje
							FunctionsCrud.updateMassage();//config//modifica
							SingletonPrograms.programThera.set(location1,((Therapeutic) SingletonPrograms.massage1));
						}
					}
				}
				
				//Muscular
				if(SingletonPrograms.opt==2) {
					options=SingletonPrograms.DnisMus.toArray();
					value = JOptionPane.showInputDialog(null, "", "Choose", JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
					if(SingletonPrograms.programMuscular.isEmpty()){
						JOptionPane.showMessageDialog(null,Languages.message("empty"), "ERROR", JOptionPane.ERROR_MESSAGE);
					}else{
						for (int i = 0; i<=(SingletonPrograms.DummieMuscular.size()-1); i++){
							
							if((SingletonPrograms.DummieMuscular.get(i).getDni()).equals(value) ) {
								 location1=i;
								 
							}	
						}//end for
						if(location1!=-1) {
							SingletonPrograms.massage1 = SingletonPrograms.programMuscular.get(location1);//lo coje
							FunctionsCrud.updateMassage();//config//modifica
							SingletonPrograms.programMuscular.set(location1,((Muscular) SingletonPrograms.massage1));//modifica
						}
				}

	}
	}
}
