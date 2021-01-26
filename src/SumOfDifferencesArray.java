import java.util.Comparator;
import java.util.stream.IntStream;

public class SumOfDifferencesArray {
    public static int sumOfDifferences(int[] arr) {
        int answer = 0;
        int[] sortedArray = IntStream.of(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        for (int i = 0; i < sortedArray.length - 1; i++) {
            answer += sortedArray[i] - sortedArray[i + 1];
        }

        return answer;
    }
}
