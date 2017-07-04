import java.util.Scanner;
 
/**
 *
 * @author User
 */
class LostRobot {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0){
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            
            if(x1 == x2){
                if(y2 > y1)
                    System.out.println("up");
                else if(y1 > y2)
                    System.out.println("down");
            }else if(y1 == y2){
                if(x2 > x1)
                    System.out.println("right");
                else if(x1 > x2)
                    System.out.println("left");
            }else
                System.out.println("sad");
        }
    }
    
}
