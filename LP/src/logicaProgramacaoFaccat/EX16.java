package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX16 {
	
		public static void main(String[] args) {
			Scanner ns = new Scanner(System.in);
			double numMaca,precoMaca,totalCompra = 0;
			
			System.out.println("Digite o n�mero de ma�as que comprou: ");
			numMaca = ns.nextDouble();
			
			if(numMaca<=6) {
				precoMaca = 1.30;
				totalCompra = numMaca * precoMaca;
			}
			else{
				precoMaca = 1;
				totalCompra = numMaca * precoMaca;
			}
			
			System.out.printf("O pre�o total na compra de ma�as foi de: %.2f", totalCompra);
			ns.close();
	}

}
