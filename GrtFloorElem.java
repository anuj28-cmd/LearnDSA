import java.util.Scanner;

public class GrtFloorElem {
    public static int B_search(int[] arr,int x){
        int start =0;
        int end = arr.length-1;
        int mid =0;
       int result = 0;
        while (start<=end) {
        mid = start + (end-start)/2;
            if(x==arr[mid]){
                return arr[mid];
            }
            else if(x>arr[mid]){
                result = mid;
                start= mid+1;
            }
            else{
                end= mid - 1;
            }

        }
        return arr[result]; 
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int target= sc.nextInt();
    int[] arr = new int[]{2,3,5,7,9,14,16,18};
    int a = B_search(arr, target);
    System.out.println(a);
sc.close();
}
    
}
