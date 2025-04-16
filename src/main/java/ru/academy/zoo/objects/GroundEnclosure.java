package ru.academy.zoo.objects;

import ru.academy.zoo.exception.AddTypeAnimalException;
import ru.academy.zoo.exception.MaxCapacityException;

import java.util.Set;

import static ru.academy.zoo.objects.Worker.log;

// Вальер для наземных животных
public class GroundEnclosure extends Enclosure {

    public GroundEnclosure(int maxCapacity_, int id_) throws MaxCapacityException {
        super(maxCapacity_, id_);
    }

    public void addAnimal(Animal animal) throws AddTypeAnimalException {
        if (animal instanceof IGroundAnimal){
            super.addAnimal(animal);
        } else {
            throw new AddTypeAnimalException(animal.getClass().getSimpleName());
        }
    }

    @Override
    public void clean() {
        log.info("Чистим вольер {}", getId());
    }
}
