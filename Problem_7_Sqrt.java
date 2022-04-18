import java.util.*;
class Problem_7_Sqrt
{
	public void sqroot(int a)
	{
		double t;
		double sq=a/2;
		do
		{
			t=sq;
			sq=(t+(a/t))/2;
		}
		while((t-sq)!=0);
		System.out.println(sq);
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("value: ");
		int a=in.nextInt();
		Problem_7_Sqrt sr=new Problem_7_Sqrt();
		sr.sqroot(a);
	}
}
