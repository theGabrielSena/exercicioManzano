package logicaProgramacao;

import java.util.Scanner;

public class L01I {

	public static void main(String[] args) {
		Scanner ns = new Scanner (System.in);
		int numA,numB;
		double diferenca = 0;
		
		System.out.println("Digite o primeiro n�mero:");
		numA= ns.nextInt();
		System.out.println("Digite o segundo n�mero:");
		numB= ns.nextInt();
		
		if(numA>numB) {
			diferenca = numA - numB;
		}
		else if(numA<numB){
			diferenca = numB - numA;	
		}
		else {
			System.out.println("Os n�meros s�o iguais");
		}
		
		diferenca = Math.pow(diferenca, 2);
		
		System.out.println("A diferen�a dos n�meros �: "+diferenca);
		ns.close();
	}

}
