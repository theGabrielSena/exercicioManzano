package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX25 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		double numeroConta,saldo,debito,credito,saldoAtual;
		
		System.out.println("Digite o n�mero da conta");
		numeroConta = ns.nextDouble();
		System.out.println("Digite o saldo da conta");
		saldo = ns.nextDouble();
		System.out.println("Digite as depesas em d�bito da conta");
		debito = ns.nextDouble();
		System.out.println("Digite o cr�dito dispon�vel na conta");
		credito = ns.nextDouble();
		
		saldoAtual = saldo-debito+credito;
		
		if(saldoAtual>=0) {
			System.out.println("Seu saldo � positivo e voc� possui R$: "+saldoAtual+ " na conta");
		}else {
			System.out.println("Seu saldo � negativo e voc� est� devendo R$: "+saldoAtual);
		}
		ns.close();
	}

}
