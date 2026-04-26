import java.util.Scanner;

public class practical19 {
  private String collegeName;

    public practical19(String collegeName) {
      this.collegeName = collegeName;
    }

    class Admission {
       private String studentName;
       private String course;

        public void acceptStudentInfo(Scanner scanner) {
          System.out.print("Enter student name: ");
          studentName = scanner.nextLine();
          System.out.print("Enter course name: ");
          course = scanner.nextLine();
        }

        public void displayAdmissionDetails() {
          System.out.println("\n--- Admission Details ---");
          System.out.println("College Name: " + collegeName);
          System.out.println("Student Name: " + studentName);
          System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {
      System.out.println("Heet Patel - 240390107029");
      Scanner scanner = new Scanner(System.in);

        System.out.print("Enter college name: ");
        String collegeName = scanner.nextLine();

        practical19 college = new practical19(collegeName);
        practical19.Admission admission = college.new Admission();
        admission.acceptStudentInfo(scanner);
        admission.displayAdmissionDetails();

        scanner.close();
    }
}
