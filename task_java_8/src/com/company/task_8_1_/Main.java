package com.company.task_8_1_;

import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

      Integer [] array = Creator.createIntegerArray();
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, (a, b) -> Integer.compare(a, b));
        System.out.println(Arrays.toString(array));
        List<String> list = Creator.createStringArray();
        System.out.println(list);
        list.sort((a, b )-> a.compareToIgnoreCase(b));
        System.out.println(list);


    }
}
