/**
 * 
 */
package framework.modules.settings.Lan.LangMod;

/**
 * @author joana
 *
 */
public class SpanishMod {

	public static String [] menu (String valor) {
		String [] menu = {};
		String[] MaTh= {"Twina","Anticelulitico","Detox"};
		String[] MaRe= {"Balinés","Piedras Volcanicas","Aromaterapia"};
		String[] MaMu= {"Gancho Descontracturante","Acupuntura","Descontracturante Manual"};
		String[] tipoA= {"Música Relajante","Cromoterapia","Velas","Musica y Velas","Todo"};
		String[] tipoT= {"Vendas Frías","Acupuntura","Manual"};
		String[] tipoZ= {"Cuerpo Entero","Piernas","Espalda","Cuello","Brazos"};
		String [] tipoAC= {"Sauna","Yoga","Meditación","Gimnasio"};

		String [] menuRelax = {"Masaje","Nombre del Cliente","DNI del cliente","Teléfono","Fecha entrada","Fecha Salida","Duración del masaje","Actividad","Fecha de la actividad","Ambiente","Salir"};
		String [] menuThera = {"Masaje","Nombre del Cliente","DNI del cliente","Teléfono","Fecha entrada","Fecha Salida","Duración del masaje","Actividad","Fecha de la actividad","Terapia","Salir"};
		String [] menuMusc = {"Masaje","Nombre del Cliente","DNI del cliente","Teléfono","Fecha entrada","Fecha Salida","Duración del masaje","Actividad","Fecha de la actividad","Zona del masaje","Salir"};
		String [] order={ "A) DNI", "B) Nombre", "C) Fecha de entrada", "D) Fecha de Salida", "E) Num de dias", "F) Precio", "G) Actividad", "H) Fecha de la Actividad", "I) Precio Total" };

		String [] menuAdmin = {"Nombre","Usuario","Contraseña","DNI","Fecha de nacimiento","Email","Tf","Fecha de contratación","SALIR"};
		String [] menuClient = {"Nombre","Usuario","Contraseña","DNI","Fecha de nacimiento","Email","Tf","Fecha de Registro","SALIR"};
		String [] orderUsers ={ "A) DNI", "B) Nombre", "C) Edad", "D) Antigüedad", "E) Usuario" };

		String [] menulogin= {"Invitado","Registro","Entrar","Settings","SALIR"};
		String [] login= {"Administrador","Cliente"};
		String [] invited= {"Leer","Ordenar"};
		String [] admin= {"Programas","Usuarios","Perfil","Settings","Cerrar sesión"};
		String [] client= {"Programas","Perfil","Settings","Cerrar sesión"};
		String [] proclient= {"Leer", "Actualizar","Ordenar"};
		String [] profile= {"Leer Perfil", "Actualizar Perfil"};
		
			switch (valor) {
			case "massageRel":
				menu=MaRe;
				break;
			case "massageTher":
				menu=MaTh;
				break;
			case "massageMus":
				menu=MaMu;
				break;
			case "ambient":
				menu=tipoA;
				break;
			case "thera":
				menu=tipoT;
				break;
			case "zone":
				menu=tipoZ;
				break;
			case "activity":
				menu=tipoAC;
				break;
			
			case "setRelax":
				menu = menuRelax;
				break;
			
			case "setThera":
				menu = menuThera;
				break;
			
			case "setMuscular":
				menu = menuMusc;
				break;
			case "order":
				menu=order;
				break;
			////////////////	
			case "setAdmin":
				menu = menuAdmin;
				break;
			case "setClient":
				menu = menuClient;
				break;
			case "orderUsers":
				menu=orderUsers;
				break;
			///////////////	
			case "menulogin":
				menu=menulogin;
				break;
			case "login":
				menu=login;
				break;
			case "invited":
				menu=invited;
				break;
			case "admin":
				menu=admin;
				break;
			case "profile":
				menu=profile;
				break;
			case "client":
				menu=client;
				break;
			case "proclient":
				menu=proclient;
				break;
		}
		
		return menu;
	}
	
