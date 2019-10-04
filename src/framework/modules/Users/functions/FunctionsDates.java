/**
 * 
 */
package framework.modules.Users.functions;


import javax.swing.JOptionPane;

import framework.SingletonApp;
import framework.classes.Dates;
import framework.functions.Functions_valida;
import framework.modules.settings.Lan.Languages;

/**
 * @author joana
 *
 */
public class FunctionsDates {
	
////////////Users
	
	////BOrn
	public static Dates dateBorn(String message, String title) {
		String bornS="";
		boolean res=false;
		int years=0;
		
		do {
			bornS=Functions_valida.validastring(message, title);//pedimos fecha
			res=Validate_data.validaDate(bornS);// validamos formato
			if(res==true) {
				SingletonApp.date1 =new Dates(bornS);//creamos nuevo
				//System.out.println(SingletonApp.date1.toString()+" validatedate2");
				res=SingletonApp.date1.validateDate();//validamos la fecha
			}
			years=SingletonApp.date1.substyears();
			if(years<16) {
				res=false;
				JOptionPane.showMessageDialog(null,Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			
		}while(res==false);
	
		return SingletonApp.date1;
	}
	
	////COntract and SingIn
	public static Dates dateContract(String message, String title) {
		String bornS="";
		boolean res=false;
		int years=0;
		
		do {
			bornS=Functions_valida.validastring(message, title);//pedimos fecha
			res=Validate_data.validaDate(bornS);// validamos formato
			if(res==true) {
				SingletonApp.date1 =new Dates(bornS);//creamos nuevo
				//System.out.println(SingletonApp.date1.toString()+" validatedate2");
				res=SingletonApp.date1.validateDate();//validamos la fecha
			}
			years=SingletonApp.date1.substyears();
			
		}while(res==false);
	
		return SingletonApp.date1;
	}


}
