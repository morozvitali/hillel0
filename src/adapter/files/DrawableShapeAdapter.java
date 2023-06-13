package adapter.files;

public class DrawableShapeAdapter implements Drawable {
    private Shape shape;

    public DrawableShapeAdapter(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        double area = shape.getArea();
        // обьнробимо площу і знайдемо що треба
    }
}
