package logicaProgramacao;

import java.util.Scanner;

public class L01H {

	public static void main(String[] args) {
		Scanner ns = new Scanner (System.in);
		double volume,comprimento,largura,altura;
		
		System.out.println("Digite o comprimento da caixa");
		comprimento = ns.nextDouble();
		System.out.println("Digite a largura da caixa");
		largura = ns.nextDouble();
		System.out.println("Digite a altura da caixa");
		altura = ns.nextDouble();
		
		volume = comprimento*largura*altura;
		
		System.out.println("O volume da caixa é: "+ volume + " litros");
		ns.close();
	}

}
