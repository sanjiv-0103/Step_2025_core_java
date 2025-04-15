import java.util.Scanner;

public class Reverse {

    public static String reverse(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            result.append(reversed.reverse()).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String val = input.nextLine();

        String reversedSentence = reverseEachWord(val);
        System.out.println("Reversed words: " + reversedSentence);
    }
	input.close;
}

