/**
 * 
 */
package letsLeetCode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Raghav
 *
 */
public class ArrayIntro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		int[] array1 = new int[3];
		int[] array2 = {20,3,14,5};
		
		for (int i=0;i<array1.length;i++)
		{
			array1[i]= sc.nextInt();
						
		}
		
		/*for (int i=0;i<array1.length;i++)
		{
			System.out.println(array1[i]);
			System.out.println(array2[i]);
						
		}*/
		
		
		for (int item: array2)
		{
			System.out.println(item);
			
		}
		Arrays.sort(array2);
		for (int item: array2)
		{
			System.out.println(item);
			
		}
		
	sc.close();	
		
	}

}
