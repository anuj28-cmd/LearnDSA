import java.util.*;
// import LearnDSA;


public class L_Permutation_Array {
    public static void main(String[] args) {
        solution s = new solution();
        int[] nums ={0,2,1,5,3,4};
        s.Permute(nums);
        
        
    }
}
class solution{
    public void Permute(int[] arr){
        int n= arr.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=arr[arr[i]];
        }
        System.out.println(Arrays.toString(ans));
    }

}
