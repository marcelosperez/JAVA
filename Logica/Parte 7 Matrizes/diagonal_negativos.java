

import java.util.Locale;
import java.util.Scanner;

public class diagonal_negativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
	    int n = sc.nextInt();

	    int[][] mat = new int[n][n];

		for (int i=0; i<mat.length; i++){
			for (int j=0; j<mat.length; j++){
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Diagonal principal: ");

		for (int i=0; i<mat.length; i++){
			System.out.print(mat[i][i] + " ");
		}

		int neg = 0;
		for (int i=0; i<mat.length; i++){
			for (int j=0; j<mat.length; j++){
				if (mat[i][j]<0){
					neg++;
				}
				
			}
		}

		System.out.println();

		System.out.println("Quantidade de negativos: " + neg);

	

		sc.close();
	}
}
