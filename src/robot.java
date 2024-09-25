import java.util.*;
public class robot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int f=sc.nextInt(),b=sc.nextInt(),t=sc.nextInt(),d=sc.nextInt();
            int td=0,tt=0;
            for(;(td+f)<d;)
            {
                td+=f;
                tt+=f*t;
                td-=b;
                tt+=b*t;
            }
            tt+=(d-td)*t;
            System.out.println(tt);
        }
    }
}