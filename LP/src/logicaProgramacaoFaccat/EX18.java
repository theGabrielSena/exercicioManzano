package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX18 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int anoNascimento,anoVoto=2023,idade;
		
		System.out.println("Digite seu ano de nascimento");
		anoNascimento = ns.nextInt();
		
		idade = anoVoto-anoNascimento;
		
		if(idade>=18) {
			System.out.println("O seu voto é obrigatório");
		}
		/*else if(idade>=16){
			System.out.println("Você pode votar, porém não é obrigatório");
		}*/
		else {
			System.out.println("Você ainda não pode votar");
		}
		ns.close();
	}

}
