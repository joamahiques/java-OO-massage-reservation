/**
 * 
 */
package framework.modules.settings.Dummies.DummPrograms.CrudoDummies;

import javax.swing.JOptionPane;

import framework.modules.Programs.clases.Muscular;
import framework.modules.Programs.clases.Relax;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Programs.clases.Therapeutic;
import framework.modules.settings.Lan.Languages;

/**
 * @author joana
 *
 */
public class DeleteDummies {

	public static void DeleteDumm() {

		int loc=0;
		Object [] options=null;
		Object value=null;

		///RELAX
			if(SingletonPrograms.massage1 instanceof Relax) {
				options=SingletonPrograms.DnisRel.toArray();
				value = JOptionPane.showInputDialog(null, "DNIs", "", JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
				if(SingletonPrograms.DummieRelax.isEmpty()){
					JOptionPane.showMessageDialog(null,Languages.menuTitle("empty"),"ERROR", JOptionPane.ERROR_MESSAGE);
				}else{
				
				for (int i = 0; i<=(SingletonPrograms.DummieRelax.size()-1); i++){
					
					if((SingletonPrograms.DummieRelax.get(i).getDni()).equals(value) ) {
						 loc=i;
						 SingletonPrograms.DnisRel.remove(value);//para que no aparezca repetido en el combo
					}	
				}//end for
				SingletonPrograms.DummieRelax.remove(loc);
			
				}//end if
		}//end if
		///THERA
		if(SingletonPrograms.massage1 instanceof Therapeutic) {
			
			options=SingletonPrograms.DnisThera.toArray();
			value = JOptionPane.showInputDialog(null, "DNIs", "", JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
				if(SingletonPrograms.DummieThera.isEmpty()){
					JOptionPane.showMessageDialog(null,Languages.menuTitle("empty"),"ERROR", JOptionPane.ERROR_MESSAGE);
				}else{
					for (int i = 0; i<=(SingletonPrograms.DummieThera.size()-1); i++){
						
						if((SingletonPrograms.DummieThera.get(i).getDni()).equals(value) ) {
							 loc=i;
							 SingletonPrograms.DnisThera.remove(value);
						}	
					}//end for
					SingletonPrograms.DummieThera.remove(loc);
				}//end if
		}//end if
		////MUSCULAR
		if(SingletonPrograms.massage1 instanceof Muscular) {
			options=SingletonPrograms.DnisMus.toArray();
			value = JOptionPane.showInputDialog(null, "DNIs", "", JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
			
				if(SingletonPrograms.DummieMuscular.isEmpty()){
					JOptionPane.showMessageDialog(null,Languages.menuTitle("empty"),"ERROR", JOptionPane.ERROR_MESSAGE);
				}else{
					for (int i = 0; i<=(SingletonPrograms.DummieMuscular.size()-1); i++){
						
						if((SingletonPrograms.DummieMuscular.get(i).getDni()).equals(value) ) {
							 loc=i;
							 SingletonPrograms.DnisMus.remove(value);
						}	
					}//end for
					SingletonPrograms.DummieMuscular.remove(loc);
				}//end if
		}//end if
	}
}
