/**
 * 
 */
package framework.modules.settings.Dummies.DummPrograms;

import framework.modules.Programs.clases.Muscular;
import framework.modules.Programs.clases.Relax;
import framework.modules.Programs.clases.SingletonPrograms;
import framework.modules.Programs.clases.Therapeutic;

/**
 * @author joana
 *
 */
public class FindDummies {

	public static int findRelax(Relax relax) { 
		relax = FunctionsDummies.askDNIRelax();
		for (int i = 0; i<=(SingletonPrograms.DummieRelax.size()-1); i++){
			if((SingletonPrograms.DummieRelax.get(i)).equals(relax) )
				return i ;
		}
		SingletonPrograms.DnisRel.add(SingletonPrograms.DNI);//almacenamos los dnis de los programas creados para sacarlos en los combos 
		return -1;////si saca -1 es que no esta repetido
	}
	
	
	public static int findThera(Therapeutic thera) { 
		thera = FunctionsDummies.askDNIThera();
		for (int i = 0; i<=(SingletonPrograms.DummieThera.size()-1); i++){
			if((SingletonPrograms.DummieThera.get(i)).equals(thera) )
				return i;
		}
		SingletonPrograms.DnisThera.add(SingletonPrograms.DNI);
		return -1;
	}
	
	public static int findMuscular(Muscular muscular) { 
		muscular = FunctionsDummies.askDNIMuscular();
		for (int i = 0; i<=(SingletonPrograms.DummieMuscular.size()-1); i++){
			if((SingletonPrograms.DummieMuscular.get(i)).equals(muscular) )
				return i;
		}
		SingletonPrograms.DnisMus.add(SingletonPrograms.DNI);
		return -1;
	}
}
