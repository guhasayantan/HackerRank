package Algorithms.Warmup;
import java.util.*;
public class SimpleArraySum {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int x = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
        	arr[arr_i] = in.nextInt();
        	x += arr[arr_i];
        }
        System.out.print(x);
    }
}
