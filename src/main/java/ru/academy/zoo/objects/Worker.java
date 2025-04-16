package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Worker {

    static final Logger log = LogManager.getLogger(Animal.class);

    private final String name;
    private List<Enclosure> enclosures;

    public Worker(String name_, List<Enclosure> enclosures_) {
        this.name = name_;
        this.enclosures = enclosures_;
    }

    public void addEnclosure(Enclosure enclosure_) {
        enclosures.add(enclosure_);
    }

    public List<Enclosure> getEnclosures() {
        return enclosures;
    }

    public String getName() {
        return name;
    }

    public void feedAnimal(Animal animal) {
        log.info("{} кормит {}", name, animal.getName());
        if (animal instanceof IDangerous) {
            log.info("{} осторожно работает с опансым животным (уровень: {})", name, ((IDangerous) animal).dangerousLevel());
        }
    }

    public void cleanEnclosure(Enclosure enclosure) {
        log.info("{} чистит вальер типа {}", name, enclosure.getClass().getSimpleName());
        enclosure.clean();
    }
}
