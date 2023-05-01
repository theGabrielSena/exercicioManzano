package logicaProgramacaoManzano;

import java.util.Scanner;

public class L02C {

	public static void main(String[] args) {
		Scanner ns = new Scanner (System.in);
		int candidatoA,candidatoB,candidatoC,votosN,votosB,votosV,totalEleitores,percentualValidos,percentualValidosA,percentualValidosB,percentualValidosC,percentualNulos,percentualBrancos;
		
		System.out.println("Digite a quantidade de votos do primeiro candidato");
		candidatoA = ns.nextInt();
		System.out.println("Digite a quantidade de votos do primeiro candidato");
		candidatoB = ns.nextInt();
		System.out.println("Digite a quantidade de votos do primeiro candidato");
		candidatoC = ns.nextInt();
		
		
		
		System.out.println("Digite a quantidade de votos brancos");
		votosB = ns.nextInt();
		System.out.println("Digite a quantidade de votos nulos");
		votosN = ns.nextInt();
		
		votosV = candidatoA+candidatoB+candidatoC;
		
		totalEleitores = votosV+votosN+votosB;
		
		percentualValidos = (100*votosV)/totalEleitores;
		
		percentualValidosA = (100*candidatoA)/totalEleitores;
		percentualValidosB = (100*candidatoB)/totalEleitores;
		percentualValidosC = (100*candidatoC)/totalEleitores;
		
		percentualNulos = (100*votosN)/totalEleitores;
		percentualBrancos = (100*votosB)/totalEleitores;
				
		System.out.println("A quantidade de eleitores foi de: " + totalEleitores + " pessoas");
		System.out.println("O percentual de votos válidos em relação à quantidade de eleitores: " + percentualValidos + "%");
		System.out.println("O percentual de votos  válidos  do  candidato  A  em  relação  à  quantidade  de eleitores: " + percentualValidosA + "%");
		System.out.println("O percentual de votos  válidos  do  candidato  B  em  relação  à  quantidade  de eleitores: " + percentualValidosB + "%");
		System.out.println("O percentual de votos  válidos  do  candidato  C  em  relação  à  quantidade  de eleitores: " + percentualValidosC + "%");
		System.out.println("O percentual correspondente de votos nulos em relação à quantidade de eleitores: " + percentualNulos + "%");
		System.out.println("O percentual correspondente de votos em branco em relação à quantidade de eleitores: " + percentualBrancos + "%");
		ns.close();
		}
}
