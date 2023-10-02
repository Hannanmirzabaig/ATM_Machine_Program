package Night_session_Test;
import java.util.Scanner;

public class ATM {
	
		public static void main(String[] args)
		{
		
			Scanner w=new Scanner(System.in);
			System.out.println("Please Enter Your Pin");
			int v=w.nextInt();
			if(v==5786) {
				int balance=1250;
				String st;


			Scanner sc=new Scanner(System.in);

		   do{
			System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = ");
			System.out.println(" PRESS FROM BELOW OPTION");
			System.out.println(" PRESS 1: To Check Balance");
			System.out.println(" PRESS 2: To Withdrawal");
			System.out.println(" PRESS 3: To Deposite");
			System.out.println(" PRESS 4: To EXIT");
			System.out.print(" CHOOSE OPTION");
			int n=sc.nextInt();
			System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = ");
			
			switch (n)
			{
				case 1:
						
						System.out.println("YOUR BALANCE IS:"+balance);
						System.out.println("THANK YOU");
						System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = ");
					break;
				case 2:
					
					System.out.println("Enter Ammount To Withdrawal");
					int withdrawal=sc.nextInt();
					
					if(withdrawal<=balance)
					{
						System.out.println("Your Withdrawal Have Successfull");
						System.out.println("You Withdrawal The Ammount Is: "+withdrawal);
						System.out.println("Now Your Balance Is: "+(balance-withdrawal));
					}
					else	
					{
						System.out.println("Insufficient You Balance");
					}
					System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = ");
					break;
				case 3:
					
					System.out.println("Enter The Ammount To Deposite");
					int deposite=sc.nextInt();

					System.out.println("Your Deposite Ammount Have Successful");
					System.out.println("Now Your Balance Is: "+(balance+deposite));
					System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = ");
					
					break;
				default:
					System.out.println("THANK YOU FOR VISITING");
			    }

			System.out.println("PRESS yes/YES/Yes TO COUNTINUE AND  OTHER CHARACTER/WORD TO STOP");
			st=sc.next();
		}while(st.equals("yes") || st.equals("Yes") || st.equals("YES"));
			
			System.out.println("THANK YOU FOR VISITING");
			
	     
	}
		
		else
		{
			
			System.out.println("Your Pin Is Invalid");
		}
		}
	
}

























					

			


