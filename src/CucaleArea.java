import javafx.scene.shape.Shape;

public class CucaleArea {
    private double area;

    public double CucaleArea(Shape s) {
        double area = ((Object) s).getArea();
        return area;
    }
}
