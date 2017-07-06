import java.io.*;
import java.util.*;
public class Chakravyuha
{
    public static void main(String args[])throws IOException
    {
        
        Scanner in=new Scanner(System.in);
        int p=in.nextInt();
        int a[][]=new int[p][p];
        int m=p,n=p,k=0,l=0,i,j;int value=1;
         int power=2*(((p*p)/11)+1);
 int b[]=new int[2*(((p*p)/11)+1)];
 b[0]=0;b[1]=0;int t=2;
        while(k<m && l<n)
        {
            for(i=l;i<n;++i)
            {
                if(value%11==0){b[t]=k;b[t+1]=i;t=t+2;}
                a[k][i]=value;
                value++;
                
            }
            k++;
        
        for(i=k;i<m;++i)
        {
             if(value%11==0){b[t]=i;b[t+1]=n-1;t=t+2;}
            a[i][n-1]=value;
            value++;
        }
        n--;
        if(k<m)
        {
            for(i=n-1;i>=l;--i)
            {
                 if(value%11==0){b[t]=m-1;b[t+1]=i;t=t+2;}
                a[m-1][i]=value;
                value++;
            }
            m--;
        }
        if(l<n)
        {
            for(i=m-1;i>=k;--i)
            {
                 if(value%11==0){b[t]=i;b[t+1]=l;t=t+2;}
                a[i][l]=value;
                value++;
            }
            l++;
        }
    }
  
    for(i=0;i<p;i++)
    {
        for(j=0;j<p;j++)
        {
            
                
            System.out.print(a[i][j]+" ");
        }
        System.out.println("");
    }
    System.out.println("Total Power points : "+(power/2));
    i=0;
    while(i<power)
    {
        System.out.println("("+b[i]+","+b[i+1]+")");
        i=i+2;
}
}
}