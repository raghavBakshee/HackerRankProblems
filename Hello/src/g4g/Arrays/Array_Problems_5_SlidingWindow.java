package g4g.Arrays;

public class Array_Problems_5_SlidingWindow {

    static int maximumSumKConsecutiveElements_Efficient(int arr[], int n, int k){
        int res = Integer.MIN_VALUE;
    	int sum = 0;
    	for(int i = 0; i < k; i++){
    	    sum += arr[i];
    	}
    	res = sum;
    	for(int i = 1; i + k <= n; i++){
    	    sum = sum + arr[i + k - 1] - arr[i - 1];
    	    res = Math.max(res, sum);
    	}
    	return res;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 30, -5, 20, 7 };
        System.out.println(maximumSumKConsecutiveElements_Efficient(arr, arr.length, 4));


    }
}
