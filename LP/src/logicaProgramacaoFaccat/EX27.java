package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX27 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um n�mero qualquer:");
		num = ns.nextInt();
		
		if(num>0) {
			System.out.println("N�mero Positivo");
		}
		else if(num<0) {
			System.out.println("N�mero Negativo");
		}
		else {
			System.out.println("� igual a zero");
		}
		ns.close();
	}

}
