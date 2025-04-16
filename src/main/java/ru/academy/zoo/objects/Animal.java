package ru.academy.zoo.objects;

import ru.academy.zoo.exception.AgeExeption;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

//базовый класс всех животных
public abstract class Animal {


    static final Logger log = LogManager.getLogger(Animal.class);

    protected final String name;

    //TODO перевести на Date - дата рождения
    protected int age;

    public Animal(String name_, int age_) throws AgeExeption {

        log.trace("Создаем новое животное с именем {}, возраст {}", name_, age_);
        this.name = name_;

        log.debug("Проверяем значение возраста");
        if (age_ < 0 || age_ > 5000) {
            throw new AgeExeption(age_);
        } else {
            this.age = age_;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void makeSound();
}
