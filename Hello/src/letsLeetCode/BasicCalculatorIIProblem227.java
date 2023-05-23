package letsLeetCode;

import java.util.Stack;

public class BasicCalculatorIIProblem227 {
 
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
       int num = 0;
       char op = '+';
       char[] chars = s.toCharArray();

       for (int i = 0; i < chars.length; i++) {
           char ch = chars[i];
           if (Character.isDigit(ch)) {
               num = num * 10 + (ch - '0');
           }
           if (!Character.isDigit(ch) && ch != ' ' || i == chars.length - 1) {
               if (op == '+') {
                   stack.push(num);
               } else if (op == '-') {
                   stack.push(-num);
               } else if (op == '*') {
                   stack.push(stack.pop() * num);
               } else if (op == '/') {
                   stack.push(stack.pop() / num);
               }

               num = 0;
               op = ch;
           }
       }

       int result = 0;
       while (!stack.isEmpty()) result += stack.pop();
       return result;
   }
 
    public static void main(String[] args) {
    System.out.println(calculate("3+2* 2 - 1"));
}
}