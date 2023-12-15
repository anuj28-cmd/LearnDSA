public class Sorting {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 8, 10, -2};
        Bubble_sort(array);
    }
    public static void Bubble_sort(int[]arr){
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = 0; j <arr.length-i-1; j++) {
                
        if (arr[j]>arr[j+1]) {
            int temp =arr[j+1];
            arr[j+1]=arr[j];
            arr[j] = temp;
         }
       } 
    }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length -1 ){
            System.out.print(", ");
            }
        }
        System.out.println("]");
    
    
    }
}

