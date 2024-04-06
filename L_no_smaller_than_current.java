import java.util.Arrays;
import java.util.Scanner;

public class L_no_smaller_than_current {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length ;
        int count = 0 ;
        int [] great = new int[n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            great[i] = count;
            count = 0;
        }
        return great;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] nums = new int[n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        int [] result = smallerNumbersThanCurrent(nums);
        System.out.print(Arrays.toString(result));
    }
    }
