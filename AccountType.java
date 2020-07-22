import java.util.Scanner;


public class AccountType {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("press S for savings account:");
	System.out.println("press C for current account:");
	String s=scan.nextLine();
	char choice = s.charAt(0);
	switch(choice) {
	case 'S':
		SavingsAccount saving = new SavingsAccount();
		
		
	case 'C':
		CurrentAccount current = new CurrentAccount();
	
	
	}
}
}
