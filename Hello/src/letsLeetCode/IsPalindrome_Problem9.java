package letsLeetCode;

public class IsPalindrome_Problem9 {
    public static boolean isPalindrome(int x) {
        // //1200021 Leetcode giving exception - NumberFormatException at string ""
        // if(x < 0) return false;
        // if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) return false;
        // int temp = x;
        // long res = 0;
        // String answer = "";
        // while(temp != 0){
        //     res = res * 10 + temp % 10;
        //     answer = answer + temp % 10;
        //     temp = temp / 10;
        // }
        // if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return false;
        // if(Integer.parseInt(answer) == x) return true;
        // return false;

        if(x < 0 || (x % 10 == 0 && x != 0)) return false;
    
        int res = 0;
        while(x > res) //Wow..Amazing logic for stoppoing at the middle of number
        {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return (res == x ) || (res / 10 == x);
    }

    public static void main(String[] args) {
        System.out.println(IsPalindrome_Problem9.isPalindrome(277747474));
    }
}
