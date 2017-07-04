import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeChk {
    public static boolean isPrime(int num) {
        int to = (int) Math.sqrt(num) + 1;
        if(num==2)
            return true;
        else{
            for (int i = 2; i <= to; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return num > 1 && true;
        }
    }
    public static void main(String[] args) throws IOException {
        int n,i,j,p = 0,q=1,l=0,z,k;
        int a[]=new int[30];
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        n=Integer.parseInt(br.readLine());
        i=Integer.parseInt(br.readLine());
        for(j=2;j<=n;j++)
        {
            if(isPrime(j)){
                p=j;
                for(k=0;k<i;k++)
                {
                    p=2*p+1;
                    if(isPrime(p)==false)
                    {
                        break;
                    }
                }
                if(isPrime(p)==true)
                    a[l++]=j;
            }
        }
        
        
        for(j=0;j<l;j++)
        {
            System.out.printf("%d ",a[j]);
        }
    }
}
