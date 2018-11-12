import java.util.Scanner;

public class FactorialRecursivo {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("introduce un numero para que calcule el factorial");
		int numero = scan.nextInt();
		
		System.out.println("El numero " + numero + " factorizado es " + FactorialRecursivo(numero));
	}
	
	//Funcion calcular numero factorial recursivo
	
	public static int FactorialRecursivo(int numero) {
				
		if(numero == 0){
            return 1;
        }
        else
            return numero * FactorialRecursivo(numero-1);
    
		
		
	}
	
	//fin 
	
}