package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX22 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int horasTrabalhadas;
		double salarioHora,salarioTotal,salarioIntermediario,horasExtras;
		
		System.out.println("Digite o n�mero de horas trabalhadas em um m�s");
		horasTrabalhadas = ns.nextInt();
		System.out.println("Digite o valor do sal�rio recebido por hora");
		salarioHora = ns.nextDouble();
		
		
		
		if(horasTrabalhadas<163) {
			salarioTotal = salarioHora*horasTrabalhadas;
			System.out.println("O valor a ser recebido �: "+salarioTotal);
		}
		else {
			salarioIntermediario = salarioHora*horasTrabalhadas;
			horasExtras = horasTrabalhadas-160;
		}
		ns.close();
	}

}
