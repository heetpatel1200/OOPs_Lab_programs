
import java.util.ArrayList; 
import java.util.Collections; 

public class practical46 { 
    public static void main(String[] args) { 
        System.out.println("Heet Patel - 240390107029"); 
        ArrayList<Integer> marks = new ArrayList<>(); 
        marks.add(78); 
        marks.add(85); 
        marks.add(92); 
        marks.add(67); 
        marks.add(88); 

        System.out.println("All marks: " + marks); 
        System.out.println("Highest marks: " + Collections.max(marks)); 
        System.out.println("Lowest marks: " + Collections.min(marks)); 
    } 
} 
