import java.util.*;
public class compounding
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try{
        double p=sc.nextDouble(),r=sc.nextDouble(),t=sc.nextDouble(),s=0;
        for(int i=(int)t;i>0;i--)
            s+=p*Math.pow(1+r/12/100,i);
        System.out.printf("Final_Amount %d",Math.round(s));
        }
        catch(Exception e){
        System.out.println("Invalid Input");}
    }
}