import java.util.*;
class MaximizeTheEarning {
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int noOfStreets = sc.nextInt(); 
        sc.close();
       while(noOfStreets-- > 0 )
        {
            int n = sc.nextInt();
            int r = sc.nextInt();
            int max = 0, count = 0;
            while(n-- > 0){
                int height = sc.nextInt();
                if(height > max){
                    max = height;
                    count++;
                }
            }
            System.out.println(count*r);
        }
    }
}
