package Exercise_2;

import java.util.*;
import java.util.stream.Collectors;

public class SortedName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sergiy", "Kate", "Olga", "Svitlana", "Ivan", "Oleksandr", "Andrew", "Roma");
        List<String> sortedName = names.stream()
                .sorted(Collections.reverseOrder())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(sortedName);
    }
}
