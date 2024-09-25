import java.util.*;
public class zombie
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int n=sc.nextInt(),t=sc.nextInt(),e[]=new int[n];
            for(int j=0;j<n;j++)
            e[j]=sc.nextInt();
            int p=sc.nextInt(),d=sc.nextInt();
            Arrays.sort(e);
            for(int j=0,ti=1;j<n&&ti<=t;j++,ti++)
            {
                if(p>=e[j])
                p+=p-e[j];
                else
                break;
            }    
            System.out.print(p>=d?"Yes":"No");
        }
    }
}