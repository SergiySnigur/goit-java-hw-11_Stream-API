package Exercise_5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeElementsOfStream {
    public static void main(String[] args) {
        Stream<String> first = Stream.of("Aragorn", "Frodo", "Legolas", "Gandalf", "Gimli", "Gollum");
        Stream<String> second = Stream.of("MORDOR", "MINAS TIRITH", "ISENGARD");
        Stream<String> result = zip(first, second);
        List<String> toPrint = result.peek(System.out::println).collect(Collectors.toList());
        System.out.println(toPrint);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstItems = first.collect(Collectors.toList());
        List<T> secondItems = second.collect(Collectors.toList());

        List<T> resultOfStream = new ArrayList<>();
        int minSize = Math.min(firstItems.size(), secondItems.size());

        for (int i = 0; i < minSize; i += 1) {
            resultOfStream.add(firstItems.get(i));
            resultOfStream.add(secondItems.get(i));
        }

        return resultOfStream.stream();
    }
}
