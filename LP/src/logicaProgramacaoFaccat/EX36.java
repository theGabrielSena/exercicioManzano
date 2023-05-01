package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX36 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int idadeHomem1,idadeHomem2,idadeMulher1,idadeMulher2,soma;
		
		System.out.println("Digite a idade do primeiro homem:");
		idadeHomem1 = ns.nextInt();
		System.out.println("Digite a idade do segundo homem:");
		idadeHomem2 = ns.nextInt();
		System.out.println("Digite a idade da primeira mulher:");
		idadeMulher1 = ns.nextInt();
		System.out.println("Digite a idade da segunda mulher:");
		idadeMulher2 = ns.nextInt();
		
		
		if(idadeHomem1>idadeHomem2 && idadeHomem1>idadeMulher2) {
			soma = idadeHomem1 + idadeMulher1;
			System.out.println("O maior número é: "+soma);
		}
		else if(idadeHomem1>idadeHomem2 && idadeHomem1>idadeMulher1) {
			soma = idadeHomem1 + idadeMulher2;
			System.out.println("O maior número é: "+soma);
		}
		else if(idadeHomem2>idadeHomem1 && idadeHomem2>idadeMulher2 ) {
			soma = idadeHomem2 + idadeMulher1;
			System.out.println("O maior número é: "+soma);
		}
		else if(idadeHomem2>idadeHomem1 && idadeHomem2>idadeMulher1) {
			soma = idadeHomem2 + idadeMulher2;
			System.out.println("O maior número é: "+soma);
		}
		ns.close();
	}

}
