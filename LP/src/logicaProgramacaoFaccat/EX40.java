package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX40 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		String nome;
		int quantidade = 0;
		double preco = 0,desconto;
		
		System.out.println("Digite o nome do produto adquirido:");
		ns.next();
		System.out.println("Digite a quantidade comprada:");
		ns.nextInt();
		System.out.println("Digite o preço unitário:");
		ns.nextDouble();
		
		if(quantidade <= 5) {
			desconto = preco*2/100;
			preco = preco-desconto;
		}else if(quantidade > 5 && quantidade<=10) {
			desconto = preco*3/100;
			preco = preco-desconto;
		}else{
			desconto = preco*5/100;
			preco = preco-desconto;
		}
		
		System.out.println("Você comprou " + quantidade + " unidades de: " + nome + " e pagou: R$" + preco + " por isso");
		ns.close();
	}

}
