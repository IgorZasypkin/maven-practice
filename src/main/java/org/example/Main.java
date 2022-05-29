package org.example;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        final Faker faker = new Faker();
        String anName = faker.animal().name();

        System.out.println(anName);
    }
}
