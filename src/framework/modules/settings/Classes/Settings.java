/**
 * 
 */
package framework.modules.settings.Classes;

import java.util.ArrayList;

import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Users.clases.SingletonUsers;

//import framework.functions.Languages.Languages;

/**
 * @author joana
 *
 */
public class Settings {
	
	private String language;
	private int decimal;
	private char currency;
	private String date;
	
	//constructor
	public Settings (String language, String date, char currency, int decimal) {
		this.language = language;
		this.date = date;
		this.currency = currency;
		this.decimal = decimal;
		
	}
	
	public Settings () {
		this.language = "en";
		this.date = "dd/mm/yyyy";
		this.currency = '€';
		this.decimal = 2;
		

		///Programs
		SingletonPrograms.programRelax = new ArrayList <> ();
		SingletonPrograms.programThera = new ArrayList <> ();
		SingletonPrograms.programMuscular  = new ArrayList <> ();
		
		SingletonPrograms.DummieRelax = new ArrayList<>();
		SingletonPrograms.DummieThera = new ArrayList<>();
		SingletonPrograms.DummieMuscular = new ArrayList<>();
		
		SingletonPrograms.DnisRel = new ArrayList<>();
		SingletonPrograms.DnisThera = new ArrayList<>();
		SingletonPrograms.DnisMus = new ArrayList<>();
		
		///Users
		
		SingletonUsers.UserClient= new ArrayList<> (); 
		SingletonUsers.UserAdmin= new ArrayList<> (); 
		//SingletonUsers.DummieAdmin= new ArrayList<> (); 
		//SingletonUsers.DummieClient= new ArrayList<> (); 
		
		SingletonUsers.DnisAdmin= new ArrayList<> (); 
		SingletonUsers.DnisClient= new ArrayList<> (); 
		
	}

	//setters and getters
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getDecimal() {
		return decimal;
	}

	public void setDecimal(int decimal) {
		this.decimal = decimal;
	}

	public char getCurrency() {
		return currency;
	}

	public void setCurrency(char currency) {
		this.currency = currency;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	///to string
	@Override
	public String toString () {
		String cad = "";
		cad = cad+getLanguage()+"\n";
		cad = cad+getDate()+"\n";
		cad = cad+getCurrency()+"\n";
		cad = cad+getDecimal()+"\n";
		return cad;
	}
}
