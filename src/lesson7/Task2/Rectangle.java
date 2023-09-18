package lesson7.Task2;

public class Rectangle extends Figure{
    int a;
    int b;

    Rectangle(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public double getSquare() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a * 2) + (b * 2);
    }
}
