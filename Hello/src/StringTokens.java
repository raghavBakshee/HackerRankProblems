import java.util.StringTokenizer;

public class StringTokens {
	public static void main(String args[]){
	String s ="Helloo this is not joke...Don't make fool? g";
	StringTokenizer st= new StringTokenizer (s);
	while (st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
		
	}
	
	
	
	}
}