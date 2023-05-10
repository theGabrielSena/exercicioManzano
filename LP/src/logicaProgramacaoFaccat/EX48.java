package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX48 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double nota1,nota2,media;
	        
	        System.out.println("Digite a nota da primeira avaliacao");
	        nota1=sc.nextDouble();
	        System.out.println("Digite a nota da segunda avaliacao");
	        nota2=sc.nextDouble();

	        while((nota1 < 0 || nota1 > 10)||(nota2 < 0 || nota2 > 10)) {
	        	System.out.println("Digite a nota da primeira avaliacao");
		        nota1=sc.nextDouble();
		        System.out.println("Digite a nota da segunda avaliacao");
		        nota2=sc.nextDouble();
	        }
	        
	        
	        media=(nota1*2+nota2*3)/5;
	        
	        System.out.printf("A media foi de: %.2f\n",media);
	        
	        sc.close();
	}
}

/*Escreva  um  algoritmo  para  ler  as  notas  da  1a.  e  2a.
  avaliações  de um  aluno,  calcule  e  imprima  a média (simples)
  desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.
*/
