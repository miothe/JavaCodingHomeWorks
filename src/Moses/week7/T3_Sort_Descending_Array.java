package Moses.week7;

import java.util.Arrays;

public class T3_Sort_Descending_Array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};
        arr = sortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sortDescending(int[] arr) {
        int n = arr.length;
// The outer loop controls the number of passes
        for (int i = 0; i < n - 1; i++) {
  // The inner loop performs the actual comparisons and swaps them
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

}
