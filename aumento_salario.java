/*11 - As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores e lhe contraram para desenvolver o programa que calcular� os reajustes.
Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte crit�rio, baseado no sal�rio atual: */

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

		System.out.printf(" O sal�rio atual do Funcionario � : R$ %.2f%n" , salario1);
		System.out.println(" seu reajuste foi de: "+ (aumento * 100) + "%"+ ".");
		System.out.printf(" O sal�rio reajustado do Funcionario � R$ %.2f%n" ,salario2);
	}

}
