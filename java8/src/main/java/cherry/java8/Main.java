package cherry.java8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.iterate(0, integer -> integer + 2).limit(10).forEach(System.out::println);
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(20).forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));
        Stream.generate(Math::random).limit(5).forEach(System.out::println);
        IntStream.generate(() -> 1).limit(10).forEach(System.out::println);
    }
}
