package logicaProgramacaoManzano;

import java.util.Scanner;

public class L02A {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int numA,numB,numC,numD,multAC,somaBD;
		
		System.out.println("Digite o primeiro n�mero");
		numA = ns.nextInt();
		System.out.println("Digite o segundo n�mero");
		numB = ns.nextInt();
		System.out.println("Digite o terceiro n�mero");
		numC = ns.nextInt();
		System.out.println("Digite o quarto n�mero");
		numD = ns.nextInt();
		
		multAC = numA*numC;
		somaBD = numB+numD;
		
		System.out.println("O valor da multiplica��o do primeiro n�mero com o terceiro �: " + multAC);
		System.out.println("O valor da soma do segundo n�mero com o quarto �: " + somaBD);
		ns.close();
	}

}
