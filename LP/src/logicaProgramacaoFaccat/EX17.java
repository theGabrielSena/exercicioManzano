package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX17 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		double nota1,nota2,media;
		
		System.out.println("Digite a nota da primeira avalia��o:");
		nota1 = ns.nextDouble();
		System.out.println("Digite a nota da segunda avalia��o:");
		nota2 = ns.nextDouble();
		
		media = (nota1*2+nota2*3)/5;
		
		if(media>=6) {
			System.out.println("O aluno foi aprovado com a m�dia de: "+ media +" pontos");
		}
		/*else if(media>=5){
			System.out.println("O aluno foi aprovado pelo conselho com: "+ media +" pontos");
		}*/
		else {
			System.out.println("O aluno n�o alcan�ou a m�dia e foi reprovado com: "+ media +" pontos");
		}
		ns.close();
	}
}
