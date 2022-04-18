import java.util.*;
class Problem_3_Palindrome
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("value of n: ");
		int n=in.nextInt();
		int rev=0;
		int r=n;
		while(r!=0)
		{
			int rem=r%10;
			rev=(rev*10)+rem;
			r=r/10;
		}
		if(rev==n)
			System.out.println(n+" is palindrome number");
		else
			System.out.println(n+" is not a palindrome number");
	}
}
