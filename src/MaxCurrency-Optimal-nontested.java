import java.util.Scanner;

/**
 * @author abhis
 *
 */
public class MaxCurrency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int ct1 = sc.nextInt();
		int ct2 = sc.nextInt();
		int ct3 = sc.nextInt();
		int ct4 = sc.nextInt();
		
		int sum = 0, cu = 0, hcu = 0;
		int t,tc,d,g;
		
		for(int w = ct1; w >= 0; w--) {
			d = 100;
			g = w;
			t = sum + d*g;
			tc = cu + g;
			if(t > a || tc > n)
				continue;
			else if (t == a) {
				cu += g;
				sum += d*g;
				//System.out.println(w);
				if(hcu < cu)
					hcu = cu;
			} else {
				cu += g;
				sum += d*g;
			}
			
			if(sum != a)
			for(int x = ct2; x >= 0; x--) {
				d = 200;
				g = x;
				t = sum + d*g;
				tc = cu + g;
				if(t > a || tc > n)
					continue;
				else if (t == a) {
					cu += g;
					sum += d*g;
					//System.out.println(w + " " + x);
					if(hcu < cu)
						hcu = cu;
				} else {
					cu += g;
					sum += d*g;
				}
				
				if(sum != a)
				for(int y = ct3; y >= 0; y--) {
					d = 500;
					g = y;
					t = sum + d*g;
					tc = cu + g;
					if(t > a || tc > n)
						continue;
					else if (t == a) {
						cu += g;
						sum += d*g;
						//System.out.println(w + " " + x + " " + y);
						if(hcu < cu)
							hcu = cu;
					} else {
						cu += g;
						sum += d*g;
					}
					
					if(sum != a)
					for(int z = ct4; z >= 0; z--) {
						d = 1000;
						g = z;
						t = sum + d*g;
						tc = cu + g;
						if (t == a && tc <= n) {
							cu += g;
							sum += d*g;
							//System.out.println(w + " " + x + " " + y + " " + z);
							if(hcu < cu)
								hcu = cu;
							break;
						} else if((a-sum)%d != 0) {
							break;
						} else {
							z = (a-sum)/d + 1;
						}
					}
					d = 500;
					g = y;
					cu -= g;
					sum -= d*g;
				}
				d = 200;
				g = x;
				cu -= g;
				sum -= d*g;
			}
			d = 100;
			g = w;
			cu -= g;
			sum -= d*g;
		}
		System.out.println(hcu);
		sc.close();
	}

}
