import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetrasRepetidas {

	public static void main(String[] args) {
		/* El ejercicio consiste en mostrar por consola cuántas veces aparece cada letra 
		 * de tu nombre y apellidos con diferentes variantes (fases).
		FASE 3
		 Almacenar en un Map tanto las letras de la lista como el número de veces 
		que aparecen.

		 */
		List<Character> nombre = new ArrayList<Character>();
		HashMap<Character, Integer> repetLetras= new HashMap<Character, Integer>();
			
		nombre.add('M');
		nombre.add('E');
		nombre.add('L');
		nombre.add('I');
		nombre.add('S');
		nombre.add('E');
		
		
		for (int i=0; i<nombre.size();i++) {
			
			if (repetLetras.get(nombre.get(i))==null) repetLetras.put(nombre.get(i), 1);
			else {
				Integer a=repetLetras.get(nombre.get(i));
				repetLetras.replace(nombre.get(i), a+1);
			}
		}
		System.out.println(repetLetras);
		
	}
}
