import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Trapezoid {
    public  double side1;
    public  double side2;
    public double height;

    public Trapezoid(double side1, double side2, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * (side1 + side2) * height;
    }

    public double calculatePerimeter() {
        return side1 + side2 + 2 * Math.sqrt(Math.pow((side2 - side1) / 2, 2) + Math.pow(height, 2));
    }
}



