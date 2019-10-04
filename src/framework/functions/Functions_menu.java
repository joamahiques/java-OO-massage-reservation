package framework.functions;
import javax.swing.JOptionPane;

import framework.modules.Programs.clases.SingletonPrograms;

public class Functions_menu {

	// OPCIONES DE MENÚ

		/// COMBOBOX//
			public static String combobox(String[] tipo,String message, String title) {
				String cad = "";
				
				Object select = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE,null, tipo,
						0);
				if(select==null){
					cad="";
				}else{
					cad=select.toString();
				}
				return cad;
				
				
				
//				try {
//					cad = select.toString();
//				} catch (Exception e) {
//					cad="EXIT";// "EXIT" and "X"
//					
//				}
//				return cad;
			}

		/// BUTTONS MAIN MENU///
			public static int validabot(String[] tipo, String message, String title) {

				int op = 0;
				op = JOptionPane.showOptionDialog(null, message, title, 0, JOptionPane.QUESTION_MESSAGE, null, tipo, tipo[0]);
				return op;
				
			}
		
		/// CONTINUE//

			public static int continu(String message, String title) {

				int confirm = JOptionPane.showConfirmDialog(null, message);
		
				if (JOptionPane.OK_OPTION == confirm) {
					//JOptionPane.showMessageDialog(null, "Continuamos", "CONTINUE", JOptionPane.INFORMATION_MESSAGE);
				}else if (JOptionPane.CANCEL_OPTION == confirm) {
					//JOptionPane.showMessageDialog(null, "Cancel", "CANCEL", JOptionPane.INFORMATION_MESSAGE);
				}else if (JOptionPane.NO_OPTION == confirm) {
					//JOptionPane.showMessageDialog(null, "No continuamos", "CONTINUE", JOptionPane.INFORMATION_MESSAGE);
				}else {
					//JOptionPane.showMessageDialog(null, "Exit", "EXIT", JOptionPane.INFORMATION_MESSAGE);
				}
				return confirm;
			}
	
		///REPEAT//
			
			public static int repeat(String[] tipo,String message, String title) {
				
				int rep=0;
				
				rep = JOptionPane.showOptionDialog(null, message, title, 0,
					JOptionPane.QUESTION_MESSAGE, null, tipo, tipo[0]);	
				
				
				switch(rep) {
				
					case -1:
						JOptionPane.showMessageDialog(null, "You have chosen to leave.\n Thank you");
						SingletonPrograms.opt = -1;
						break;
					case 0:
						//JOptionPane.showMessageDialog(null, "Repeat");
						break;
					case 1:
						//JOptionPane.showMessageDialog(null, "Go to the main menu");
						break;
					case 2:
						
						//JOptionPane.showMessageDialog(null, "You have chosen to leave.\n Thank you");
						SingletonPrograms.opt = -1;
						break;
				}//end switch
				
				return rep;
				
			}
			
	/// BOOLEAN//

			public static Boolean yon(String message, String title) {//// yes=true, not=false

				int confirm = JOptionPane.showConfirmDialog(null, message);
				Boolean yesornot=false;
		
				if (JOptionPane.OK_OPTION == confirm) {
					yesornot=true;
				}else if (JOptionPane.CANCEL_OPTION == confirm) {
					JOptionPane.showMessageDialog(null, "Cancel", "CANCEL", JOptionPane.INFORMATION_MESSAGE);
				}else if (JOptionPane.NO_OPTION == confirm) {
					yesornot=false;
				}else {
					JOptionPane.showMessageDialog(null, "Exit", "EXIT", JOptionPane.INFORMATION_MESSAGE);
				}
				return yesornot;
			}
			
			

}
