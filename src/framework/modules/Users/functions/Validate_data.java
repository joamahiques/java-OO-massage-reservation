package framework.modules.Users.functions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import framework.SingletonApp;

public class Validate_data {
		
	private static final String tempName="^[a-zA-Z\\s]*$";
	private static final String tempPassword="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";//8 caracteres minimo, al menos un dígito, al menos una minúscula y al menos una mayúscula.NO puede tener otros símbolos.
	//private static final String plantilla_CP="^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$";
	private static final String tempTf="^[0-9]{2,3}-? ?[0-9]{6,7}$";
	private static final String tempdni="([0-9]{8})([A-Z])";
	private static final String tempemail=("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	//private static final String plantilla_edad="^[0-9]{1,2}$";
	private static final String temphour="^([01]?[0-9]|2[0-3]):[0-5][0-9]$";
	private static final String tempdate1 = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)\\d{2}$";
	private static final String tempdate2 = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-(19|20)\\d{2}$";
	private static final String tempdate3 = "^(19|20)\\d{2}/(0[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])$";
	private static final String tempdate4 = "^(19|20)\\d{2}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
	//name
	public static boolean validaName(String name){
        Pattern pattern=Pattern.compile(tempName);
        Matcher matcher = pattern.matcher(name);
		if(matcher.matches()){
			return true;
		} 
	    return false; 
	  }
	
	//tf
	public static boolean validaTf(String tf) {
        Pattern pattern=Pattern.compile(tempTf);
        Matcher matcher = pattern.matcher(tf);
		if(matcher.matches()){
			return true;
		} 
	    return false; 
	  }

	// DNI
	public static boolean validaDNI(String dni){
		Pattern pattern=Pattern.compile(tempdni);
		Matcher matcher=pattern.matcher(dni);
		if(matcher.matches()){
			return true;
		} 
		 return false; 
	 }
	
	// date
	public static boolean validaDate(String date) {
		String s="";
		 
		switch (SingletonApp.set.getDate()) {
			case "dd/mm/yyyy":
				s = tempdate1;
				break;
			case "dd-mm-yyyy":
				s = tempdate2;
				break;
			case "yyyy/mm/dd":
				s = tempdate3;
				break;
			case "yyyy-mm-dd":
				s = tempdate4;
				break;
		}	
		return date.matches(s);
	}
	
	
	//hour
	public static boolean validahour(String hour){
		Pattern pattern=Pattern.compile(temphour);
		Matcher matcher=pattern.matcher(hour);
		if(matcher.matches()){
			return true;
		  } 
	    return false; 
	  }
	
	//email
	public static boolean validaEmail(String email){
		Pattern pattern=Pattern.compile(tempemail);
		Matcher matcher=pattern.matcher(email);
		if(matcher.matches()){
			return true;
		  } 
	    return false; 
	  }
	
	//password
		public static boolean validaPassW(String password){
			Pattern pattern=Pattern.compile(tempPassword);
			Matcher matcher=pattern.matcher(password);
			if(matcher.matches()){
				return true;
			  } 
		    return false; 
		  }
}
