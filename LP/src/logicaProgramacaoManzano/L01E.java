package logicaProgramacaoManzano;

import java.util.Scanner;

public class L01E {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int prestacao,valor,taxa,tempo;
		
		System.out.println("Digite o valor da compra");
		valor = ns.nextInt();
		System.out.println("Digite o tempo em atraso");
		tempo = ns.nextInt();
		System.out.println("Digite o valor da taxa de atraso");
		taxa = ns.nextInt();
		
		prestacao = (valor+(valor*taxa/100)*tempo);
		
		System.out.println("O valor da compra foi de: R$" + valor);
		System.out.println("O tempo em atraso foi de: " + tempo + " dias");
		System.out.println("O valor da taxa de atraso é de: R$"+ taxa);
		System.out.println("A prestação com juros calculados é de: "+ prestacao);
		ns.close();
	}
}
