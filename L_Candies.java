import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L_Candies {
    public static List<Boolean> kidsWithCandies(int[] candies, int ec) {
        int big = 0;
        List<Boolean> result = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]>big){
                big =candies[i];
            }
        }
        for(int j=0;j<candies.length;j++){
                if(big<=candies[j]+ec){
                    result.add(true);
                }
                else
                result.add(false);
            }
            return result;
        }
        
    
        
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candies = new int[n];
        for(int i=0;i<n;i++){
            candies[i]=sc.nextInt();
        }
        int ec = 3;
        List<Boolean> result = kidsWithCandies(candies,ec);
         System.out.println(result);
        
    }
}

    

