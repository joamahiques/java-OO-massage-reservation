package framework.modules.Users.functions.CRUD;

import javax.swing.JOptionPane;

import framework.classes.Dates;
import framework.functions.Functions_menu;
import framework.modules.Users.clases.Admin;
import framework.modules.Users.clases.Client;
import framework.modules.Users.clases.SingletonUsers;
import framework.modules.Users.functions.FunctionsDates;
import framework.modules.Users.functions.Functions_data;
import framework.modules.settings.Lan.Languages;

public class FunctionsCrudUsers {
	


/////////////ASK DNIs
	
	public static Admin askDNIAdmin () {

		SingletonUsers.DNI=Functions_data.dni();
		//System.out.println(SingletonPrograms.DNI+ "askDNI relax");
		
		return new Admin (SingletonUsers.DNI);
	}
	
	public static Client askDNIClient () {
		
		SingletonUsers.DNI=Functions_data.dni();
		
		return new Client (SingletonUsers.DNI);
	}
/////////////ASK Users
	
	public static Admin askUserAdmin () {
	
		SingletonUsers.SUser=Functions_data.User();
		//System.out.println(SingletonPrograms.DNI+ "askDNI relax");
		
	return new Admin (SingletonUsers.SUser);
	}
	
	public static Client askUserClient () {
	
		SingletonUsers.SUser=Functions_data.User();
	
	return new Client (SingletonUsers.SUser);
	}
	
	
//////////////CREATE	
	
	public static void createUser() {
		

		String tf="",user="",password="",name="",dni="",email="";
		Dates born;
		Dates contract;
		Dates singin;
		
		
				
				user=Functions_data.User();
				password=Functions_data.password();
				name=Functions_data.Name();
				dni=SingletonUsers.DNI;
				//System.out.println(SingletonUsers.DNI+" for");
				tf=Functions_data.Tf();
				email=Functions_data.email();
				born=FunctionsDates.dateBorn(Languages.menuTitle("born"), Languages.menuTitleGe("users"));//No puede ser menor de 16
					
				
				
			
			//Admin
			if(SingletonUsers.opt==0) {	
				contract=FunctionsDates.dateContract(Languages.menuTitle("contract"),   Languages.menuTitleGe("users"));//
				SingletonUsers.user=new Admin(dni, user, password, name, email, tf, born, contract);
				SingletonUsers.UserAdmin.add((Admin) SingletonUsers.user);
				for(int x=0;x<SingletonUsers.UserAdmin.size();x++) {
					  System.out.println(SingletonUsers.UserAdmin.get(x));
					}
			}
			//Client
			if(SingletonUsers.opt==1) {	
				singin=FunctionsDates.dateContract(Languages.menuTitle("sign"),  Languages.menuTitleGe("users"));
				SingletonUsers.user=new Client(dni, user, password, name, email, tf, born, singin);
				//System.out.println(SingletonUsers.user.getDNI().toString()+" forDNI");
				SingletonUsers.UserClient.add((Client) SingletonUsers.user);
				for(int x=0;x<SingletonUsers.UserClient.size();x++) {
					  System.out.println(SingletonUsers.UserClient.get(x));
					}
			}
		
			
	
	}

	
///////////////UPDATE
	
	////Update DNI:relax
	public static void updateDniAdmin (Admin a1){
		int location = -1;
		a1 = askDNIAdmin();
		location = FunctionsFindUsers.findAdmin(a1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
		}else {
			SingletonUsers.user.setDNI(SingletonUsers.DNI);
		}
	}
	////Update DNI:Thera
	public static void updateDniClient (Client c1){
		int location = -1;
		c1 = askDNIClient();
		location = FunctionsFindUsers.findClient(c1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, Languages.message("error"), "ERROR", JOptionPane.ERROR_MESSAGE);
		}else {
			SingletonUsers.user.setDNI(SingletonUsers.DNI);
		}
	}

	///General Update
	public static void updateUsers() {
		
		String opt2="";
		int index=0;
	
		/////////ADMIN
		if(SingletonUsers.user instanceof Admin) {
			
			
			opt2=Functions_menu.combobox(Languages.menu("setAdmin"), Languages.menuTitle("option"), Languages.menuTitleGe("admin"));
			//sacamos el index del array para que nos valga para todos los idiomas. Con el String no nos servia
			for(int i = 0; i < Languages.menu("setAdmin").length; i++) {
				  if(Languages.menu("setAdmin")[i].equals(opt2)) {
				    index = i;
				    
				  }
				}
			
			switch(index){
				
					case 0:
						((Admin)SingletonUsers.user).setName(Functions_data.Name());
						break;
					case 1:
						((Admin)SingletonUsers.user).setUser(Functions_data.Name());
						break;
					case 2:
						((Admin)SingletonUsers.user).setPassword(Functions_data.password());
						break;
					case 3:
						updateDniAdmin((Admin)SingletonUsers.user);
						break;
					case 4:
						((Admin)SingletonUsers.user).setDatebirthday(FunctionsDates.dateBorn(Languages.menuTitle("born"), Languages.menuTitle("USER")));
						break;
					case 5:
						((Admin)SingletonUsers.user).setEmail(Functions_data.email());
						break;
					case 6:
						((Admin)SingletonUsers.user).setPhone(Functions_data.Tf());
						break;
					case 7:
						((Admin)SingletonUsers.user).setDateContract(FunctionsDates.dateContract(Languages.menuTitle("contract"), Languages.menuTitle("USER")));
						break;
					case 8:
						
						break;
			}//end switch
		}
		if(SingletonUsers.user instanceof Client) {
			
			
			opt2=Functions_menu.combobox(Languages.menu("setClient"), Languages.menuTitle("option"), Languages.menuTitleGe("client"));
			//sacamos el index del array para que nos valga para todos los idiomas. Con el String no nos servia
			for(int i = 0; i < Languages.menu("setClient").length; i++) {
				  if(Languages.menu("setClient")[i].equals(opt2)) {
				    index = i;
				    
				  }
				}
			
			switch(index){
				
					case 0:
						((Client)SingletonUsers.user).setName(Functions_data.Name());
						break;
					case 1:
						((Client)SingletonUsers.user).setUser(Functions_data.Name());
						break;
					case 2:
						((Client)SingletonUsers.user).setPassword(Functions_data.password());
						break;
					case 3:
						updateDniClient((Client)SingletonUsers.user);
						break;
					case 4:
						((Client)SingletonUsers.user).setDatebirthday(FunctionsDates.dateBorn(Languages.menuTitle("born"), Languages.menuTitle("USER")));
						break;
					case 5:
						((Client)SingletonUsers.user).setEmail(Functions_data.email());
						break;
					case 6:
						((Client)SingletonUsers.user).setPhone(Functions_data.Tf());
						break;
					case 7:
						((Client)SingletonUsers.user).setDateSingin(FunctionsDates.dateContract(Languages.menuTitle("sign"), Languages.menuTitle("USER")));
						break;
					case 8:
						
						break;
			}//end switch
		}
		
	}

}
