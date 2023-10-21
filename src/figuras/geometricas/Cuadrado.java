/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.geometricas;

/**
 *
 * @author CESDE
 */
class Cuadrado extends FiguraGeometrica {
    private double lado;
    
    public Cuadrado( double lado, String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
       return lado * lado;
    }


    
    
    
}
