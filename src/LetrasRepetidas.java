
public class LetrasRepetidas {

	public static void main(String[] args) {
		/* El ejercicio consiste en mostrar por consola cuántas veces aparece cada letra 
		 * de tu nombre y apellidos con diferentes variantes (fases).
		FASE 1
		 Crear una tabla (char []) con tu nombre donde cada posición corresponda a una 
		letra.
		 Haz un bucle que recorra esta tabla y muestre por consola cada una de las 
		letras.
		 */
		
		char nombre []= {'M','E','L','I','S','A'};
		/*
		for (int i=0; i<6; i++) {
			System.out.println(nombre[i]);
		}
		
		*/
		
		for (char i:nombre) {
			System.out.println(i);
		}
	}

}
