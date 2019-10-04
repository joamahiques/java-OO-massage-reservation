/**
 * 
 */
package framework.modules.settings.Dummies.DummPrograms.CrudoDummies;

import javax.swing.JOptionPane;

import framework.modules.Programs.clases.Muscular;
import framework.modules.Programs.clases.Relax;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Programs.clases.Therapeutic;
import framework.modules.settings.Dummies.DummPrograms.FunctionsDummies;


/**
 * @author joana
 *
 */
public class UpdateDummies {
	
public static void updateDumm() {
	int loc=0;
	Object [] options=null;
	Object value = null;
	
		//Relax
		if(SingletonPrograms.massage1 instanceof Relax) {
			options=SingletonPrograms.DnisRel.toArray();
			value = JOptionPane.showInputDialog(null, "", "Choose", JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
			
			if(SingletonPrograms.DummieRelax.isEmpty()){
				JOptionPane.showMessageDialog(null,"VACIO");// Languages.message("mainerror", config, 0), Languages.message("errortitle", config, 0), JOptionPane.ERROR_MESSAGE);
			}else{
				
				for (int i = 0; i<=(SingletonPrograms.DummieRelax.size()-1); i++){
					
					if((SingletonPrograms.DummieRelax.get(i).getDni()).equals(value) ) {
						 loc=i;
						 
					}	
				}//end for
				if(loc!=-1) {
					SingletonPrograms.massage1 = SingletonPrograms.DummieRelax.get(loc);
					FunctionsDummies.upDumm();
					SingletonPrograms.DummieRelax.set(loc,((Relax) SingletonPrograms.massage1));//modifica
				}
			}
		}
		
		//THERA
		if(SingletonPrograms.massage1 instanceof Therapeutic) {
			options=SingletonPrograms.DnisThera.toArray();
			value = JOptionPane.showInputDialog(null, "", "Choose", JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
			
			if(SingletonPrograms.DummieThera.isEmpty()){
				JOptionPane.showMessageDialog(null,"VACIO");// Languages.message("mainerror", config, 0), Languages.message("errortitle", config, 0), JOptionPane.ERROR_MESSAGE);
			}else{
				for (int i = 0; i<=(SingletonPrograms.DummieThera.size()-1); i++){
					
					if((SingletonPrograms.DummieThera.get(i).getDni()).equals(value) ) {
						 loc=i;	 
					}	
				}//end for
				if(loc!=-1) {
					SingletonPrograms.massage1 = SingletonPrograms.DummieThera.get(loc);
					FunctionsDummies.upDumm();
					SingletonPrograms.DummieThera.set(loc,((Therapeutic) SingletonPrograms.massage1));//modifica
				}
			}
		}
		
		//Muscular
		if(SingletonPrograms.massage1 instanceof Muscular) {
			options=SingletonPrograms.DnisMus.toArray();
			value = JOptionPane.showInputDialog(null, "", "Choose", JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
		
			if(SingletonPrograms.DummieMuscular.isEmpty()){
				JOptionPane.showMessageDialog(null,"VACIO");// Languages.message("mainerror", config, 0), Languages.message("errortitle", config, 0), JOptionPane.ERROR_MESSAGE);
			}else{
				for (int i = 0; i<=(SingletonPrograms.DummieMuscular.size()-1); i++){
					
					if((SingletonPrograms.DummieMuscular.get(i).getDni()).equals(value) ) {
						 loc=i;	 
					}	
				}//end for
				if(loc!=-1) {
					SingletonPrograms.massage1 = SingletonPrograms.DummieMuscular.get(loc);
					FunctionsDummies.upDumm();
					SingletonPrograms.DummieMuscular.set(loc,((Muscular) SingletonPrograms.massage1));//modifica
				}
			}
		}
		
		
	}

}
