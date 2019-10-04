package framework.modules.Programs.functions.CRUD;
import javax.swing.JOptionPane;

import framework.functions.Functions_menu;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.settings.Lan.Languages;
public class CrudPrograms {


	public static int MasCrud() {
				
				int opt=0;
				
		do {
				opt = Functions_menu.validabot(Languages.menu("menu_crud"),Languages.menuTitle("menu_crud"),Languages.menuTitleGe("programs"));	
				
				
				switch(opt) {
				
					case -1:
							JOptionPane.showMessageDialog(null, Languages.message("exit"));
					
						break;
					//create
					case 0:
							
							CreateProgram.createPro();
						
						break;
					
					//read
					case 1:
						
							ReadPrograms.readPro();
						
						break;
					
					//update
					case 2:
						
							UpdateProgram.updatePro();
						
						break;
					
					//delete
					case 3:
						
							DeleteProgram.DeletePro();
						
						break;
					//Order
					case 4:
						
							OrderPrograms.OrderPro();
						
						break;
					//exit
					case 5:
						
						JOptionPane.showMessageDialog(null, Languages.message("exit"));
						
						break;
				}//end switch
				//repeat?
				SingletonPrograms.rep=Functions_menu.repeat(Languages.menu("repeat"),Languages.menuTitle("repeat"), Languages.menuTitleGe("options"));
			} while (SingletonPrograms.rep==0);
			if (SingletonPrograms.rep==2||SingletonPrograms.rep==-1) {
				SingletonPrograms.opt = -1;
			}//end if
				
			return opt;
		
}
}
