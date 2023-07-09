package Moses.week6;

import java.util.Scanner;

public class T1_String_Password_Validation_Task {

    public static void main(String[] args) {
        int numUpperCaseLetters = 1;
        int numLowerCaseLetters = 1;
        int numSpecialCharacter = 1;
        int numDigit = 1;
        // Declare some variables
        int upperNumber = 0;
        int lowerNumber = 0;
        int specialDigit = 0;
        int digitNumber = 0;
        int letterCount = 0;
        Scanner in = new Scanner(System.in);
        // Process of accepting the infor from the user
        String input = in.nextLine();
        // To get the entire length of the password
        int inputLength = input.length();

        // Get a for loop to go through the entire string to see if it meets the criteria(upper, lower etc)
        for (int i = 0; i < inputLength; i++) {
            // To get one letter at a time starting from index 0 and also will be length - 1
            char ch = input.charAt(i);
            // Check if it meets this conditions and if it is greater or equal to otherwise password is invalid
            if (Character.isUpperCase(ch))
                upperNumber++;
            else if (Character.isLowerCase(ch))
                lowerNumber++;
            else if (Character.isDigit(ch))
                digitNumber++;

        }
        if (upperNumber >= numUpperCaseLetters && lowerNumber >= numLowerCaseLetters && digitNumber >= digitNumber) ;
        System.out.println("Valid Password");
/*
        else {
            System.out.println("The password is invalid");
            if (upperNumber < numUpperCaseLetters)
                System.out.println("Not enough upper case Letters");
            if (lowerNumber < numLowerCaseLetters) ;
            System.out.println("Not enough lower case letters");
            if (digitNumber < digitNumber) ;
            System.out.println("Not enough digits");

        }
*/

    }
}
