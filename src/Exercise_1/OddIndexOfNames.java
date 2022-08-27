package Exercise_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddIndexOfNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sergiy", "Kate", "Olga", "Svitlana", "Ivan", "Oleksandr", "Andrew", "Roma");

        String result = IntStream
                .range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + "." + names.get(i))
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
