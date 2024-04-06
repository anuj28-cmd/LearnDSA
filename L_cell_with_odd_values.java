import java.util.Arrays;

public class L_cell_with_odd_values {
    public static void main(String[] args) {
        
    
    int m = 2;
    int n = 3;
    int[][] indices = {{0, 1}, {1, 1}};
    int [][] result = new int[m][n];
//     for(int i = 0 ; i < indices.length ; i++){
//         for(int j = 0 ; j < indices[i].length ; j++){
//             for(int t = 0 ; t < result.length ; t++){
//                 for(int p = 0 ; p < result[t].length ; p++){
//             result[t][p] = result[t][p] + 1;

//             }
//         }
//     }
// }
    for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    
    }
}
