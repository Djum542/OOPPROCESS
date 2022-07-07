public abstract class Shape {
    protected float area;
    protected String name;

    public Shape(float area, String name) {
        this.area = area;
        this.name = name;
    }

    public abstract float getArea();
}
