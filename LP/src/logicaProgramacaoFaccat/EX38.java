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
				System.out.println("Usu�rio inv�lido!");
			}
		}else {
			System.out.println("Usu�rio inv�lido!");
		}
		ns.close();
	}

}

/*Fa�a um algoritmo para ler um n�mero que � um c�digo de usu�rio. Caso este c�digo seja
diferente de um c�digo armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
mensagem �Usu�rio inv�lido!�. Caso o C�digo seja correto, deve ser lido outro valor que � a senha. Se
esta senha estiver incorreta (a certa � 9999) deve ser mostrada a mensagem �senha incorreta�. Caso a
senha esteja correta, deve ser mostrada a mensagem �Acesso permitido�.*/