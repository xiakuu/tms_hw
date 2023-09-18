package lesson7.Task2;

public class Triangle extends Figure{
    int a;
    int b;
    int c;

    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getSquare() {
        return Math.sqrt(getPerimeter()/2 * (getPerimeter() / 2 - a) * (getPerimeter()/2 - b) * (getPerimeter()/2 - c));
    }
}
