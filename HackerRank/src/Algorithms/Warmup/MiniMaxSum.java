package Algorithms.Warmup;
import java.util.*;
public class MiniMaxSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		long e = in.nextLong();
		long x1 = b + c + d +e;
		long x2 = a + c + d +e;
		long x3 = a + b + d +e;
		long x4 = a + b + c +e;
		long x5 = a + b + c +d;
		
		long max = Math.max(x1, Math.max(x2, Math.max(x3, Math.max(x4, x5))));
		long min = Math.min(x1, Math.min(x2, Math.min(x3, Math.min(x4, x5))));
		
		System.out.print(min + " " + max);

	}

}
