class Account
{
	private String acc_hol_name;
	private int acc_no;
	private double balance;
	Account (String accholname, int accno, double bal)
	{
		this.acc_hol_name=accholname;
		this.acc_no=accno;
		this.balance=bal;
	}
	public String getname()
	{
		return acc_hol_name;
	}
	public void setName (String newname,int old_acc_no)
    {
		if (this.acc_no==old_acc_no)
		{
			this.acc_hol_name=newname;
			System.out.println("Account holder name changed successfully");
		}
		else
		{
			System.out.println("Invalid account no");
		}
    }
	public int getAccNo()
	{
		return acc_no;
	}
	public double getBalance()
	{
		return balance;
    }
	public void setBalance(double amt, int old_acc_no)
	{
		if (this.acc_no==old_acc_no)
		{
			this.balance=this.balance+amt;
			System.out.println("Ammount is deposited successfully");
		}
		else
			{
			System.out.println("invalid account no");
		    }
	}
	public void withDrawal(double newamount, int old_acc_no)
	{
		if (this.acc_no==old_acc_no)
		{
          this.balance=this.balance-newamount;
			System.out.println("Ammount is withdrwal successfully");
		}
		else
			{
			System.out.println("invalid account no");
		    }
	}
	public double getAttributes()
	{
		System.out.println("Account Holder Name="+acc_hol_name);
		System.out.println("Account no="+acc_no);
		System.out.println("Balance"+balance);
	}
}

