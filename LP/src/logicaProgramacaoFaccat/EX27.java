package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX27 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número qualquer:");
		num = ns.nextInt();
		
		if(num>0) {
			System.out.println("Número Positivo");
		}
		else if(num<0) {
			System.out.println("Número Negativo");
		}
		else {
			System.out.println("É igual a zero");
		}
		ns.close();
	}

}
