import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuckyNumbers_1380 {
        public static List<Integer> luckyNumbers (int[][] matrix) {
            List<Integer> luckyNumber = new ArrayList<Integer>();
            int min = 0;
            int Min_index = 0;
            for (int i = 0 ; i < matrix.length ; i++){
                min = matrix[i][0];
                for (int j = 0 ; j < matrix[i].length ; j++){
                    if(matrix[i][j]<min){
                        min = matrix[i][j] ;
                        Min_index = j;
                    }
                }
                boolean flag = true;
                for (int k = 0 ; k < matrix.length ; k++){
                    if(matrix[k][Min_index]>min){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    luckyNumber.add(min);
                }
            }
            return luckyNumber;
        }
        public static <List> void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            int col = sc.nextInt();
            int arr[][] = new int[row][col];
            for (int i = 0 ; i < arr.length ; i++){
                for (int j = 0 ; j < arr[i].length ; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.print(luckyNumbers (arr));
        }
    }

