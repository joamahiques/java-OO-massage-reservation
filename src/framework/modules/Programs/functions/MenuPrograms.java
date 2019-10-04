package framework.modules.Programs.functions;
import framework.functions.Functions_menu;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Programs.functions.CRUD.CrudPrograms;
import framework.modules.settings.Functions.SettingsOptions;
import framework.modules.settings.Lan.Languages;

public class MenuPrograms {

	
	//public static void main(String[] args) {
		public static void Programs() {
		
		//SingletonApp.set= new Settings();
		
		do {
			///Options:
			SingletonPrograms.opt = Functions_menu.validabot(Languages.menu("menu_primary"), Languages.menuTitle("menu_primary"), Languages.menuTitleGe("programs"));
			
			switch (SingletonPrograms.opt) {

///////////////////////---EXIT		
			
			case -1:
				
				//function
				//JOptionPane.showMessageDialog(null, Languages.message("exit"));
				break;

/////////////////////---RELAX		
			case 0:
				
				//function 
				CrudPrograms.MasCrud();
				break;
				
///////////////////---THERAPEUTICS
			case 1:
				
				//function 
				CrudPrograms.MasCrud();
				break;

///////////////////---MUSCULARS			
			case 2:
				
				//function 
				CrudPrograms.MasCrud();
				break;

///////////////////---SETTINGS		
			case 3:
				
				//function 
				SettingsOptions.settingsOpt();
				break;

///////////////////---EXIT			
			case 4:
				
				//JOptionPane.showMessageDialog(null, Languages.message("exit"));
				SingletonPrograms.opt=-1;
				break;
				

			}//end switch

		} while (SingletonPrograms.opt != -1);// button X

		
	}

}
