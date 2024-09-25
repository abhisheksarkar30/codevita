import java.util.*;
public class last_fibo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int a=sc.nextInt(),b=sc.nextInt(),l=sc.nextInt();
            int f[]=new int[b-a+1];
            for(int j=a;j<=b;j++)
            f[j-a]=j;
            for(int s=b-a+1;s>1&&s>=l;)
            {
                for(int j=b-a+1-s,c=0;j<=(b-a);j++)
                {
                    ++c;
                    if(c==l&&s>1)
                    {
                        c=0;
                        f[j]=0;
                        s--;
                    }
                }
                Arrays.sort(f);for(int j=0;j<b-a+1;j++)System.out.print(f[j]);System.out.println();
            }
            double r=(Math.pow(((1+Math.sqrt(5))/2),f[f.length-1])-Math.pow(((1-Math.sqrt(5))/2),f[f.length-1]))/Math.sqrt(5);
            System.out.println((int)Math.round(r%1000000007));
        }
    }
}