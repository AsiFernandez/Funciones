import java.util.Scanner;

public class DibujarCubo {

	//funcion para crear un cubo de asteriscos
		public static void cuboAsteriscos(int cantidad) {
			for(int i = 1; i <= cantidad; i++) {
				
				for(int j = 1; j <= cantidad; i++) {
					
					System.out.print("*");
				}
				
				System.out.println("");
			}
		}
		
		
		
		
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		cuboAsteriscos(3);
		
	
	}

}
