package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX62 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		int num = 0;
		double media;
		
		System.out.println("Digite o numero de alunos na sala");
		int alunos = sc.nextInt();
		do {
		System.out.println("Digite a nota de cada um deles para realizar o calculo aritmetico");
		for (int i = 0;i < alunos;i++) {
			num = sc.nextInt();
			cont += num;
		}
		
		media = cont/10;
		}while(num<0||num>10);
		
		System.out.println("A media: "+media);
		
		sc.close();
	}
}

/*
Ler o n�mero de alunos existentes em uma turma e,
ap�s isto, ler as notas destes alunos, calcular
e escrever a m�dia aritm�tica dessas notas lidas.  
*/
