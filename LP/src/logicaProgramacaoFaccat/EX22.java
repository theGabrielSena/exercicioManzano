package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX22 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		double horasTrabalhadas,salarioHora,salarioTotal,horasExtras,salarioHoraExtra1,salarioHoraExtra2,salarioHoraExtraTotal;
		
		System.out.println("Digite o valor do salário recebido por hora");
		salarioHora = ns.nextDouble();
		System.out.println("Digite o número de horas trabalhadas em um mês");
		horasTrabalhadas = ns.nextDouble();
		
		
		if(horasTrabalhadas<=160) {
			salarioTotal = salarioHora*horasTrabalhadas;
			System.out.println("O salário total do funcionário no mês é de: "+salarioTotal);
		}
		else {
			horasExtras = horasTrabalhadas-160;
			salarioHoraExtra1 = horasExtras*salarioHora;
			salarioHoraExtra2 = salarioHoraExtra1*50/100;
			salarioHoraExtraTotal = salarioHoraExtra1+salarioHoraExtra2;
			salarioTotal = salarioHora * 160 + salarioHoraExtraTotal;
			System.out.println("O salário final do funcionário é de: "+salarioTotal);
			
		}
		ns.close();
	}

}
