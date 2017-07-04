import java.util.*;
public class catch22
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        String tf[]=new String[T];
        for(int i=0;i<T;i++)
        {
            int f=sc.nextInt(),b=sc.nextInt(),t=sc.nextInt(),fd=sc.nextInt(),bd=sc.nextInt();
            int td=0,tt=0;
            if(fd<=f)
                tf[i]=(fd*t+" F");
            else
            if(f>b)
            {
            while((td+f)<fd)
            {
                td+=f-b;
                tt+=(f+b)*t;
            }
            tt+=(fd-td)*t;
            tf[i]=(tt+" F");
            }
            else if(f<b)
                {
                    tt=(bd/(b-f))*(f+b)*t+(bd%(b-f)>0?(bd%(b-f)+2*f)*t:0);
            tf[i]=(tt+" B");
            }
            else
            tf[i]="No Ditch";
        }
        for(int i=0;i<T;i++)
            if(i!=T-1)
            System.out.println(tf[i]);
        else
                System.out.print(tf[i]);
    }
}
