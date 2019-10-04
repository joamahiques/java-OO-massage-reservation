/**
 * 
 */
package framework.modules.settings.Dummies.DummPrograms.CrudoDummies;

import framework.modules.Programs.clases.Muscular;
import framework.modules.Programs.clases.Relax;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Programs.clases.Therapeutic;
import framework.modules.settings.Dummies.DummPrograms.FindDummies;
import framework.modules.settings.Dummies.DummPrograms.FunctionsDummies;

/**
 * @author joana
 *
 */
public class CreateDummies {

public static void createDumm() {
		
		int find = -1;
	for(int x=0;x<3;x++) {
		
		if(SingletonPrograms.opt==0) {
			Relax relax1=new Relax();
			
			find = FindDummies.findRelax(relax1);
			//System.out.println(find+" find relax1");
			
			if (find != -1) {
				//JOptionPane.showMessageDialog(null,Languages.menuTitle("errorDNI"),"ERROR", JOptionPane.ERROR_MESSAGE);
				
			} else {
				FunctionsDummies.credumm(SingletonPrograms.opt);
				
			}
		}//end if
		
		if(SingletonPrograms.opt==1) {
			Therapeutic thera1=new Therapeutic();
			
			find = FindDummies.findThera(thera1);
			//System.out.println(find+" find");
			if (find != -1) {
				//JOptionPane.showMessageDialog(null,Languages.menuTitle("errorDNI"),"ERROR", JOptionPane.ERROR_MESSAGE);
			} else {
				FunctionsDummies.credumm(SingletonPrograms.opt);
			}
		}//end if
		
		if(SingletonPrograms.opt==2) {
			
			Muscular muscular1=new Muscular();
			find = FindDummies.findMuscular(muscular1);
			
			if (find != -1) {
				//JOptionPane.showMessageDialog(null,Languages.menuTitle("errorDNI"),"ERROR", JOptionPane.ERROR_MESSAGE);
			} else {
				FunctionsDummies.credumm(SingletonPrograms.opt);
			}
		}//end if
	}}
}
