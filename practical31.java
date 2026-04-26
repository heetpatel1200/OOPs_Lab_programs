class Student {
    protected int rollNo;
    protected String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }
}

public class practical31 extends Student {
    private int marks1;
    private int marks2;
    private int marks3;

    public practical31(int rollNo, String name, int marks1, int marks2, int marks3) {
        super(rollNo, name);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void displayResult() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("----- STUDENT MARK SHEET -----");
        displayStudent();
        System.out.println("Marks 1 : " + marks1);
        System.out.println("Marks 2 : " + marks2);
        System.out.println("Marks 3 : " + marks3);
        System.out.println("Total   : " + total);
        System.out.printf("Average : %.2f%n", average);
    }

    public static void main(String[] args) {
        System.out.println("Heet Patel - 240390107029");
        practical31 studentResult = new practical31(101, "Heet", 85, 90, 88);
        studentResult.displayResult();
    }
}