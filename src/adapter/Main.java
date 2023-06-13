package adapter;
import adapter.files.*;
public class Main {
    public static void main(String[] args) {

        // ми створюємо адаптер, є кілька різних фігур і їх треба зарендерити, порахувати, всіх купою
        // Обгортання у адаптер це і є адаптер
        Drawable [] drawables = {
                new DrawableShapeAdapter(new Circle(1)),
                new DrawableShapeAdapter(new Circle(1)),
                new DrawableShapeAdapter(new Circle(2)),
                new DrawableShapeAdapter(new Circle(3)),
                new DrawableShapeAdapter(new Square(1)),
                new DrawableShapeAdapter(new Square(4))
        };
        for (Drawable d: drawables) {
                    d.draw();
                }
    }
}
