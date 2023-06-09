package logicaProgramacaoFaccat;

public class EX39 {
	    public static void main(String[] args) {
	        boolean A = true;
	        boolean B = true;
	        boolean C = false;

	        // Avaliando express�o (A e B) ou (A xou B)
	        boolean resultadoA = (A && B) || (A ^ B);
	        System.out.println("(A e B) ou (A xou B) = " + resultadoA);

	        // Avaliando express�o (A ou B) e (A e C)
	        boolean resultadoB = (A || B) && (A && C);
	        System.out.println("(A ou B) e (A e C) = " + resultadoB);

	        // Avaliando express�o A ou C e B xou A e n�o B
	        boolean resultadoC = A || (C && (B ^ (A && !B)));
	        System.out.println("A ou C e B xou A e n�o B = " + resultadoC);
	    }
	}

/*
Para A = V, B = V e C = F, qual o resultado da avalia��o das seguintes express�es:
a) (A e B) ou (A xou B)
b) (A ou B) e (A e C)
c) A ou C e B xou A e n�o B
*/