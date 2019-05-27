package com.company.task_8_1_;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Creator {


    public static Integer[] createIntegerArray() {

        Integer[] array = new Integer[inputSize()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    public static List<String> createStringArray() {

        ArrayList<String> list = new ArrayList();
        int size = inputSize();
        for (int i = 0; i < size; i++) {
            System.out.println("Input string");
            list.add(i, inputString());
        }
        return list;

        }


    private static int inputSize () {
        {   Scanner sc = new Scanner(System.in);
            System.out.println("Input array size, please");
            int size;
            while (true)
            {
                try
                {   size = sc.nextInt();
                    if (size < 1)  throw new IllegalArgumentException("Size should be greater than 1");
                    return size;
                }
                catch (InputMismatchException e)
                {
                    sc.next();
                    System.out.print("Please, input only number /n");
                }
            }
        }


    }

    private  static  String inputString () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string");
        return sc.nextLine();

    }
    }




