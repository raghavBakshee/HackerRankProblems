import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String S= sc.next();
		sc.close();
		if(printReverse(S))
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

	/*public static void printReverse(String S)
	{		String S1= "";
			for(int i=S.length()-1;i>=0;i--)
			S1=S1+S.charAt(i);
			
			if(S1.equalsIgnoreCase(S))
				System.out.println("Yes");
			else
				System.out.println("No");
		
	}*/
	

	public static boolean printReverse(String S)
	{		
		int n= S.length();
		for (int i =0; i<n/2;i++)
			if(S.charAt(i)!=S.charAt(n-1-i))
				return false;
			
			
				return true;
		
	}
	
	
}
