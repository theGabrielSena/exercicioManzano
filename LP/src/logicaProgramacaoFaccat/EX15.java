package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX15 {
	
		public static void main(String[] args) {
			Scanner ns = new Scanner(System.in);
			double num1;
			
			System.out.println("Escreva um número qualquer:");
			num1 = ns.nextDouble();
			
			if(num1>=0) {
				System.out.println("É POSITIVO");
			}
			else {
				System.out.println("É NEGATIVO");
			}
			ns.close();
		}

	}
