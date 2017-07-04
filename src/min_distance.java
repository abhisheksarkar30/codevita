import java.util.*;
public class min_distance {
    
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    double x=sc.nextDouble(),y=sc.nextDouble(),c1=0,c2=0,va=sc.nextDouble(),vb=sc.nextDouble();
    if(x>0 && y>0 && va>0 && vb>0)
    {
        c2=Math.sqrt((x*x)+(y*y));
        do
        {
            x=x-va;
            y=y-vb;
            c1=Math.sqrt((x*x)+(y*y));
            if(c1<=c2)
            {
                c2=c1;
                continue;
            }
            else
                break;
        }while(c1>=c2);
        if(c2==0)
            System.out.printf("0.0");
        else
            System.out.printf("%.11f",c2);
    }
    else
        System.out.printf("Invalid Input");
}

}
