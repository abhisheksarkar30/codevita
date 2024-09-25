import java.io.*;
import java.util.*;
public class continento {
    static final int rows=15, cols=60;
    List<Integer> ar=new ArrayList<>();
	public static void main (String[] args) throws FileNotFoundException
    {
        Scanner sc1=new Scanner(System.in);
        Scanner sc=new Scanner(new File(""+sc1.nextLine()));
        
        char world[][]=new char[rows][cols];
        int i=0;
        while(i<rows){
            char co[]=sc.nextLine().toCharArray();
            int j=0;
            while(j<cols){
                world[i][j]=co[j];
                j++;
            }
            i++;
        }
        
        continento obj = new continento();
        int continents=obj.cnt(world);
        Collections.sort(obj.ar);
        int index=1;
        i=obj.ar.size();
        while(i>0){
            System.out.println("continent "+(index++)+": "+obj.ar.get(i-1));
            i--;
        }
        
        System.out.print("Number of continents: "+continents);
    }
    
    boolean chk(char M[][], int r, int c,
                   boolean vstd[][])
    {
        return (r >= 0) && (r < rows) &&
               (c >= 0) && (c < cols) &&
               (M[r][c]=='#' && !vstd[r][c]);
    }
    int co;
    void dfs(char M[][], int r, int c, boolean vstd[][])
    {
        int rowco[] = {-1, -1, -1,  0, 0,  1, 1, 1};
        int colco[] = {-1,  0,  1, -1, 1, -1, 0, 1};
        vstd[r][c] = true;
        int k = 0;
        while ( k < 8){
            if (chk(M,r+rowco[k],c+colco[k],vstd) ){
                co++;    
                dfs(M,r+rowco[k],c+colco[k],vstd);
            }
            ++k;}
    }
    int cnt(char M[][])
    {
        
        boolean vstd[][] = new boolean[rows][cols];
        int cnt = 0,i = 0;
        while ( i < rows){
            int j = 0;
            while ( j < cols ){
			
                if (M[i][j]=='#' && !vstd[i][j]){
                    co=1;
                    dfs(M, i, j, vstd);
                    ++cnt;
                    ar.add(co);
                    
                }
                ++j;}
				++i;}
 
        return cnt;
    }
    
}