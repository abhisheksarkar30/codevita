import java.util.*;
public class reliable
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        reliable ob=new reliable();
        int n=0,f=0,t=0;
        do
        {
            String s=sc.next();
            if(ob.check(s)&&Integer.valueOf(s)>0)
            {
                n=Integer.valueOf(s);
                break;
            }
            System.out.println("Invalid Input");
        }while(true);
        do
        {
            String s=sc.next();
            if(ob.check(s)&&Integer.valueOf(s)>=0)
            {
                f=Integer.valueOf(s);
                break;
            }
            System.out.println("Invalid Input");
        }while(true);
        do
        {
            if(f==0)
            {t=0;break;}
            String s=sc.next();
            if(ob.check(s)&&Integer.valueOf(s)>0&&Integer.valueOf(s)<=n)
            {
                t=Integer.valueOf(s);
                break;
            }
            System.out.println("Invalid Input");
        }while(true);
        if(f==0&&t==0)
        System.out.println("Total Down Time: 0\n0\n0\n100%");
        else
        {
            double m1=((double)n-t)/(double)f;
            double m2=(double)t/f;
            double a=(m1/(m1+m2))*100.0;
            m1=Double.valueOf(String.format("%.11G",m1));
            m2=Double.valueOf(String.format("%.11G",m2));
            a=Double.valueOf(String.format("%.11G",a));
            //System.out.println(m1+" "+m2+" "+a);
            System.out.println((int)Math.round(m1)+"\n"+(int)Math.round(m2)+"\n"+(int)Math.round(a)+"%");
        }
    } 
    public boolean check(String s)
    {
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++)
        if(!Character.isDigit(c[i]))
        return false;
        return true;
    }
}