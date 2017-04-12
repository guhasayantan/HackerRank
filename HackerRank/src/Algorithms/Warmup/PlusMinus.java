package Algorithms.Warmup;
import java.util.*;
public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        int cpos =0 , cneg =0 , czero =0;
        for (int i =0; i<arr.length; i++){
        	if(arr[i] > 0)
        		++cpos;
        	else if (arr[i] < 0)
        		++cneg;
        	else if(arr[i] == 0)
        		++czero;
        }
        System.out.println((float)cpos/arr.length);
        System.out.println((float)cneg/arr.length);
        System.out.println((float)czero/arr.length);
	}

}
