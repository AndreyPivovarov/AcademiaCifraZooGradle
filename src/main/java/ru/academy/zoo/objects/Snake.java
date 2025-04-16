package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.academy.zoo.exception.AgeExeption;

public class Snake extends Animal implements IGroundAnimal {

    private static final Logger log = LogManager.getLogger(Snake.class);

    public Snake(String name_, int age_) throws AgeExeption {
        super(name_, age_);
    }

    @Override
    public void makeSound() {
        log.info("Shhhhshshhshsh");
    }

    @Override
    public boolean isBigAnumal() {
        return true;
    }
}
