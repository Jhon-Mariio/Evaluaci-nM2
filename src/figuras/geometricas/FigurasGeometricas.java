
package figuras.geometricas;


public class FigurasGeometricas 
{
    public static void main(String[] args) 
    {
        Cuadrado cuadrado = new Cuadrado (5, "Rojo");
        Circulo circulo = new Circulo (3, "Verde");
        
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea() + " unidades cuadradas");
        System.out.println("Area del circulo: " + circulo.calcularArea() + " unidades cuadradas");
    }
    
}
