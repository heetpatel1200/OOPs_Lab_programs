
public class practical34 { 
    public static void checkEligibility(int age) { 
        if (age < 18) { 
            throw new IllegalArgumentException("Age must be 18 or above to vote"); 
        } 
        System.out.println("Eligible to vote"); 
    } 

    public static void main(String[] args) { 
        System.out.println("Heet Patel - 240390107029"); 
        int[] testAges = {16, 18, 25}; 

        for (int age : testAges) { 
            try { 
                System.out.println("Checking age: " + age); 
                checkEligibility(age); 
            } catch (IllegalArgumentException e) { 
                System.out.println("Exception: " + e.getMessage()); 
            } finally { 
                System.out.println("Validation process completed"); 
            } 
            System.out.println(); 
        } 
    } 
} 
