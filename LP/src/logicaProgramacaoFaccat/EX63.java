package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX63 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0,num;
		
		System.out.println("Digite dez numeros");
		for (int i = 0; i < 10; i++) {
			num = sc.nextInt();
			cont += num;
		}
		System.out.println("A soma dos dez numeros: "+cont);
		
		sc.close();
	}
}

/*
Escreva  um  algoritmo  para  ler
10  números  e  ao  final  da  leitura
escrever  a  soma  total  dos  10 números lidos. 
*/