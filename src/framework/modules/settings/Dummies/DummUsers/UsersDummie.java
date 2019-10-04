/**
 * 
 */
package framework.modules.settings.Dummies.DummUsers;

import framework.SingletonApp;
import framework.classes.Dates;
import framework.modules.Users.clases.Admin;
import framework.modules.Users.clases.Client;
import framework.modules.Users.clases.SingletonUsers;

/**
 * @author joana
 *
 */
public class UsersDummie {
	
	public static Admin askDNIAdmin () {

		SingletonUsers.DNI="48600973H";
		
		return new Admin(SingletonUsers.DNI);
	}
	
	public static Client askDNIClient () {
		
		SingletonUsers.DNI="48600973P";
		
		return new Client (SingletonUsers.DNI);
	}
	
public static void createUser() {
		

		String tf="",user="",password="",name="",dni="",email="";
		String tfA="",userA="",passwordA="",nameA="",dniA="",emailA="";
		String born="", bornA="";
		String contract;
		String signin;	
		if(SingletonUsers.opt==0) {	
			//Admin
				userA="JoaMahiques";
				passwordA="Morotunos1";
				nameA="Joana";
				dniA=SingletonUsers.DNI;;
				tfA="658895412";
				emailA="joamahiques@gmail.com";
				bornA="22/02/1985";
				SingletonApp.date1 =new Dates(bornA);
				contract="12/12/2000";
				Dates Dcontract =new Dates(contract);
				
				SingletonUsers.user=new Admin(dniA, userA, passwordA, nameA, emailA, tfA, SingletonApp.date1, Dcontract );
				SingletonUsers.UserAdmin.add((Admin) SingletonUsers.user);
				
				for(int x=0;x<SingletonUsers.UserAdmin.size();x++) {
					  System.out.println(SingletonUsers.UserAdmin.get(x));
					}
		}
			//Client
		if(SingletonUsers.opt==1) {		
				user="Pepi";
				password="LesCides2";
				name="Pepica";
				dni=SingletonUsers.DNI;
				tf="658895412";
				email="pepilapepi@gmail.com";
				born="22/02/1985";
				SingletonApp.date1 =new Dates(born);	
				signin="12/12/2000";
				Dates Dsignin=new Dates(signin);
				
				SingletonUsers.user=new Client(dni, user, password, name, email, tf, SingletonApp.date1, Dsignin);
				//System.out.println(SingletonUsers.user.getDNI().toString()+" forDNI");
				SingletonUsers.UserClient.add((Client) SingletonUsers.user);
				
				for(int x=0;x<SingletonUsers.UserClient.size();x++) {
					  System.out.println(SingletonUsers.UserClient.get(x)+" for");
					}
		}
		
	}
}
