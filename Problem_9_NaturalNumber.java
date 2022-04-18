import java.util.*;
class Problem_9_NaturalNumber
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("value of n: ");
		int n=in.nextInt();
		int s=0;
		for(int i=1;i<=n;i++)
		{
			s=s+i;
		}
		System.out.println("Sun of n natural number is: "+s);
	}
}
