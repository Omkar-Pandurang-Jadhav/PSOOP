

import java.util.Scanner;

class BackwardsCharSequence implements CharSequence {
    private String data;

    public BackwardsCharSequence(String data) {
        this.data = data;
    }

    @Override
    public int length() {
        return data.length();
    }

    @Override
    public char charAt(int index) {
        return data.charAt(data.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder reversedSubsequence = new
                StringBuilder(data.substring(start, end)).reverse();
        return reversedSubsequence.toString();
    }

    @Override
    public String toString() {
        StringBuilder reversedString = new
                StringBuilder(data).reverse();
        return reversedString.toString();
    }
}

public class ReversedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String inputSentence = scanner.nextLine();
        CharSequence reversedSequence = new BackwardsCharSequence(inputSentence);
        System.out.println("Reversed sentence using custom CharSequence: " + reversedSequence);
        scanner.close();
    }
}
