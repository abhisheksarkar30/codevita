import java.util.*;

public class concatenate_prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Long, Long> prime = new HashMap<Long, Long>();
        HashMap<Long, Long> store = new HashMap<Long, Long>();
        long num = sc.nextLong();
        long last = 0, temp = 3, length, count = 0,ncount = 0;
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
                last= temp;
            }
            temp += 2;
        }
        int fc=prime.size();
        while (temp <= last*(long)Math.pow(10,(""+last).length())+last && num > 3) {
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
            }
            temp += 2;
        }
        for (long i = 0; i < fc; i++)
            for (long j = 0; j < fc; j++)
            {
                long t=prime.get(i)*(long)Math.pow(10,(""+prime.get(j)).length())+prime.get(j);
                if(!store.containsValue(t)&&prime.containsValue(t))
                    store.put(ncount++,t);
            }
        System.out.println(ncount);
    }
}