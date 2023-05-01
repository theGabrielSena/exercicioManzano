package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX20 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int num1,num2;
		
		System.out.println("Digite o primeiro número");
		num1 = ns.nextInt();
		System.out.println("Digite o segundo número");
		num2 = ns.nextInt();
		
		if(num1>num2){
			System.out.println("A sequênia numérica é: "+num2+" , " +num1);
		}
		else if(num2>num1){
			System.out.println("A sequênia numérica é: "+num1+" , " +num2);
		}
		else {
			System.out.println("Os número são iguais");
		}
		ns.close();
	}

}