package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX36 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int idadeHomem1,idadeHomem2,idadeMulher1,idadeMulher2,soma,produto = 0;
		
		System.out.println("Digite a idade do primeiro homem:");
		idadeHomem1 = ns.nextInt();
		System.out.println("Digite a idade do segundo homem:");
		idadeHomem2 = ns.nextInt();
		System.out.println("Digite a idade da primeira mulher:");
		idadeMulher1 = ns.nextInt();
		System.out.println("Digite a idade da segunda mulher:");
		idadeMulher2 = ns.nextInt();
		
		
		if(idadeHomem1>idadeHomem2 || idadeMulher1>idadeMulher2) {
			soma = idadeHomem1 + idadeMulher2;
			produto = idadeHomem2 * idadeMulher1;
			System.out.println("O maior n�mero �: "+soma);
			System.out.println("O produto �: "+produto);
		}
		else {
			soma = idadeHomem2 + idadeMulher1;
			produto = idadeHomem1 * idadeMulher2;
			System.out.println("O maior n�mero �: "+soma);
			System.out.println("O produto �: "+produto);
		}
		ns.close();
	}

}


/*Escreva  um  algoritmo  que  leia  as  idades  de  2  homens  e  de  2  mulheres (considere  que  as
idades dos  homens  ser�o  sempre  diferentes  entre  si,  bem  como  as  das  mulheres).  Calcule
e  escreva  a  soma das  idades  do  homem  mais  velho  com  a  mulher  mais  nova,  e  o  produto  das  idades 
do  homem  mais novo com a mulher mais velha. */