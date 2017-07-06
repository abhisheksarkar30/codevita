import java.util.Scanner;

public class rle_string {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int f=0;
        for(int i=0;i<s.length;i++,f=0)
        {
            for(int j=0;j<s[i].length();j++,f=++f%2)
                for(int k=1;k<=s[i].charAt(j)-64;k++)
                    System.out.print(f==0?"0":"!");
            System.out.println();
        }
    }
}
