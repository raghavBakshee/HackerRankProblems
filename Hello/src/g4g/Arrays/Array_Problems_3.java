package g4g.Arrays;

public class Array_Problems_3 {
    static int trappingRainWater_Naive(int arr[], int n)
    {
        int res = 0;
        for(int i = 1; i < n - 1; i++){
            
            int lmax = arr[i];
            for(int j = 0; j < i; j++)
                lmax = Math.max(lmax, arr[j]);
            
            int rmax = arr[i];
            for(int j = i + 1; j < n; j++)
                rmax = Math.max(rmax, arr[j]);
                
        res += Math.min(lmax, rmax) - arr[i];  
        }
        return res;
    }

    static int trappingRainWater_Efficient(int arr[], int n){
        // {3, 0, 1, 2, 5}
        int res = 0;
        int lmax []= new int[n];
        int rmax[]= new int[n];
        
        lmax[0] = arr[0];
        for(int i = 1; i < n; i++)
            lmax[i] = Math.max(arr[i], lmax[i - 1]);

        rmax[n - 1] = arr[n - 1];
        for(int i = n - 2; i >= 0; i--)
            rmax[i] = Math.max(arr[i], rmax[i + 1]);

        for(int i = 1; i < n - 1; i++)
            res = res + (Math.min(lmax[i], rmax[i]) - arr[i]);

        return res;
    }

    public static void main(String[] args) {
      int arr[] = {3, 0, 1, 2, 5}, n = 5;
      System.out.println( trappingRainWater_Naive(arr, n));

      int arr1[] = {3, 0, 1, 2, 5}, n1 = 5;
      System.out.println( trappingRainWater_Efficient(arr1, n1));
    }
}
