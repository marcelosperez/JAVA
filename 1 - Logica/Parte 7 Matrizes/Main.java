import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a ordem da matriz? : ");
		int n = sc.nextInt();
		
		double [][] mat = new double[n][n];

		System.out.println();

		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat.length; j++){
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextDouble();
			}
		}

		System.out.println();

        System.out.printf("A matriz digitada foi %n");

		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat.length; j++){
				System.out.print(mat[i][j] + " ");				
			}
			System.out.println();
		}

        System.out.println();

		double soma = 0;
		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat.length; j++){
				if (mat[i][j] > 0) {
					soma = soma + mat[i][j];
				}			
			}
		}

        System.out.printf("Soma dos elementos positivos = %.1f%n%n", soma);

        System.out.print("Escolha uma linha: ");
        int L = sc.nextInt();

		for(int i=0; i<mat.length; i++){
			System.out.print(mat[L][i] + " ");			
		}


		System.out.printf("%n%n");

        System.out.print("Escolha uma coluna: ");
        int C = sc.nextInt();
		
		for(int i=0; i<mat.length; i++){
			System.out.print(mat[i][C] + " ");			
		}

		System.out.printf("%n%n");

		System.out.printf("Diagonal principal: %n");

		for(int i=0; i<mat.length; i++){
				System.out.print(mat[i][i] + " ");			
		}


		System.out.printf("%n%n");



		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat.length; j++){
				if (mat[i][j] < 0) {
                   mat[i][j] = mat[i][j] * mat[i][j];
				}			
			}
		}

		System.out.println("Matriz alterada: ");

		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat.length; j++){
				System.out.print(mat[i][j] + " ");				
			}
			System.out.println();
		}

		System.out.printf("%n");

		System.out.println("Acima da diagonal: ");

		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat.length; j++){
				if (i<j) {
					System.out.println(mat[i][j] + "");
				}			
			}
		}

		sc.close();

		
	}
}
