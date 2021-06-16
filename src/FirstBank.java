import java.util.*;
//Main fxn in class that calls upon Account and uses the Account.Java source code to do the grunt work.
public class FirstBank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello! Please input your account name and account ID to continue.");
        System.out.print("Name: ");
        String accName = scan.nextLine();
        System.out.print("\nAccount ID: ");
        String accID = scan.nextLine();
        scan.close();
        
        Account acc = new Account(accName, accID);
        acc.showMenu();
    }
}
