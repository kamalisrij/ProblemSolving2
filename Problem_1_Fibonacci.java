import java.util.*;
class Problem_1_Fibonacci
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n=in.nextInt();
		int a=-1;
		int b=1;
		int c;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
