
import java.util.HashMap; 
import java.util.Map; 
import java.util.Scanner; 

public class practical47 { 
    public static void main(String[] args) { 
        System.out.println("Heet Patel - 240390107029"); 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a sentence: "); 
        String sentence = sc.nextLine(); 

        HashMap<String, Integer> frequencyMap = new HashMap<>(); 
        String[] words = sentence.split("\\s+"); 

        for (String word : words) { 
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1); 
        } 

        System.out.println("Word frequencies:"); 
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) { 
            System.out.println(entry.getKey() + " -> " + entry.getValue()); 
        } 

        sc.close(); 
    } 
} 
