package com.company.task_8_3_2;

public class Person {
    private String name;
    private int age;
    private boolean gender;

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        String str;
        if (gender) {
            str = "male";
        } else {
            str = "female";
        }
            return
                    "name: " + name  +
                            ", age: " + age +
                            ", gender: " + str;

    }
}
