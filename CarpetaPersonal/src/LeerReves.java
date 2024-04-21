import java.util.*;
public class LeerReves {

	public static void main(String[] args) {
		
		Scanner leer_dato = new Scanner(System.in);
		System.out.println("Ingrese palabra");
		String palabra = leer_dato.nextLine();
	char [] palabra_reves = new char[palabra.length()];
		
		for(int i = palabra.length() - 1;i >=0; i-- ) {
			palabra_reves[palabra.length() - 1 - i] = palabra.charAt(i);
			
		}
		
		System.out.println("La palabra: " + "" + palabra + "" + " al reves es: ");
		for(int i=0; i<palabra_reves.length; i++) {
			System.out.print(palabra_reves[i]);
		}

	}

}
