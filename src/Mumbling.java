import java.util.Locale;

public class Mumbling {

    public static String accum(String s) {
        // convert the passed in string to lowercase and store it
        String lowerCaseString = s.toLowerCase();

        // create StringBuilder that will build our answer
        StringBuilder sb = new StringBuilder();

        // loop through lowerCaseString
        for (int i = 0; i < lowerCaseString.length(); i++) {
            char capsFirstLetter = Character.toUpperCase(lowerCaseString.charAt(i));
            sb.append(capsFirstLetter);
            sb.append(String.valueOf(lowerCaseString.charAt(i)).repeat(i));

            if (i != lowerCaseString.length() - 1) {
                sb.append("-");
            }
        }

        return sb.toString();
    }

}
