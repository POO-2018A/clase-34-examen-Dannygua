
package prueba;


public class Escaleno implements Metodos{
    
    private double lado1;
    private double lado2;
    private double lado3;    
    double area;
    double perimetro;
    double altura;
    double S;
    
    

    public Escaleno(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public double CalcularS (){
        
        S =(lado1+lado2+lado3)/2;
        
        return S;
    }
            
    
    @Override
    public double CalcularArea() {
        CalcularS();
        area =Math.sqrt(S*(S-lado1)*(S-lado2)*(S-lado3));
        return area;
        
    }

    @Override
    public double CalcularPerimetro() {
                CalcularS();
                perimetro = lado1+lado2+lado3;
                return perimetro;

    }

    @Override
    public double CalcularAltura() {
                CalcularS();
                altura =(2/lado1)*Math.sqrt(S*(S-lado1)*(S-lado2)*(S-lado3));
                return altura;

    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
}
