import java.util.Scanner;
import java.util.Stack;
public class Sheldon_cooper
{
  private Stack<Integer> stack = new Stack<Integer>();
     private int sumin = 0,sizeStack=0;
     int c=0;
     public void populateSubset(int[] data, int fromIndex, int last,int t)
     {
      
      int TARGET_SUM=t;
         if (sumin == TARGET_SUM) 
         {
           if(sizeStack==3)
              {
             count(stack);
              }
         }

          for (int now = fromIndex; now < last; now++) {

              if (sumin + data[now] <= TARGET_SUM) {
                 stack.push(data[now]);
                 sumin += data[now];
                 sizeStack=stack.size();
                 populateSubset(data, now + 1, last,TARGET_SUM);
                 sumin -= (Integer) stack.pop();
             }
         }
     }
     private void count(Stack<Integer> stack)
     {
      c++;
     }
     void print()
     {
       if(c>0)
           System.out.print("True");
       else
        System.out.print("False");
     }
     public static void main(String [] args)
     {
         Sheldon_cooper get = new Sheldon_cooper();
         int t1,n1,i;
         Scanner sc=new Scanner(System.in);
         n1=sc.nextInt();
         int []ip=new int[n1];
         for(i=0;i<n1;i++)
         {
             ip[i]=sc.nextInt(); 
         }
         t1=sc.nextInt();
         get.populateSubset(ip, 0, ip.length,t1);
        get.print();
     }

}
