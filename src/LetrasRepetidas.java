import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetrasRepetidas {

	public static void main(String[] args) {
		/* El ejercicio consiste en mostrar por consola cuántas veces aparece cada letra 
		 * de tu nombre y apellidos con diferentes variantes (fases).
		FASE 4
		 Crear otra lista con tu apellido donde cada posición corresponda a una letra.

		 Combinar las dos listas en una sola. Además, añade una posición con un espacio vacío entre la primera y la 
		segunda. Es decir, partimos de la lista name y surname y al terminar la ejecución sólo tendremos una que se 
		llamará fullname.

		FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]

		 */
		List<Character> name = new ArrayList<Character>();
		List<Character> surName = 	Arrays.asList('G','O','M','E','Z');	
		List<Character> fullName= new ArrayList<Character>();
			
		name.add('M');
		name.add('E');
		name.add('L');
		name.add('I');
		name.add('S');
		name.add('A');

		
		for (int i=0; i<name.size();i++) {
			fullName.add(name.get(i));
		}
		
		fullName.add(' ');
		
		for (int i=0; i<surName.size(); i++) {
			fullName.add(surName.get(i));	
		}
		
		System.out.println(fullName);
		
	}
}
