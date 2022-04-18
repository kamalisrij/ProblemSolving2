import java.util.*;
class Problem_2_Prime
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n=in.nextInt();
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==2)
			System.out.println(n+" is prime no.");
		else
			System.out.println(n+" is not a prime no.");
	}
}
