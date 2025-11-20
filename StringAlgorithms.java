public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
    public static String printCharacters(String word) {
      String returning = "";
      int len = word.length();
      for (int i = 0; i < len; i++) {
        returning += word.charAt(i);
        if (i != len - 1) returning += "\n";
      }
      return returning;
    }


    /**
     * Challenge 2:
     * Write a method that takes a String 'word' and returns
     * a new String with the characters reversed.
     */
    public static String reverseWord(String word) {
      String returning = "";
      for (int i = word.length()-1; i >= 0; i--) {
         returning += word.charAt(i);
      }
      return returning;
    }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
    public static String capitalizeString(String sentence) {
      String returning = "";
      String prevChar = " ";
      for (int i = 0; i < sentence.length(); i++) {
         String currentChar = sentence.substring(i, i+1);
         if (prevChar.equals(" ")) 
            returning += currentChar.toUpperCase();
         else
            returning += currentChar;
         prevChar = currentChar;
      }  
      return returning;
    }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        return word.equalsIgnoreCase(reverseWord(word));
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
    public static char firstUniqueChar(String word) {
      int len = word.length();
      for (int i = 0; i < len; i++) {
         String c = word.substring(i, i+1);
         if (!(word.substring(0, i).contains(c) || word.substring(i+1, len).contains(c)))
            return c.charAt(0);
      }
      return ' ';
    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method
        
        System.out.println("Testing printCharacters:");
        // Example:
        System.out.println(printCharacters("hello"));

        System.out.println("\nTesting reverseWord:");
        // Example:
        System.out.println(reverseWord("hello"));

        System.out.println("\nTesting capitalizeString:");
        // Example:
        System.out.println(capitalizeString("the quick brown fox"));

        System.out.println("\nTesting detectPalindrome:");
        // Example:
        System.out.println(detectPalindrome("Racecar"));
        System.out.println(detectPalindrome("Java"));

        System.out.println("\nTesting firstUniqueChar:");
        // Example:
        System.out.println(firstUniqueChar("swiss"));
    }
}
