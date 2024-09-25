import java.util.*;
public class milkman{

 private static Scanner in;
 public static void main(String[] args) {
  in = new Scanner(System.in);
  int n,v,u,m,m1,s,s1,i,v1,w1;
  int l[]=new int[9999];
  try
  {
  n=in.nextInt();
   if((n>=1)&&(n<=1000))
   {
    for(i=1;i<=n;i++)
    {
     if((i>=1)&&(i<=n))
     {
      l[i]=in.nextInt();
     }
    }
    for(i=1;i<=n;i++)
    {
     if(l[i]>0)
     {
      
      if(l[i]<=9)
      {
        if((l[i]==1)||(l[i]==5)||(l[i]==7))
       {
        int a1=1;
        System.out.println(a1);
       }
        if((l[i]==2)||(l[i]==6)||(l[i]==8))
       {
        int a2=2;
        System.out.println(a2);
       }
        if((l[i]==3)||(l[i]==9))
       {
        int a3=3;
        System.out.println(a3);
        
       }
        if(l[i]==4)
       {
        int a4=4;
        System.out.println(a4);
       }
      }
      int z=l[i]/10;
      v=z-1;
      u=l[i]%10;
      if(l[i]>=10)
      {
      if(u==0)
      {
       System.out.println(z);
      }
      if((u==1)||(u==5)||(u==7))
      {
       v1=z+1;
       System.out.println(v1);
      }
      if((u==2)||(u==4))
      {
       m=2;
       m1=v+m;
       System.out.println(m1);
      }
      if((u==3)||(u==9))
      {
       s=3;
       s1=v+s;
       System.out.println(s1);
      }
       if((u==6)||(u==8))
      {
       int k1=z+2;
       System.out.println(k1);
      }
      }
     }
    }
   }
   
  }
  catch(Exception e)
  {
   
  }

 }

}