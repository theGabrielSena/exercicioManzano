package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX41 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = ns.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double nota2 = ns.nextDouble();
		
		System.out.println("Digite a terceira nota:");
		double nota3 = ns.nextDouble();
		
		System.out.println("Informe a media dos exercicios: ");
        double mediaExercicios = ns.nextDouble();
        		
		double mediaAproveitamento = (nota1+nota2*2+nota3*3+mediaExercicios)/7;
		
		System.out.println("--------------------------------------------");
		System.out.printf("Media de aproveitamento: %.2f\n", mediaAproveitamento);

	        if (mediaAproveitamento >= 9.0) {
	            System.out.println("Conceito: A");
	        } else if (mediaAproveitamento >= 7.5) {
	            System.out.println("Conceito: B");
	        } else if (mediaAproveitamento >= 6.0) {
	            System.out.println("Conceito: C");
	        } else {
	            System.out.println("Conceito: D");
	        }

		ns.close();
	}
}

/*  Faça  um  algoritmo  para  ler
   as  3  notas  obtidas  por  um  aluno  nas  3 verificações
   e  a  média  dos exercícios que fazem parte da avaliação. 
   Calcular a média de aproveitamento, usando a fórmula abaixo 
   e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:
*/ 
