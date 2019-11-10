package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseApplication.class, args);

        Calculator calc1 = new Calculator();

        calc1.Dodaj(25,20);
        calc1.Odejmij(100,15);

        int wynikDodaj = calc1.Dodaj(25,20);
        int wynikOdejmij = calc1.Odejmij(100,15);

        System.out.println("Wynik dodawania: " + wynikDodaj);
        System.out.println("Wynik odejmowania: " + wynikOdejmij);

    }

}
