package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont=0;
		
		System.out.println("Digite 10 valores");
		
		for (int i = 1; i <= 10; i++) {
			int num = sc.nextInt();
			if(num<0) {
				cont++;
			}
		}
		
		System.out.println(cont+" dos numeros sao negativos");
		
		sc.close();
	}
}

// Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS. 
