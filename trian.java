package triangulo;
import java.util.Scanner;
public class trian {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Vamos descobrir o tipo do triângulo!");
		System.out.println("Digite o primeiro valor (lateral direita): ");
		float primeiro_valor = teclado.nextFloat();
		System.out.println("Digite o segundo valor (lateral esquerda): ");
		float segundo_valor = teclado.nextFloat();
		System.out.println("Digite o terceiro valor (base): ");
		float terceiro_valor = teclado.nextFloat();
		
		if(primeiro_valor == segundo_valor && segundo_valor == terceiro_valor) {
			System.out.print("É um triângulo Equilátero!");
		}	
		if(primeiro_valor == segundo_valor && segundo_valor != terceiro_valor) {
			System.out.println("É um triângulo Isósceles!");
		}
		if(primeiro_valor != segundo_valor && segundo_valor != terceiro_valor) {
			System.out.println("É um triângulo Escaleno!");
		}
	}

}
