import java.util.*;

public class PrimeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Long, Long> prime = new HashMap<Long, Long>();
        long num = sc.nextLong();
        long sum = 2, temp = 3, length, count = 0;
        int ncount = 0;
        boolean flag = false;

        prime.put((long) 0, (long) 2);
        while (sum < num && num > 3) {
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

        sum = 5;
        count = 0;
        for (long i = 2; i < prime.size() - 1; i += 2) {
            flag = false;
            sum += prime.get(i) + prime.get(i + 1);

            if (sum > num) {
                break;
            }

            for (long j = 0; j <= i; j++) {
                long t = prime.get(j);
                count++;
                if (t * t > sum) {
                    break;
                } else if (sum % t == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                ncount++;
            }
        }
        System.out.println(num >= 5 ? ncount + 1 : ncount);
    }
}
