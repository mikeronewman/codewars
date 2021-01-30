import java.util.ArrayList;
import java.util.stream.IntStream;

public class MultiplesThreeFive {
    public int solution(int number) {
        // an array of all numbers below passed in number
        int[] range = IntStream.range(1, number).toArray();
        // a list to hold all numbers that are either multiples of 3 or 5
        ArrayList<Integer> multiples = new ArrayList<Integer>();
        // a place to store our sum of all multiples
        int sum = 0;

        // loop through all numbers and add any multiples of either three or five to our multiples list
        for(int x: range) {
            if(isMultipleOfThree(x) || isMultipleOfFive(x)) {
                multiples.add(x);
            }
        }

        // loop through our list of multiples and get the sum of all elements
        for(int y: multiples) {
            sum += y;
        }

        return sum;
    }

    private static boolean isMultipleOfThree(int num) {
        if(num % 3 == 0) {
            return true;
        } else return false;
    }

    private static boolean isMultipleOfFive(int num) {
        if(num % 5 == 0) {
            return true;
        } else return false;
    }
}
