package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX47 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        double valor1, valor2;

	        System.out.print("Informe o primeiro valor: ");
	        valor1 = sc.nextDouble();

	        System.out.print("Informe o segundo valor: ");
	        valor2 = sc.nextDouble();
	        System.out.println("-----------------------------");
	        if(valor2==0) {
				System.out.println("VALOR INVALIDO");
			}
	        
	        while (valor2 == 0) {
	            System.out.print("Informe outro valor: ");
	            valor2 = sc.nextDouble();
	            if(valor2==0) {
	            	System.out.println("-----------------------------");
					System.out.println("VALOR INVALIDO");
				}
	        }

	        double resultado = valor1 / valor2;
	        
	        System.out.println("-----------------------------");
	        System.out.printf("O resultado da divisao: %.2f", resultado);
	        sc.close();
	    }
	}

//Acrescentar  uma  mensagem  de 'VALOR  INV�LIDO'  no  exerc�cio  [45]  caso  o  segundo  valor informado seja ZERO. 