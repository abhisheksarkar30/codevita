package codevita;

import java.util.*;
public class binary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            long n=sc.nextInt(),cnt=0,sum=0,x=3;
            while(cnt<n){
                char c[]=Long.toBinaryString(x).toCharArray();
            Arrays.sort(c);
            long j=Long.parseLong(String.valueOf(c));
            if(j>9&&j<100)
            {cnt++;
            sum+=x;
            System.out.println(x);
            }
            x++;
            }
            System.out.print(sum%1000000007);
        }
    }
}