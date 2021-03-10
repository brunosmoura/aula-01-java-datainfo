/*Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.*/

package aula01;

import java.util.Scanner;

public class lados_triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double lado1,lado2,lado3;
		
		System.out.println("digite o Primeiro lado do triangulo: ");
		lado1 =sc.nextDouble();
		
		System.out.println("digite o Segundo lado do triangulo: ");
		lado2 =sc.nextDouble();
		
		System.out.println("digite o Terceiro lado do triangulo: ");
		lado3 =sc.nextDouble();
		
		if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
			if (lado1 == lado2 && lado2==lado3) {
				System.out.println("Os Lados digitados formam um Triângulo Equilátero");
			}else if (lado1 == lado2 || lado2 == lado3 || lado1 ==lado3) {
				System.out.println("Os Lados digitados formam um Triângulo Isósceles");
			}else {
				System.out.println("Os Lados digitados formam um Triângulo Escaleno");
			}
		}else {
			System.out.println("Os lados informados não formam um triângulo");
		}

	}

}
