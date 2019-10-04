package framework.functions;

import javax.swing.JOptionPane;

public class Functions_valida {

	/// VALIDAINT
		public static int validaint(String message, String title) {// intro a number
			int a = 0;
			String sval;
			boolean ok = false;
	
			do {
				try {
					sval = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
					if (sval == null) {
						JOptionPane.showMessageDialog(null, "Leaving the application", "EXIT",
								JOptionPane.INFORMATION_MESSAGE);///cancel and exit
						System.exit(0);
					} else {
						a = Integer.parseInt(sval);
						ok = true;
						//
						System.out.println(a + " number");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "You haven't entered a valid number", "Error",
							JOptionPane.ERROR_MESSAGE);
					ok = false;
				}
			} while (ok == false);
			
			return (a);

		}
	
	//// VALIDAINT 0
		public static int validaint0(String message, String title) {
			int a = 0;
			String sval;
			boolean ok = false;
	
			do {
				try {
					sval = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
					if (sval == null) {
						JOptionPane.showMessageDialog(null, "Leaving the application", "EXIT",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);///cancel and exit
					} else {
						a = Integer.parseInt(sval);
					} // end if
					if (a == 0) {
						JOptionPane.showMessageDialog(null, "We can't operate with 0. Try again");
					} else {
						ok = true;
						///
						System.out.println(a + " number");
					} // end if
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "You haven't entered a valid number", "Error",
							JOptionPane.ERROR_MESSAGE);
					ok = false;
				}
	
			} while (ok == false || a == 0);
			return (a);
	
		}
	
	// VALIDAFLOAT
		public static float validafloat(String message, String title) {
			float a = 0.0f;
			String sval;
			boolean ok = false;
	
			do {
				try {
					sval = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
					if (sval == null) {
						JOptionPane.showMessageDialog(null, "Leaving the application", "EXIT",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					} else {
						a = Float.parseFloat(sval);
						ok = true;
						///
						System.out.println(a + " float");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "You haven't entered a valid number", "Error",
							JOptionPane.ERROR_MESSAGE);
					ok = false;
				}
			} while (ok == false);
			return (a);
		}
	
	// VALIDAFLOAT0
		public static float validafloat0(String message, String title) {
			float a = 0.0f;
			String sval;
			boolean ok = false;
	
			do {
				try {
					sval = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
					if (sval == null) {
						JOptionPane.showMessageDialog(null, "Leaving the application", "EXIT",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					} else {
						a = Float.parseFloat(sval);
					}
					if (a == 0) {
						JOptionPane.showMessageDialog(null, "We can't operate with 0. Try again");
					} else {
						ok = true;
						System.out.println(a + " float");
					} // end if
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "You haven't entered a valid number", "Error",
							JOptionPane.ERROR_MESSAGE);
					ok = false;
				}
			} while (ok == false);
			return (a);
		}
	
	// VALIDACHAR
		public static char validachar(String message, String title) {
			char c = 0;
			String sval;
			boolean ok = false;
	
			do {
				try {
					sval = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
					if (sval == null) {
						JOptionPane.showMessageDialog(null, "Leaving the application", "EXIT",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					} else {
						c = sval.charAt(0);
						ok = true;
						///
						System.out.println(c + " char");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "You haven't entered a valid data", "Error",
							JOptionPane.ERROR_MESSAGE);
					ok = false;
				}
			} while (ok == false);
			return c;
		}
	
	// VALIDASTRING
		public static String validastring(String message, String title) {
			String cad = "";
			boolean ok = false;
	
			do {
				try {
					cad = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
					ok = true;
					///
					System.out.println(cad + " String");
					if (cad == null) {
						JOptionPane.showMessageDialog(null, "Leaving the application", "EXIT",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
	
					}
					if (cad.equals("")) {
						JOptionPane.showMessageDialog(null, "Data entry error", "Error", JOptionPane.ERROR_MESSAGE);
						ok = false;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "You haven't entered a valid data", "Error",
							JOptionPane.ERROR_MESSAGE);
					ok = false;
				}
			} while (ok == false);
			return cad;
		}
	
	// VALIDAPOS//
		public static int validapos(String message, String title, int contdig) {///o array.length
	
			int pos = 0;
			String sval;
			boolean ok = false;
	
			do {
				
				do {
					try {
						sval = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
	
						if (sval == null) {
							JOptionPane.showMessageDialog(null, "Leaving the application", "EXIT",
									JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);//cancel 
						} else {
							pos = Integer.parseInt(sval);
							ok = true;
							//
							System.out.println(pos + " position");
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "You haven't entered a valid data", "Error",
								JOptionPane.ERROR_MESSAGE);
						ok = false;
					}
	
				} while (ok == false);
	
				if ((pos < 1) || (pos > contdig)) {
					JOptionPane.showMessageDialog(null, "You haven't entered a valid position");
	
				}
	
			} while ((pos < 1) || (pos > contdig));
			
			return pos;
		}
	
	
}
