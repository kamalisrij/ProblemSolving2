import java.util.Random;
class Problem_5_RandomNumber
{
    public static void main(String[] args)
    {
        Random r=new Random();
        int u=700;
        int l=300;
        int rand=r.nextInt(l,u);
        System.out.println(rand);
    }
}
