package GUVI_Task5;

import java.util.List;

public class FilterNames {
    public static void main(String[] args) {

        //creatng list of names
        List<String> names = List.of("Aarthi", "Simiksha", "Akshaya", "Lidiya", "Anu", "Varshini", "Moni");

        //filtering names starts with A using stream
        List<String> nameStartsWithA = names.stream()
                                            .filter(s -> s.startsWith("A"))
                                            .toList();

        System.out.println(nameStartsWithA);
    }
}
