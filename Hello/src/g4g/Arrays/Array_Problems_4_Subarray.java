package g4g.Arrays;

public class Array_Problems_4_Subarray {
    static int maximumSumSubArray_Naive(int arr[], int n) {
        // {1, -2, 3, -1, 2}
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i; j < n; j++) {
                curr += arr[j];
                res = Math.max(res, curr);
            }
        }

        return res;
    }

    static int maximumSumSubArray_Efficient(int arr[], int n) {
        int res = arr[0];
        int max = arr[0];;
        // {-3, 8, -2, 4, -5, 6}
        for (int i = 1; i < n; i++) {
            max  = Math.max(max + arr[i], arr[i]);
            res = Math.max(res, max);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 3, -1, 2 };
        System.out.println(maximumSumSubArray_Naive(arr, 5));

        int arr1[] = { -3, 8, -2, 4, -5, 6 };
        System.out.println(maximumSumSubArray_Efficient(arr1, 6));
    }
}
