package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX14 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		double num1;
		
		System.out.println("Escreva um n�mero qualquer:");
		num1 = ns.nextDouble();
		
		if(num1>10) {
			System.out.println("� MAIOR QUE 10");
		}
		else if(num1<10) {
			System.out.println("N�O � MAIOR QUE 10");
		}
		else {
			System.out.println("� IGUAL A 10");
		}
		ns.close();
	}

}
