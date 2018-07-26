import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringCompare
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String S= sc.next();
		int count= sc.nextInt();
		sc.close();
		printStringCompare(S,count);
		
	}
	
	public static void printStringCompare(String S,int count)
	{
		List <String> list= new ArrayList<String>();
		
		for(int i=0; i<S.length();i++)
		{
			if(S.length()-i>=count)
			list.add(S.substring(i,count+i));				
			
		}
		Collections.sort(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
				
		
	}

}