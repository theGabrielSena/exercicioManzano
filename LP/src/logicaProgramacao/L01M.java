package logicaProgramacao;

import java.util.Scanner;

public class L01M {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		double numA,numB,numC,soma,somaQuadrado;
		
		System.out.println("Digite o primeiro n�mero");
		numA = ns.nextDouble();
		System.out.println("Digite o segundo n�mero");
		numB = ns.nextDouble();
		System.out.println("Digite o terceiro n�mero");
		numC = ns.nextDouble();
		
		soma = Math.pow(numA, 2) + Math.pow(numB, 2) + Math.pow(numC, 2);
		somaQuadrado = Math.pow(soma, 2);
		
		System.out.println("O quadrado dos tr�s quadrados �: " + somaQuadrado);
		ns.close();
	}

}
