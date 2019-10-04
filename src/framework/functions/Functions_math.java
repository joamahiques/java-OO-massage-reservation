package framework.functions;

import javax.swing.JOptionPane;

public class Functions_math {
	

		
		// SUM//
			public static float sum() {
				float result = 0.0f;
				float num1 = 0.0f, num2 = 0.0f;
		
				num1 = Functions_valida.validafloat("Intro the first number", "NUMBER");
				num2 = Functions_valida.validafloat("Intro the second number", "NUMBER");
				result = num1 + num2;
				System.out.println(result + " sum");
				return result;
			}
			
		// SUBTRACT//
			public static float subtract() {
				float result = 0.0f;
				float num1 = 0.0f, num2 = 0.0f;
		
				num1 = Functions_valida.validafloat("Intro the first number", "NUMBER");
				num2 = Functions_valida.validafloat("Intro the second number", "NUMBER");
				result = num1 - num2;
				System.out.println(result + " subt");
				return result;
			}
			
		// MULTIPLY//
			public static float product() {
				float result = 0.0f;
				float num1 = 0.0f, num2 = 0.0f;
		
				num1 = Functions_valida.validafloat0("Intro the first number", "NUMBER");
				num2 = Functions_valida.validafloat0("Intro the second number", "NUMBER");
				result = num1 * num2;
				System.out.println(result + " product");
				return result;
			}

		// DIVIDE//
			public static float divide() {
				float result = 0.0f;
				float num1 = 0.0f, num2 = 0.0f;
		
				num1 = Functions_valida.validafloat("Intro the first number", "NUMBER");
				num2 = Functions_valida.validafloat0("Intro the second number", "NUMBER");
				result = num1 / num2;
				System.out.println(result + " divide");
				return result;
			}
			
		//validafloatsCalculadora
			public static float valioperations(String op){	
				float result=0;
				switch (op) {
					case "SUM":
						result=Functions_math.sum();
						System.out.println(result + "sum");
						break;
					case "SUBTRACT":
						result=Functions_math.subtract();
						System.out.println(result + " subt");

						break;
					case "MULTIPLY":
						result=Functions_math.product();
						System.out.println(result + " multiply");
						break;
					case "DIVIDE":
						result=Functions_math.divide();
						System.out.println(result + " divide");
						break;
					case "EXIT":
						JOptionPane.showMessageDialog(null, "you have choose exit. Thank you.");
					
					}//end switch
					return result;
				}

	}


