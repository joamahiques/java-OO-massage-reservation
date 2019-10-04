/**
 * 
 */
package framework.modules.settings.Dummies.DummUsers;

import framework.modules.Users.clases.Admin;
import framework.modules.Users.clases.Client;
import framework.modules.Users.clases.SingletonUsers;

/**
 * @author joana
 *
 */
public class FindUsersDum {
	
	public static int findAdmin(Admin admin) { 
		admin = UsersDummie.askDNIAdmin();
		for (int i = 0; i<=(SingletonUsers.UserAdmin.size()-1); i++){
			if((SingletonUsers.UserAdmin.get(i)).equals(admin) )
				return i ;
		}
		SingletonUsers.DnisAdmin.add(SingletonUsers.DNI);//almacenamos los dnis de los programas creados para sacarlos en los combos 
		return -1;////si saca -1 es que no esta repetido
	}
	
	
	public static int findClient(Client client) { 
		client = UsersDummie.askDNIClient();
		for (int i = 0; i<=(SingletonUsers.UserClient.size()-1); i++){
			if((SingletonUsers.UserClient.get(i)).equals(client) )
				return i;
		}
		SingletonUsers.DnisClient.add(SingletonUsers.DNI);
		return -1;
	}

}
