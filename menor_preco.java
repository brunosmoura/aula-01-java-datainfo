/* 07 - Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles. */

package aula01;

import java.util.Scanner;

public class menor_preco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o pre�o do Primeiro Produto: ");
		double prod1 =sc.nextDouble();
		System.out.println("Digite o pre�o do segundo Produto: ");
		double prod2 =sc.nextDouble();
		System.out.println("Digite o pre�o do terceiro Produto: ");
		double prod3 =sc.nextDouble();
		
		if (prod1 < prod2 && prod1 < prod3) {
			System.out.println("Compre o produto 1!");
		}else if (prod2 < prod1 && prod2 <prod3) {
			System.out.println("Compre o produto 2!");
		}else {
			System.out.println("Compre o produto 3!");
		}

	}

}
