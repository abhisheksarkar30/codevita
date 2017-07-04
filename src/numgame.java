import java.util.*;
public class numgame {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        numgame ob=new numgame();
        int N=sc.nextInt();
        int arr[]=new int[N],fc[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            fc[i]=ob.factor(arr[i]);
        }
        Arrays.sort(fc);
        int match=0;
        for(int i=1;i<N;i++)
            if(fc[i]==fc[i-1])
            fc[i-1]=fc[i]=0;
           
        Arrays.sort(fc);
        for(int i=N-1,f=1;i>=0&&fc[i]!=0;i--,f*=-1)
            match+=fc[i]*f;
        System.out.print(match==0?"JASBIR":"AMAN");
    }
    int factor(int n)
    {
        int c=1;
        for(int i=2;i<=n/2;i++)
            if(n%i==0)
                c++;
        return c;
    }
}
