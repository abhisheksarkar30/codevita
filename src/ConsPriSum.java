
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsPriSum {
    public static boolean isPrime(long n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long inp=Long.parseLong(br.readLine());
        long sum=2,cnt=0;
        for(long i=3;i<=inp/2;i++){
            if(isPrime(i)){
                sum=sum+i;
                if(sum<=inp){
                    if(isPrime(sum)){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
