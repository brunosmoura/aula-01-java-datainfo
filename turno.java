/* Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso. */

package aula01;

import java.util.Scanner;

public class turno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o turno que vocês estuda (M-matutino ou V-Vespertino ou N- Noturno): ");
		char turno =sc.next().charAt(0);
		
		switch (turno) {
		case 'M':
			System.out.println( "Bom Dia!");break;
		case 'V':
			System.out.println( "Boa Tarde!");break;
		case 'N':
			System.out.println( "Boa Noite!");break;
		default:
			System.out.println("Valor Invalido!");
		}

	}
}
