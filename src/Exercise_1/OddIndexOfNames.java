package Exercise_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OddIndexOfNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sergiy", "Kate", "Olga", "Svitlana", "Ivan", "Oleksandr", "Andrew", "Roma");

        List<String> oddNames = IntStream
                .range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(names::get)
                .collect(Collectors.toList());
        System.out.println(oddNames);

        List<Integer> oddIndex = IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(oddIndex);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < oddNames.size(); i += 1) {
            result.append(oddIndex.get(i)).append(".").append(oddNames.get(i)).append(" ");
        }
        System.out.println(result);
    }
}
