import java.util.*;
public class compiler
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        compiler ob=new compiler();
        int T=sc.nextInt();
        sc.nextLine();
        label:
        for(int i=0;i<T;i++)
        {
            char c[]=sc.nextLine().toCharArray();
            char t[]=new char[c.length/2];
            if(c[0]!='{'||c[c.length-1]!='}')
            {
                System.out.println("Compilation Errors");
                continue;
            }
            int in=0,pc=-1,bc=0;
            for(int j=1;j<c.length-1;j++)
            {
                switch(c[j])
                {
                    case '{':   if(ob.check(t,in,'<')||ob.check(t,in,'('))
                                t[in++]=c[j];
                                else
                                {
                                    System.out.println("Compilation Errors");
                                    continue label;
                                }   
                                break;
                    case '<':   bc++;
                                if(!ob.check(t,in,'<')&&!ob.check(t,in,'(')&&!ob.check(t,in,'{')&&bc==1)
                                t[in++]=c[j]; 
                                else
                                {
                                    System.out.println("Compilation Errors");
                                    continue label;
                                }
                                break;
                    case '(':   if(!ob.check(t,in,'<')&&!ob.check(t,in,'(')&&!ob.check(t,in,'{'))
                                {
                                    t[in++]=c[j];
                                    pc=0;
                                }
                                else
                                {
                                    System.out.println("Compilation Errors");
                                    continue label;
                                }
                                break;
                    case '}':   if(in!=0&&t[in-1]=='{')
                                t[--in]=0;
                                else
                                {
                                    System.out.println("Compilation Errors");
                                    continue label;
                                }
                                break;
                    case '>':   if(in!=0&&t[in-1]=='<')
                                t[--in]=0;
                                else
                                {
                                    System.out.println("Compilation Errors");
                                    continue label;
                                }
                                break;
                    case ')':   if(in!=0&&t[in-1]=='(')
                                {t[--in]=0;pc=-1;}
                                else
                                {
                                    System.out.println("Compilation Errors");
                                    continue label;
                                }
                                break;
                    case 'P':   if(pc!=-1)
                                pc++;
                                if(pc>100)
                                {
                                    System.out.println("Compilation Errors");
                                    continue label;
                                }
                }
            }
            if(in==0&&bc==1)
            System.out.println("No Compilation Errors");
            else
            System.out.println("Compilation Errors");
        }
    }
    public boolean check(char t[],int in,char c)
    {
        for(int i=0;i<in;i++)
        if(t[i]==c)
        return true;
        return false;
    }
}