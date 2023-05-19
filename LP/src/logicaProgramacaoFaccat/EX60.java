package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX60 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contIntervalo=0;
		int contFora=0;
		
		System.out.println("Digite 10 valores");
		
		for (int i = 1; i <= 10; i++) {
			int num = sc.nextInt();
			if(num>=10 && num<=20) {
				contIntervalo++;
			}else {
				contFora++;
			}
		}
		
		System.out.println(contIntervalo+" desses valores estao no intervalo e "+contFora+" nao estao");
		
		sc.close();
	}
}

/*
 Ler  10  valores  e  escrever  quantos  desses
 valores  lidos  estão  no  intervalo  [10,20]
 (inlcuindo  os valores 10 e 20 no intervalo)
 e quantos deles estão fora deste intervalo. 
*/
