package logicaProgramacao;

import java.util.Scanner;

public class L01K {

	public static void main(String[] args) {
		Scanner ns = new Scanner (System.in);
		double saldoD, saldoBR, dolar;
		
		System.out.println("Digite a cota��o do real com rela��o ao dolar atual:");
		dolar = ns.nextDouble();
		System.out.println("Digite o seu saldo em reais R$:");
		saldoBR = ns.nextDouble();
		
		saldoD = saldoBR*dolar;
		
		System.out.println("O saldo convertido para a moeda brasileira �: "+saldoD);
		ns.close();
	}

}
