import java.util.Scanner;

public class BuscarPrimeraLetra {

	
	/*
	 * Funciones
	 */
	
	public static char primeraLetra(String Palabra) {
		
		char letra =  Palabra.charAt(0);
		return letra;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un palabra o frase");
		String palabra = scan.nextLine();
		
		char letra = primeraLetra(palabra);
		System.out.println("la primera letra de tu palabra/frase es: " + letra);
	}

}


