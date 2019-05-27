package com.company.task_9_3;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Triangle> mySet = new HashSet<>();
        try {
            mySet.add(new Triangle(0,0,1,1,1,0)); // a=b=c
            mySet.add(new Triangle(0,0,1,2,2,0)); // a=c
            mySet.add(new Triangle(0,0,1,0,0,1)); // 90
            mySet.add(new Triangle(0,0,4,5,2,0)); // rangom
            mySet.add(new Triangle(0,0,0,0,2,0)); // not exist
            }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage() + "\n");
        }
        for (Triangle item: mySet) {
            System.out.println(item.toString() + item.defineTriangle(item));
        }



    }
}
