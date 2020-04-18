import java.util.Scanner;

public class CheckStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
		sc.close();
		System.out.println(isStringPalindrome(S1));

	}

	public static boolean isStringPalindrome(String Str){
		int n= Str.length();
		for(int i=0; i< n;i++)
			if(Str.charAt(i) != Str.charAt(n-1-i))
				return false;


		return true;


	}

}
