import javafx.scene.shape.Shape;

public abstract class Circle extends Shape {
    private float radiums;

    public Circle(float radiums) {
        this.radiums = radiums;
    }

    public double clcArea() {
        double area = 3.14 * (radiums * radiums);
        return (area);
    }
}
