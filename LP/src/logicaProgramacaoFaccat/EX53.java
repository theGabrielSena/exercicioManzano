package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print(i + "|");
		}
		sc.close();
	}
}

/*Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
  Considere que o N ser� sempre maior que ZERO.
*/