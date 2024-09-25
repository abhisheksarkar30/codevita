import java.util.*;
public class bob_list
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String s[]=new String[t],s1[]=new String[t];
        for(int i=0;i<t;i++)
        {s[i]=sc.nextLine();s1[i]=sc.nextLine();}
        for(int j=0;j<t;j++)
        {
            String ns[]=s[j].split(" ");
            String ns1[]=s1[j].split(" ");
            int[] n=new int[ns.length],n1=new int[ns1.length];
            for(int i=0;i<ns.length;i++)
            n[i]=Integer.valueOf(ns[i]);
            for(int i=0;i<ns1.length;i++)
            n1[i]=Integer.valueOf(ns1[i]);
            Arrays.sort(n);
            Arrays.sort(n1);
            int[] f=new int[n.length+n1.length],in=new int[Math.min(n.length,n1.length)];
            for(int i=0;i<f.length;i++)
            f[i]=i<n.length?n[i]:n1[i-n.length];
            Arrays.sort(f);
            System.out.print(f[0]+" ");
            int c=0;
            for(int i=1;i<f.length;i++)
            if(f[i-1]==f[i])
            {
                in[c++]=f[i];
                f[i]=f[i-1]=0;
            }
            else
            System.out.print(f[i]+" ");
            System.out.println();
            if(c!=0)
            for(int i=0;i<in.length;i++)
            {if(in[i]!=0)
            System.out.print(in[i]+" ");}
            else
            System.out.print("Empty List");
            System.out.println();
            for(int i=0,k=0;i<n.length;i++)
            if(n[i]!=n1[k])
            {
                System.out.print(n[i]+" ");
                if(n[i]>n1[k])
                k++;
            }
            else k++;
            System.out.println();
        }
    }
}