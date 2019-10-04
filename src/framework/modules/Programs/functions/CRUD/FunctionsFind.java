/**
 * 
 */
package framework.modules.Programs.functions.CRUD;

import framework.modules.Programs.clases.Muscular;
import framework.modules.Programs.clases.Relax;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Programs.clases.Therapeutic;

/**
 * @author joana
 *
 */
public class FunctionsFind {
	
	public static int findRelax(Relax relax) { 
		//System.out.println(" res findrelax");
		for (int i = 0; i<=(SingletonPrograms.programRelax.size()-1); i++){
			if((SingletonPrograms.programRelax.get(i)).equals(relax) )
				return i ;
		}
		SingletonPrograms.DnisRel.add(SingletonPrograms.DNI);
		return -1;////si saca -1 es que no esta repetido
	}
	
	/*public static int findRelax1(Relax relax) { 
		Iterator<Relax> i= SingletonPrograms.programRelax.iterator();
		
		while (i.hasNext()) {
		int x=i.next;	
		if(x.equals(relax) ) {
				return 1;(x.next)
			} 
		}
		return -1;
	}*/
	
	public static int findThera(Therapeutic thera) { 
		for (int i = 0; i<=(SingletonPrograms.programThera.size()-1); i++){
			if((SingletonPrograms.programThera.get(i)).equals(thera) )
				return i;
		}
		SingletonPrograms.DnisThera.add(SingletonPrograms.DNI);
		return -1;
	}
	
	public static int findMuscular(Muscular muscular) { 
		for (int i = 0; i<=(SingletonPrograms.programMuscular.size()-1); i++){
			if((SingletonPrograms.programMuscular.get(i)).equals(muscular) )
				return i;
		}
		SingletonPrograms.DnisMus.add(SingletonPrograms.DNI);
		return -1;
	}
}
