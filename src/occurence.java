import java.util.*;
public class occurence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a=sc.nextInt(),b=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            char s[]=sc.next().toCharArray();
            if(s[0]=='A')
            {
                int co=0;
                for(int j=a;j<=b;j++)
                {
                    char c[]=(""+j).toCharArray();
                    int f=1;
                    for(int k=0;k<c.length;k+=2)
                    if(c[k]!=s[1])
                    {f=0;break;}
                    if(f==1&&c.length>=3)
                    {co++;continue;}
                    f=0;
                    for(int k=1;k<c.length;k+=2)
                    if(c[k]==s[1])
                    f++;
                    if(f==(c.length/2)&&f>1)
                    co++;
                }
                System.out.println(co);
            }
            else if(s[0]=='C')
            {
                int co=0;
                String c="";
                for(int j=0;j<(s[1]-48);j++)
                c+=s[2];
                for(int j=a;j<=b;j++)
                if((""+j).contains(c))
                co++;
                System.out.println(co);
            }
            else
            {
                int co=0;
                for(int j=a;j<=b;j++)
                {
                    char c[]=(""+j).toCharArray();
                    if(c[0]==s[0]&&s.length==c.length)
                    {
                        int f=1;
                        for(int k=1;k<c.length;k++)
                        if(s[k]!='W'&&c[k]!=s[k])
                        {f=0;break;}
                        if(f==1)
                        co++;
                    }
                }
                System.out.println(co);
            }
        }
    }
}