import javafx.scene.shape.Shape;

public abstract class Rectangle extends Shape {
    protected double with;
    protected double high;

    public Rectangle(double with, double high) {
        this.with = with;
        this.high = high;
    }

    public double getArea() {
        return with * high;
    }
}
