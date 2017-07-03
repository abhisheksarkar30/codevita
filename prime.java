import java.util.HashMap;
import java.util.Scanner;

public class prime {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Long, Long> prime = new HashMap<Long, Long>();
        long num = 5000000;
        long sum = 2, temp = 3, length, count = 0;
        boolean flag = false;

        prime.put((long) 0, (long) 2);
        while (temp <= num && num > 3) {
            count = 0;
            flag = false;
            length = prime.size();

            while (count < length) {
                long get = prime.get(count);
                if (get * get > temp) {
                    count=length;
                    break;
                } else if (temp % get == 0) {
                    flag = true;
                    break;
                }
                count++;
            }
            if (flag == false) {
                prime.put(count, temp);
                sum += temp;
            }
            temp += 2;
        }
        for(long i=0;i<prime.size();i++)
            System.out.print(prime.get(i)+" ");
        System.out.println("\n\n"+prime.size());
    }
}
