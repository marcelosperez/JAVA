package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		double lado1x, lado2x, lado3x, lado1y, lado2y, lado3y;

		System.out.print("Lado1 do Triangulo X : ");
		lado1x = sc.nextDouble();
		x.set_a(lado1x);
		System.out.print("Lado2 do Triangulo X : ");
		lado2x = sc.nextDouble();
		x.set_b(lado2x);
		System.out.print("Lado3 do Triangulo X : ");
		lado3x = sc.nextDouble();
		x.set_c(lado3x);

		System.out.print("Lado1 do Triangulo Y : ");
		lado1y = sc.nextDouble();
		y.set_a(lado1y);
		System.out.print("Lado2 do Triangulo Y : ");
		lado2y = sc.nextDouble();
		y.set_b(lado2y);
		System.out.print("Lado3 do Triangulo Y : ");
		lado3y = sc.nextDouble();
		y.set_c(lado3y);
		
		double areaX = x.area();
		double areaY = y.area();

		if (lado1x < lado2x + lado3x && lado2x < lado1x + lado3x && lado3x < lado1x + lado2x) {
			if (lado1y < lado2y + lado3y && lado2y < lado1y + lado3y && lado3y < lado1y + lado2y) {
				
				System.out.println("Triangle X area:  = " + String.format("%.4f", x.area()));
				System.out.println("Triangle Y area:  = " + String.format("%.4f", y.area()));

				if (areaX > areaY) {
					System.out.println("Larger area: X");
				} else {
					System.out.println("Larger area: Y");
				}

			} 
			else 
			{
				System.out.println("Valores invalidos ! Um lado deve ser menor que a soma dos outros dois !");
            }  
		}

		sc.close();
	}
}