package g4g;

public class Exactly3Divisors {
    public static boolean isPrime(int N)
    {
        if(N <= 1) return false;
        
        for(int i = 2; i <= Math.sqrt(N); i++)
        {
            if(N % i == 0) 
            return false;
        }
        return true;
    }
    public static int exactly3Divisors(int N)
    {
       int count = 0;
       for(int i = 0; i <= Math.sqrt(N); i++)
       {
           if(isPrime(i))
           count++;
           
       }
       return count;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Exactly3Divisors.exactly3Divisors(67));

    }

}