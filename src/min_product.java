import java.util.*;
public class min_product
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),a[]=new int[n],b[]=new int[n]; 
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        b[i]=sc.nextInt();
        int bmax=b[0],amin=a[0];
        for(int i=0;i<n;i++)
            if(Math.abs(b[i])>Math.abs(bmax))
            {
                bmax=b[i];
                amin=a[i];
            }
        for(int i=0;i<n;i++)
        if(b[i]==bmax)
        if(b[i]*a[i]<bmax*amin)
        amin=a[i];
        int s=bmax*(bmax>0?amin-k*2:amin+k*2);
        for(int i=0;i<n;i++)
            if(!(b[i]==bmax&&amin==a[i]))
            s+=b[i]*a[i];
        System.out.print(s);        
    }
}