/**
 * 
 */
package framework.modules.Users.clases;

import java.util.ArrayList;
/**
 * @author joana
 *
 */
public class SingletonUsers {
	
	public static ArrayList <Client> UserClient;
	public static ArrayList <Admin> UserAdmin;
	
	public static UsersClass ClientRegistered=null;
	public static UsersClass AdminRegistered=null;
	public static int location=0;
	//public static ArrayList <Client> DummieClient;
	//public static ArrayList <Admin> DummieAdmin;
	public static ArrayList <String> DnisClient;
	public static ArrayList <String> DnisAdmin;
	
	public static UsersClass  user=null;
	public static int opt=0;
	public static int rep=0;
	public static String DNI="";
	public static String SUser="";
	public static String Spass="";
}
