package Exercise_4;

import java.util.stream.Stream;

public class RandomAlgorithm {
    public void method(long a, long c, long m) {
        Stream.iterate(0, n -> Math.toIntExact((a * n + c) % m)).limit(10).forEach(System.out::println);
    }
}
