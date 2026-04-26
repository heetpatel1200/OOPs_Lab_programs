import java.util.Scanner;
public class practical11 {
   int hours;
   int minutes;

    void setTime(int h, int m) {
      hours = h;
      minutes = m;
    }

    void displayTime() {
      System.out.println(hours + " hours and " + minutes + " minutes");
    }

    void addTime(practical11 t1, practical11 t2) {
      int totalMinutes = t1.minutes + t2.minutes;
      this.minutes = totalMinutes % 60;
      int extraHours = totalMinutes / 60;
      this.hours = t1.hours + t2.hours + extraHours;
    }

    public static void main(String[] args) {
      System.out.println("Heet Patel - 240390107029");
      Scanner sc = new Scanner(System.in);
      practical11 t1 = new practical11();
      practical11 t2 = new practical11();
      practical11 t3 = new practical11();

        System.out.println("Enter Time 1 (hours and minutes):");
        t1.setTime(sc.nextInt(), sc.nextInt());

        System.out.println("Enter Time 2 (hours and minutes):");
        t2.setTime(sc.nextInt(), sc.nextInt());

        t3.addTime(t1, t2);

        System.out.print("Time 1: ");
        t1.displayTime();
        System.out.print("Time 2: ");
        t2.displayTime();
        System.out.print("Total Added Time: ");
        t3.displayTime();

        sc.close();
    }
}
