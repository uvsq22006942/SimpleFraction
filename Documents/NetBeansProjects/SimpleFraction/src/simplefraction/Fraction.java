
package simplefraction;


public class Fraction {
    public double a;
    public double b;
    public double t;

    public Fraction(double a, double b, double t) {
        this.a = a;
        this.b = b;
        this.t = t;
    }

    @Override
    public String toString() {
        return "Fraction{" + "a=" + a + ", b=" + b + ", t=" + t + '}'+"totale = "+a/b;
    }
    
}
