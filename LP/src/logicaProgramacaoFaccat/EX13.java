package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX13 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		double nota1,nota2,nota3,media;
		
		
		System.out.println("Digite a primeira nota: ");
		nota1 = ns.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = ns.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = ns.nextDouble();
		
		media = (nota1*2+nota2*3+nota3*5)/10;
		
		System.out.println("A média de notas é: " + media);
		ns.close();
	}

}
