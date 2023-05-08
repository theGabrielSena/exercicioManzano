package logicaProgramacao;

import java.util.Scanner;

public class L01A {

	public static void main(String[] args) {
		Scanner ns = new Scanner (System.in);
		double celsius,fahrenheit ;
		
		
		System.out.println("Digite a temperatura em graus Celsius");
		celsius = ns.nextInt();
		fahrenheit = (9*celsius+160)/5;
		
		System.out.printf("A temperatura é de %.2f %n",fahrenheit,"ºF");
		ns.close();
	}
}
