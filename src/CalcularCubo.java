import java.util.Scanner;

public class CalcularCubo {
	
	/*
	 * Funciones
	 */
	
	public static float calcularCubo(float base) {
		
		float calculo = (float) Math.pow(base, 3);
			
		System.out.println("Tu numero al cubo es " + calculo);
		return calculo ;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un numero para calcular su cubo");
		int numero= scan.nextInt();
		
		calcularCubo((float) numero);
		
	
	}
}

