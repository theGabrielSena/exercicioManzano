package logicaProgramacao;

import java.util.Scanner;

public class L01D {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int tempo,velocidade,distancia,litros_usados;
		
		System.out.println("Digite o tempo gasto na viagem");
		tempo = ns.nextInt();
		System.out.println("Digite  a velocidade m�dia na viagem");
		velocidade = ns.nextInt();
		
		distancia = tempo * velocidade;
		litros_usados = distancia/12;
		
		System.out.println("A velocidade m�dia na viagem foi: " + velocidade +" quil�metros por hora");
		System.out.println("O tempo gasto na viagem foi: " + tempo + " hora/s");
		System.out.println("A dist�ncia foi de: "+ distancia + " quil�metros");
		System.out.println("E a quantidade de litros foi de: "+ litros_usados + " L");
		ns.close();
	}
}
