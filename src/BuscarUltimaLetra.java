
public class BuscarUltimaLetra {


	/*
	 * Funciones
	 */
	
	public static void primeraLetra(String Palabra) {
		
		int uLetra = Palabra.length();
		System.out.println("La primera letra de la palabra es " + Palabra.charAt(Palabra.length() - 1));
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		primeraLetra("Joni gilipollas");
	}

}
 