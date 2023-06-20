package g4g.Arrays;

public class Array_Problems {
    public static int removeDuplicatesReturnNewSize(int arr[]){
        int res = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[res - 1]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    public static int[] moveZeroesToEnd(int arr[]){
        int pointer = 0;
	    for(int i = 0; i < arr.length; i++){
	        if(arr[i] != 0){
	            arr[pointer++] = arr[i];
	        }
	    }
	    while(pointer < arr.length){
	        arr[pointer++] = 0;
	    }
        return arr;
    }
    static void leadersInArrayNaiveApproach(int arr[]){
        for(int i = 0; i < arr.length; i++){
            boolean flag = false;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] >= arr[i]){
                    flag = true;
                    break;
                }
            }
            if(flag == false)
            System.out.print(arr[i] + " ");
        }
    }

    static void leadersInArrayEfficientApproach(int arr[]){
        int curr_leader = arr[arr.length - 1];
        System.out.print(curr_leader + " ");
        for(int i = arr.length - 2; i >= 0; i--){
            if(curr_leader < arr[i]){
                curr_leader = arr[i];
                System.out.print(curr_leader + " ");
            }
        }
    }

    public static int maxDifferenceInArrayNaiveApproach(int arr[]){
       // Maximum value of a[j] - a[i], such that j > i
       // I/P = [2, 3, 10, 6, 4, 8, 1]
       // O/P = 8 {10 -2}
       int res = arr[1] - arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                // if(arr[j] - arr[i] > res)
                //     res = arr[j] - arr[i];
                res = Math.max(res, arr[j] - arr[i]);
            }
        }
        
        return res;
    } 

    public static int maxDifferenceInArrayEfficientApproach(int arr[]){
        // Maximum value of a[j] - a[i], such that j > i
        // I/P = [2, 3, 10, 6, 4, 8, 1]
        // O/P = 8 {10 -2}
        int res = arr[1] - arr[0];
        int minVal = arr[0];
        for(int j = 1; j < arr.length; j++){
            res = Math.max(res, arr[j] - minVal);
            minVal = Math.min(minVal, arr[j]);
        }
         return res;
     } 

     public static int equilibriumPoint(int arr[]){
        int n = arr.length; 
        int left = 0, right = 0, pivot = 0;
      for(int i = 1; i < n; i++){
          right += arr[i];
      }
      while(pivot < n - 1 && right != left){
          pivot++;
          right -= arr[pivot];
          left += arr[pivot - 1];
      }
      return left==right ? pivot + 1 : -1;
     } 

    public static void main(String[] args) {
        System.out.println(removeDuplicatesReturnNewSize(new int[]{10, 20, 20, 30, 30, 40}));
        int arr[] = moveZeroesToEnd(new int[]{1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9});
        for(int a : arr){
            System.out.print(a + " ");
        };
        System.out.println(" ");
        leadersInArrayNaiveApproach(new int[]{7, 10, 4, 10, 6, 5, 2, 3});
        System.out.println(" ");
        leadersInArrayEfficientApproach(new int[]{7, 10, 4, 10, 6, 5, 2, 3});

        System.out.println(maxDifferenceInArrayNaiveApproach(new int[]{2, 3, 10, 6, 4, 8, 1}));
        System.out.println(maxDifferenceInArrayNaiveApproach(new int[]{30, 10, 8, 2}));
        System.out.println(maxDifferenceInArrayEfficientApproach(new int[]{2, 3, 10, 6, 4, 8, 1}));
        System.out.println(maxDifferenceInArrayEfficientApproach(new int[]{30, 10, 8, 2}));


    }
}