	public static String menuTitle (String opt) {
		String  menu = null;
		String  massage = "Escoge un Masaje";
		String  name = "Introduce el nombre" ;
		String  tf ="Introduce el teléfono" ;
		String  dni = "Intoduce el DNI XXXXXXXX-X" ;
		String dateStart=  "Fecha de Entrada" ;
		String dateEnd=  "Fecha de Salida" ;
		String activity=  "Quieres una actividad?" ;
		String dateActivity= "Fecha de la Actividad" ;
		String dateEndActivity=  "Fecha final de la Actividad" ;
		String  duration = "Escoge una Duración";
		String  hour = "Escoge una hora";
		String  ambient = "Escoge un Ambiente";
		String  therapy = "Escoge una Terapia";
		String  zone = "Escoge una Zona";
		String order = "¿Qué orden prefieres??";
		//USER
		String  born = "Cual es tu fecha de nacimiento?";
		String USER = "USUARIO";
		String user= "Introduce tu fecha de nacimiento";
		String surname = "Introduce tu apellido";
		String pass = "Introduce tu contraseña \nMínimo 8 carácteres, 1 mayúscula, 1 minúscula y 1 número";
		String email = "Introduce tu email";
		String contract = "Fecha de contratación";// fecha de contratacion
		String sign = "Fecha de registro";
		
		String login="Que Ususario eres?";
		String option = "Escoge una opción";
		String orderpro="Qué Programas quieres ordenar?";
		switch (opt) {
			
			case "massage":
				menu = massage;
				break;
				
			case "name":
				menu = name;
				break;
	
			case "tf":
				menu = tf;
				break;
	
			case "dni":
				menu = dni;
				break;
			case "dateStart":
				menu = dateStart;
				break;
			case "dateEnd":
				menu = dateEnd;
				break;
			case "activity":
				menu = activity;
				break;
			case "dateActivity":
				menu = dateActivity;
				break;
			case "dateEndActivity":
				menu = dateEndActivity;
				break;
			case "duration":
				menu = duration;
				break;
				
			case "hour":
				menu = hour;
				break;
	
			case "ambient":
				menu = ambient;
				break;
			case "therapy":
				menu = therapy;
				break;
			case "zone":
				menu =zone;
				break;
			case "order":
				menu =order;
				break;
		////////////		
				
			case "born":
				menu = born;
				break;
				
			case "USER":
				menu = USER;
				break;
			case "user":
				menu = user;
				break;
	
			case "surname":
				menu = surname;
				break;
			case "pass":
				menu = pass;
				break;
			case "email":
				menu = email;
				break;
			case "contract":
				menu = contract;
				break;
			case "sign":
				menu = sign;
				break;
			
			case "option":
				menu =option;
				break;
	////////////////		
			case "login":
				menu=login;
				break;
			case "orderpro":
				menu=orderpro;
				break;
				
			default:
				menu = null;
				break;
		}
		
		return menu;
	}
	public static String  message (String tra) {
		String message="";
		String error="Error";
		String errorDNI="Error, este DNI ya existe";
		String delete="Borrado";
		String empty="Está Vacio";
		switch (tra) {
		
			case "error":
				message =error;
				break;
			case "errorDNI":
				message =errorDNI;
				break;
			case "delete":
				message =delete;
				break;
			case "empty":
				message=empty;
				break;
			case "activitynull":
				message="Primero Escoge una actividad";
				break;
				///
			case "relax":
				message="RELAJANTE";
				break;
			case "thera":
				message="TERAPEUTICO";
				break;
			case "muscular":
				message="MUSCULAR";
				break;
			case "name":
				message="Nombre: ";
				break;
			case "tf":
				message="Teléfono: ";
				break;
			case "date":
				message="Fecha de Entrada: ";
				break;
			case "exitDate":
				message="Fecha de Salida: ";
				break;
			case "days":
				message="Num de Dias: ";
				break;
			case "massage":
				message="Masaje: ";
				break;
			case "hour":
				message="Hora: ";
				break;
			case "duration":
				message="Duración: ";
				break;
			case "price":
				message="Precio del Programa: ";
				break;
			case "activity":
				message="Actividad: ";
				break;
			case "dateAct":
				message="Fecha de la Actividad: ";
				break;
			case "dateEndAct":
				message="Fecha de Fin de la Actividad: ";
				break;
			case "daysAct":
				message="Num de dias de la Actividad: ";
				break;
			case "priceAct":
				message="Precio de la Actividad: ";
				break;
			case "totalPrice":
				message="Precio Total: ";
				break;
			case "ambient":
				message="Ambiente: ";
				break;
			case "therapy":
				message="Terapia: ";
				break;
			case "zone":
				message="Zona del Masaje: ";
				break;
			//////////	
			case "admin":
				message="ADMINISTRADOR";
				break;
			case "client":
				message="CLIENTE";
				break;
			case "user":
				message="Usuario: ";
				break;
			case "pass":
				message="Contraseña: ";
				break;
			case "email":
				message="Email: ";
				break;
			case "birthday":
				message="Fecha de nacimiento: ";
				break;
			case "age":
				message="Edad: ";
				break;
			case "singin":
				message="Fecha de registro: ";
				break;
			case "contract":
				message="Fecha de contratación: ";
				break;
			case "antique":
				message="Antigüedad: ";
				break;
		}
		
		return message;
	}
}
