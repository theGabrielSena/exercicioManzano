package logicaProgramacao;

import java.util.Scanner;

public class L01C {

	public static void main(String[] args) {
		Scanner ns = new Scanner (System.in);
		double volume,raio,altura;
		
		System.out.println("Digite o raio da lata de �leo");
		raio = ns.nextInt();
		System.out.println("Digite a altura da lata de �leo");
		altura = ns.nextInt();
		
		volume = 3.14159*Math.pow(raio, 2)*altura;
		
		System.out.println("O volume da lata de �leo �: " + volume);
		ns.close();
	}
}
