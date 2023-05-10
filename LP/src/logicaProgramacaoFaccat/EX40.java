package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX40 {

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        System.out.print("Informe a descricao do produto: ");
        String descricao = ns.nextLine();

        System.out.print("Informe a quantidade adquirida: ");
        int quantidade = ns.nextInt();

        System.out.print("Informe o preco unitario: R$ ");
        double precoUnitario = ns.nextDouble();

        double total = quantidade * precoUnitario;
        double desconto = 0.0;

        if (quantidade <= 5) {
            desconto = total*2/100;
        } else if (quantidade <= 10) {
            desconto = total*3/100;
        } else {
            desconto = total*5/100;
        }

        double totalAPagar = total - desconto;

        System.out.println("-----------------------------------");
        System.out.println("Descricao do produto: " + descricao);
        System.out.println("Quantidade adquirida: " + quantidade);
        System.out.printf("Preco unitario: R$ %.2f\n", precoUnitario);
        System.out.printf("Total: R$ %.2f\n", total);
        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Total a pagar: R$ %.2f\n", totalAPagar);

        ns.close();
    }
}

/* Faça  um  algoritmo  para  ler:  a  
descrição  do  produto  (nome),  a  
quantidade  adquirida  e  o  preço unitário.
Calcular e escrever o total 
(total = quantidade adquirida * preço unitário),
o desconto e o total a pagar (total a pagar = total - desconto),
sabendo-se que: 
- Se quantidade  <= 5  o desconto será de 2% 
- Se quantidade  > 5 e  quantidade  <=10  o desconto será de 3% 
- Se quantidade  >  10 o desconto será de 5%
*/ 