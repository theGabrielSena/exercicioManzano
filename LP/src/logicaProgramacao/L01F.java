package logicaProgramacao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class L01F {

	public static void main(String[] args) {
		Scanner ns = new Scanner (System.in);
		int numUmInt,numDoisInt,numTrocaInt;
		double numUmDouble,numDoisDouble,numTrocaDouble;
		String stringUm,stringDois,trocaString;
		
					String op[]= {"Inteiro","Double","String"};
					int ope = JOptionPane.showOptionDialog(null,"Escolha a opera��o" , "MENU",
							0, JOptionPane.QUESTION_MESSAGE, null, op, op);
					//------------------------------------------------------------
		
					if(ope==0) {
					System.out.println("Digite o primeiro n�mero");
					numUmInt = ns.nextInt();
					System.out.println("Digite o segundo n�mero");
					numDoisInt = ns.nextInt();
					
					numTrocaInt = numUmInt;
					numUmInt = numDoisInt;
					numDoisInt = numTrocaInt;
								
					System.out.println("O primeiro n�mero digitado: "+numUmInt);
					System.out.println("O segundo n�mero digitado: "+numDoisInt);
					}
					if(ope==1) {
					System.out.println("Digite o primeiro n�mero");
					numUmDouble = ns.nextDouble();
					System.out.println("Digite o segundo n�mero");
					numDoisDouble = ns.nextDouble();

					numTrocaDouble = numUmDouble;
					numUmDouble = numDoisDouble;
					numDoisDouble = numTrocaDouble;
					
					System.out.println("O primeiro n�mero digitado: "+numUmDouble);
					System.out.println("O segundo n�mero digitado: "+numDoisDouble);
					}
					if(ope==2) {
					System.out.println("Digite a primeira frase");
					stringUm = ns.next();
					System.out.println("Digite a segunda frase");
					stringDois = ns.next();
					
					trocaString = stringUm;
					stringUm = stringDois;
					stringDois = trocaString;
								
					System.out.println("A primeira frase: "+stringUm);
					System.out.println("A segunda frase: "+stringDois);
					}
		ns.close();
		}
	}

