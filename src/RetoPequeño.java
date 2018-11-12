import java.util.Scanner;

public class RetoPequeño {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//pedir datos para calcular el factorial y el sumatorio
		System.out.println("introduce un numero y yo calculare el factorial y el sumatorio");
		int numero = scan.nextInt();
		
		//mostrar el factorial y el sumatorio
		int mostrarF = factorial(numero);
		System.out.println("El factorial de tu numero es: " + mostrarF );
		int mostrarS = sumatorio(numero);
		System.out.println("El sumatorio de tu numero es: " +  mostrarS);
		//fin Sumatorio factorial	
		
		//pedir dato para buscar el primer y ultimo digito
		System.out.println("introduce un numero largo y yo mostrare el primer y ultimo digito");
		int numero2 = scan.nextInt();
		//mostrar el primer y el ultimo digito
		int mostrarPN = mostrarPrimerNumero(numero2);
		System.out.println("El primer digito dentro de tu numero es: " + mostrarPN);
		int mostrarUN = mostrarUltimoNumero(numero2);
		System.out.println("El ultimo digito dentro de tu numero es: " +  mostrarUN);
		//fin primer ultimo digitos
	}
	
	
	
	// Funcion calcular el factorial de un numero
		public static int factorial(int numero) {
			
			int factorizado = 1; 
			
			for(int i = 1; i <= numero; i++) {
				factorizado = factorizado * i;
			}
					
			return factorizado;
		}
	//Fin funcion calcular factorial

	//Funcion calcular sumatorio
		public static int sumatorio(int numero) {
			
			int sumatorio = 0; 
			
			for(int i = 0; i <= numero; i++) {
				sumatorio = sumatorio + i;
			}
					
			return sumatorio;
		}
	//Fin funcion caluclar sumatorio
		
	//Funcion mostrar ultimo numero de un digito
		public static int mostrarUltimoNumero(int numero) {
			int uNumero = numero%10;
			
			return uNumero;
		}
		
	//Fin funcion mostrar ultimo numero
		
	//Funcion mostrar Primer numero de un digito
		public static int mostrarPrimerNumero(int numero) {
			int pNumero = numero;
			while (pNumero > 10) {
				pNumero = pNumero / 10;
			}
			
			return pNumero;
		}
				
	//Fin funcion mostrar Primer numero
		

}
