public class ColouredTriangles {
    public static char triangle(final String row) {
        StringBuilder newString = new StringBuilder();
        // just return the string if it's only one character long
        if (row.length() == 1) {
            return row.charAt(0);
        }
        for (int i = 0; i < row.length() - 1; i++) {
            char firstChar = row.charAt(i);
            char secondChar = row.charAt(i + 1);
            // if characters are the same, append the same character
            // if characters are different, append the third possible character
            if (firstChar == secondChar) {
                newString.append(firstChar);
            } else if ((firstChar == 'B' && secondChar == 'G')
                    || (firstChar == 'G' && secondChar == 'B')) {
                newString.append('R');
            } else if ((firstChar == 'R' && secondChar == 'G')
                    || (firstChar == 'G' && secondChar == 'R')) {
                newString.append('B');
            } else if ((firstChar == 'B' && secondChar == 'R')
                    || (firstChar == 'R' && secondChar == 'B')) {
                newString.append('G');
            }
        }
        if (newString.length() > 1) {
            triangle(newString.toString());
        }
        return newString.charAt(0);
    }
}

