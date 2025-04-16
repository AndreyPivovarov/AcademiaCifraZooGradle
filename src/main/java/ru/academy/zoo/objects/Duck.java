package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.zoo.exception.AgeExeption;

public class Duck extends Animal implements IFlyable, ISwimmable {

    private static final Logger log = LogManager.getLogger(Duck.class);

    public Duck(String name_, int age_) throws AgeExeption {
        super(name_, age_);
    }

    @Override
    public void makeSound() {
        log.info("Kcryyyaaaa");
    }

    @Override
    public boolean isBigBird() {
        return false;
    }

    @Override
    public void fly() {
        log.info("Утка c именем {} летит", getName());
    }

    @Override
    public boolean isSultWater() {
        return true;
    }
}
