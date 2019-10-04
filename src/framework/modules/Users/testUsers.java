/**
 * 
 */
package framework.modules.Users;

import framework.SingletonApp;
import framework.modules.Users.clases.SingletonUsers;
import framework.modules.Users.functions.CRUD.UpdateUsers;
import framework.modules.settings.Classes.Settings;
import framework.modules.settings.Dummies.DummUsers.CreateUsersDum;
import framework.modules.settings.Functions.SettingsOptions;

/**
 * @author joana
 *
 */
public class testUsers {
		
	public static void main(String[] args) {
		SingletonApp.set= new Settings();
		
		String fechanac="";
		int age=0;
	
		
////////// AGE
//		int rest, year1,year2;
//		Dates date1=new Dates();
//		Dates datebirt= new Dates("22/02/1985");
//		System.out.println(datebirt+" datebirt");
//		 rest=datebirt.substyears();
//
//		System.out.println(rest+" age");
		
////////////CREATE
		
//		FunctionsCrudUsers.askDNIAdmin();
//		FunctionsCrudUsers.createUser();
//		FunctionsCrudUsers.updateUsers();
		SettingsOptions.settingsOpt();
		
		if(SingletonUsers.UserAdmin.isEmpty()) {
			SingletonUsers.opt=0;
			CreateUsersDum.createDumm();
			SingletonUsers.opt=1;
			CreateUsersDum.createDumm();//Estos dummies se guardan en el array de users principal, no hay uno especifico para dummies, así lo podemos update etc como si lo hubieramos creado de forma manual.
		}
		SingletonUsers.opt=0;
		System.out.println(SingletonUsers.opt+" opt");
		//ReadUsers.readUsers();
		UpdateUsers.updateUsers();
		SingletonUsers.opt=1;
		UpdateUsers.updateUsers();
	}
		
}
	