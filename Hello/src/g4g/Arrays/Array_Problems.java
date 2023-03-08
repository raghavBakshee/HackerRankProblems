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
    }
}
