package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX64 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0,num;
		
		System.out.println("Digite os dez numeros");
		for(int i = 0; i < 10; i++) {
			num = sc.nextInt();
			if(num<40) {
				cont += num;
			}
		}
		
		System.out.println("O valor dos numeros somados: "+cont);
		
		sc.close();
	}
}

/*
Escreva um algoritmo para ler 10 números.
Todos os números lidos com valor inferior a 40 devem ser somados.
Escreva o valor final da soma efetuada.
*/
