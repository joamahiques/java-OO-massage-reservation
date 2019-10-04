package framework.functions;
import java.util.ArrayList;
import java.util.Iterator;



public class FunctionsOther {
	
////////////----DIGITS----
	
	    /////---out digits--  int[] digits=new int[cont];
		public static int[] digitsOfNum(int num) {
		
		int aux=num;
		int rest=0, cont=0;

		while(aux>0){//contamos los dígitos para saber el length del array;
			aux=aux/10;
			cont++;
		}

		int[] digits=new int[cont];
		while(num>0) {
			rest=(num%10);
			num=num/10;
			digits[cont-1]=rest;//almacenamos cada resto en un indice de digitos
			cont--;//cambiamos de indice para que podamos almacenar el proximo dígito en otro indice
			System.out.println(rest +" rest");
			System.out.println(cont + " contador");
		}
		return digits;
	}
		
	    ///////////---high and less and cont	array 4 variables
		public static int[] digitsHyL(int[] digits) {// o divisors
		
			int  high=0, less=0,conthigh=0,contless=0;
			Boolean inte=false;
			
			for(int i=0;i<digits.length;i++) {
				//out digits
				System.out.println(digits[i] + " digit");			
				
				//sacamos mayor y menor y contamos
				if(inte==false) {
					high=digits[i];
					less=digits[i];
					inte=true;
								
				}else {
					//high
					if(digits[i]>high) {
						conthigh=0;
						high=digits[i];
						System.out.println(high+ " high");
					}else if(digits[i]==high) {///repeat?
						conthigh++;
						System.out.println(conthigh+ " highrepeat");	
					}
					if(digits[i]<less){
						contless=0;
						less=digits[i];
						System.out.println(less+ " less");	
					} else if(digits[i]==less) {///repeat?
						contless++;
						System.out.println(contless+ " lessrepeat");
					}
				}//end if
				
			}//end for
			
			return new	int[]{high,conthigh,less,contless};
	
		}
	    //////////--PAIRS & ODDS count and sum
		public static int[] digitsPandO(int[] digits) {
		
			int  contpairs=0,contodd=0, sumodds=0, sumpairs=0;
			
			///out digits
			
			for(int i=0;i<digits.length;i++) {
				
				System.out.println(digits[i] + " digits");	
				
			///pairs and odds CONT AND SUM
				if((digits[i]%2)==0) {
					sumpairs=sumpairs+digits[i];
					contpairs++;
					System.out.println(digits[i] + " pairs");
				}//end if
				if((digits[i]%2)!=0) {
					sumodds=sumodds+digits[i];
					contodd++;
					System.out.println(digits[i] + " odd");
				}//end if
			}//end for
			System.out.println(contpairs + " contpairs");
			System.out.println(sumpairs + " sumpairs");
			System.out.println(contodd + " contodd");
			System.out.println(sumodds + " sumodds");
			
			return new	int[]{contpairs,sumpairs,contodd,sumodds};
		}
		
/////////////////----DIVISORS----
		
	///out divisors of num
		public static int[] divisorsOfNum(int num) {
			int  cont=0;	
			int[] divisors;
			///contamos divisores
			for (int i = 1; i <= num; i++) {
				
				if ((num % i) == 0) {
					cont++;
					System.out.println(i + " divisor");
				} // end if
			} // end for
			
			divisors=new int[cont];
			///almacenamos divisores
			for (int j = 1; j < num; j++) {
				
				if ((num % j) == 0) {
					divisors[cont-1]=j;//almacenamos cada divisor en un indice de divisors
					cont--;
				}//end if
			}//end for
			
			return divisors;
		}

////////////////////////---NUMBERS---
		
	//// store numbers in arrayList
		
		/*ArrayList<Integer> nums = new ArrayList<Integer>();
		 * nums.add(num);*/
		
	////// ----High & Less---- int [] highandless=new int[4]; reset for repeat the two arrays
		public static int[] numHyL(ArrayList<Integer> nums) {
		
			int  high=0, less=0,conthigh=0,contless=0, aux=0;
			Boolean inte=false;
			Iterator<Integer> i = nums.iterator();
			

				while( i.hasNext() ){	
					aux=i.next();
					if(inte==false) {
						high=aux;
						less=aux;
						inte=true;
						System.out.println(high+ " high");
						System.out.println(less+ " less");
					}else {
						//high
						if(aux>high) {
							high=aux;
							conthigh=0;
							System.out.println(high+ " high");
						}else if(aux==high) {
							conthigh++;
							System.out.println(conthigh+ " highrepeat");
						}
						//less
						if(aux<less) {
							less=aux;
							contless=0;
							System.out.println(less+ " less");
						}else if(aux==less) {
							contless++;
							System.out.println(contless+ " lessrepeat");
						}
					}
				}//end for
				
				//System.out.println(high+ " high");
				//System.out.println(conthigh+ " highrepeat");
				//System.out.println(less+ " less");
				//System.out.println(contless+ " lessrepeat");
			return new	int[]{high,conthigh,less,contless};
					
	
		}

		
		
}