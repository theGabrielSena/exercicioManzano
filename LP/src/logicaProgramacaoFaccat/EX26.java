package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX26 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int quantidadeAtualEstoque,quantidadeMaxima,quantidadeMinima,media;
		
		System.out.println("Digite a quantidade atual de produtos no estoque: ");
		quantidadeAtualEstoque = ns.nextInt();
		System.out.println("Digite a quantidade m�xima permida desse produto no estoque: ");
		quantidadeMaxima = ns.nextInt();
		System.out.println("Digite a quantidade m�nima permida desse produto no estoque: ");
		quantidadeMinima = ns.nextInt();
		
		media = (quantidadeMaxima*2 + quantidadeMinima*3)/5;
		
		if(quantidadeAtualEstoque>=media) {
			System.out.println("N�o � necess�rio efetuar a compra, atualmente o estoque � est� com: "+quantidadeAtualEstoque);
		}
		else {
			System.out.println("� necess�rio efetuar a compra, atualmente o estoque � est� com: "+quantidadeAtualEstoque);
		}
		ns.close();
	}

}
