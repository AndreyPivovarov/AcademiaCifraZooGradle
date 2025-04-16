package ru.academy.zoo.objects;

import ru.academy.zoo.exception.AddTypeAnimalException;
import ru.academy.zoo.exception.MaxCapacityException;

import static ru.academy.zoo.objects.Worker.log;

public class SwimEnclosure extends Enclosure {

    public SwimEnclosure(int maxCapacity_, int id_) throws MaxCapacityException {
        super(maxCapacity_, id_);
    }

    @Override
    public void addAnimal(Animal animal) throws AddTypeAnimalException {
        if (animal instanceof ISwimmable){
            super.addAnimal(animal);
        } else {
            throw new AddTypeAnimalException(animal.getClass().getSimpleName());
        }
    }

    @Override
    public void clean() {
        log.info("Чистим бассейн {}", getId());
    }
}
