package codevita;

import java.util.*;
public class saving {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int M=sc.nextInt(),T=sc.nextInt();
    double R=sc.nextDouble(),A,I,RM=M;   
    for(T--;T>0;T--)
    {
        A=RM/(1+R/1200);
        I=RM-A;
        RM+=M-I;
    }
    A=RM/(1+R/1200);
    I=RM-A;
    RM-=I;
    System.out.printf("%d",Math.round(RM));
}
}
