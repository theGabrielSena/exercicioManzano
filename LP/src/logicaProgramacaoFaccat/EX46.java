package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1,valor2;
		double resultado;
		
		System.out.println("Digite o primeiro valor");
		valor1 = sc.nextInt();
		
		do {
			System.out.println("Digite o segundo valor");
			valor2 = sc.nextInt();
			System.out.println("-----------------------------");
			if(valor2==0) {
				System.out.println("VALOR INVALIDO");
			}
		} while(valor2==0);
		
		resultado = valor1 / valor2;

	    System.out.printf("O resultado da divisao: %.2f", resultado);
	    sc.close();
	}

}