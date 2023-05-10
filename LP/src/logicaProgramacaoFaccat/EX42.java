package logicaProgramacaoFaccat;

import javax.swing.JOptionPane;


public class EX42 {

	public static void main(String[] args) {
		
		int idFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu codigo na empresa:"));
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
		int tempoTrabalho = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que ingressou na empresa: "));
		int anoAtual = 2023;
		String op[]= {"Requerer Aposentadoria","Nao Requerer"};
		
		idade = anoAtual-idade;
		tempoTrabalho = anoAtual-tempoTrabalho;
		
		if(idade>=65) {
			int ope = JOptionPane.showOptionDialog(null,"Ola, funcionario de codigo "+ idFuncionario + "\nFelizmente, voce ja pode solicitar sua aposentadoria por ter "+ idade +" anos" , "MENU",
					0, JOptionPane.QUESTION_MESSAGE, null, op, op);
			if(ope==0) {
				JOptionPane.showMessageDialog(null,"Muito bem, voce esta na fila para se aposentar");
			}
			if(ope==1) {
				JOptionPane.showMessageDialog(null,"Entendido, volte novamente quanto resolver solicitar");
			}
		}else if(tempoTrabalho>=30) {
			int ope = JOptionPane.showOptionDialog(null,"Ola, funcionario de codigo "+ idFuncionario + "\nFelizmente, voce ja pode solicitar sua aposentadoria por ter "+ tempoTrabalho +" anos na empresa" , "MENU",
					0, JOptionPane.QUESTION_MESSAGE, null, op, op);
			if(ope==0) {
				JOptionPane.showMessageDialog(null,"Muito bem, voce esta na fila para se aposentar");
			}
			if(ope==1) {
				JOptionPane.showMessageDialog(null,"Entendido, volte novamente quanto resolver solicitar");
			}
		}else if(idade>=60 && tempoTrabalho>=25) {
			int ope = JOptionPane.showOptionDialog(null,"Ola, funcionario de codigo "+ idFuncionario + "\nFelizmente, voce ja pode solicitar sua aposentadoria por ter "+ idade +" anos e "+ tempoTrabalho +" anos na empresa" , "MENU",
					0, JOptionPane.QUESTION_MESSAGE, null, op, op);
			if(ope==0) {
				JOptionPane.showMessageDialog(null,"Muito bem, voce esta na fila para se aposentar");
			}
			if(ope==1) {
				JOptionPane.showMessageDialog(null,"Entendido, volte novamente quanto resolver solicitar");
			}
			
		}else {
			JOptionPane.showMessageDialog(null,"Voce ainda nao pode se aposentar, por ainda ter "+ idade +" anos e "+ tempoTrabalho +" anos na empresa");
		}
	}
}

/*
 Uma empresa quer verificar se um empregado est� qualificado
 para a aposentadoria ou n�o. Para estar em condi��es,
 um dos seguintes requisitos deve ser satisfeito:
 	- Ter no m�nimo 65 anos de idade.
 	- Ter trabalhado no m�nimo 30 anos.
   	- Ter no m�nimo 60 anos  e ter trabalhado no m�nimo 25 anos. 
 Com base nas informa��es acima, fa�a um algoritmo
 que leia: o n�mero do empregado (c�digo),
 o ano de seu nascimento e o ano de seu
 ingresso na empresa. O programa dever�
 escrever a idade e o tempo de trabalho
 do empregado e a mensagem
 'Requerer aposentadoria'  ou  'N�o requerer'.
 
  
  
  
  
  
  
 */
