package logicaProgramacaoFaccat;

import java.util.Scanner;

public class Fibonacci {
	

    public static int[] calcularFibonacci(int n) {
        int[] valores = new int[n+1]; // array para armazenar os valores j� calculados
        for (int i = 0; i <= n; i++) {
            valores[i] = fibonacciRecursivo(i, valores); // chamamos a fun��o recursiva para cada n�mero da sequ�ncia
        }
        return valores;
    }

    public static int fibonacciRecursivo(int n, int[] valores) {
        // verificamos se � um dos casos base da sequ�ncia
        if (n == 0 || n == 1) {
            return n;
        }

        // verificamos se j� calculamos o valor antes
        if (valores[n] != 0) {
            return valores[n];
        }

        // calculamos o valor correspondente na sequ�ncia
        int resultado = fibonacciRecursivo(n-1, valores) + fibonacciRecursivo(n-2, valores);
        
        // armazenamos o valor calculado para evitar c�lculos repetidos
        valores[n] = resultado;

        return resultado;
    }

    public static void main(String[] args) {
    	Scanner ns = new Scanner(System.in);
        int n; // n�mero para calcular na sequ�ncia
        System.out.println("Digite o n�mero que deseja saber:");
        n=ns.nextInt();
        int[] resultado = calcularFibonacci(n); // chamamos a fun��o para calcular a sequ�ncia completa
        System.out.println("Sequ�ncia de Fibonacci at� o " + n + "� n�mero:");
        for (int i = 0; i <= n; i++) {
            System.out.print(resultado[i] + " "); // exibimos cada valor da sequ�ncia
        }
        ns.close();
    }
}
