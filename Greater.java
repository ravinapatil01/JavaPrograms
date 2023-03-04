import java.util.Scanner;
class Greater
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no first:");
		int a= s.nextInt();
		System.out.println("Enter the no 2nd:");
		int b= s.nextInt();
		System.out.println("the gretest no is:"+greatest(a,b));

	}
	public static int greatest(int a,int b)
	{
		int res= a>b?a:b;
		return res;
	}
}
