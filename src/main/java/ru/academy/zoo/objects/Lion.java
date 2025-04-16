package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.zoo.exception.AgeExeption;

public class Lion extends Animal implements IDangerous, IGroundAnimal {

    private static final Logger log = LogManager.getLogger(Lion.class);

    public Lion(String name_, int age_) throws AgeExeption {
        super(name_, age_);
    }

    @Override
    public void makeSound() {
        log.info("РРРРррррррр");
    }

    //уровень опасности по 10 бальной шкале
    @Override
    public int dangerousLevel() {
        return 10;
    }

    @Override
    public boolean isBigAnumal() {
        return true;
    }
}
