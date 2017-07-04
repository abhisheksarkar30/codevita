import java.util.*;
public class super_ascii
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        if(T<1||T>100)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        String s[]=new String[T];
        for(int i=1;i<=T;i++)
        {
            sc.nextLine();
            s[i-1]=(sc.next()).toLowerCase();
        }
        for(int i=0;i<T;i++)
        {
            char c[]=s[i].toCharArray();
            int f[]=new int[26];
            for(int j=0;j<c.length;j++)
            f[c[j]-97]++;
            int cp=0,cn=0;
            for(int j=0;j<26;j++)
                if(f[j]>(j+1))
                cp+=f[j]-j-1;
                else if(f[j]!=0)
                    cn+=j+1-f[j];
            System.out.println(cp>cn?cn+(cp-cn)*3:cp+(cn-cp)*2);
        }
    }
}
