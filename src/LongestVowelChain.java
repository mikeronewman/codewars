import java.util.ArrayList;

public class LongestVowelChain {
    public static int solve(String s){
        int vowelCount = 0;
        String currentVowelChain = "";
        ArrayList<String> vowelChains = new ArrayList<String>();


        // loop through string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            // check if character is a vowel
            if (Character.toString(currentChar).matches("[aeiou]")) {
                // builds the current vowel chain string
                currentVowelChain += currentChar;
                // checks if we are at the end of the string, if so we add the string to our list
                if (i == s.length() - 1) {
                    vowelChains.add(currentVowelChain);
                }
                // if the character wasn't a vowel, we add our current chain to the list and reset our current chain to empty
            } else {
                vowelChains.add(currentVowelChain);
                currentVowelChain = "";
            }
        }

        // loop through the list and find the length of our longest string
        for (String str : vowelChains) {
            if (str.length() > vowelCount) {
                vowelCount = str.length();
            }
        }

        return vowelCount;
    }
}
