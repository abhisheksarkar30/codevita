import java.util.Scanner;
public class catsdogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		long[] a=new long[n];
		long[] b=new long[n];
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextLong();
				b[i]=sc.nextLong();
			}
		for(i=0;i<n;i++)
		{
			long c=a[i];
			long d=b[i];
			//System.out.println(c+" "+d);
			
			long di=Math.abs(c-d);
			//System.out.println(di);
                        System.out.print((di>c||di>d)?-1:di==0?1:di);
			if(i!=n-1)
                            System.out.println();
			
		}
	}

}
