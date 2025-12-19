package GUVI_Task5;

import java.util.stream.Stream;

public class StreamUpperCase {
    public static void main(String[] args) {
        //Creating stream of names
        Stream<String> names = Stream.of("aBc", "d", "ef");

        //convert to upper case using stream
        names.map(s -> s.toUpperCase())
        .forEach(s -> System.out.println(s));
    }
}
