// Java program for implementation of Insertion Sort
public class Linked_list {

//    /*Function to sort array using insertion sort*/
//    void sort(int arr[]) {
//        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            int key = arr[i];
//            int j = i - 1;
//
//            /* Move elements of arr[0..i-1], that are
//               greater than key, to one position ahead
//               of their current position */
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j = j - 1;
//            }
//            arr[j + 1] = key;
//        }
//    }
//
//    /* A utility function to print array of size n*/
//    static void printArray(int arr[]) {
//        int n = arr.length;
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//
//        System.out.println();
//    }

    // Driver method
    public static void main(String args[]) {
        int arr[][] = {{6, 0, 3, 5},{7, 9, 1, 2},{4, 10, 12, 8}};
        for (int i = 0; i < arr.length; i++){

            for (int j = 0; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length ; j++){
//                System.out.print(arr[j][i] + " ");
//            }
//            System.out.println(" ");
//        }
//        Linked_list ob = new Linked_list();
//        ob.sort(arr);
//
//        printArray(arr);

    }
}