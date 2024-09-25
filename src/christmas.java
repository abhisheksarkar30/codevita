import java.util.*;
public class christmas
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),c1=0,c2=0;
        if(t<=1)
        {
            System.out.print("You cannot generate christmas tree");
            System.exit(0);
        }
        if(t>20)
        {
            System.out.print("Tree is no more");
            System.exit(0);
        }
        for(int i=1;i<=t+1;i++)
        {
            c2=0;
            for(int j=1;j<=t-i+1;j++)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++,c2++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<=t-2;i++)
        {
            for(int j=1;j<=t-i;j++)
            {
                c1=c2=0;
                for(int k=1;k<t-j+1;k++,c1++)
                    System.out.print(" ");
                for(int k=1;k<2*(j+1);k++,c2++)
                    System.out.print("*");
                System.out.println();
            }
        }
        for(int i=1;i<=c1+c2/2;i++)
            System.out.print(" ");
        System.out.println("*");
        for(int i=1;i<=c1+c2/2;i++)
            System.out.print(" ");
        System.out.print("*");
    }
}