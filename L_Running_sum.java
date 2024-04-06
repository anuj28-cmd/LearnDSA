
import java.util.*;
// import LearnDSA;

 class Solution{
    public void sum(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
           sum=sum+arr[i];
           ans[i] = sum;
        }
        System.out.println(Arrays.toString(ans));
    }
    
}


public class L_Running_sum {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums ={1,2,3,4};
        s.sum(nums);
        
        
    }
    
}




    

