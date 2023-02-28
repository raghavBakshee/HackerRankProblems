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
    public static void main(String[] args) {
        System.out.println(removeDuplicatesReturnNewSize(new int[]{10, 20, 20, 30, 30, 40}));

        int arr[] = moveZeroesToEnd(new int[]{8,5,0,10,0,20,0});
        for(int a : arr){
            System.out.print(a + " ");
        };
    }
}
