package g4g.Arrays;

public class Array_Largest {
    public static int largestElement(int arr[]){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int secondlargestElement(int arr[]){
        int max = arr[0];
        int secondMax = -1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
                
            if(arr[i] != max)
                if(secondMax < max && secondMax < arr[i])
                    secondMax = arr[i];
        }
        
        return secondMax;
    }

    public static int largestElementIndex(int arr[]){
        int largest = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[largest])
                largest = i;
        }
        return largest;
    }

    public static int secondLargestElementIndex(int arr[]){
        int largest = 0;
        int res = -1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            }
            else if(arr[i] != arr[largest]){
                if(res == -1 || arr[res] < arr[i])
                    res = i;
            }
        }
        return res;
    }

    
    
    public static void main(String[] args) {
        System.out.println(largestElement(new int[]{1,40,18,39,7,-89}));
        System.out.println(secondlargestElement(new int[]{1,40,40,40,7,90,90,50}));
        System.out.println(largestElementIndex(new int[]{1,40,18,39,7,89}));
        System.out.println(secondLargestElementIndex(new int[]{1,40,40,89,7,89}));
    }
}
