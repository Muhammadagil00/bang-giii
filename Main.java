import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\ACER\\Documents\\trapezoid.csv";
        List<Main> Agil = new ArrayList<>();

        try {
            BufferedReader agil = new BufferedReader(new FileReader(csvFile));
            String line;
            agil.readLine();
            while ((line = agil.readLine()) != null) {
                String[] data = line.split(",");
                double side1 = Double.parseDouble(data[0]);
                double side2 = Double.parseDouble(data[1]);
                double height = Double.parseDouble(data[2]);

                Trapezoid trapezoid = new Trapezoid(side1, side2, height);
                double area = trapezoid.calculateArea();
                double perimeter = trapezoid.calculatePerimeter();

                System.out.println("Area: " + area);
                System.out.println("Perimeter: " + perimeter);
            }
          } catch (IOException e){
        System.err.println(e.getMessage());
    }
        }
    }



