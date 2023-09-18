package lesson7.Task2;

public class Main {
    public static void main(String[] args) {
        double perimeterSum = 0;
        Circle circle1 = new Circle(6);
        Rectangle rectangle1 = new Rectangle(2, 4);
        Triangle triangle1 = new Triangle(3, 4, 5);
        Circle circle2 = new Circle(7);
        Rectangle rectangle2 = new Rectangle(5, 6);

        System.out.println("Пермиетр круга: " + circle1.getPerimeter() + ", площадь: " + circle1.getSquare());
        System.out.println("Периметр прямоугольника: " + rectangle1.getPerimeter() + ", площадь: " + rectangle1.getSquare());
        System.out.println("Периметр треугольника: " + triangle1.getPerimeter() + ", площадь: " + triangle1.getSquare());
//        System.out.println(circle2.getPerimeter());
//        System.out.println(rectangle2.getPerimeter());

        Figure[] figures = {circle1, circle2, rectangle1, rectangle2, triangle1};

        for(int i = 0; i < figures.length; i++){
            perimeterSum += figures[i].getPerimeter();
        }

        System.out.println("Сумма периметров: " + perimeterSum);
    }
}
