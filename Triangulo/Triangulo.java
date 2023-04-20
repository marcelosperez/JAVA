package entities;

public class Triangulo {
	    private double a;
	    private double b;
	    private double c;

	    public double get_a() {
		     return a;
	    }

	    public void set_a(double a) {
		     this.a = a;
	    }

	    public double get_b() {
	     	return b;
	    }

	    public void set_b(double b) {
		     this.b = b;
	    }

	    public double get_c() {
		     return c;
	    }

	    public void set_c(double c) {
		     this.c = c;
	    }

	    public double perimetro() {
	     	return a + b + c;
	    }
	    
	    public double area() {
	      	  double sp = perimetro() / 2.0;
		      return (double) Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));
	    }
}
