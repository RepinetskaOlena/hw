package com.company.task_9_1;


import java.util.*;
import java.util.List;

public class Generator {
    ArrayList myList;
    Set mySet;
    public Generator (int[] arr) {
       myList = new ArrayList();

        for (int i = 0; i <arr[0] ; i++) {
        int item = arr[1] + (int) (Math.random() * (arr[2]-arr[1])) ;
        myList.add(i, item);

        }
        List list = new ArrayList();
        for (int i = arr[1]; i < arr[2]; i++) {
        list.add(i);
        Collections.shuffle(list);
        shrinkTo(list,arr[0]);
        mySet = new HashSet(list);
        }

    }

    public static void shrinkTo(List list, int newSize) {
        int size = list.size();
        if (newSize >= size) return;
        for (int i = newSize; i < size; i++) {
            list.remove(list.size() - 1);
        }
    }

    @Override
    public String toString() {
        return  "List: " + myList + "\n" +
                "Set: " + mySet ;
    }
}

