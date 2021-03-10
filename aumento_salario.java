/*11 - As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual: */

package aula01;

import java.util.Scanner;

public class aumento_salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double aumento, salario2;
		
		System.out.println("Digite o Salario do Funcionario: ");
		double salario1 = sc.nextDouble();
		
		if (salario1  <= 280 ) {
			aumento = 0.2;
			salario2 = salario1*(aumento+1);
		}else if (salario1  > 280 && salario1  < 700 ) {
			aumento = 0.15;
			salario2 = salario1*(aumento+1);
		}else if (salario1 >= 700 && salario1 < 1500) {
			aumento = 0.1;
			salario2 = salario1*(aumento+1);
		}else {
			aumento = 0.05;
			salario2 = salario1*(aumento+1);
		}

		System.out.printf(" O salário atual do Funcionario é : R$ %.2f%n" , salario1);
		System.out.println(" seu reajuste foi de: "+ (aumento * 100) + "%"+ ".");
		System.out.printf(" O salário reajustado do Funcionario é R$ %.2f%n" ,salario2);
	}

}
