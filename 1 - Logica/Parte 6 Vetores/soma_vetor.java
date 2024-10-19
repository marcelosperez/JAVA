import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
	    double soma;

	    System.out.print("Quantos numeros voce vai digitar? ");
	    n = sc.nextInt();

	    double[] vetor = new double[n];

		soma = 0;
	    for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
	        vetor[i] = sc.nextDouble();
			soma = soma + vetor[i];
	    }


		System.out.print("VALORES = ");

	    for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f  ", vetor[i]);
	    }

	    System.out.printf("\nSOMA = %.2f\n", soma);
	    System.out.printf("MEDIA = %.2f\n", soma/n);

		sc.close();
	}
}