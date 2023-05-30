package Exercicio;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = comparar(a, b, c);
		
		mostrarResultado(maior);
		
		sc.close();
	}

	public static int comparar(int x, int y, int z) {
		int maior;
		
		if (x > y && x > z) {
			maior = x;
		} else if (y > z) {
			maior = y;
		} else {
			maior = z;
		}
		return maior;
	}

	public static void mostrarResultado(int valor) {
		System.out.println("Maior numero = " + valor);
	}
}