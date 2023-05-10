package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		  double valor1, valor2;

	        System.out.print("Informe o primeiro valor: ");
	        valor1 = sc.nextDouble();

	        do {
	            System.out.print("Informe o segundo valor: ");
	            valor2 = sc.nextDouble();
	            System.out.println("-----------------------------");

	        } while (valor2 == 0);

	        double resultado = valor1 / valor2;

	        System.out.printf("O resultado da divisao: %.2f", resultado);
	        sc.close();
	}
}

/*Escreva um algoritmo para ler 2 valores
  e se o segundo valor informado for ZERO, 
  deve ser lido um novo valor, ou seja,
  para o segundo valor não pode ser aceito o valor zero
  e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
  (utilizar a estrutura REPITA).
 */