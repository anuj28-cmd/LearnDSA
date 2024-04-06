import java.util.Scanner;

class L_G {
    public static int numIdenticalPairs(int[] nums) {
        int n= nums.length;
       int count =0;

        for(int i = 0; i < n ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(nums[i]==nums[j]){
                count++;
                }
            }

        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i = 0 ; i < n ; i++){
        nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.print(numIdenticalPairs(nums));
    }
}