import java.util.*;
class Problem_10_Decimal
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("binary value: ");
		int bi=in.nextInt();
		Problem_10_Decimal dec=new Problem_10_Decimal();
		dec.bitodec(bi);
	}
	public void bitodec(int bi)
	{	
		int dec=0;
		int b=1;
		int temp=bi;
		while(temp>0)
		{
			int rem=temp%10;
			temp=temp/10;
			dec=dec+rem*b;
			b=b*2;
		}
		System.out.println("Decimal value is "+dec);
	}
}
