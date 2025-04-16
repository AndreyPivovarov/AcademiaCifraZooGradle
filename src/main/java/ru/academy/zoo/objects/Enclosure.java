package ru.academy.zoo.objects;

import ru.academy.zoo.exception.AddTypeAnimalException;
import ru.academy.zoo.exception.MaxCapacityException;

import java.util.HashSet;
import java.util.Set;

//Общий класс вольера
public abstract class Enclosure {

    protected final int maxCapacity; // Максимальная вместимость
    protected int id; // Номер вольера
    protected final Set<Animal> animals;


    public Enclosure(int maxCapacity_, int id_) throws MaxCapacityException {
        if (maxCapacity_ < 0 || maxCapacity_ >= 500) {
            throw new MaxCapacityException(maxCapacity_);
        }
        this.maxCapacity = maxCapacity_;
        this.animals = new HashSet<Animal>();
        this.id = id_;
    }

    public void addAnimal(Animal animal) throws AddTypeAnimalException {
        animals.add(animal);
    }

    public int getId() {
        return id;
    }

    public abstract void clean();
}
