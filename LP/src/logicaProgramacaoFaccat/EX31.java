package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX31 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int num1,num2,num3;
		
		System.out.println("Digite o primeiro número:");
		num1 = ns.nextInt();
		System.out.println("Digite o segundo número:");
		num2 = ns.nextInt();
		System.out.println("Digite o terceiro número:");
		num3 = ns.nextInt();
		
		if(num3<(num1+num2) && num2<(num3+num1) && num1<(num2+num3)) {
			System.out.println("Formou um triângulo");
		}
		else {
			System.out.println("Não formou");
		}
		ns.close();
	}

}