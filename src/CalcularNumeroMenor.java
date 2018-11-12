import java.util.Scanner;

public class CalcularNumeroMenor {

	/*
	 * Funciones
	 */
	
	public static int calcularMenor(int numero1, int numero2) {
		
		int pequenio = Math.min(numero1, numero2);
		
		return pequenio;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero a comparar ");
		int numero1= scan.nextInt();
		System.out.println("Introduce el segundo numero a comparar ");
		int numero2= scan.nextInt();
		
		
		int peque = calcularMenor(numero1, numero2);
		
		System.out.println("el numero mas pequeño es el " + peque);

	}

}

