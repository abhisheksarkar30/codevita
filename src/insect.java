import java.util.*;
public class insect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            long x=sc.nextLong(),y=sc.nextLong(),t=sc.nextLong();
            System.out.println((x*2*t+y*(2*t-1))%1000000007);
        }
    }
}