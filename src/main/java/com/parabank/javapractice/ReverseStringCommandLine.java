package com.parabank.javapractice;
import java.util.Scanner;

public class ReverseStringCommandLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        String reversedString = reverseString(inputString);

        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}
