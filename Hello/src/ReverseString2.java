import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S= sc.next();
		sc.close();
		System.out.println(reverseString1(S));
	}
	
	public static String reverseString1(String Str){
		int n=Str.length();
		String S2="";
		for(int i=n-1; i>=0;i--){
			S2 = S2 + Str.charAt(i);
			
		}
		return S2;
	}

}
