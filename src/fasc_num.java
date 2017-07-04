package codevita;

import java.util.*;
public class fasc_num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        fasc_num ob=new fasc_num();
        ArrayList<Integer> ar=new ArrayList<Integer>();
        int num[][]={{19,2},{2,19},{27,3},{3,27}};
        int a=sc.nextInt(),b=sc.nextInt();
//        for(int i=a;i<=b;i++)
//        {
//            if(ar.indexOf(i)<0&&ob.check(i))
//            System.out.println(i);
//            if((i*10)<=b&&ob.check(i*10))
//            ar.add(i*10);
//        }
        label:
        for(int i=(""+a).length();;i++)
        {
            for(int j=0;j<4;j++)
            {
                int temp=(int)(num[j][0]*Math.pow(10,j%2==0?i-2:i-1)+num[j][1]);
                if(temp>=a&&temp<=b)
                    System.out.println(temp);
                else if(temp>b)
                    break label;
            }
        }
    } 
    public boolean check(int n)
    {
        int a[]=new int[10];
        char c[]=(String.valueOf(n)+(n*2)+(n*3)).toCharArray();
        for(int i=0;i<c.length;i++)
        a[c[i]-48]++;
        for(int i=1;i<10;i++)
        if(a[i]!=1)
        return false;
        return true;
    }
}