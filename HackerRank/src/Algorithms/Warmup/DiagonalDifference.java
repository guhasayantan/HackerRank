package Algorithms.Warmup;
import java.util.*;
public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int D1 = 0, D2 = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        for (int i =0 ; i < n ; i++) {
        	D1 += a[i][i];
        }
        for (int j =0 ; j < n ; j++) {
        	D2 += a[j][n -1 -j];
        }
        
        System.out.print(Math.abs(D1-D2));
	}

}
