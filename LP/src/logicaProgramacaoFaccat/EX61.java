package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		double media;
		
		System.out.println("Digite dez numeros para realizar o calculo aritmetico");
		for (int i = 0;i < 10;i++) {
			int num = sc.nextInt();
			cont += num;
		}
		
		media = cont/10;
		
		System.out.println("A media: "+media);
		
		sc.close();
	}
}

//Ler 10 valores, calcular e escrever a m�dia aritm�tica desses valores
