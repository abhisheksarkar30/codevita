import java.util.*;
public class income {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),arr[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            arr[i-1]=sc.nextInt();
            if(i!=1&&arr[i-1]<arr[i-2])
            Arrays.sort(arr,0,i);
            if(i%2==1)
            System.out.printf("%.2f ", 1.0*arr[((i+1)/2)-1]);
            else
                System.out.printf("%.2f ", (arr[i/2]+arr[i/2-1])/2.0);
        }
    }
}
