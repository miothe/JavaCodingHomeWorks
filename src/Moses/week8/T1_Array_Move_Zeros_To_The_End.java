package Moses.week8;

public class T1_Array_Move_Zeros_To_The_End {

    public static void main(String[] args) {


        int arr[] = {1, 0, 2, 0, 3, 0, 4, 0};

        int length = arr.length;
        int nonZeroNumbers = 0;
        // Move numbers that are not zero to the beginning of array
        for (int i = 0; i < length; i++) {
            if(arr[i] !=0){
                arr[nonZeroNumbers] = arr[i];
                nonZeroNumbers++;
            }
        }
        // The left element spaces are filled with zeros after the non zero numbers
        while(nonZeroNumbers < length){
            arr[nonZeroNumbers] = 0;
            nonZeroNumbers++;
        }
        // Revised array is printed in on one line
        for (int number : arr){
            System.out.print(number + " ");
        }
    }
}
