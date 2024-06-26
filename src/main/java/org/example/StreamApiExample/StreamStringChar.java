package org.example.StreamApiExample;

import java.util.stream.Stream;

public class StreamStringChar {

    public static void main(String[] args) {


        Stream<String> stream = Stream.of("A%B%C".split("\\%"));
        stream.forEach(n->System.out.println(n));
    }
}
