package entities;

public class Triangulo 
   {
	    private double a;
	    private double b;
	    private double c;

        public double GetA()
        {
            return a;
        }

        public void SetA(double a)
        {
            this.a = a;
        }

        public double GetB()
        {
            return b;
        }

        public void SetB(double b)
        {
            this.b = b;
        }

        public double GetC()
        {
            return c;
        }

        public void SetC(double c)
        {
           this.c = c;
        }

        public double Perimetro()
        {
            return a + b + c;
        }

        public double Area()
        {
            double sp = Perimetro() / 2.0;
            return (double) Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));
        }
    }