import java.util.Scanner;
public class max_sub_array {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int max=-999999999,max1=0,n=sc.nextInt(),arr[]=new int[n];
            for(int j=0;j<n;j++)
            arr[j]=sc.nextInt();
            for(int j=0;j<n;j++)
            {
               max1+=arr[j];
               if(max1>max)
            max = max1;
        if(max1<0)
            max1 = 0;
            }
            System.out.println(max);
        }
    }
}
