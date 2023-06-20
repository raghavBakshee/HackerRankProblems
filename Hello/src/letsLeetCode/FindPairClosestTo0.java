package letsLeetCode;

public class FindPairClosestTo0 {
    public static void  findPairSum(int arr[]){
        int minsum = arr[0] + arr[1];
        int temp = 0;
        int index1=0;
        int index2 = 0;
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                temp = arr[i] + arr[j];
                if(Math.abs(temp) < Math.abs(minsum)){
                    index1 = i;
                    index2 = j;
                    minsum = temp;
                }
            }
        }
       System.out.print(arr[index1] + "   "+ arr[index2]);
    }
    public static void main(String[] args) {
        findPairSum(new int[] {1,3,-5,7,8,20,-40,6});
        //System.out.println("Hello, World!");
    }
}
