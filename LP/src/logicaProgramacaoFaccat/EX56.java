package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Digite um número");
			num=sc.nextInt();
		}while(num<0||num>10);
		
		for (int i = 1; i <= 10; i++) {
				System.out.println(i +" x "+ num +" = "+ i*num);
				System.out.println("----------");
		}
		sc.close();
	}
}

//Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido. 