
    import java.util.*;
// import LearnDSA;

 class Solution{
    public void concat(int[] arr){
        int n = arr.length;
        int[] ans = new int[n*2];
        for(int i=0;i<n;i++){
            ans[i]=arr[i];
            ans[i+n]=arr[i]; 
        }
        System.out.println(Arrays.toString(ans));
    }
    
}


public class L_Concatination_of_Array {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums ={1,2,1};
        s.concat(nums);
        
        
    }
    
}


