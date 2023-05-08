package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX25 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		double numeroConta,saldo,debito,credito,saldoAtual;
		
		System.out.println("Digite o número da conta");
		numeroConta = ns.nextDouble();
		System.out.println("Digite o saldo da conta");
		saldo = ns.nextDouble();
		System.out.println("Digite as depesas em débito da conta");
		debito = ns.nextDouble();
		System.out.println("Digite o crédito disponível na conta");
		credito = ns.nextDouble();
		
		saldoAtual = saldo-debito+credito;
		
		if(saldoAtual>=0) {
			System.out.printf("Olá, você possui a conta de número: %.0f\n",numeroConta);
			System.out.println("Seu saldo é positivo e você possui R$: "+saldoAtual+ " na conta");
		}else {
			System.out.println("Olá, você possui a conta de número: "+numeroConta+" e");
			System.out.println("Seu saldo é negativo e você está devendo R$: "+saldoAtual);
		}
		ns.close();
	}

}
