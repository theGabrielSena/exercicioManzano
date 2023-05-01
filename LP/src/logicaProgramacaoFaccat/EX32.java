package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX32 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		String timeA,timeB;
		int golA,golB;
		
		System.out.println("Digite o nome do time da casa:");
		timeA = ns.nextLine();
		System.out.println("Digite o nome do time visitante:");
		timeB = ns.nextLine();
		
		System.out.println("Digite a quantidade de gols do time da casa:");
		golA = ns.nextInt();
		System.out.println("Digite a quantidade de gols do time visitante:");
		golB = ns.nextInt();
		
		
		
		if(golA==golB) {
			System.out.println("A partida entre " +timeA+" e " +timeB+ " terminou empatata em: "+golA+" a "+golB);
		}else if(golA>golB){
			System.out.println("O "+timeA+ " ganhou em casa, pelo placar de: "+golA+" a "+golB+" contra o "+timeB);
		}else {
			System.out.println("O "+timeB+ " ganhou fora de casa, pelo placar de: "+golB+" a "+golA+" contra o "+timeA);
		}
		ns.close();
	}

}
