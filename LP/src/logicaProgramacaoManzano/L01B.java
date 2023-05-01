package logicaProgramacaoManzano;

import java.util.Scanner;

public class L01B {

	public static void main(String[] args) {
		Scanner ns = new Scanner (System.in);
		double celsius,fahrenheit ;
		
		
		System.out.println("Digite a temperatura em graus Fahrenheit");
		fahrenheit = ns.nextInt();
		celsius = (fahrenheit-32)*5/9;
		
		System.out.printf("A temperatura é de %.3f %n",celsius,"ºC");
		ns.close();
	}
}
