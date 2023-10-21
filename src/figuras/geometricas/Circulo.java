
package figuras.geometricas;

/**
 *
 * @author CESDE
 */
public class Circulo extends FiguraGeometrica {
    private double radio;
    private static final double PI = 3.14159265359;
    
    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }

    
   
    
}
