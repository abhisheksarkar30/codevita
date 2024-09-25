import java.util.*;
public class frndsp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        frndsp ob=new frndsp();
        int n=sc.nextInt(),m=sc.nextInt();
        int arr[]=new int[m],arr1[]=new int[m],a[]=new int[n],a1[]=new int[n];
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
            arr1[i]=sc.nextInt();
        }
        a[0]=arr[0];a1[0]=arr1[0];
        for(int i=1;i<m;i++)
        {
            if(!ob.check(a,arr[i]))
            {
                if(ob.check(a1,arr[i]))
                a1[i]=arr1[i];}
            else if(!ob.check(a1,arr[i]))
            {   
                if(ob.check(a,arr[i]))
                a[i]=arr1[i];
            }
        }
        for(int i=0; i<n;i++)
        System.out.println(a[i]+" "+a1[i]);
        int c=0;
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        if(a[i]!=0&&a[i]==a1[j])
        c=1;
        System.out.println(c==0?"Yes":"No");
    }    
    public boolean check(int s[],int a)
    {
        for(int i=0;i<s.length;i++)
        if(s[i]==a)
        return false;
        return true;
    }
}