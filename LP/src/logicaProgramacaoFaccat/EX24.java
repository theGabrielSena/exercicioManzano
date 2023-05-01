package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX24 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		double salarioFixo,valorVenda,acrescimo;
		
		System.out.println("Digite o salário fixo");
		salarioFixo = ns.nextDouble();
		System.out.println("Digite o valor da venda");
		valorVenda = ns.nextDouble();
		
		if(valorVenda<=1500) {
			acrescimo = valorVenda/100*3;
			salarioFixo = acrescimo+salarioFixo;
			System.out.println("O seu salário foi de: R$"+salarioFixo);
		}else {
			acrescimo = valorVenda/100*5;
			salarioFixo = acrescimo+salarioFixo;
			System.out.println("O seu salário foi de: R$"+salarioFixo);
		}
		ns.close();
	}

}
