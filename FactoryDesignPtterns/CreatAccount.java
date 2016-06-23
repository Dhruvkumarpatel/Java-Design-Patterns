package FactoryDesignPtterns;

public class CreatAccount {
	
	
	public Account getAccount(String accounttype)
	{
		
		if(accounttype.equalsIgnoreCase("checking"))
		{
			return new CheckingAccount();
		}
		else
		{
			return new SavingAccount();
		}
		
	}

}
