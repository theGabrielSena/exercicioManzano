package logicaProgramacaoManzano;

import java.util.Scanner;

public class L02B {

	public static void main(String[] args) {
		Scanner ns = new Scanner (System.in);
		double SM,PR,NS;
		
		System.out.println("Digite o valor do sal�rio mensal");
		SM = ns.nextDouble();
		System.out.println("Digite o percentual de reajuste");
		PR = ns.nextDouble();
		
		NS = (PR/100)*SM;
		NS = NS+SM;
		
		System.out.println("O novo sal�rio ficou ajustado em: " + NS);
		ns.close();
	}

}
