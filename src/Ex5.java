/**
 * Created by User on 22.11.2016.
 */
public class Ex5 {
    public static void main(String[] args) {
        int n = 7, m = 9;
        int[][] arr = new int[n][m];
        System.out.println("Array_1: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int)(Math.random()*(n+m));
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nArray_2: ");
        createArray2(arr, n, m);
    }

    public static void createArray2(int[][] arr1, int k, int l){
        int[] arr2 = new int[k];
        int s;
        for (int i = 0; i < k; i++) {
            s=0;
            for (int j = 0; j < l; j++) {
                s += arr1[i][j];
            }
            arr2[i] = s;
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr2[i] + "\t");
        }
    }
}
