package logicaProgramacaoManzano;

import java.util.Scanner;

public class L02A {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int numA,numB,numC,numD,multAC,somaBD;
		
		System.out.println("Digite o primeiro número");
		numA = ns.nextInt();
		System.out.println("Digite o segundo número");
		numB = ns.nextInt();
		System.out.println("Digite o terceiro número");
		numC = ns.nextInt();
		System.out.println("Digite o quarto número");
		numD = ns.nextInt();
		
		multAC = numA*numC;
		somaBD = numB+numD;
		
		System.out.println("O valor da multiplicação do primeiro número com o terceiro é: " + multAC);
		System.out.println("O valor da soma do segundo número com o quarto é: " + somaBD);
		ns.close();
	}

}
