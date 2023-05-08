package logicaProgramacaoFaccat;

import java.util.Scanner;

public class Fibonacci {
	

    public static int[] calcularFibonacci(int n) {
        int[] valores = new int[n+1]; // array para armazenar os valores já calculados
        for (int i = 0; i <= n; i++) {
            valores[i] = fibonacciRecursivo(i, valores); // chamamos a função recursiva para cada número da sequência
        }
        return valores;
    }

    public static int fibonacciRecursivo(int n, int[] valores) {
        // verificamos se é um dos casos base da sequência
        if (n == 0 || n == 1) {
            return n;
        }

        // verificamos se já calculamos o valor antes
        if (valores[n] != 0) {
            return valores[n];
        }

        // calculamos o valor correspondente na sequência
        int resultado = fibonacciRecursivo(n-1, valores) + fibonacciRecursivo(n-2, valores);
        
        // armazenamos o valor calculado para evitar cálculos repetidos
        valores[n] = resultado;

        return resultado;
    }

    public static void main(String[] args) {
    	Scanner ns = new Scanner(System.in);
        int n; // número para calcular na sequência
        System.out.println("Digite o número que deseja saber:");
        n=ns.nextInt();
        int[] resultado = calcularFibonacci(n); // chamamos a função para calcular a sequência completa
        System.out.println("Sequência de Fibonacci até o " + n + "º número:");
        for (int i = 0; i <= n; i++) {
            System.out.print(resultado[i] + " "); // exibimos cada valor da sequência
        }
        ns.close();
    }
}
