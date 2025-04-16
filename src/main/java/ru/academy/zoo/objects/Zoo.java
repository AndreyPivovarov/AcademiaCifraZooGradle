package ru.academy.zoo.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

public class Zoo {
    static final Logger log = LogManager.getLogger(Animal.class);

    private static Zoo zooInstance;

    private final Set<Worker> workers;

    public static Zoo getInstance() {
        if (zooInstance == null) {
            zooInstance = new Zoo();
            return zooInstance;
        } else return zooInstance;
    }

    private Zoo() {
        this.workers = new HashSet<Worker>();
    }

    public void addWorker(Worker w) {
        log.info("Добавлен работник {}", w.getName());
        workers.add(w);
    }

    // Метод очистки вольеров и кормления животных работниками
    public void dailyWorks() {
        for (Worker w : workers) {
            for (Enclosure c : w.getEnclosures()) {
                w.cleanEnclosure(c);
                for (Animal animal: c.animals){
                    w.feedAnimal(animal);
                }
            }
        }
    }
}
