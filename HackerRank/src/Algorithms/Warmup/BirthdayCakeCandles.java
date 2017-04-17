package Algorithms.Warmup;
import java.util.*;
public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        long count = 1;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        Arrays.sort(height);
        for (int i = 1; i < height.length; i++){
        	if (height[i-1] == height[i]){
        		++count;
        	}
        	else{
        		count=1;
        	}
        
        }
        System.out.print(count);

	}

}
