package logicaProgramacaoFaccat;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EX23 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		String nome;
		double altura,pesoIdeal;
		
		String op[]= {"Masculino","Femino"};
		int ope = JOptionPane.showOptionDialog(null,"Escolha seu sexo" , "MENU",
				0, JOptionPane.QUESTION_MESSAGE, null, op, op);
		
		System.out.println("Digite seu nome:");
		nome = ns.next();
		System.out.println("Digite sua altura");
		altura = ns.nextDouble();
		

		
		if(ope == 0) {
			pesoIdeal = (72.1 * altura) - 58;
			System.out.printf("Olá, "+nome+" seu peso ideal seria: %.2f",pesoIdeal);
		}
		if(ope == 1) {
			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.printf("Olá,"+nome+" seu peso ideal seria: %.2f",pesoIdeal);
		}
		ns.close();
	}

}
