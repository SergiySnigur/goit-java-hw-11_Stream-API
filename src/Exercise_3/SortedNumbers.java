package Exercise_3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SortedNumbers {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "0", "4", "5");
        String result = "";
        List<String> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        for (String item : sortedNumbers) {
            result += item + ", ";
        }
        String s = result.substring(0, result.length() - 2);
        result = "\"" + s + "\"";
        System.out.println(result);
    }
}
