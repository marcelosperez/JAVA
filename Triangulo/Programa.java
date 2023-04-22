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
		
		 int invalidoX = 0;
         int invalidoY = 0;

		System.out.print("Lado1 do Triangulo X : ");
		lado1x = sc.nextDouble();
		x.SetA(lado1x);
		System.out.print("Lado2 do Triangulo X : ");
		lado2x = sc.nextDouble();
		x.SetB(lado2x);
		System.out.print("Lado3 do Triangulo X : ");
		lado3x = sc.nextDouble();
		x.SetC(lado3x);
		
		System.out.println(); // blank line

        if (lado1x > lado2x + lado3x || lado2x > lado1x + lado3x || lado3x > lado1x + lado2x)
        {
             System.out.println("Valores do Triangulo X invalidos !");
             System.out.println("Um lado não pode ser maior que a soma dos outros dois ");
             System.out.println(" "); // blank line
             invalidoX = 1;
        }


		System.out.print("Lado1 do Triangulo Y : ");
		lado1y = sc.nextDouble();
		y.SetA(lado1y);
		System.out.print("Lado2 do Triangulo Y : ");
		lado2y = sc.nextDouble();
		y.SetB(lado2y);
		System.out.print("Lado3 do Triangulo Y : ");
		lado3y = sc.nextDouble();
		y.SetC(lado3y);
		
		System.out.println(); // blank line
		
		if (lado1y > lado2y + lado3y || lado2y > lado1y + lado3y || lado3y > lado1y + lado2y)
        {
             System.out.println("Valores do Triangulo Y invalidos !");
             System.out.println("Um lado não pode ser maior que a soma dos outros dois ");
             System.out.println(" "); // blank line
             invalidoX = 1;
        }
	
		double areaX = x.Area();
        double areaY = y.Area();

        double perX = x.Perimetro();
        double perY = y.Perimetro();
		
       if (invalidoX == 0)
       {
            System.out.println("Perimetro de X = " + String.format("%.4f", perX));
            System.out.println("Área de X = " + String.format("%.4f", areaX));		
            System.out.println(); // blank line
        }

       if (invalidoY == 0)
       {
            System.out.println("Perimetro de Y = " + String.format("%.4f", perY));
            System.out.println("Área de Y = " + String.format("%.4f", areaY));		
            System.out.println(); // blank line
        }

      if (invalidoX == 0 && invalidoY == 0)
       {
           if (areaX > areaY)
            {
                System.out.println("X tem a maior area ");
                System.out.println(); // blank line
            }
            else
            {
                System.out.println("Y tem a maior area ");
                System.out.println(); // blank line
            }
	

		sc.close();
	}
}