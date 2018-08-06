
package prueba;


public class Equilatero implements Metodos{
    
    private double lado1;
    double area;
    double perimetro;
    double altura;
    final double raiz3 = Math.sqrt(3);

    public Equilatero(double lado1) {
        this.lado1 = lado1;
    }
          
    @Override
    public double CalcularArea() {
     
        area =((raiz3*lado1)/2)*Math.pow(lado1, 2);
        return area;
    }

    @Override
    public double CalcularPerimetro() {
        perimetro =3*lado1;

        return perimetro;
    }

    @Override
    public double CalcularAltura() {
        altura =(raiz3*lado1)/2;
        return altura;
        

    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    
}
