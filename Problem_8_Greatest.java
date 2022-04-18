import java.util.*;
class Problem_8_Greatest
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("values: ");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int res=a>b && a>c ? a:b>a && b>c ? b:c;
		System.out.println("Greatest of three number is "+res);
	}
}
