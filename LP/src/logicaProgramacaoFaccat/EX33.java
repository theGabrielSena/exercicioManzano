package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX33 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int num1,num2;
		
		System.out.println("Digite o primeiro n�mero:");
		num1 = ns.nextInt();
		System.out.println("Digite o segundo n�mero:");
		num2 = ns.nextInt();
		
		if(num1>num2) {
			System.out.println("O primeiro n�mero � maior.");
		}
		else if(num2>num1) {
			System.out.println("O segundo n�mero � maior.");
		}
		else{
			System.out.println("Os n�meros s�o iguais.");
		}
		ns.close();
	}

}
