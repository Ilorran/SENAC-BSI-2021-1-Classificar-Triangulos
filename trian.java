package triangulo;
import java.util.Scanner;
public class trian {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Vamos descobrir o tipo do tri�ngulo!");
		System.out.println("Digite o primeiro valor (lateral direita): ");
		float primeiro_valor = teclado.nextFloat();
		System.out.println("Digite o segundo valor (lateral esquerda): ");
		float segundo_valor = teclado.nextFloat();
		System.out.println("Digite o terceiro valor (base): ");
		float terceiro_valor = teclado.nextFloat();
		
		if(primeiro_valor == segundo_valor && segundo_valor == terceiro_valor) {
			System.out.print("� um tri�ngulo Equil�tero!");
		}	
		if(primeiro_valor == segundo_valor && segundo_valor != terceiro_valor) {
			System.out.println("� um tri�ngulo Is�sceles!");
		}
		if(primeiro_valor != segundo_valor && segundo_valor != terceiro_valor) {
			System.out.println("� um tri�ngulo Escaleno!");
		}
	}

}
