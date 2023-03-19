package g4g.Arrays;

public class Array_Problems_2 {
    public static void frequenciesInSortedArray(int arr[]){
        // I/p = [10, 10, 10, 25, 30, 30]
        // O/p = 10 3
        //       25 1
        //       30 2
        int pointer = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] == arr[i]){
                pointer++;
            }
            else{
                System.out.println(arr[i - 1] + " " + pointer);
                pointer = 1;
            }
        }
        System.out.print(arr[arr.length - 1] + " " + pointer );            
    }

    public static void main(String[] args) {
        frequenciesInSortedArray(new int[]{10, 10, 10, 25, 30, 30});
        System.out.println();
        frequenciesInSortedArray(new int[]{10, 10, 10, 10});
        System.out.println();
        frequenciesInSortedArray(new int[]{10, 20, 30});
    }
}
