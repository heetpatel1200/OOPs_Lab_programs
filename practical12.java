import java.util.Scanner;
public class practical12 {
   int x;
   int y;

    practical12() {
      x = 5;
      y = 5;
    }

    practical12(int x, int y) {
      this.x = x;
      this.y = y;
    }

    practical12(practical12 p) {
      this.x = p.x;
      this.y = p.y;
    }

    void display() {
      System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
      System.out.println("Heet Patel - 240390107029");
      Scanner sc = new Scanner(System.in);

        practical12 p1 = new practical12();
        System.out.print("Default ");
        p1.display();

        System.out.print("Enter x and y for new point: ");
        int inputX = sc.nextInt();
        int inputY = sc.nextInt();
        practical12 p2 = new practical12(inputX, inputY);
        System.out.print("Parameterized ");
        p2.display();

        practical12 p3 = new practical12(p2);
        System.out.print("Copy of Point 2 ");
        p3.display();

        sc.close();
    }
}
