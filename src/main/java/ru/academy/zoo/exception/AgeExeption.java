package ru.academy.zoo.exception;

import java.text.MessageFormat;

public class AgeExeption extends Exception {
    public AgeExeption(int age) {
        super(MessageFormat.format("Некорректный возраст {0}", age));
    }
}
