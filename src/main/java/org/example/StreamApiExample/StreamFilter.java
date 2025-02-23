package org.example.StreamApiExample;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {

    //Stream filter(Predicate predicate) provides a stream that contains the elements of
    // this stream that satisfy the supplied predicate.
    
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


        memberNames.stream().filter((s) -> s.startsWith("A"))
                .forEach(System.out::println);

    }
}
