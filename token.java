import java.util.*;

class Token{
	public static void main(String[] args) {
		int cas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome !!! \n 1)Cash Deposit \n 2) Cash Withdraw\n 3)For Loan purpose\n4)For DD\n5)For Account Creation\n 6) For knowing about any other details\n 7)Exit\n Enter your choice with the corresponding number ");	
		int token =0;
		while(true){
		cas = sc.nextInt();
			switch(cas){
				case 1:
					System.out.println("Reason of visit: Cash Deposit");
					token++;
					System.out.println("Token number: " + token);
					break;
				case 2:
					System.out.println("Reason of visit: Cash Withdraw");
					token++;
					System.out.println("Token number: " + token);
					break;
				case 3:
					System.out.println("Reason of visit: For Loan purpose");
					token++;
					System.out.println("Token number: " + token);
					break;
				case 4:
					System.out.println("Reason of visit: For DD");
					token++;
					System.out.println("Token number: " + token);
					break;
				case 5:
					System.out.println("Reason of visit: For Account Creation");
					token++;
					System.out.println("Token number: " + token);
					break;
				case 6:
				 	System.out.println("Reason of visit: For knowing about any other details");
				 	token++;
				 	System.out.println("Token number: " + token);
				 	break;
				case 7:
					System.exit(0);
				default:
					System.out.println("Invalid number");
					System.exit(0);	
			}
		}
	}
}