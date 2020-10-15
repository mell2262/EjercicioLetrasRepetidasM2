import java.util.ArrayList;
import java.util.List;

public class LetrasRepetidas {

	public static void main(String[] args) {
		/* El ejercicio consiste en mostrar por consola cuántas veces aparece cada letra 
		 * de tu nombre y apellidos con diferentes variantes (fases).
		FASE 2
		 Cambia la tabla  para una lista (List <Character>)
		 En bucle, si la letra es una vocal imprime en la consola: 'VOCAL'. Sino, imprime: 
		'CONSONTANT'.
		 Si encuentras un numero, muestra por pantalla: 'Los nombres de personas no .
		contienen números!'.

		 */
		List<Character> nombre = new ArrayList<Character>();
		
		nombre.add('M');
		nombre.add('E');
		nombre.add('l');
		nombre.add('i');
		nombre.add('S');
		nombre.add('8');
		
		for (int i=0; i<nombre.size();i++) {
			if ((nombre.get(i).equals('a')) || (nombre.get(i).equals('e')) ||(nombre.get(i).equals('i')) ||(nombre.get(i).equals('o')) ||(nombre.get(i).equals('u')) ||(nombre.get(i).equals('A')) ||(nombre.get(i).equals('E')) ||(nombre.get(i).equals('I')) ||(nombre.get(i).equals('O')) ||(nombre.get(i).equals('U'))) 
				System.out.println(nombre.get(i)+ " VOCAL");
			else 
				if ((nombre.get(i).charValue() >= 48) && (nombre.get(i).charValue()<= 57))
					System.out.println("Los nombres de personas no contienen números!");
				else System.out.println(nombre.get(i)+ " CONSONANATE");

		}
	}
}
