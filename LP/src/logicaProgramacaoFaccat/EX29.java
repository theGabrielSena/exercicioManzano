package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX29 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int num1,num2,num3,soma;
		
		System.out.println("Digite o primeiro n�mero:");
		num1 = ns.nextInt();
		System.out.println("Digite o segundo n�mero:");
		num2 = ns.nextInt();
		System.out.println("Digite o terceiro n�mero:");
		num3 = ns.nextInt();
		
		if(num1>num2 && num1>num3 || num2>num1 && num2>num3) {
			soma=num1+num2;
			System.out.println(soma);
		}
		else if(num1>num3 && num1>num2 || num3>num1 && num3>num2) {
			soma=num1+num3;
			System.out.println(soma);
		}
		else if(num2>num1 && num2>num3 || num3>num1 && num3>num2) {
			soma=num2+num3;
			System.out.println(soma);
		}
		else if(num2>num3 && num2>num1 || num1>num2 && num1>num3) {
			soma=num2+num1;
			System.out.println(soma);
		}
		else if(num3>num1 && num3>num2 || num2>num1 && num2>num3 ) {
			soma=num3+num2;
			System.out.println(soma);
		}
		else if(num3>num2 && num3>num1 || num1>num2 && num1>num3 ){
			soma=num3+num1;
			System.out.println(soma);
		}
		ns.close();
	}

}
