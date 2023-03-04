class AccountDriver 
{
	public static void main(String[] args) 
	{
		Account ac1=new Account ("vimala",100,13500.00);
			ac1.getAttributes();
		    ac1.setName("sheela",100);
			ac1.getAttributes();
		System.out.println(ac1.getBalance());
		    ac1.setBalance(1500,100);
		System.out.println(ac1.getBalance());
		    ac1.withDrawal(10000,100);
			ac1.getAttributes();
	}
}
