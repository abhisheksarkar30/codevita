import java.util.*;
public class football {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String team[]=sc.nextLine().split(" ");
        HashMap<String,Integer> match,gf,ga,pts;  
        match = new HashMap<>();
        gf = new HashMap<>();
        ga = new HashMap<>();
        pts = new HashMap<>();
        int m=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            match.put(team[i].toLowerCase(), 0);
            gf.put(team[i].toLowerCase(), 0);
            ga.put(team[i].toLowerCase(), 0);
            pts.put(team[i].toLowerCase(), 0);
        }
        sc.nextLine();
            
        for(int i=0;i<m;i++)
        {
            String s[]=sc.nextLine().split(" ");
            s[0]=s[0].toLowerCase();
            s[1]=s[1].toLowerCase();
            int s0=Integer.parseInt(s[2]),s1=Integer.parseInt(s[3]);
            if(match.containsKey(s[0])&&match.containsKey(s[1]))
                    if(match.get(s[0])==2||match.get(s[1])==2||s[1].equals(s[0]))
                    {
                        System.out.print("Invalid Input");
                        System.exit(0);
                    }
                    else
                    {
                        match.put(s[0], match.get(s[0])+1);
                        match.put(s[1], match.get(s[1])+1);
                        gf.put(s[0], gf.get(s[0])+s0);
                        gf.put(s[1], gf.get(s[1])+s1);
                        ga.put(s[0], ga.get(s[0])+s1);
                        ga.put(s[1], ga.get(s[1])+s0);
                        if(s0>s1)
                            pts.put(s[0], pts.get(s[0])+2);
                        else if(s0<s1)
                            pts.put(s[1], pts.get(s[1])+2);
                        else
                        {
                            pts.put(s[0], pts.get(s[0])+1);
                            pts.put(s[1], pts.get(s[1])+1);
                        }
                    }            
        }
        for(int i=0;i<n;i++)
        System.out.println(match.get(team[i].toLowerCase())+" "+gf.get(team[i].toLowerCase())+" "+ga.get(team[i].toLowerCase())+" "+pts.get(team[i].toLowerCase()));
       for(int i=0;i<n;i++)
        for(int j=0;j<n-i-1;j++)
        {
            if(pts.get(team[j].toLowerCase())<pts.get(team[j+1].toLowerCase()))
            {
                String t=team[j];
                team[j]=team[j+1];
                team[j+1]=t;
            }
            else if(pts.get(team[j].toLowerCase())==pts.get(team[j+1].toLowerCase()))
            {
                int gd0=gf.get(team[j].toLowerCase())-ga.get(team[j].toLowerCase()),
                        gd1=gf.get(team[j+1].toLowerCase())-ga.get(team[j+1].toLowerCase());
                if(gd0<gd1)
            {
                String t=team[j];
                team[j]=team[j+1];
                team[j+1]=t;
            }
            else if(gd0==gd1)
            {
                if(gf.get(team[j].toLowerCase())<gf.get(team[j+1].toLowerCase()))
            {
                String t=team[j];
                team[j]=team[j+1];
                team[j+1]=t;
            }
            else if(gf.get(team[j].toLowerCase())==gf.get(team[j+1].toLowerCase()))
            {
                if(team[j].compareToIgnoreCase(team[j+1])>0)
            {
                String t=team[j];
                team[j]=team[j+1];
                team[j+1]=t;
            }
            }
            }
            }
        }
       for(int i=0;i<n;i++)
                System.out.println(team[i]);
    }
}
