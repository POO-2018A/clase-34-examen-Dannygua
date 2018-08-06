
package prueba;


public class Isosceles implements Metodos {
    
    private double ladoRepetido;
    private double base;
    double area;
    double perimetro;
    double altura;

    public Isosceles(double ladoRepetido, double base) {
        this.ladoRepetido = ladoRepetido;
        this.base = base;
    }
    
    
    
    @Override
    public double CalcularArea() {
        
        area= (base*(Math.sqrt(Math.pow(ladoRepetido, 2)-(Math.pow(base, 2)/4))))/2;
        
    
        return area;
    }

    @Override
    public double CalcularPerimetro() {
        perimetro = 2*ladoRepetido*base;
        return perimetro;
    }

    @Override
    public double CalcularAltura() {
        altura =Math.sqrt(Math.pow(ladoRepetido, 2)-(Math.pow(base,2)/4));
        return altura;

    }

    public double getLadoRepetido() {
        return ladoRepetido;
    }

    public void setLadoRepetido(double ladoRepetido) {
        this.ladoRepetido = ladoRepetido;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
}
