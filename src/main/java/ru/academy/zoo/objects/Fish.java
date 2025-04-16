package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.zoo.exception.AgeExeption;

public class Fish extends Animal implements ISwimmable{

    private static final Logger log = LogManager.getLogger(Fish.class);

    public Fish(String name_, int age_) throws AgeExeption {
        super(name_, age_);
    }

    @Override
    public void makeSound() {
        log.info("рыба молчит");
    }

    @Override
    public boolean isSultWater() {
        return false;
    }
}
