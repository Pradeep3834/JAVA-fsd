import java.util.Scanner;
class intialbalance{
	final int count=10000;
	
}

public class Transactions {
  
	private static final int count = 10000;
	private static final int limit=5000;
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter D for deposit:");
		System.out.println("enter W for withdraw:");
		System.out.println("enter B for balance");
		String s=scan.next();
	 char  choice =s.charAt(0);
		switch(choice)
		{
		case'D':
			System.out.println("enterr the Amount:");
			Scanner deposit = new Scanner(System.in);
			int d=deposit.nextInt();
			
			System.out.println("Successfully deposted.Balance is"+(d+count));
			break;
			
		case 'W':
			System.out.println("enter the Amount to be Withdrawn");
			int Wamount=scan.nextInt();
			if( Wamount<=count) {
				if(Wamount==limit) {
					System.out.println("insufficient balance");
					break;
				}
				if(Wamount>limit) {
					System.out.println("Withdraw attempt failed");
					break;
				}
				
				else
					System.out.println("successful transaction balane is" +(count-Wamount));
			}
			break;
		case 'B':
			System.out.println("balance is " +count);
			
		}
		
	}
	
	
	
}
