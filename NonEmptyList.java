package GUVI_Task5;

import java.util.Arrays;
import java.util.List;

public class NonEmptyList {
    public static void main(String[] args) {
        //Creating list of empty and non empty strings
        List<String> ListString = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        //Filtering non empty strings using stream
        List<String> nonEmptyList = ListString.stream()
                                                .filter(s -> !s.isEmpty())
                                                .toList();

        System.out.println(nonEmptyList);
    }
}
