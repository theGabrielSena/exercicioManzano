package logicaProgramacaoFaccat;

import javax.swing.JOptionPane;

public class EX35 {
	public static void main(String[] args) {
		double r = 0,litrosAlcool = 0, litrosGasolina = 0,descontoA = 0,descontoG = 0, valorA = 2.90 ,valorG = 3.30;
		
		while(r==0) {
			String op[]= {"Álcool","Gasolina"};
			int ope = JOptionPane.showOptionDialog(null,"Escolha a operação" , "MENU",
					0, JOptionPane.QUESTION_MESSAGE, null, op, op);
			if (ope==0 || ope==1) {	
					
						if(ope==0) {
							litrosAlcool = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantidade de litros abastecidos", "Litros Álcool", 
							JOptionPane.QUESTION_MESSAGE));
							if(litrosAlcool<=20) {
								descontoA = litrosAlcool*3/100;
							}
							else {
								descontoA = litrosAlcool*5/100;
							}
							valorA = valorA*litrosAlcool-descontoA;
							System.out.printf("O valor pago pelo cliente em "+litrosAlcool+ " litros de Álcool, foi de: R$%.2f %n",valorA);
						}
						if(ope==1) {
							litrosGasolina = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de litros abastecidos", "Litros Gasolina", 
							JOptionPane.QUESTION_MESSAGE));
							if(litrosGasolina<=20) {
								descontoG = litrosGasolina*4/100;
							}
							else {
								descontoG = litrosGasolina*6/100;
							}
							valorG = valorG*litrosGasolina-descontoG;
							System.out.printf("O valor pago pelo cliente em "+litrosGasolina+" litros de Gasolina, foi de: R$%.2f %n",valorG);
						}
			}
		}
	}
}