/**
 * 
 */
package framework.modules.Users.functions.CRUD;

import framework.modules.Users.clases.Admin;
import framework.modules.Users.clases.Client;
import framework.modules.Users.clases.SingletonUsers;

/**
 * @author joana
 *
 */
public class FunctionsFindUsers {
	
	public static int findAdmin(Admin admin) { 
		//System.out.println(" res findrelax");
		for (int i = 0; i<=(SingletonUsers.UserAdmin.size()-1); i++){
			if((SingletonUsers.UserAdmin.get(i)).equals(admin) )
				//System.out.println("AQUI2");
				return i ;
		}
		return -1;////si saca -1 es que no esta repetido
	}

	
	public static int findClient(Client client) { 
		for (int i = 0; i<=(SingletonUsers.UserClient.size()-1); i++){
			if((SingletonUsers.UserClient.get(i)).equals(client) )
				return i;
		}
		return -1;
	}
	
	
}
