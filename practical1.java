import java.util.Scanner;
public class practical1 {
   public static void main(String args[]) {
     System.out.println("Heet Patel - 240390107029");
     Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");
        double meters = scanner.nextDouble();

        double feet = meters * 3.28084;

        System.out.printf("Distance in feet: %.2f%n", feet);

        scanner.close();
    }
}
