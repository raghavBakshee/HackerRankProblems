package g4g.Searching;

public class BinarySearch_Firstoccurence {

    public static int firstOccurence(int arr[], int x){
        int low, high;
        low = 0; high = arr.length - 1;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low)/2;
            if(arr[mid] > x) high = mid -1;
            else if(arr[mid] < x) low = mid + 1;
            else{
                if(mid == 0 || arr[mid - 1] != arr[mid]) return mid;
                else high = mid - 1;
            }
        }
        return -1;
    }

    public static int lastOccurence(int arr[], int x){
        int low, high;
        int n = arr.length;
        low = 0; high = n - 1;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low)/2;
            if(arr[mid] > x) high = mid -1;
            else if(arr[mid] < x) low = mid + 1;
            else{
                if((mid == (n - 1)) || arr[mid + 1] != arr[mid]) return mid;
                else low = mid + 1;
            }
        }
        return -1;
    }

    public static int squareRoot(int x){
        int mid, low, high, ans = 0;
        low = 1; high = x;
        while(low <= high){
            mid = low + (high - low)/2;
            if(mid == x/mid) return mid; //Don't use mid*mid == x, Integer overflow
            else if(mid > x /mid) high = mid -1; //Don't use mid*mid > x, Integer overflow
            else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 40, 40, 40,40,40, 40, 60 };
        System.out.println(firstOccurence(arr, 40));

        int arr2[] = { 5, 10, 10, 20, 20 };
        System.out.println(firstOccurence(arr2, 10));

        int arr3[] = { 10, 20, 30, 40, 40, 40, 40,40,40, 40, 60 };
        System.out.println(lastOccurence(arr3, 40));

        int arr4[] = { 5, 10, 10, 20, 20 };
        System.out.println(lastOccurence(arr4, 10));

        System.out.println(squareRoot(353434));
    }
}
