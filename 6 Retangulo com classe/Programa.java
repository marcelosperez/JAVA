


//--------> JAVA

import java.util.Scanner;

//--------> JAVA

public class Programa {
	
  public static void main (String[ ] args) {
	  
    double larg, alt;
	
	Scanner sc = new Scanner (System.in);
	
    Retangulo retangulo = new Retangulo();

    System.out.print("Digite a largura:");
	larg = sc.nextDouble();
	retangulo.SetLargura(larg);
    
    System.out.print("Digite a altura:");
    alt = sc.nextDouble();
    retangulo.SetAltura(alt);
    
	System.out.println("A largura eh: " + retangulo.GetLargura() );
    
    System.out.println(); // blank line
    
	System.out.println("A altura eh: " + retangulo.GetAltura() );

    System.out.println(); // blank line
    
	sc.close();
 }
}