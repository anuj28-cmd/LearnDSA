import java.util.Arrays;
import java.util.Scanner;

// public class L_Flip {
//     public static void main(String[]args){
//     int [][] image = {{1,1,0},{1,0,1},{0,0,0}};
//     for(int i = 0; i< image.length; i++){
//         for(int j = 0; j< image[i].length; j++){
//             int mid = image[i].length/2;
//             int start = 0;
//             int end = image[i].length-1;
//             while(start < end){
//                 int temp = image[i][start];
//                 image[i][start] =image[i][end];
//                 image[i][end] = temp;
//                 start++;
//                 end--;
//             }
//             }
//             for(int j = 0; j< image[i].length; j++){
//                 if(image[i][j]==0){
//                     image[i][j]=1;
//                 }
//                 else{
//                     image[i][j]=0;
//                 }
//             }
//             System.out.println(Arrays.toString(image[i]));
//         }
//     }
// }
class L_Flip {
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = image[i].length - 1;
            while (start <= end) {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }
            for(int j = 0; j< image[i].length; j++){
                                if(image[i][j]==0){
                                    image[i][j]=1;
                                }
                                else{
                                    image[i][j]=0;
                                }
                            }
        }
        return image;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] image = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                image[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int[][] result = flipAndInvertImage(image);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}

