package g4g.Math;

public class Math_GCD_LCM {
    //Iterative GCD
    public static int GCD(int a, int b)
    {
       int res = Math.min(a, b);
       while(res > 0)
       {
        if(a % res == 0 && b % res == 0)
            break;
        res--;
       } 
       return res;
    }
    // Eucledian Algo - recursive GCD
    public static int recursiveGCD(int a, int b)
    {
        if(b == 0)
            return a;
        return recursiveGCD(b, a % b);
    }

    //Eucledian algo - to find LCM
    public static int lcm(int a, int b)
    {
        return (a * b)/ recursiveGCD(a, b);
    }

    public static void main(String[] args) {
        System.out.println(Math_GCD_LCM.GCD(100, 200));
        System.out.println(Math_GCD_LCM.recursiveGCD(100, 200));
        System.out.println(Math_GCD_LCM.lcm(4, 6));
    }
}
