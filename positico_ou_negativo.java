/*02. Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.*/

package aula01;

import java.util.Scanner;

public class positico_ou_negativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um Numero: ");
		int num =sc.nextInt();
		
		if (num < 0 ) {
			System.out.println("O n�mero digitado � negativo!");
		}else if (num == 0) {
			System.out.println("o numero digitado � neutro!");
		}else {
			System.out.println("o numero digitado � positivo!");
		}
	}

}
