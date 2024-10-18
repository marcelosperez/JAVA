import java.lang.Math;
import java.util.Scanner;
import java.util.Locale;

public class Retangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Base do retangulo: ");
        double base = sc.nextDouble();
        System.out.print("Altura do retangulo: ");
        double alt = sc.nextDouble();

        double area = base * alt;
        double per = 2 * base + 2 * alt;
        double diag = Math.sqrt(base * base + alt * alt);

        System.out.printf("Area = %.4f\n", area);
        System.out.printf("Preço = %.4f\n", per);
        System.out.printf("Diagonal = %.4f\n", diag);

        sc.close();

    }
}