package Algorithms.Warmup;
import java.util.*;
public class CompareTriplets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int A[] = {a0, a1, a2};
        int B[] = {b0, b1, b2};
        int Apt =0 , Bpt = 0;
        for (int i=0; i < A.length; i++){
        	if(A[i] <= 0 || A[i] > 100 || B[i] <= 0 || B[i] > 100){
        		System.exit(0);
        	}
        	if (A[i] > B [i]){
        		Apt += 1;
        	}
        	else if (A[i] < B [i]){
        		Bpt += 1;
        	}
        	else if (A[i] == B [i]){
        		Apt += 0;
        		Bpt += 0;
        	}
        }
        System.out.print(Apt + " " + Bpt);
	}

}
