package Moses.week8;

import java.util.Arrays;

public class T2_Array_NuniqueIntegersThatSumUpTo {
    public static int[] generateArray(int N) {
        int[] arr = new int[N];
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {
            int num = (int) (Math.random() * 100) - 50;  // Generate random number between -50 and 49
            arr[i] = num;
            sum += num;
        }

        arr[N - 1] = -sum;  // Set the last element to ensure the sum is zero

        return arr;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] result = generateArray(N);
        System.out.println(Arrays.toString(result));
    }
}
