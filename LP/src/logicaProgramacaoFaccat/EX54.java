package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX54 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("Digite um n�mero");
			n = sc.nextInt();
		} while(n < 0);
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		sc.close();
	}
}

/*Modifique o  exerc�cio anterior para aceitar somente
  valores maiores  que 0 para N. Caso o valor informado 
  (para N) n�o seja maior que 0, dever� ser lido um novo valor para N.
*/