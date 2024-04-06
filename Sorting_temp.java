import java.util.Arrays;

public class Sorting_temp {
    public static void Select_sort(int [] arr){
        int last = arr.length-1;
        int max = 0;
        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = 1 ; j < arr.length; j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
                    int temp = arr[last];
                    arr[last] = arr[max];
                    arr[max] = temp;
                }
            }
        }
    
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 8, 10, -2};
        Select_sort(array);
        System.out.println(Arrays.toString(array));
    }
    
}
