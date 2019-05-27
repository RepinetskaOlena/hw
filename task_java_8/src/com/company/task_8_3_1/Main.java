package com.company.task_8_3_1;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream natural = IntStream.iterate(10, i -> i + 10);
        ArrayList list = new ArrayList();
        natural
                .limit(10)
                .forEach(i -> list.add((i / 2)));
        System.out.println(list);

    }
}
