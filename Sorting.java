import java.util.Arrays;

public class Sorting {
   
//     public static void print(int[]arr){
//          System.out.print("[");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]);
//             if(i != arr.length -1 ){
//             System.out.print(", ");
//             }
//         }
//         System.out.println("]");
//     }
//     public static void Bubble_sort(int[]arr){
//         for (int i = 0; i < arr.length -1 ; i++) {
//             for (int j = 0; j <arr.length-i-1; j++) {
                
//         if (arr[j]>arr[j+1]) {
//             int temp =arr[j+1];
//             arr[j+1]=arr[j];
//             arr[j] = temp;
//          }
//        } 
//        print(arr);
//     }
// }
//     public static void Select_sort(int [] arr){
//         int last = arr.length-1;
//         int max = 0;
//         for(int i = 0 ; i < arr.length-1 ; i++){
//             for(int j = 1 ; j < arr.length; j++){
//                 if(arr[j] > arr[max]){
//                     max = j;
//                 }
//                     int temp = arr[last];
//                     arr[last] = arr[max];
//                     arr[max] = temp;
//                 }
//             }
//             print(arr);
//         }
    
    
//         public static void Selection_Sort(int[] arr){
//             int n = arr.length;
//            for (int i = 0; i < n-1; i++) {
//                 int min= i;
//             for (int j = i+1; j < n; j++) {
//                 if (arr[j]<arr[min]){
//                     min = j;
//             }
//         }
//         int temp = arr[min];
//         arr[min] = arr[i];
//         arr[i] = temp;
//     }
    
//     print(arr);
//         }

public static void cyclic_sort(int[] arr){
    for(int i = 0 ; i <  arr.length  ; i++){
        int correctIndex = arr[i] - 1;
        if(arr[i] != arr[correctIndex]){
            int temp = arr[i];
            arr[i] = arr[correctIndex];
            arr[correctIndex] = temp;
        }
    }
}


 public static void main(String[] args) {
    int[] array = new int[]{5,4,3,2,1};
    cyclic_sort(array);
    System.out.println(Arrays.toString(array));
        // Bubble_sort(array);
        // Selection_Sort(array);
        // Select_sort(array);
            
            
    }
}

