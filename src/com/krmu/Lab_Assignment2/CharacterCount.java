package com.krmu.Lab_Assignment2;

public class CharacterCount {
    public static void main(String[] args) {
        // Example char array
        char[] charArray = {'a', 'b', 'c', 'a', 'd', 'a', 'e', 'a'};
        // Character to search for
        char searchChar = 'a';
        // Call the method to count occurrences
        int count = countCharacterOccurrences(charArray, searchChar);
        // Print the result
        System.out.println("The character '" + searchChar + "' appears " + count + " times.");
    }

    public static int countCharacterOccurrences(char[] charArray, char searchChar) {
        int count = 0;
        // Loop through the array and count occurrences of the search character
        for (char c : charArray) {
            if (c == searchChar) {
                count++;
            }
        }
        return count;
    }
}
