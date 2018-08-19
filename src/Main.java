import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero;
		String resultado;
		CodigoRomano numeroRomano = new CodigoRomano();
		System.out.println("ingrese el numero a convertir en numero romano: ");
		numero = entrada.nextInt();
		if(numero > 0 && numero < 1000) {
			resultado = numeroRomano.conversorRomano(numero);
			System.out.println("el numero: " + numero + " en convertido a numero romano es: "
					+ resultado);
		}else {
			System.out.println("la cantidad es incorrecta");
		}
		
	}

}
