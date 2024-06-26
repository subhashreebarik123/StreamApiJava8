package org.example.StreamApiExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {


        List<String> memberNames = new ArrayList<>();

        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        Stream<String > stream = memberNames.stream();
        stream.forEach(p -> System.out.println(p));
    }
}
