import java.util.*;
// import LearnDSA;

 class Solution{
    public void Permute(int[] arr){
        int n= arr.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=arr[arr[i]];  
        }
        System.out.println(Arrays.toString(ans));
    }
    
}


public class Permutation_Array {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums ={0,2,1,5,3,4};
        s.Permute(nums);
        
        
    }
    
}
