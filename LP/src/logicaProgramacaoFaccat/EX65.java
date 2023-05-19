package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX65 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1,num2,cont=0;
		
        System.out.println("Digite o primeiro valor: ");
        num1 = sc.nextInt();
        do {
        System.out.println("Digite o segundo valor: ");
        num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            cont += i;
        }
        }while(num2>=num1);
        
        System.out.println("Soma dos inteiros entre " + num1 + " e " + num2 + ": " + cont);

        sc.close();
	}
}

/*
Ler 2 valores, calcular e escrever a soma dos inteiros existentes entre os 2 valores lidos
(incluindo os valores lidos na soma).
Considere que o segundo valor lido será sempre maior que o primeiro valor lido 
*/
