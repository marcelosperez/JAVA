import java.util.Scanner;
import java.util.Locale;

public class Terreno {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

       System.out.print("Digite a largura do terreno: ");  
       double larg = sc.nextDouble();
       System.out.print("Digite o comprimento do terreno: ");
       double comp = sc.nextDouble();
       System.out.print("Digite o valor do metro quadrado: ");
       double valor = sc.nextDouble();

       double area = larg * comp;
       double preco = valor * area;


       System.out.printf("Area do terreno = %.2f\n", area);
       System.out.printf("Preco do terreno = %.2f\n", preco);

       sc.close();


    }
}