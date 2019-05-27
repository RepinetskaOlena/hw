package com.company.task_9_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Generator generator = new Generator(inputParameters());
        System.out.println(generator);
    }

    public static int[]  inputParameters () {
        int [] arr = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input size");
        arr[0] = scanner.nextInt();
        System.out.println("Please, input first number of range");
        arr[1] = scanner.nextInt();
        System.out.println("Please, input last number of range");
        arr[2] = scanner.nextInt();
        return arr;
    }

}
