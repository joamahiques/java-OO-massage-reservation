package framework.modules.Users.functions;
import framework.functions.Functions_valida;
import framework.modules.settings.Lan.Languages;

public class Functions_data {
	

	///name:
		public static String Name(){
			String name="";
			boolean res=false;
			
			do {
				 name=Functions_valida.validastring(Languages.menuTitle("name"), Languages.menuTitle("USER"));
				 res=Validate_data.validaName(name);
			
			}while(res==false);
			return name;
			
		  }
		///User
		public static String User(){
			String name="";
			boolean res=false;
			
			do {
				 name=Functions_valida.validastring(Languages.menuTitle("user"), Languages.menuTitle("USER"));
				 res=Validate_data.validaName(name);
			
			}while(res==false);
			return name;
			
		  }
	
	///tf:
		public static String Tf(){
		String tf="";
		boolean res=false;
		
		do {
			 tf=Functions_valida.validastring(Languages.menuTitle("tf"),  Languages.menuTitle("USER"));
			 res=Validate_data.validaTf(tf);
		
		}while(res==false);
		return tf;
		
	  }
	
	///DNI:
		public static String dni(){
			String dni="";
			boolean res=false;
			
			do {
				 dni=Functions_valida.validastring(Languages.menuTitle("dni"),  Languages.menuTitle("USER"));
				 res=Validate_data.validaDNI(dni);
			
			}while(res==false);
			return dni;
			
		  }
	
	///Email:
			public static String email(){
				String email="";
				boolean res=false;
				
				do {
					 email=Functions_valida.validastring(Languages.menuTitle("email"),  Languages.menuTitle("USER"));
					 res=Validate_data.validaEmail(email);
				
				}while(res==false);
				return email;
				
			}
	
	///Date	
		public static String askdate() {
			String date="";
			boolean res=false;
			do {
				date=Functions_valida.validastring("", "");
				res=Validate_data.validaDate(date);
			}while(res==false);
			return date;
		}
		
	///Password
		public static String password() {
			String passw="";
			boolean res=false;
			do {
				passw=Functions_valida.validastring(Languages.menuTitle("pass"),  Languages.menuTitle("USER"));
				res=Validate_data.validaPassW(passw);
			}while(res==false);
			return passw;
		}
	
		
	
		
}
