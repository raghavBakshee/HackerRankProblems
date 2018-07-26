import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S= sc.next();
		sc.close();
		System.out.println(reverseByMethod1(S));	
		
	}
	
	public static String reverseByMethod1(String oldstring)
	{
		char ch[]= oldstring.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
			rev= rev+ch[i];
	return rev;
	
	}

}

