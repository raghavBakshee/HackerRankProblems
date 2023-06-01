package g4g.Searching;

public class Problem35_SearchInsert {
    public static int searchInsert(int[] arr, int x) {
        int mid, low, high;
        low = 0; high = arr.length - 1;
        if(arr[low] > x) return 0;
        if(arr[high] < x) return high + 1;
        while(low < high){
            mid = low + (high - low)/2;
            if(arr[mid] == x) return mid;
            else if(arr[mid] > x) high = mid;
            else if(arr[mid] < x) low = mid + 1;
        }
        return high;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        System.out.println(searchInsert(arr, 2));
    }
}
