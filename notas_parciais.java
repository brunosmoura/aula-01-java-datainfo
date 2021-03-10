/*Fa�a um programa que l� as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua m�dia. A atribui��o de conceitos obedece � tabela abaixo: */

package aula01;

import java.util.Scanner;

public class notas_parciais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		double nota1, nota2, media;
		char conceito;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		media = (nota1+nota2)/2;
		
		if (media >= 9 ) {
			conceito = 'A';
		}else if (media < 9 && media >= 7.5) {
			conceito ='B';
		}else if (media < 7.5 && media >= 6) {
			conceito ='C';
		}else if (media < 6 && media >= 4) {
			conceito ='D';
		}else {
			conceito = 'E';
		}
		
		if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
			System.out.printf("Voc� foi APROVADO, sua nota m�dia foi  %.2f%n" , media);
			System.out.println("Parab�ns,voce Obteve o Conceito :" + conceito);
		}else {
			System.out.printf("infelizmente voc� foi Reprovado, sua m�dia foi %.2f%n" , media);
			System.out.println("Voc� Obteve o Conceito : " + conceito);
		}

	}

}
