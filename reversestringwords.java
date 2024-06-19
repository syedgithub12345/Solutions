//reversed
public class reversestringwords {
    public static void main(String[] args) {
        String sentence = "jack and jill went up a hill";
        String reversedSentence = reverseWords(sentence);
        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" "); // Split the sentence into words
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            String reversedWord = reverseString(word); // Reverse each word
            reversedSentence.append(reversedWord).append(" "); // Append reversed word with a space
        }

        return reversedSentence.toString().trim(); // Remove trailing space and return
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i)); // Append each character in reverse order
        }
        return reversed.toString();
    }
}