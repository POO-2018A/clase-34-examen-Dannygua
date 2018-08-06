
package prueba;


public class Rectangulo implements Metodos{
    
    private double lado1;
    private double lado2;
    double ladorestante;
    double area;
    double perimetro;
    double altura;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public double ladoRestante (){
       
        ladorestante = Math.pow(lado1, 2)+Math.pow(lado2, 2);
        ladorestante = Math.sqrt(ladorestante);
        return ladorestante;
    }
            
    

    @Override
    public double CalcularArea() {
        ladoRestante ();
     
        area= (lado1*lado2)/2;
        return area;
        
    }

    @Override
    public double CalcularPerimetro() {
                ladoRestante ();

        perimetro =lado1+lado2+ladorestante;
        return perimetro;
    }

    @Override
    public double CalcularAltura() {
                ladoRestante ();
        altura = (lado1*lado2)/ladorestante;

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
    
}
