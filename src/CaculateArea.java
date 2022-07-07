import javafx.scene.shape.Shape;

public class CaculateArea {
    Shape[] shapes;
    double sumTotal;

    public CaculateArea(Shape[] shapes, double sumTotal) {
        this.shapes = shapes;
        this.sumTotal = sumTotal;
    }

    public double sumArea() {
        sumTotal = 0;
        for (int i = 0; i < shapes.length; i++) {
            sumTotal = sumTotal + shapes[i].BASELINE_OFFSET_SAME_AS_HEIGHT;

        }
        return sumTotal;
    }

}
