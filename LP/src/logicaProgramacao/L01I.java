package logicaProgramacao;

import java.util.Scanner;

public class L01I {

	public static void main(String[] args) {
		Scanner ns = new Scanner (System.in);
		int numA,numB;
		double diferenca = 0;
		
		System.out.println("Digite o primeiro número:");
		numA= ns.nextInt();
		System.out.println("Digite o segundo número:");
		numB= ns.nextInt();
		
		if(numA>numB) {
			diferenca = numA - numB;
		}
		else if(numA<numB){
			diferenca = numB - numA;	
		}
		else {
			System.out.println("Os números são iguais");
		}
		
		diferenca = Math.pow(diferenca, 2);
		
		System.out.println("A diferença dos números é: "+diferenca);
		ns.close();
	}

}
