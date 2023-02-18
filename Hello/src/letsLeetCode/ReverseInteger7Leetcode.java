package letsLeetCode;

class ReverseInteger7Leetcode {
    public static int reverse(int x) {
        boolean isNegative = false;
        isNegative = x < 0 ? true : false;
        if(isNegative)
        x = -x;
        long res = 0;
        while(x != 0)
        {
            res = res * 10 + (x % 10);
            x = x/10;
        }
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return 0;
        if(isNegative)
            res = -res;
        
        return (int)res;

    }
    public static void main(String[] args) {
        System.out.println(reverse(56565)); 
    }
}