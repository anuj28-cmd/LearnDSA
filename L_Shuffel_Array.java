import java.util.*;
// import LearnDSA;

 class Solution{
    public void Shuffel(int[] arr,int n){
        int[] ans = new int[n*2];
        for(int i=0;i<n;i++){
            ans[2*i]=arr[i];  
            ans[2*i+1]=arr[n+i];
        }
        System.out.println(Arrays.toString(ans));
    }
    
}


public class L_Shuffel_Array {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums ={1,2,3,4,4,3,2,1};
        int n =4;
        s.Shuffel(nums,n);
        
        
    }
    
}

    