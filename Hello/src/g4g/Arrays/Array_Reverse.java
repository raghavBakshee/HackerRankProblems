package g4g.Arrays;

public class Array_Reverse {
    public static int[] reverseArray(int arr[]) {
        int low = 0, high = arr.length - 1;
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low ++;
            high --;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = reverseArray(new int[]{1,2});
        for (int a : arr) {
            System.out.print(a + " ");
        }
        
    }
}
