import java.util.Scanner;
class PairSum {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] numbers = new int[N];
        for(int i=0;i<numbers.length;i++){
        	numbers[i]= s.nextInt();}
        s.close();
                	
        	int maximum = numbers[0];
        
        for (int c = 0; c < numbers.length; c++)
        {
          if (numbers[c] > maximum)
          {
             maximum  = numbers[c];
          }
        }	
        	
        PairSum.getPairsCount(numbers,maximum);
    }

    public static void getPairsCount(int[] arr, int sum)
    {
 
        int count = 0;// Initialize result
 
        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;
 
        System.out.println(count);
    }
}
