
import java.io.*;
public class LogicPyramid {
    public static String pad_str(String n){
        int len=n.length();
        String g="";
        if(len<5){
            for(int i=0;i<5-len;i++)
             g=g+"0";
             return g.concat(n);
        }else{
            return n;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int inp=Integer.parseInt(br.readLine());
        int num=2;
        String val="",valhex="";
        for(int i=1;i<=inp;i++){
            for(int m=1;m<=inp-i;m++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                valhex=String.valueOf(num*((2*num)-1));
                val=pad_str(valhex);
                num+=2;
                System.out.print(val+" ");
            }
            if(i!=inp)
            System.out.println();
        }
    }
}
