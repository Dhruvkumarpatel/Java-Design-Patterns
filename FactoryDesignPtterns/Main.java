package FactoryDesignPtterns;

import java.util.Scanner;

public class Main {
	
		public static void main(String args[])
		{
			
			CreatAccount account = new CreatAccount();
			
			Scanner o = new Scanner(System.in);
			
			System.out.println("Enter the Account Type");
			
			String accountType = o.nextLine();
			
			
			Account account2 = account.getAccount(accountType);
		
			account2.createAccount();
			
			
		}

}
