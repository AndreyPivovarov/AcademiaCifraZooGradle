package ru.academy.zoo.exception;

import java.text.MessageFormat;

public class AddTypeAnimalException extends Throwable {

    public AddTypeAnimalException(String notCorrectClassAnimal) {
        super(MessageFormat.format("В вальер добавляется недопустимое животное с типом {0}", notCorrectClassAnimal));
    }
}
