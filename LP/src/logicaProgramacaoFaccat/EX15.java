package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX15 {
	
		public static void main(String[] args) {
			Scanner ns = new Scanner(System.in);
			double num1;
			
			System.out.println("Escreva um n�mero qualquer:");
			num1 = ns.nextDouble();
			
			if(num1>=0) {
				System.out.println("� POSITIVO");
			}
			else {
				System.out.println("� NEGATIVO");
			}
			ns.close();
		}

	}
