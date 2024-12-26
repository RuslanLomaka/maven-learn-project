package com.ruslanlomaka;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
    public static void main(String[] args) {

        Person me = new Person("Ruslan", "Lomaka");

        Gson myGson = new GsonBuilder().setPrettyPrinting().create();


        String ruslanLomaka = myGson.toJson(me);

        System.out.println(ruslanLomaka);
    }
}

class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}