package ru.academy.zoo.exception;

import java.text.MessageFormat;

public class MaxCapacityException extends Exception {

    public MaxCapacityException(int maxCapacity) {
        super(MessageFormat.format("Некорректное значение максимального объема вальера {0}", maxCapacity));
    }
}
