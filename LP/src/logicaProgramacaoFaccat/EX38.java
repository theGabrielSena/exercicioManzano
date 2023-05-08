package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX38 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int loginLog=1234,senhaLog=9999,login,senha;
		
		System.out.println("Digite o seu login:");
		login = ns.nextInt();
		
		if(login==loginLog) {
			System.out.println("Digite sua senha:");
			senha = ns.nextInt();
			if(senha==senhaLog) {
				System.out.println("Acesso permitido");
			}
			else {
				System.out.println("Usuário inválido!");
			}
		}else {
			System.out.println("Usuário inválido!");
		}
		ns.close();
	}

}

/*Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se
esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a
senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.*/