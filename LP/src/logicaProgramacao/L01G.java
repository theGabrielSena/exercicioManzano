package logicaProgramacao;

import java.util.Scanner;

public class L01G {

	public static void main(String[] args) {
		Scanner ns = new Scanner (System.in);
		int num1,num2,num3,num4;
		int somaAB,somaAC,somaAD,somaBC,somaBD,somaCD;
		int multAB,multAC,multAD,multBC,multBD,multCD;
		
		System.out.println("Digite o primeiro número: ");
		num1 = ns.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = ns.nextInt();
		System.out.println("Digite o terceiro número: ");
		num3 = ns.nextInt();
		System.out.println("Digite o quarto número: ");
		num4 = ns.nextInt();
/*-----------SOMA----------*/
		somaAB = num1+num2;
		somaAC = num1+num3;
		somaAD = num1+num4;
		somaBC = num2+num3;
		somaBD = num2+num4;
		somaCD = num3+num4;
/*-------MULTIPLICAÇÃO-------*/
		multAB = num1*num2;
		multAC = num1*num3;
		multAD = num1*num4;
		multBC = num2*num3;
		multBD = num2*num4;
		multCD = num3*num4;
/*---------------------------*/
		System.out.println("----------SOMA----------");
		System.out.println("A + B = " +somaAB);
		System.out.println("A + C = " +somaAC);
		System.out.println("A + D = " +somaAD);
		System.out.println("B + C = " +somaBC);
		System.out.println("B + D = " +somaBD);
		System.out.println("C + D = " +somaCD);
		System.out.println("-----MULTIPLICAÇÃO------");
		System.out.println("A * B = " +multAB);
		System.out.println("A * C = " +multAC);
		System.out.println("A * D = " +multAD);
		System.out.println("B * C = " +multBC);
		System.out.println("B * D = " +multBD);
		System.out.println("C * D = " +multCD);
		ns.close();
	}

}
