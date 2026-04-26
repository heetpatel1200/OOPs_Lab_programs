import java.util.Scanner;
public class practical9 {
   double width = 1.0;
   double height = 1.0;

    practical9() {
    }

    practical9(double width, double height) {
      this.width = width;
      this.height = height;
    }

    double getArea() {
      return width * height;
    }

    double getPerimeter() {
      return 2 * (width + height);
    }

    public static void main(String[] args) {
      System.out.println("Heet Patel - 240390107029");
      Scanner input = new Scanner(System.in);

        System.out.print("Enter width: ");
        double w = input.nextDouble();

        System.out.print("Enter height: ");
        double h = input.nextDouble();

        practical9 rect = new practical9(w, h);

        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        input.close();
    }
}
