// import java.util.*;
// import LearnDSA;

public class L_Richest_customer {
    public static void main(String[] args) {
        Richie s = new Richie();
        int[][] nums ={{2,8,7},{7,1,3},{1,9,5}};
        s.Rich(nums);
        
        // [[2,8,7],[7,1,3],[1,9,5]]
    }
    
}
class Richie{
    public void Rich(int[][] arr){
        int sum =0;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum = sum+arr[i][j];
            }
            if (sum>temp) {
                temp =sum;
            }
            sum=0;
        }
        System.out.println(temp);
    }

}

    

