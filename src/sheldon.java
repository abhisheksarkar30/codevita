import java.util.Scanner;
import java.util.Stack;
public class sheldon
{
	Stack<Integer> lifo = new Stack<Integer>();
     int sum = 0,LifoSize=0;
     static int c=0;
     public void Subset(int[] data, int begin, int last,int t)
     {
      
      int Tsum=t;
         if (sum == Tsum&&LifoSize==3) 
         c++;

          for (int current = begin; current < last; current++)
		  {
              if (sum + data[current] <= Tsum) {
                 lifo.push(data[current]);
                 sum += data[current];
                 LifoSize=lifo.size();
                 Subset(data, current + 1, last,Tsum);
                 sum -= (Integer) lifo.pop();
             }
         }
     }
     public static void main(String [] args)
     {
         sheldon get = new sheldon();
         int t,n;
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         int ip[]=new int[n];
         for(int i=0;i<n;i++)
         {
             ip[i]=sc.nextInt(); 
         }
         t=sc.nextInt();
         get.Subset(ip, 0, ip.length,t);
		if(c>0)
           System.out.print("True");
       else
        System.out.print("False");
     }

}
