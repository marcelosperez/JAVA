import java.util.Locale;
import java.util.Scanner;

/*
Para resolver esse exercício podemos dar uma olhada no conceito de formação das matrizes:
Considerando uma matriz de ordem 3
A11 A12 A13
A21 A22 A23
A31 A32 A33
Reparando que a diagonal é dada por Aij quando i=J
A11 A22 A33
Podemos considerar que quando j>i os números estarão acima da diagonal
A12 A13 A23
E que quando i<j os números estarão abaixo da diagonal
*/

public class acima_diagonal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, somaAcima;

	    System.out.print("Qual a ordem da matriz? ");
	    n = sc.nextInt();

	    int[][] matriz = new int[n][n];

	    for (int i=0; i<n; i++) {
	        for (int j=0; j<n; j++) {
	        	System.out.printf("Elemento [%d,%d]: ", i, j);
	            matriz[i][j] = sc.nextInt();
	        }
	    }

		somaAcima = 0;
	    for (int i=0; i<n; i++) {
	        for (int j=0; j<n; j++) {
	            // ou if (j > i) {
	            if (i < j) {
	                somaAcima = somaAcima + matriz[i][j];
	            }
	        }
	    }

	    System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d\n", somaAcima);

		sc.close();
	}
}
