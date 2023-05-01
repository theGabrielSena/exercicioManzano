package logicaProgramacaoManzano;

import java.util.Scanner;

public class L01J {

	public static void main(String[] args) {
		Scanner ns = new Scanner (System.in);
		double saldoD, saldoBR, dolar;
		
		System.out.println("Digite a cotação do dólar atual:");
		dolar = ns.nextDouble();
		System.out.println("Digite o seu saldo em dólares $:");
		saldoD = ns.nextDouble();
		
		saldoBR = dolar*saldoD;
		
		System.out.println("O saldo convertido para a moeda brasileira é: "+saldoBR);
		ns.close();
	}

}
