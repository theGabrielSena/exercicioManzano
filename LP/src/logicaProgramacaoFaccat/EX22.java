package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX22 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int horasTrabalhadas;
		double salarioHora,salarioTotal,salarioIntermediario,horasExtras;
		
		System.out.println("Digite o número de horas trabalhadas em um mês");
		horasTrabalhadas = ns.nextInt();
		System.out.println("Digite o valor do salário recebido por hora");
		salarioHora = ns.nextDouble();
		
		
		
		if(horasTrabalhadas<163) {
			salarioTotal = salarioHora*horasTrabalhadas;
			System.out.println("O valor a ser recebido é: "+salarioTotal);
		}
		else {
			salarioIntermediario = salarioHora*horasTrabalhadas;
			horasExtras = horasTrabalhadas-160;
		}
		ns.close();
	}

}
