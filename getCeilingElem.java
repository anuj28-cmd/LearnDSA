package LearnDSA;
import java.util.Scanner;

public class getCeilingElem{
    // using linnear search :
    public static int search(int[]arr,int target){
        
        for(int i =0;i<arr.length;i++){
        if (arr[i]==target) {
            System.out.println("target found:"+arr[i]);
            return 0;
           
        }
        else if(arr[i]>target && arr[i]<arr[i+1]) {
            System.out.println("the smallest int greater than target is :"+arr[i]);  
            return 0;
            
        }else{
        System.out.println("no element found");
        } 
    }
     return 0;
    }
//     // Using binary search
    public static int B_search(int[]arr,int x){
       int start = 0;
       int end = arr.length -1 ;
       int mid=0;
       while (start!=end) {
         mid = start + (end-start)/2;
        if (x == arr[mid]){
            return mid;
        }
        else if (x < arr[mid]){
            end=mid-1;
        return 0;
       }
       else{
        start = mid +1;     
    }
}
    return mid;
}
    public static void main(String[] args) {
        
    
    int[] arr=new int[]{2,3,5,9,14,16,18};
    Scanner sc =new Scanner(System.in);
    int target = sc.nextInt();
    search(arr, target);
    B_search(arr, target);
    sc.close();
   }
}


