import java.util.*;
class Problem_11_Binary
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("decimal value: ");
		int dec=in.nextInt();
		Problem_11_Binary bi=new Problem_11_Binary();
		bi.dectobi(dec);
	}
	public void dectobi(int dec)
	{	
		int[] b=new int[100];
		int c=0;
		while(dec>0)
		{
			b[c]=dec%2;
			dec=dec/2;
			c++;
		}
		for(int i=c-1;i>=0;i--)
		{
			System.out.print(b[i]);
		}
	}
}
			
		
