package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX31 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int num1,num2,num3;
		
		System.out.println("Digite o primeiro n�mero:");
		num1 = ns.nextInt();
		System.out.println("Digite o segundo n�mero:");
		num2 = ns.nextInt();
		System.out.println("Digite o terceiro n�mero:");
		num3 = ns.nextInt();
		
		if(num3<(num1+num2) && num2<(num3+num1) && num1<(num2+num3)) {
			System.out.println("Formou um tri�ngulo");
		}
		else {
			System.out.println("N�o formou");
		}
		ns.close();
	}

}