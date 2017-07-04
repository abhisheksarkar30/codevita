import java.util.*;
public class stones
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        /*if(T<1||T>10)
        {
            System.out.println("Enter value of T within this range: 1<=T<=10");
            System.exit(0);
        }*/
        int s[]=new int[T];
        for(int i=1;i<=T;i++)
        s[i-1]=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            if(s[i]<1||s[i]>10000)
            {
                System.out.println("Invalid Input");
                continue;
            }
            System.out.println((s[i]-1)%4!=0?"Yes":"No");
        }
    }
}          
