package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX20 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int num1,num2;
		
		System.out.println("Digite o primeiro n�mero");
		num1 = ns.nextInt();
		System.out.println("Digite o segundo n�mero");
		num2 = ns.nextInt();
		
		if(num1>num2){
			System.out.println("A sequ�nia num�rica �: "+num2+" , " +num1);
		}
		else if(num2>num1){
			System.out.println("A sequ�nia num�rica �: "+num1+" , " +num2);
		}
		else {
			System.out.println("Os n�mero s�o iguais");
		}
		ns.close();
	}

}