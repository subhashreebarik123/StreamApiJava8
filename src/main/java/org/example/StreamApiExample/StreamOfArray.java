package org.example.StreamApiExample;

import java.util.stream.Stream;

public class StreamOfArray {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(new Integer[]{1,2,3,4,5,6,7,8,9,10});
        stream.forEach(n->System.out.println(n));
    }
}
