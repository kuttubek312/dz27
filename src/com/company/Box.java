package com.company;

public class Box <T> {
    private String name;

    public Box(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                '}';
    }
    public static <T> Box<T> BoxMethod(){
        return new Box<>("Мерсер Айленде"); // оснаватель Box
    }
}

