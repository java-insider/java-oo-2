package shape;

public class Calculator {

    private double total;

    public double sumSurfaceArea(Shape shape) {
        total += shape.surfaceArea();
        return total;
    }
}
