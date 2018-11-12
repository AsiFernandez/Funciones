import java.util.Scanner;

public class EsPrimo {
	
	
	

	public static boolean EsPrimo (int num) {
		
		boolean primo = true;
		int contador = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num%i == 0) {
				contador ++;
			}
		}
		
		if(contador > 2) {
			primo = false;
		}
		
		return primo;
		 
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("inserta un numero");
		int numero = scan.nextInt();
		
		boolean primo = EsPrimo(numero);
		if( primo != true) {
		System.out.println("el numero " + numero +" no es primo" );
		}else {
			System.out.println("el numero " + numero +" es primo" );
		}
		
		
		
		
		
	}
	
	
	
	

}
