package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX37 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int quilosMaca,quilosMorango,quilosSoma;
		double precoMaca = 0, precoMorango = 0,desconto;
		
		System.out.println("Digite quantos quilos de morango deseja comprar:");
		quilosMorango = ns.nextInt();
		System.out.println("Digite quantos quilos de maça deseja comprar:");
		quilosMaca = ns.nextInt();
		
		quilosSoma = quilosMaca+quilosMorango;
		
		if(quilosMorango<=5) {
			precoMorango = 2.50;
			precoMorango = precoMorango * quilosMorango;
			
		}
		else if(quilosMorango>5) {
			precoMorango = 2.20;
			precoMorango = precoMorango * quilosMorango;
		}
		if(quilosMaca<=5) {
			precoMaca= 1.80;
			precoMaca = precoMaca * quilosMaca;
		}
		else if(quilosMaca>5){
			precoMaca = 1.50;
			precoMaca = precoMaca * quilosMaca;
		}
		double precoTotal=precoMaca+precoMorango;
		
		if(quilosSoma>8 || precoTotal>25) {
			desconto = precoTotal*10/100;
			precoTotal = precoTotal-desconto;
		}
		
		System.out.printf("O valor dos morangos ficou em: R$%.2f",precoMorango);
		System.out.printf(" e o valor das maças em: R$%.2f %n",precoMaca); 
		System.out.println("A quantidade de quilos comprados foi de: "+quilosSoma+" Kgs");
		System.out.printf("O valor total de compras foi de: R$%.2f",precoTotal);
		ns.close();
	}

}

/* Uma fruteira está vendendo frutas com a seguinte tabela de preços:
Até 5 Kg = Morango R$ 2,50 por Kg e Maçã R$ 1,80 por Kg
Acima de 5 Kg = Morango por R$ 2,20 por Kg e Maçã por R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
38) Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se
esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem*/
