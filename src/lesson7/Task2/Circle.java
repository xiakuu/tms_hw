package lesson7.Task2;

public class Circle extends Figure{
        int r;

        Circle(int r){
                this.r = r;
        }
        @Override
        public double getPerimeter() {
                return Math.PI * Math.pow(r, 2);
        }

        @Override
        public double getSquare() {
                return 2 * Math.PI * r;
        }
}
