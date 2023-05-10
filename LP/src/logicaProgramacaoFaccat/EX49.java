package logicaProgramacaoFaccat;

import javax.swing.JOptionPane;

public class EX49 {

	private static int ope;

	public static void main(String[] args) {
		
		double nota1,nota2,media;
		String op[]= {"Sim","Nao"};
		
		do {
			
		 nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira avaliacao: "));
		
		 nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda avaliacao: "));
		
		while((nota1 < 0 || nota1 > 10)||(nota2 < 0 || nota2 > 10)) {
			 nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira avaliacao: "));
			 
			 nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda avaliacao: "));
        }
		
		 media=(nota1*2+nota2*3)/5;
		 
		 JOptionPane.showMessageDialog(null,"A media foi de: "+media);
		 
		 int ope = JOptionPane.showOptionDialog(null,"Deseja realizar um novo calculo? " , "MENU",
					0, JOptionPane.QUESTION_MESSAGE, null, op, op);
		 if(ope==1) {
			 System.exit(0);
		 }
		 
		} while(ope==0);
	}
}

/*Acrescente  uma  mensagem 'NOVO  CÁLCULO  (S/N)?'ao  final  do  exercício  [48].  
  Se  for respondido 'S' deve retornar e executar um novo cálculo,
  caso contrário deverá encerrar o algoritmo. 
*/
