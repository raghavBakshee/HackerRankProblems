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

    static int maximumLengthEvenOddSubArray_Naive(int arr[], int n){
        // 5, 10, 20, 6, 3, 8
        int res = 1;
        for(int i = 0; i < n; i++){
            int curr = 1;
            for(int j = i + 1; j < n; j++){
                if((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || 
                (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0)){
                    curr++;
                }
                else break;
            }
            res = Math.max(res, curr);
        }

        return res;
    }

    static int maximumLengthEvenOddSubArrayEfficient(int arr[], int n){
        // {5, 10, 20, 6, 3, 8}; 
        int curr = 1;
        int res = 1;
        for(int i = 1; i < n; i++){
            if((arr[i] % 2 == 0 && arr[i -1] % 2 != 0) ||
            (arr[i] % 2 != 0 && arr[i -1] % 2 == 0)){
                curr ++;
                res = Math.max(res, curr);
            }
            else curr = 1;
        }
        
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 3, -1, 2 };
        System.out.println(maximumSumSubArray_Naive(arr, 5));

        int arr1[] = { -3, 8, -2, 4, -5, 6 };
        System.out.println(maximumSumSubArray_Efficient(arr1, 6));


        int arr2[] = {5, 10, 20, 6, 3, 8};
        System.out.println(maximumLengthEvenOddSubArray_Naive(arr2, 6));
        System.out.println(maximumLengthEvenOddSubArrayEfficient(arr2, 6));

        

    }
}
