package logicaProgramacaoManzano;

import java.util.Scanner;

public class L01L {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		double numA,numB,numC,soma;
		
		System.out.println("Digite o primeiro n�mero");
		numA = ns.nextDouble();
		System.out.println("Digite o segundo n�mero");
		numB = ns.nextDouble();
		System.out.println("Digite o terceiro n�mero");
		numC = ns.nextDouble();
		
		soma = Math.pow(numA, 2) + Math.pow(numB, 2) + Math.pow(numC, 2);
		
		System.out.println("A soma dos tr�s n�meros �: " + soma);
		ns.close();
	}

}
