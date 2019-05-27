package com.company.task_8_3_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> persons =
                Arrays.asList(
                        new Person("Olena", 31, false),
                        new Person("Oleksandra", 37, false),
                        new Person("Andrii", 35, true),
                        new Person("Stanislav", 1, true));


        System.out.println(showMenAgeEighteen(persons));
        System.out.println("Avarage women age is " + countAvgAgeWomen(persons));
    }

    public static List<Person> showMenAgeEighteen (List<Person> persons)

    { List<Person> filter;
        filter = persons
                .stream()
                .filter((p) -> p.isGender() == true && p.getAge() >= 18 )
                .collect(Collectors.toList());

        return filter;
    }

    public static double countAvgAgeWomen (List<Person> persons) {

//        double ageAvg = persons
//                .stream()
//                .filter(((p) -> p.isGender() == false)
//                        .mapToInt(persons::getAge).average().getAsDouble();
                return persons
                        .stream()
                        .filter((p) -> p.isGender() == false)
                        .mapToInt( Person::getAge).average().getAsDouble();
    }





}
