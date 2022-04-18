import java.util.*;
class Problem_6_Gcd
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("values: ");
		int a=in.nextInt();
		int b=in.nextInt();
		int g=0;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
				g=i;
		}
		System.out.println("gcd is "+g);
	}
}
