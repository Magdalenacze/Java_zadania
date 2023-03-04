
package zad_prog_rozdz_6_zad_7;

/**
 * Klasa Circle
 * @author Magdalena
 */
public class Circle {
    
    private double radius;
    final double PI = 3.14159;
    
    public Circle(double aRadius) {
        
        radius = aRadius;
    }
    
    public Circle() {
        
        this(0.0);
    }
    
    public void setRadius(double aRadius) {
    
        radius = aRadius;
    }
    
    public double getRadius() {
    
        return radius;
    }
    
    public double area() {
        
        return PI * Math.pow(radius, 2);
    }
    
    public double diameter() {
        
        return radius * 2;
    }
    
    public double circumference() {
        
        return 2 * PI * radius;
    }
}
