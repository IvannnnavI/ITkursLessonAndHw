package lesson_22.hW_22.Task_3;

public class MainFigure {
    public static void main(String[] args) {
        Figure[] figures = {new Circle(5), new Triangle(15,10), new Square(8)};

        for (Figure figure : figures) {
            System.out.println("Площадь фигуры: " +figure.calculateArea());

        }
    }
}
