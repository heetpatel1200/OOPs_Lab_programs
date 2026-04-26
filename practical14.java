import java.util.Scanner;
public class practical14 {
   String accountId;
   String accountHolderName;
   double balance;

  void assignValues(String id, String name, double bal) {
    accountId = id;
    accountHolderName = name;
    balance = bal;
  }

  void displayValues() {
    System.out.println("ID: " + accountId + " | Name: " + accountHolderName + " | Balance: " + balance);
  }

  static void searchAccount(practical14[] accounts, String searchId) {
     boolean found = false;
     for (practical14 acc : accounts) {
        if (acc.accountId.equalsIgnoreCase(searchId)) {
           System.out.println("Account Found:");
           acc.displayValues();
           found = true;
           break;
        }
     }
     if (!found) {
        System.out.println("Account with ID " + searchId + " not found.");
     }
  }

  public static void main(String[] args) {
    System.out.println("Heet Patel - 240390107029");
    Scanner sc = new Scanner(System.in);
    practical14[] accounts = new practical14[5];

     for (int i = 0; i < accounts.length; i++) {
        accounts[i] = new practical14();
     }

     accounts[0].assignValues("A101", "Heet", 50000);
     accounts[1].assignValues("A102", "Anjali", 75000);
     accounts[2].assignValues("A103", "Rahul", 30000);
     accounts[3].assignValues("A104", "Sneha", 90000);
     accounts[4].assignValues("A105", "Amit", 45000);

     System.out.println("All Accounts:");
     for (practical14 acc : accounts) {
            acc.displayValues();
        }

        System.out.print("\nEnter Account ID to search: ");
        String searchId = sc.next();
        searchAccount(accounts, searchId);

        sc.close();
    }
}
