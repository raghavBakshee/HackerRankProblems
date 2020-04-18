import java.math.BigInteger;
import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int k = sc.nextInt();
			System.out.println(fact(k)/fact(k-n));
			
		}
	}
	public static int fact(int a){
		if(a<=1)
			return 1;
		return a * fact(a-1);
	}

}
