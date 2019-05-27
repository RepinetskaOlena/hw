package com.company.task_9_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vocabulary vocabulary = new Vocabulary();
        Translator translator;
        Menu menu = new Menu();
        int choice;
        do {
            menu.show();
            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter english word:");
                    String eng = new Scanner(System.in).nextLine();
                    System.out.println("Enter translation in Ukrainian:");
                    String ukr = new Scanner(System.in).nextLine();
                    vocabulary.addWord(eng, ukr);
                    break;
                case 2:
                    System.out.println("Enter phrase in English");
                    String phrase = new Scanner(System.in).nextLine();
                    translator = new Translator(vocabulary);
                    translator.translateEngToUkr(phrase);
                    break;
                default:
                    if (choice != 0)
                        System.out.println("Invalid choose!");
                    break;
            }
        } while (choice != 0);
    }
}
